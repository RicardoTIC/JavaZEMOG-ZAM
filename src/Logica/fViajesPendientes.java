package Logica;

import Helpers.Ayudas;
import Modelo.ViajesPendientes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public String Buscar_comboBox(int id) {
        String valor = "";

        try {

            PreparedStatement pst = con.prepareCall("select estatusViajePendiente from powerZemogViajesPendientes where id=" + id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                valor = rs.getString("estatusViajePendiente");
                return valor;
            }

        } catch (SQLException e) {

            return valor = "";
        }

        return valor;
    }

    public String Buscar_comboBoxEstatus(int id) {
        String valor = "";

        try {

            PreparedStatement pst = con.prepareCall("SELECT motivoError FROM powerZemogViajesPendientes where id ="+id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                valor = rs.getString("motivoError");
                return valor;
            }

        } catch (SQLException e) {

            return valor = "";
        }

        return valor;
    }

    public DefaultTableModel showdata(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {
            "id",
            "numeroViaje",
            "folio",
            "numeroEconomico",
            "codigoArea",
            "sucursal",
            "kilometros",
            "FechaCaptura",
            "numeroGuia",
            "factura",
            "flete",
            "estadoViajeFacturado",
            "estatusViajePendiente",
            "motivoError",
            "comentarioError"
        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_viajes_seguimiento_facturas(?)}");
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
                registros[12] = rs.getString(13);
                registros[13] = rs.getString(14);
                registros[14] = rs.getString(15);

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensajeLateral("Error", "Error en la consulta fviajes " + e.getMessage(), "error");
            return null;
        }

    }

    public DefaultTableModel ResumenData() {

        DefaultTableModel modelo;

        String[] columnas = {
            "Sucursal",
            "Tipo error",
            "Cantidad de incidencias"

        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {
            PreparedStatement pst = con.prepareCall("select sucursal,motivoError comentario  ,count(*) NumeroIncidencias from powerZemogViajesPendientes \n"
                    + "group by sucursal,motivoError order by sucursal asc");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensajeLateral("Error", "Error en la consulta fviajesPendiente " + e.getMessage(), "error");
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

            if(n > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    
}
