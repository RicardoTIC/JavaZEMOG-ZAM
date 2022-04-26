/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Modelo.ConvenioRutas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class fConveniosRutas {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    

    /*Lista de datos*/
    public DefaultTableModel listaConveniosRutas(String buscar,String sucursal) {

        DefaultTableModel modelo;

        String[] columnas = {"id_convenio",
            "Nombre ruta",
            "Sucursal",
            "id_remitente",
            "Remitente",
            "id_destinatario",
            "Destinatario",
            "id_cliente",
            "Cliente",
            "id_origen",
            "Origen",
            "id_destino",
            "Destino",
            "id_ruta",
            "desc_ruta",
            "id_tipo_operacion",
            "tipo_operacion",
            "nombreCliente",
            "kms_manual",
            "kms_ruta",
            "monto_factor_s",
            "monto_factor_f",
            "monto_factor_s_MT",
            "monto_factor_f_MT",
            "id_area_zemog",
            "tarifa"
        };
        
        modelo = new DefaultTableModel(null, columnas);
        String [] registros = new String[columnas.length];
        
        
        try {
            
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_ruta(?,?)}");
            cst.setString(1, buscar);
            cst.setString(2, sucursal);
            
            
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
                registros[15] = rs.getString(16);
                registros[16] = rs.getString(17);
                registros[17] = rs.getString(18);
                registros[18] = rs.getString(19);
                registros[19] = rs.getString(20);
                registros[20] = rs.getString(21);
                registros[21] = rs.getString(22);
                registros[22] = rs.getString(23);
                registros[23] = rs.getString(24);
                registros[24] = rs.getString(25);
                registros[25] = rs.getString(26);
                
                modelo.addRow(registros);
            }
            
            return modelo;
            
            
            
            
        } catch (SQLException e) {
            
            return null;
        }
        

    }
    
    
    /*Objeto convenios */
    public ConvenioRutas dataLine(){
        
        ConvenioRutas obj = new ConvenioRutas();
        
        try {
            
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_ruta(?)}");
            cst.setString(1, obj.getBuscardor());
            
            
            /*
            
            4 unidades por movimiento por 4 movimiento diarios 
            26 unidades por km por movimiento.
            
            */
            
            
            ResultSet rs = cst.executeQuery();
            
            if (rs.next()) {
                
                obj.setId_convenio(rs.getInt(1));
                obj.setDesc_convenio(rs.getString(2));
                obj.setId_area(rs.getString(3));
                obj.setId_remitente(rs.getInt(4));
                obj.setRemitente(rs.getString(5));
                obj.setId_destinatario(rs.getInt(6));
                obj.setDestinatario(rs.getString(7));
                obj.setId_cliente(rs.getInt(8));
                obj.setCliente(rs.getString(9));
                obj.setId_origen(rs.getInt(10));
                obj.setOrigen(rs.getString(11));
                obj.setId_destino(rs.getInt(12));
                obj.setDestino(rs.getString(13));
                obj.setId_ruta(rs.getInt(14));
                obj.setDesc_ruta(rs.getString(15));
                obj.setId_tipo_operacion(rs.getInt(16));
                obj.setTipo_operacion(rs.getString(17));
                obj.setNombreCliente(rs.getString(18));
                obj.setKms_manual(rs.getInt(19));
                obj.setKms_ruta(rs.getInt(20));
                obj.setMonto_factor_f(rs.getInt(21));
                obj.setId_convenio(rs.getInt(22));
                obj.setId_convenio(rs.getInt(23));
                obj.setId_convenio(rs.getInt(24));
                obj.setId_convenio(rs.getInt(25));
                obj.setId_convenio(rs.getInt(26));

            }
            
             return obj;
            
            
            
        } catch (SQLException e) {
            obj.setErrorMensaje("Error en la clase "+getClass() + " | "+e.getMessage() );
            return obj;
        }
        
        
    }
    
    
    
    
}
