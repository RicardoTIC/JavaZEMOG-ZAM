package Logica;

import Helpers.Ayudas;
import Modelo.ViajesPendientes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fViajesPendientes {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    
        public DefaultTableModel showdata(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {
            "id",
            "Numero Viaje","Folio","NumeroEconomico","FechaCaptura","Numero guia","Factura","Flete","estadoViajeFacturado",
            "EstatusViajePendiente","MotivoError","ComentariosError"
        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_viajes_seguimiento_facturas(?) }");
            cst.setString(1, buscar);

            ResultSet rs = cst.executeQuery();

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

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensajeLateral("Error", "Error en la consulta fviajes " + e.getMessage(), "error");
            return null;
        }

    }

    
    public boolean matenimiento(ViajesPendientes u) {

        try {
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mantenimiento_viajes_pendientes(?,?,?,?,?,?)}");
                        
            cst.setString(1, u.getEstatusViajePendiente());
            cst.setInt(2, u.getNumeroViaje());
            cst.setInt(3, u.getCodigoArea());
            cst.setString(4, u.getMotivoError());
            cst.setString(5, u.getComentarioError());
            cst.setString(6, u.getAccion());


            int n = cst.executeUpdate();
            
            if (n>0) {
                return true;
            }else{
                return false;
            }
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
