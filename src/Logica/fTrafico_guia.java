package Logica;

import Helpers.Ayudas;
import Modelo.Trafico_guia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fTrafico_guia {

    //Declaracion de variables globales
    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();

    public DefaultTableModel showDataTravelTraffic(Trafico_guia obj) {

        DefaultTableModel modelo;
        String[] columnas
                = {
                    "No viaje", "Codigo area", "Nombre corto", "No guia", "Estatus guia", "Estatus Letra",
                    "Prestamo", "Prestamo estatus", "Flete", "Iva asignado", "Numero guia", "Numero guia asignado",
                    "Unidad", "Remolque 1", "Remolque 2", "Motivo Cancelacion", "Fecha cancelacion", "Fecha guia",
                    "Remision", "Usuario alta", "Fecha de modificacion"
                };

        modelo = new DefaultTableModel(null, columnas);

        String[] registros = new String[columnas.length];

        try {

            PreparedStatement pst = con.prepareCall("SELECT tg.no_viaje,tg.id_area,a.nombrecorto,tg.no_guia,\n"
                    + "tg.status_guia,\n"
                    + "CASE\n"
                    + "WHEN tg.status_guia = 'C' THEN 'Confirmado'\n"
                    + "WHEN tg.status_guia = 'R' THEN 'Regreso'\n"
                    + "WHEN tg.status_guia = 'A' THEN 'Pendiente'\n"
                    + "WHEN tg.status_guia = 'T' THEN 'Transito'\n"
                    + "WHEN tg.status_guia = 'B' THEN 'Cancelado'\n"
                    + "END estatus_Letra,tg.prestamo,CASE WHEN tg.prestamo = 'P' THEN 'Pendiente' WHEN tg.prestamo = 'N' THEN 'Aceptado' END Prestamo_letra\n"
                    + ",tg.flete,tg.iva_guia,tg.num_guia,tg.num_guia_asignado,tg.id_unidad,tg.id_remolque1,\n"
                    + "tg.id_remolque2,tg.motivo_cancelacion,\n"
                    + "tg.fecha_cancelacion,\n"
                    + "tg.fecha_guia,\n"
                    + "tg.no_remision,\n"
                    + "id_modifico,\n"
                    + "tg.fecha_modifico\n"
                    + "FROM dbo.trafico_guia tg \n"
                    + "join dbo.general_area a on a.id_area = tg.id_area\n"
                    + "where tg.no_viaje =? and tg.id_area =?");
            pst.setInt(1, obj.getNo_viaje());
            pst.setInt(2, obj.getCodigo_area());

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
                registros[15] = rs.getString(16);
                registros[16] = rs.getString(17);
                registros[17] = rs.getString(18);
                registros[18] = rs.getString(19);
                registros[19] = rs.getString(20);
                registros[20] = rs.getString(21);

                modelo.addRow(registros);

            }

            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

    public String updateStatusTravelGuia(Trafico_guia obj) {
        String sql = "";
        try {

            if (obj.getStatus_guia().equalsIgnoreCase("B")) {

                sql = "update dbo.trafico_guia set status_guia = ? , fecha_cancelacion = GETDATE() , fecha_modifico =GETDATE(),\n"
                        + "motivo_cancelacion = ? ,prestamo = ? where no_guia =?";

            } else if (obj.getStatus_guia().equalsIgnoreCase("R")) {
                
                sql = "update dbo.trafico_guia set status_guia = ? , fecha_cancelacion = null , fecha_modifico =GETDATE(),\n"
                        + "motivo_cancelacion = null ,prestamo = null where no_guia =?";
                
            }
            
            PreparedStatement pst = con.prepareCall(sql);
            
            pst.setString(1, obj.getStatus_guia());
            pst.setString(2, obj.getMotivo_cancelacion());
            pst.setString(3, obj.getPrestamo());
            pst.setInt(4, obj.getNo_guia());
            
            
            pst.execute();
            
            
            return "success";
            
            

        } catch (SQLException e) {
            return "Tienes un error en la clase "+getClass().getName() + " El error corresponde "+ e.getMessage();
        }
        

    }
}
