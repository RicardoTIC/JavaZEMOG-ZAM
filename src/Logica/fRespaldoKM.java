package Logica;

import Helpers.crud;
import Modelo.RespaldoKM;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import Modelo.RespaldoKM;
import Modelo.Sucursal;
import Modelo.Unidad;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class fRespaldoKM extends crud<RespaldoKM> {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    private RespaldoKM obj = new RespaldoKM();  
    
    
    
    @Override
    public DefaultTableModel showdata(String buscar) {
        DefaultTableModel modelo;

        int contador = 1;
        String[] columnas = {"Id", "Fecha", "Km Reales", "Venta", "Sucursal"};
        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_respaldo_km(?)}");
            cst.setString(1, buscar);

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
            obj.setError("Error " + e.getMessage());
            return null;
        }

    }

    public DefaultTableModel showdata(String fechaInicial, String fechaFinal, String buscar) {
        DefaultTableModel modelo;

        int contador = 1;
        String[] columnas = {"Id", "Fecha", "Km Reales", "Venta", "Sucursal"};
        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_respaldo_km(?,?,?)}");
            cst.setString(1, fechaInicial);
            cst.setString(2, fechaFinal);
            cst.setString(3, buscar);

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
            obj.setError("Error " + e.getMessage());
            return null;
        }

    }

    public ArrayList<Sucursal> bases() {
        ArrayList<Sucursal> arreglo = new ArrayList<>();
       
        
        SQL = "SELECT nombrecorto,id_area, po.nombreCortoOperacion FROM dbo.general_area a\n" +
              "join dbo.powerOperacion po on po.id_operacion = a.id_operacion";

        try {

            PreparedStatement pst = con.prepareCall(SQL);

            ResultSet rs = pst.executeQuery();
            
            //arreglo.add(obj.);
            
            Sucursal uni = new Sucursal();
            uni.setNombrecorto("Selecciona la sucursal");
            arreglo.add(uni);
            
            while (rs.next()) {
               Sucursal uni2 = new Sucursal();
               
               uni2.setNombrecorto(rs.getString(1));
               uni2.setId_area(rs.getInt(2));
               uni2.setNombreOperacion(rs.getString(3));
               
               arreglo.add(uni2);
            }
            
           

            return arreglo;

        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public boolean insert(RespaldoKM obj) {
        SQL = "insert into powerResumenKmSucursal "
                + "(fecha,id_area,kmReales,kmException,venta,nombreOperacion)"
                + "values(?,?,?,?,?,?)";
        try {
            
            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, obj.getFecha());
            pst.setInt(2, obj.getCodigoArea());
            pst.setInt(3, obj.getKmsReales());
            pst.setInt(4, obj.getKmsReales());
            pst.setDouble(5, obj.getVenta());
            pst.setString(6, obj.getNombreOperacion());

            pst.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    @Override
    public boolean delete(RespaldoKM obj) {

        SQL = "DELETE FROM powerResumenKmSucursal WHERE id = ?";
        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setInt(1, obj.getId());

            pst.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    @Override
    public boolean update(RespaldoKM Obj) {

        SQL = "UPDATE powerResumenKmSucursal SET fecha = ?, id_area = ?,kmReales =?,kmException = ?,venta = ?,nombreOperacion = ? WHERE id = ?";

        try {

            PreparedStatement pst = con.prepareCall(SQL);

            pst.setString(1, obj.getFecha());
            pst.setInt(2, obj.getCodigoArea());
            pst.setInt(3, obj.getKmsReales());
            pst.setInt(4, obj.getKmsReales());
            pst.setDouble(5, obj.getVenta());
            pst.setString(6, obj.getNombreOperacion());
            pst.setInt(7, obj.getId());

            pst.execute();

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
