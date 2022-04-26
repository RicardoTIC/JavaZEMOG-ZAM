/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Ruta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class fRutas extends crud<Ruta> {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    public int totalRegistros;
    public int totalUnidades;
    private Ayudas help = new Ayudas();

    public Ruta dataOnly(String nombreRuta, int codigoArea) {

        /* El metodo recauda la informacion de la rutas */
        Ruta obj = new Ruta();
        try {

            PreparedStatement pst = con.prepareCall("SELECT id_cliente,tc.id_area,id_convenio,desc_convenio,monto_factor_s,monto_factor_f, monto_factor_f_MT,monto_factor_s_MT,id_ruta, a.nombrecorto \n"
                    + "FROM dbo.trafico_convenio tc join dbo.general_area a on a.id_area = tc.id_area \n"
                    + "where  tc.desc_convenio =? and a.id_area =?");

            pst.setString(1, nombreRuta);
            pst.setInt(2, codigoArea);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                obj.setId_cliente(rs.getInt(1));
                obj.setCodigoArea(rs.getInt(2));
                obj.setId_convenio(rs.getInt(3));
                obj.setNombreRuta(rs.getString(4));
                obj.setMonto_factor_s(rs.getFloat(5));
                obj.setMonto_factor_f(rs.getFloat(6));
                obj.setMonto_factor_s_MT(rs.getFloat(7));
                obj.setMonto_factor_f_MT(rs.getFloat(8));
                obj.setCodigo_ruta(rs.getInt(9));
                obj.setNombreRuta(rs.getString(10));
       
            }

            return obj;

        } catch (SQLException e) {
            obj.setErrorMensaje("Error en la clase " + getClass().getName() + " Tipo Error " + e.getMessage());
            return obj;
        }

    }

    @Override
    public DefaultTableModel showdata(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {"Id", "Sucursal", "Nombre Ruta", "Km", "Codigo Ruta", "Monto Sencillo", "Monto Full", "Codigo ruta"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call mostrarRutas(?)}");
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

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fRutas " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }
    }

    @Override
    public boolean insert(Ruta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Ruta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Ruta Obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultListModel showListData(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel showdataFordate(String fechaInicio, String fechafinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel resumenIndicador(String fechaInicio, String fechafinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel showdataFordate(String fechaInicio, String fechafinal, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
