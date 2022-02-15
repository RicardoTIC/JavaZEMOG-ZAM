/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Unidad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class fUnidades extends crud<Unidad> {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    public int totalRegistros;
    public int totalUnidades;
    private Ayudas help = new Ayudas();

    @Override
    public DefaultTableModel showdata(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {"Unidad", "Sucursal", "Numero de serie", "Modelo", "Placas", "Tarjeta de circulacion", "Tipo",
            "Poliza", "Estatus", "Aseguradora", "Tipo Unidad", "Tarjeta IAVE"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarUnidades(?)}");
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

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fviajes " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }

    }

    @Override
    public DefaultTableModel resumenIndicador(String fechaInicio, String fechafinal) {
        return null;
    }

    public DefaultTableModel resumenDeUnidades(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {"Sucursal", "Operacion", "Tipo Unidad", "Numero de unidades"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_resumen_unidades(?)}");
            cst.setString(1, buscar);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fUnidades " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }

    }

    public boolean actualizarUnidad(Unidad eco) {

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_actualizarTractor(?,?,?)}");
            cst.setString(1, eco.getId_unidad());
            cst.setInt(2, eco.getNumeroViaje());
            cst.setInt(3, eco.getCodigoArea());

            int n = cst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            help.mensajeLateral("error al actualizar Datos", e.getMessage(), "error");
            return false;
        }

    }

    @Override
    public boolean insert(Unidad obj) {
        return true;
    }

    @Override
    public boolean delete(Unidad obj) {
        return true;
    }

    @Override
    public boolean update(Unidad Obj) {
        return true;
    }

    @Override
    public DefaultListModel showListData(String buscar) {
        return null;
    }

    @Override
    public DefaultTableModel showdataFordate(String fechaInicio, String fechafinal) {

        return null;

    }

    @Override
    public DefaultTableModel showdataFordate(String fechaInicio, String fechafinal, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
