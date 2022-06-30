package Logica;

import Helpers.Ayudas;
import Modelo.UnidadesOpenBook;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class fUnidadesOpenBook {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private Ayudas help = new Ayudas();

    public DefaultTableModel showAllData(String buscar) {

        DefaultTableModel modelo;
        int contador = 1;
        String[] columnas = {"Id", "Unidad", "Fecha Inicio", "Fecha Final", "Meta Mensual", "Cuota Diaria", "Estatus",
            "Sucursal", "Estatus Operativo", "Tipo Cuota", "Cuota Pepsi", "Comentarios"};

        String[] filas = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            PreparedStatement pst = con.prepareCall("{call sp_ZEMOG_mostrar_unidades_de_openBook(?)}");
            pst.setString(1, buscar);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                for (int i = 0; i < filas.length; i++) {

                    filas[i] = rs.getString(contador);
                    contador += 1;
                }
                contador = 1;
                modelo.addRow(filas);
            }

            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

    public String mantenimientoUnidades(UnidadesOpenBook obj) {

        try {
            System.out.println("accion " + obj.getAccion());
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mantenimiento_Unidades_OpenBook(?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setInt(1, obj.getId());
            cst.setString(2, obj.getId_unidad());
            cst.setInt(3, obj.getId_area());
            cst.setString(4, obj.getFechaInicio());
            cst.setString(5, obj.getFechaFinal());
            cst.setString(6, obj.getTipoCuota());
            cst.setInt(7, obj.getId_estatus());
            cst.setInt(8, obj.getId_estatus_pepsi());
            cst.setInt(9, obj.getId_estatus_operativo());
            cst.setString(10, obj.getComentario());
            cst.setString(11, obj.getAccion());
            ///XG = ZG vallarta - 

            cst.execute();

            return "success";

        } catch (SQLException e) {
            obj.setError("No se puedo " + obj.getAccion() + " el registro " + e.getMessage());
            return obj.getError();
        }

    }

    public ArrayList<String> bases() {
        ArrayList<String> arreglo = new ArrayList();
        int contador = 0;
        int contadorRegistros = 1;

        SQL = "SELECT nombrecorto FROM dbo.general_area";

        try {

            PreparedStatement pst = con.prepareCall(SQL);

            ResultSet rs = pst.executeQuery();

            arreglo.add("Selecciona una sucursal");

            while (rs.next()) {
                arreglo.add(rs.getString(contadorRegistros));
            }

            return arreglo;

        } catch (SQLException e) {
            return null;
        }

    }

    public int seleccion_base(String base) {
        int codigo_area = 0;
        SQL = "select id_area from dbo.general_area where nombrecorto = ?";

        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, base);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt(1);
            }

            return codigo_area;

        } catch (SQLException e) {
            return 0;
        }

    }

    public int powerEstatusUnidadesOperativas(String nombreEstatus) {
        int codigo_area = 0;
        SQL = "select id from dbo.powerEstatusUnidadesOperativas where nombreEstatus = ?";

        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, nombreEstatus);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt(1);
            }

            return codigo_area;

        } catch (SQLException e) {
            return 0;
        }

    }

    public int powerzam_estatus_unidad(String nombreEstatus) {

        int codigo_area = 0;
        SQL = "select id_estatus from dbo.powerzam_estatus_unidad where nombre_Estatus = ?";

        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, nombreEstatus);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt(1);
            }

            return codigo_area;

        } catch (SQLException e) {
            return 0;
        }

    }
    
    public int estatus_pepsi(String nombreEstatus) {

        int codigo_area = 0;
        SQL = "select id_estatus_pepsi from dbo.powerzam_estatus_pepsi_especial where nombreEstatus = ?";

        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, nombreEstatus);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt(1);
            }

            return codigo_area;

        } catch (SQLException e) {
            return 0;
        }

    }

    public int validacionExistenciaUnidad(String eco) {
        SQL = "SELECT id_unidad FROM dbo.mtto_unidades where id_unidad = ?";
        int existencia = 0;
        try {
            PreparedStatement pst = con.prepareCall(SQL);
            pst.setString(1, eco);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                existencia = 1;
            }

            return existencia;

        } catch (SQLException e) {
            return 0;
        }

    }

    public int validacionDeSucursal(int codigoArea){
        SQL = "select id_area from dbo.mtto_unidades where id_unidad = ?";
        int id_area = 0;
        try {
            
            PreparedStatement pst = con.prepareCall(SQL);
            
            pst.setInt(1, codigoArea);
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                id_area = rs.getInt(1);
            }
            
            return id_area;
            
        } catch (SQLException e) {
            return id_area;
        }
        
    
    }
    
}
