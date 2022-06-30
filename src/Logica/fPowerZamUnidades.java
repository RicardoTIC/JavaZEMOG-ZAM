/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Modelo.EstatusUnidad;
import Modelo.Estatus_Pepsi;
import Modelo.Sucursal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.concurrent.Callable;
import javax.swing.table.DefaultTableModel;
import Modelo.PowerZamUnidades;
import java.util.List;

/**
 *
 * @author Ricardo Herrera
 */
public class fPowerZamUnidades {

    private Conexion cn = new Conexion();
    private Connection con = cn.conectar();
    private int totalRegistros = 0;
    private Ayudas ayuda = new Ayudas();

    PowerZamUnidades pwu = new PowerZamUnidades();

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] columnas = {"Fecha Inicial", "Fecha Final", "Unidad", "Sucursal", "Cuota", "Estatus", "Estatus Gepp", "id_area", "id_estatus", "id_estatus_pepsi",
             "Comentarios Movimiento", "Tipo Cuota"};

        String[] filas = new String[columnas.length];
        ///Rafael 
        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call mostrarPowerUnidades(?) }");
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
                filas[8] = rs.getString(9);
                filas[9] = rs.getString(10);
                filas[10] = rs.getString(11);
                filas[11] = rs.getString(12);

                totalRegistros = totalRegistros + 1;
                modelo.addRow(filas);

            }

            return modelo;

        } catch (SQLException e) {
            ayuda.mensaje("Error " + e.getMessage(), "Error");
            System.err.print(e.getMessage().getClass().getName());
            return null;
        }

    }

    public Vector comboBoxEstatusUnidad() {

        EstatusUnidad estatus = null;

        Vector<EstatusUnidad> datos = new Vector<EstatusUnidad>();

        try {

            PreparedStatement ps = con.prepareCall("SELECT * FROM powerzam_estatus_unidad");

            //Creamos una objeto con el indice cero 
            estatus = new EstatusUnidad();
            estatus.setId_estatus(0);
            estatus.setNombre_Estatus("Selecciona un estatus");
            datos.add(estatus);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                estatus = new EstatusUnidad();
                estatus.setId_estatus(rs.getInt(1));
                estatus.setNombre_Estatus(rs.getString(2));
                datos.add(estatus);
            }
            return datos;

        } catch (Exception e) {
            ayuda.mensaje("Error " + e.getMessage(), "Error");
            return null;
        }

    }

    public Vector comboBoxEstatusUnidadPepsi() {

        Estatus_Pepsi estatus = null;

        Vector<Estatus_Pepsi> datos = new Vector<Estatus_Pepsi>();

        try {

            PreparedStatement ps = con.prepareCall("SELECT * FROM powerzam_estatus_pepsi_especial");

            //Creamos una objeto con el indice cero 
            estatus = new Estatus_Pepsi();
            estatus.setId_estatus_pepsi(0);
            estatus.setNombreEstatus("Selecciona un estatus");
            datos.add(estatus);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                estatus = new Estatus_Pepsi();
                estatus.setId_estatus_pepsi(rs.getInt(1));
                estatus.setNombreEstatus(rs.getString(2));
                datos.add(estatus);
            }
            return datos;

        } catch (Exception e) {
            ayuda.mensaje("Error " + e.getMessage(), "Error");
            return null;
        }

    }

    public Vector comboSucursal() {

        Sucursal estatus = null;

        Vector<Sucursal> datos = new Vector<Sucursal>();

        try {

            PreparedStatement ps = con.prepareCall("select id_area,nombre,nombrecorto from general_area order by nombrecorto asc");

            //Creamos una objeto con el indice cero 
            estatus = new Sucursal();
            estatus.setId_area(0);
            estatus.setNombrecorto("Selecciona una Sucursal");
            datos.add(estatus);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                estatus = new Sucursal();
                estatus.setId_area(rs.getInt(1));
                estatus.setNombre(rs.getString(2));
                estatus.setNombrecorto(rs.getString(3));
                datos.add(estatus);
            }
            return datos;

        } catch (Exception e) {
            ayuda.mensaje("Error " + e.getMessage(), "Error");
            return null;
        }

    }

    public DefaultTableModel mostrarResumenUnidades(String buscar) {
        DefaultTableModel modelo;

        try {

            String[] columnas = {"Sucursal", "Numero de unidades"};

            modelo = new DefaultTableModel(null, columnas);
            String[] registros = new String[columnas.length];

            CallableStatement cst = con.prepareCall("{sp_resumen_unidades(?)}");
            cst.setString(1, buscar);
            ResultSet rs = cst.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);

                totalRegistros = totalRegistros + 1;

                modelo.addColumn(registros);

            }

        } catch (Exception e) {
            return modelo = null;
        }
        return modelo;

    }

    public boolean deleteUnidad(PowerZamUnidades u) {

        try {
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_eliminar_unidad_PowerZam(?,?,?)}");
            cst.setInt(1, u.getId_area());
            cst.setString(2, u.getId_unidad());
            cst.setString(3, u.getF_inicial());

            int n = cst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            return false;
        }

    }

    public boolean insertarUnidad(PowerZamUnidades u) {

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_insert_unidad_PowerZAM(?,?,?,?,?,?,?,?,?,?,?,?)}");

            cst.setInt(1, u.getId_area());
            cst.setString(2, u.getId_unidad());
            cst.setString(3, u.getF_inicial());
            cst.setString(4, u.getTipocuota());
            cst.setInt(5, u.getInd_titular());
            cst.setInt(6, u.getInd_ingresoxflete());
            cst.setInt(7, u.getInd_ingresoventafija());
            cst.setFloat(8, u.getMontorentafija());
            cst.setInt(9, u.getId_razon_detenida());
            cst.setInt(10, u.getId_estatus());
            cst.setInt(11, u.getId_estatus_pepsi());
            cst.setString(12, u.getComentarios());

            cst.executeUpdate();

            return true;

        } catch (SQLException e) {

            return false;
        }

    }

    public int buscar_codigo_area(String base) {
        int codigo_area = 0;
        try {

            PreparedStatement pst = con.prepareCall("select id_area from dbo.general_area where nombrecorto=?");
            pst.setString(1, base);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt("id_area");
                return codigo_area;
            }

        } catch (SQLException e) {
            return 0;

        }
        return codigo_area;
    }

    public String buscar_estatus_unidad(int id) {
        String valor = "";
        try {
            PreparedStatement pst = con.prepareCall("select peu.nombre_Estatus from dbo.powerzam_unidad pw join dbo.powerzam_estatus_unidad peu on peu.id_estatus = pw.id_estatus where pw.id_estatus = ?");
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                valor = rs.getString("nombre_Estatus");
                return valor;
            }

        } catch (SQLException e) {
            return valor;
        }
        return valor;
    }

    public int buscar_codigo_area_nombre_sucursal(String suc) {
        // Evento se encarga de buscar el codigo area en base a la sucursal selecciona del cboSucursal del furmulario
        int codigo_area = 0;
        try {

            PreparedStatement pst = con.prepareCall("select a.id_area from dbo.powerzam_unidad pu join dbo.general_area a on a.id_area = pu.id_area where a.nombrecorto =?");
            pst.setString(1, suc);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                codigo_area = rs.getInt("id_area");
                return codigo_area;

            }

        } catch (Exception e) {
            return 0;
        }
        return codigo_area;

    }

    public String buscar_estatus_unidad_sucursal(int id) {
        String valor = "";
        int codigoArea = 0;
        try {

            PreparedStatement pst = con.prepareCall("select a.nombrecorto from dbo.powerzam_unidad pu join dbo.general_area a on a.id_area = pu.id_area where a.id_area =" + id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                valor = rs.getString("nombrecorto");
                return valor;
            }

        } catch (SQLException e) {
            return valor;
        }
        return valor;

    }

}
