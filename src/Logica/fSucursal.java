
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Sucursal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;


public class fSucursal extends crud<Sucursal> {
    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    public int totalRegistros;
    public int totalUnidades;
    private Ayudas help = new Ayudas();
    private String SQL ;
    
    
    @Override
    public DefaultTableModel showdata(String buscar) {
               DefaultTableModel modelo;

        String[] columnas = {"id area","Nombre Sucursal","Corto","Operacion","Presupuesto","# de unidades","$ por equipo"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call mostrarSucursales(?)}");
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
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fviajes " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }
    }

    
    public Sucursal datosSucursal(String sucursal){
        Sucursal suc = new Sucursal();
        SQL = "select id_area,nombre,nombrecorto from dbo.general_area where nombrecorto = ?";
        
        
        try {
            
            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, sucursal);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {                
                
                suc.setId_area(rs.getInt(1));
                suc.setNombre(rs.getString(2));
                suc.setNombrecorto(rs.getString(3));
                
            }
            
            return suc;
            
        } catch (SQLException e) {
        
            return null;
        }
        
    }
    
    @Override
    public boolean insert(Sucursal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Sucursal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Sucursal Obj) {
       SQL = "Update general_area set presupuesto = ?,costoPorEquipo = ?, n_unidades = ? where id_area = ?";
        try {
            
            PreparedStatement pst = con.prepareCall(SQL);
            pst.setFloat(1, Obj.getPresupuesto());
            pst.setInt(2, Obj.getCostoPorEquipo());
            pst.setInt(3, Obj.getNumeroUnidades());
            pst.setInt(4, Obj.getId_area());
            
            pst.execute();
            
            return true;
            
            
            
        } catch (SQLException e) {
            Obj.setMensajeError("Error en "+e.getMessage());
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
