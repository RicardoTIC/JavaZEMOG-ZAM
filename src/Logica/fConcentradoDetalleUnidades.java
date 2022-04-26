package Logica;

import Helpers.Ayudas;
import Modelo.ConcentradoDetalleUnidades;
import Modelo.Sucursal;
import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fConcentradoDetalleUnidades {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    private int totalKilometros;
    private Ayudas help = new Ayudas();

    //Metod de insertar
    public String insertData(ConcentradoDetalleUnidades obj) {

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_Insertar_numero_de_unidades(?,?,?,?)}");

            cst.setString(1, obj.getFecha_unidades());
            cst.setDate(2, obj.getFecha_final());
            cst.setInt(3, obj.getId_area());
            cst.setInt(4, obj.getNumeroUnidades());

            cst.execute();

            return "success";

        } catch (Exception e) {
            obj.setMensajeError("No se puedo insertar ningun registro en la base de datos " + getClass().getName() + " Codigo de error " + e.getMessage());
            return obj.getMensajeError();
        }

    }

    public DefaultTableModel ListaDeDatos() {
        String valor = "";
        DefaultTableModel modelo;
        String[] columnas = {"Id", "Sucursal", "Numero de unidades", "Fecha Unidades"};
        String[] registros = new String[columnas.length];
        modelo = new DefaultTableModel(null, columnas);
        int contador = 1;

        try {

            PreparedStatement pst = con.prepareCall("select pdu.id,a.nombrecorto,pdu.numeroUnidades,pdu.fecha_unidades from dbo.powerDetalleUnidades pdu\n"
                    + "join dbo.general_area a on a.id_area = pdu.id_area");
            //pst.setString(1, buscar);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                for (int i = 0; i < registros.length; i++) {

                    registros[i] = rs.getString(contador);
                    contador++;
                }
                modelo.addRow(registros);
                contador = 1;
            }
            return modelo;

        } catch (SQLException e) {

            return null;
        }

    }

    public Sucursal dataRegistre(String buscador) {
        Sucursal obj = new Sucursal();
        try {

            PreparedStatement pst = con.prepareCall("select id_area,nombrecorto from general_area where nombrecorto = ?");
            pst.setString(1, buscador);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                obj.setId_area(rs.getInt(1));
                obj.setNombrecorto(rs.getString(2));

            }
            return obj;

        } catch (SQLException e) {

            return obj;

        }

    }

    public String actualizar(ConcentradoDetalleUnidades obj) {

        try {

            PreparedStatement pst = con.prepareCall("UPDATE powerDetalleUnidades SET numeroUnidades = ? where id = ? ");
            pst.setInt(1, obj.getNumeroUnidades());
            pst.setInt(2, obj.getId());

            pst.execute();

            return "success";

        } catch (SQLException e) {
            obj.setMensajeError("No se pudo actualizar el datos revisar " + getClass().getName() + " Error" + e.getMessage());
            return obj.getMensajeError();
        }

    }

    public DefaultTableModel resumenUnidades(String fechaInicio, String fechaFinal) {

        DefaultTableModel modelo;
        String[] columnas = {"Id", "Sucursal", "Numero Unidades", "Fecha Unidades"};
        String[] registros = new String[columnas.length];
        modelo = new DefaultTableModel(null, columnas);
        int contador = 1;

        try {

            PreparedStatement pst = con.prepareCall("select pdu.id,a.nombrecorto,pdu.numeroUnidades, pdu.fecha_unidades from dbo.powerDetalleUnidades pdu\n"
                    + "join dbo.general_area a on a.id_area = pdu.id_area where fecha_unidades >=? and fecha_unidades <= ?");

            pst.setString(1, fechaInicio);
            pst.setString(2, fechaFinal);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                for (int i = 0; i < registros.length; i++) {

                    registros[i] = rs.getString(contador);
                    contador++;
                }
                modelo.addRow(registros);
                contador = 1;
            }
            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

}
