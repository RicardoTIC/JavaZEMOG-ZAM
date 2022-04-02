package Logica;

import Helpers.Ayudas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fTrafico_viaje {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    public DefaultTableModel showData(int no_viaje, int id_area) {

        DefaultTableModel modelo;

        String[] columnas = {"Numero Economico", "Remolque 1", "Remolque 2", " Dolly", "Codigo Estatus", "Estatus", "# de viaje", "Sucursal", "Codigo de ruta", "Operador"};
        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            PreparedStatement pst = con.prepareCall("select id_unidad,id_remolque1,id_remolque2,id_dolly,status_viaje , \n"
                    + "CASE WHEN tv.status_viaje = 'B' THEN 'Cancelado'\n"
                    + "	 WHEN tv.status_viaje = 'C' THEN 'Liquidado'\n"
                    + "	 WHEN tv.status_viaje = 'A' THEN 'Pendiente'\n"
                    + "	 WHEN tv.status_viaje = 'R' THEN 'Realizado'\n"
                    + "	 WHEN tv.status_viaje = 'T' THEN 'Transito'\n"
                    + "	 WHEN tv.status_viaje = 'L' THEN 'Liberado'\n"
                    + "	 END estatusLetra\n"
                    + ",no_viaje,a.nombrecorto,id_ruta,p.nombre from dbo.trafico_viaje tv\n"
                    + "join dbo.general_area a on a.id_area = tv.id_area \n"
                    + "join dbo.personal_personal p on p.id_personal = tv.id_personal\n"
                    + "where no_viaje = ? and tv.id_area = ?");

            pst.setInt(1, no_viaje);
            pst.setInt(2, id_area);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                registros[8] = rs.getString(9);
                registros[9] = rs.getString(10);
                modelo.addRow(registros);
            }
            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

    public String updateStatusTraficoViaje(String estatus, int no_viaje, int codigoArea) {

        try {
            
            PreparedStatement pst = con.prepareCall("update dbo.trafico_viaje set status_viaje =? where no_viaje =? and id_area =?");
            pst.setString(1,estatus );
            pst.setInt(2, no_viaje);
            pst.setInt(3, codigoArea);
            
            pst.execute();
            
            return "success";
            

        } catch (Exception e) {
            return "Error"+e.getMessage();
        }

    }
}
