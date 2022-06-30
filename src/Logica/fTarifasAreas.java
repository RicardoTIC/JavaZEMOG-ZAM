package Logica;

import Helpers.Ayudas;
import Modelo.PowerTarifas;
import Modelo.Sucursal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fTarifasAreas {

    private final Conexion sqlServer = new Conexion();
    private final Connection con = sqlServer.conectar();
    
    public DefaultTableModel showAllData(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Id", "Sucursal", "Cuota Mensual", "Cuota por mov", "Fecha inicio"
        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_tarifas(?,?,?)}");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechaFinal);
            cst.setString(3, buscador);

            ResultSet rs = cst.executeQuery();

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
    
    public boolean manteniminetoTarifas (PowerTarifas obj){
        
        
        try {
            
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_powerTarifasArea(?,?,?,?,?,?,?)}");
            cst.setString(1, obj.getAccion());
            cst.setString(2, obj.getFechaInicio());
            cst.setString(3, obj.getFechaFinal());
            cst.setInt(4, obj.getId_area());
            cst.setInt(5, obj.getCuotaKmUnidad());
            cst.setDouble(6, obj.getCuotaViajesUnidad());
            cst.setInt(7, obj.getId());
            
            
            cst.execute();
            
            
            return true;
            
            
        } catch (SQLException e) {
            
            obj.error = "Error en la consulta a la base de datos " + e.getMessage();
        
        }
        
        return false;
    
    }
    
    public Sucursal codigo_area(String sucursal){
        
        Sucursal obj = new Sucursal();
        
        
        try {
            
            PreparedStatement pst= con.prepareCall("SELECT a.id_area , a.nombrecorto FROM dbo.general_area a where a.nombrecorto = ? ");
            pst.setString(1, sucursal);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                obj.setId_area(rs.getInt(1));
                obj.setNombrecorto(rs.getString(2));
                
            }
            
            return obj;
            
            
        } catch (SQLException e) {
            obj.setMensajeError("Error en la consulta a la base de datos "+e.getMessage());
            
        }
        
        return obj;
    }
    
    
}
