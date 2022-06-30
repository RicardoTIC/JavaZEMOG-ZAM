/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Carta_de_Cobro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class fCartaCobro extends crud<Carta_de_Cobro> {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    @Override
    public DefaultTableModel showdata(String buscar) {
        
        String [] columnas = {"Codigo area","Numero Guia","Factura","Carta cobro","Flete","Remision","Fecha Vencimiento"};
        
        DefaultTableModel modelo = new DefaultTableModel(null,columnas);
        
        String[] registros = new String[columnas.length];

        
        try {
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_carta_cobro(?)}");
            cst.setString(1, buscar);
            
            ResultSet rs = cst.executeQuery();
            
            while (rs.next()) {                
                
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(6);
                registros[5] = rs.getString(19);
                registros[6] = rs.getString(23);
                
                modelo.addRow(registros);
            }
            
            return modelo;
            
            
        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public boolean insert(Carta_de_Cobro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Carta_de_Cobro obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Carta_de_Cobro Obj) {
        
        try {
            

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_cancelar_carta_cobro(?,?)}");
            cst.setString(1, Obj.getNo_guia());
            cst.setInt(2, Obj.getId_area());
            

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
