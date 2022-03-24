/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Convenios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class fConvenios extends crud<Convenios> {
    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;
    
    public List<Convenios> listaConvenios(Convenios obj){
        
        List<Convenios> list = new ArrayList<>();
        Convenios obj2 =  new Convenios();
        
        try {
            
            CallableStatement cst = con.prepareCall("{Call sp_ZEMOG_consultar_convenio(?,?)}");
            cst.setInt(1, obj.getCodigoRuta());
            cst.setInt(2, obj.getCodigoArea());

            
            ResultSet rs = cst.executeQuery();
            
            
            if (rs.next()) {
                
                obj2.setId_convenio(rs.getInt(1));
                obj2.setNombreConvenio(rs.getString(3));
                obj2.setRemitente(rs.getString(6));
                obj2.setDestinatario(rs.getString(8));
                obj2.setOrigen(rs.getString(12));
                obj2.setDestino(rs.getString(14));
                obj2.setVentaFullMT(rs.getDouble(24));
                obj2.setVentaSencilloMT(rs.getDouble(25));
                obj2.setVentaFactorFull(rs.getDouble(23));
                obj2.setVentaFactorSencillo(rs.getDouble(22));
                
                list.add(obj2);
            }
            
            return list;
            
        } catch (SQLException e) {
            return null;
        }
        
        
    }
    
        public String update_expedicion(String tipoExpedicion, int numeroViaje, int codigoArea){
    
        try {
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_cambio_expedicion(?,?,?) }");
            cst.setString(1, tipoExpedicion);
            cst.setInt(2, numeroViaje);
            cst.setInt(3, codigoArea);
            
            cst.execute();
            
            return "success";
                    
            
            
        } catch (SQLException e) {
            return "Error " + e.getMessage();
        }
        
    }
    
    @Override
    public DefaultTableModel showdata(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Convenios obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Convenios obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String updateConvenio(Convenios obj){
        
        try {
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_modificar_ruta(?,?,?,?)}");
            cst.setInt(1, obj.getNumeroviaje());
            cst.setInt(2, obj.getCodigoArea());
            cst.setInt(3, obj.getCodigoRuta());
            cst.setString(4, obj.getNum_guia());
            
            System.out.println("Numero de viaje : "+obj.getNumeroviaje() + " Codigo de area "+ obj.getCodigoArea() + " Codigo de ruta "+obj.getCodigoRuta() + " Numero de guia "+ obj.getNum_guia());
            
            cst.execute();
            
            return "success";
            
            
        } catch (SQLException e) {
            return "Error " + e.getMessage();
        }
        
        
    }
    
    @Override
    public boolean update(Convenios Obj) {
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
