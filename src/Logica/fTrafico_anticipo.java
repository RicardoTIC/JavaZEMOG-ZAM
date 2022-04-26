package Logica;

import Helpers.Ayudas;
import Modelo.Trafico_anticipo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fTrafico_anticipo {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    public DefaultTableModel showAllData(int no_Viaje, int codigoArea) {

        DefaultTableModel modelo;

        String[] columnas = {"id_cheque",
            "no_viaje",
            "id_area",
            "nombrecorto",
            "fecha_anticipo",
            "monto_anticipo",
            "status_anticipo",
            "estatus_letra",
            "id_ingreso",
            "observaciones",
            "nombre",
            "fecha_pago",
            "referencia_pago",
            "fecha_ingreso",
            "detalles"};

        modelo = new DefaultTableModel(null, columnas);

        String[] registros = new String[columnas.length];

        try {

            PreparedStatement pst = con.prepareCall("select ta.id_cheque,ta.no_viaje,a.id_area, a.nombrecorto ,ta.fecha_anticipo,ta.monto_anticipo,ta.status_anticipo,\n"
                    + "CASE\n"
                    + "WHEN ta.status_anticipo = 'A' THEN 'Aceptado'\n"
                    + "WHEN ta.status_anticipo = 'C' THEN 'Cancelado'\n"
                    + "WHEN ta.status_anticipo = 'E' THEN 'Edicion'\n"
                    + "WHEN ta.status_anticipo = 'L' THEN 'Liquidacion'\n"
                    + "END estatus_letra,\n"
                    + "ta.id_ingreso,observaciones,\n"
                    + "p.nombre,\n"
                    + "ta.fecha_pago,ta.referencia_pago,ta.fecha_ingreso,ta.detalles\n"
                    + "from dbo.trafico_anticipo ta \n"
                    + "join dbo.general_area a on a.id_area = ta.id_area \n"
                    + "join dbo.personal_personal p on p.id_personal = ta.id_operador\n"
                    + "where no_viaje = ? and ta.id_area = ?");

            pst.setInt(1, no_Viaje);
            pst.setInt(2, codigoArea);

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
                registros[10] = rs.getString(11);
                registros[11] = rs.getString(12);
                registros[12] = rs.getString(13);
                registros[13] = rs.getString(14);
                registros[14] = rs.getString(15);

                modelo.addRow(registros);

            }

            return modelo;

        } catch (Exception e) {
            return null;
        }

    }

    public Trafico_anticipo dataIndividual(int no_Viaje, int codigoArea) {

        Trafico_anticipo obj = new Trafico_anticipo();

        try {
            PreparedStatement pst = con.prepareCall("select ta.id_cheque,ta.no_viaje,a.id_area, a.nombrecorto ,ta.fecha_anticipo,ta.monto_anticipo,ta.status_anticipo,\n"
                    + "CASE\n"
                    + "WHEN ta.status_anticipo = 'A' THEN 'Aceptado'\n"
                    + "WHEN ta.status_anticipo = 'C' THEN 'Cancelado'\n"
                    + "WHEN ta.status_anticipo = 'E' THEN 'Edicion'\n"
                    + "WHEN ta.status_anticipo = 'L' THEN 'Liquidacion'\n"
                    + "END estatus_letra,\n"
                    + "ta.id_ingreso,observaciones,\n"
                    + "p.nombre,\n"
                    + "ta.fecha_pago,ta.referencia_pago,ta.fecha_ingreso,ta.detalles\n"
                    + "from dbo.trafico_anticipo ta \n"
                    + "join dbo.general_area a on a.id_area = ta.id_area \n"
                    + "join dbo.personal_personal p on p.id_personal = ta.id_operador\n"
                    + "where no_viaje = ? and ta.id_area = ?");

            pst.setInt(1, no_Viaje);
            pst.setInt(2, codigoArea);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                obj.setId_cheque(rs.getInt(1));
                obj.setId_cheque(rs.getInt(2));
                obj.setId_cheque(rs.getInt(3));
                obj.setId_cheque(rs.getInt(4));
                obj.setId_cheque(rs.getInt(5));
                obj.setId_cheque(rs.getInt(6));
                obj.setId_cheque(rs.getInt(7));
                obj.setId_cheque(rs.getInt(8));
                obj.setId_cheque(rs.getInt(10));
                obj.setId_cheque(rs.getInt(11));
                obj.setId_cheque(rs.getInt(12));
                obj.setId_cheque(rs.getInt(13));
                obj.setId_cheque(rs.getInt(14));

            }

            return obj;

        } catch (SQLException e) {
            obj.setErrorMensaje("Error en la clase " + getClass() + " Error en " + e.getMessage());
            return obj;
        }

    }

    public String update_trafico_anticipo(Trafico_anticipo obj) {
        String mensajeError;
        String sql;

        try {
            System.out.println("Observaciones " + obj.getObservaciones() + " Estauts "+obj.getStatus_anticipo());

            if (obj.getObservaciones().length() <= 0 && !obj.getStatus_anticipo().equalsIgnoreCase("C")) {
                // modificaion de estatus
                sql = "update dbo.trafico_anticipo set status_anticipo = ? where no_viaje = ? and id_area = ?";

                PreparedStatement pst = con.prepareCall(sql);

                pst.setString(1, obj.getStatus_anticipo());
                pst.setInt(2, obj.getNo_viaje());
                pst.setInt(3, obj.getId_area());
                pst.execute();

            } else {
                
                ///cancelacion
                sql = "update dbo.trafico_anticipo set status_anticipo = ?, observaciones = ? where  no_viaje = ? and id_area = ?";
                PreparedStatement pst = con.prepareCall(sql);
                pst.setString(1, obj.getStatus_anticipo());
                pst.setString(2, obj.getObservaciones());
                pst.setInt(3, obj.getNo_viaje());
                pst.setInt(4, obj.getId_area());
                pst.execute();

            }

            return "success";

        } catch (SQLException e) {
            mensajeError = "Error en la clase" + getClass() + " Error " + e.getMessage();
            return mensajeError;
        }
    }
}
