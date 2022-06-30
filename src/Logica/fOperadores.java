/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Operador;
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
public class fOperadores extends crud<Operador> {

    public int totalRegistros;
    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    Ayudas help = new Ayudas();

    public Operador buscar_informacion_operador(String nombre){
        Operador valorEncontrado = new Operador();
        try {
            
            PreparedStatement pst = con.prepareCall("SELECT CASE WHEN estado = 'A' THEN 'Activo' ELSE 'Inactivo' END estado, fecha_baja,nombre FROM personal_personal where nombre =?");
            pst.setString(1, nombre);
            
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                valorEncontrado.setEstado(rs.getString(1));
                valorEncontrado.setFecha_baja(rs.getString(2));
                valorEncontrado.setNombreOperador(rs.getString(3));
            }
            
            return valorEncontrado;
            
        } catch (SQLException e) {
            valorEncontrado.setMensajeError("Mensaje de error "+e.getMessage());
            return valorEncontrado;
        }
        
    }
    
    
    public String buscar_estatus_operador(String nombreOperador){
        String valorEncontrado = "";
        try {
            
            PreparedStatement pst = con.prepareCall("SELECT CASE WHEN estado = 'A' THEN 'Activo' ELSE 'Inactivo' END estado FROM personal_personal where nombre =?");
            pst.setString(1, nombreOperador);
            
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                valorEncontrado = rs.getString(1);
            }
            
            return valorEncontrado;
            
        } catch (SQLException e) {
            return "No se encontro ningun estado de operador" + e.getMessage();
        }
        
    }
    
    public DefaultTableModel showdata(String buscar, String sucursal, String activo) {

        try {

            DefaultTableModel modelo;

            String[] columnas = {"id", "Nombre", "Fecha Baja", "Descripcion", "Sucursal", "Tipo Empleado", "Estado"};
            String[] filas = new String[columnas.length];

            modelo = new DefaultTableModel(null, columnas);

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarOperadores(?,?,?)}");
            cst.setString(1, buscar);
            cst.setString(2, sucursal);
            cst.setString(3, activo);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                filas[0] = rs.getString(1);
                filas[1] = rs.getString(2);
                filas[2] = rs.getString(3);
                filas[3] = rs.getString(4);
                filas[4] = rs.getString(5);
                filas[5] = rs.getString(6);
                filas[6] = rs.getString(7);
                totalRegistros += 1;
                modelo.addRow(filas);

            }

            return modelo;

        } catch (Exception e) {
            help.mensaje("Error en el medotodo showData fOperadores ", "Error");
            return null;
        }

    }

    @Override
    public DefaultTableModel showdata(String buscar) {

        try {

            DefaultTableModel modelo;

            String[] columnas = {"id", "Nombre", "Puesto", "Sucursal", "Telefono", "Tipo empleado", "Estado", "Estado L"};
            String[] filas = new String[columnas.length];

            modelo = new DefaultTableModel(null, columnas);

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarOperadores(?,?)}");

            cst.setString(1, buscar);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                filas[0] = rs.getString(1);
                filas[1] = rs.getString(2);
                filas[2] = rs.getString(3);
                filas[3] = rs.getString(4);
                filas[4] = rs.getString(5);
                filas[5] = rs.getString(6);
                filas[6] = rs.getString(7);
                filas[7] = rs.getString(8);
                totalRegistros += 1;
                modelo.addRow(filas);

            }

            return modelo;

        } catch (Exception e) {
            help.mensaje("Error en el medotodo showData fOperadores ", "Error");
            return null;
        }

    }

    @Override
    public boolean insert(Operador obj) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public boolean delete(Operador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Operador Obj) {
        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_modificar_operador(?,?,?)}");
            
            cst.setInt(1, Obj.getNo_viaje());
            cst.setInt(2, Obj.getCodigo_area());
            cst.setInt(3, Obj.getId_operador());
            
            cst.executeUpdate();
            
            return true;

        } catch (SQLException e) {
            help.mensaje("Error en el medotodo update fOperadores ", "Error");
            return false;
        }
    }

    public boolean updateOperator(Operador obj){
        
        System.out.println("Estado " + obj.getEstado() + " Id Personal "+ obj.getId_operador());
        
        try {
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_actualizar_operador(?,?)}");
            cst.setString(1, obj.getEstado());
            cst.setInt(2, obj.getId_operador());
            
            cst.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        }
        
        
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
