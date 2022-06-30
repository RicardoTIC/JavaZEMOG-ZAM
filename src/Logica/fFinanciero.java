package Logica;

import Helpers.Ayudas;
import Modelo.Financiera;
import Modelo.Sucursal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class fFinanciero {

    private Conexion cn = new Conexion();
    private Connection con = cn.conectar();
    private Ayudas ayuda = new Ayudas();
    private String formatoMoneda = "$ ###,###.###", formatoNumero = "###,###.###", formatoPorcenajte = "#.## %";
    private DecimalFormat formato = new DecimalFormat();
    private String sql = "";
    private Financiera obj = new Financiera();

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

    public DefaultTableModel listaDatos(String buscador) {
        int contador = 1;
        DefaultTableModel modelo;

        String[] columnas = {"id","Sucursal", "Dia fin Mes", "Operacion", "Mes", "Fecha financiera",
            "Kilometros", "Venta", "Venta por Km", "Venta Diaria", "Kms Diarios"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement pst = con.prepareCall("{call sp_ZEMOG_mostrarPresupuestofinanciero(?)}");
            pst.setString(1, buscador);
            ResultSet rs = pst.executeQuery();
            formato.applyPattern(formatoNumero);

            while (rs.next()) {

                for (int i = 0; i < registros.length; i++) {

                    registros[i] = rs.getString(contador);

//                    if (i == 6 || i == 7 || i == 8 || i == ) {
//                        registros[i] = formato.format(rs.getDouble(contador));
//                    }

                    contador++;
                }
                contador = 1;
                modelo.addRow(registros);

            }
            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

    public int extraccion_CodigoArea(String base) {
        int codigo_area = 0;
        try {

            PreparedStatement pst = con.prepareCall("SELECT id_area FROM dbo.general_area WHERE nombrecorto = ?");
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

    public int mantenimientoFinanciero(Financiera obj) {

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mantenimiento_powerResumenKmSucursal(?,?,?,?,?,?)}");
            cst.setString(1, obj.getAccion());
            
            cst.setInt(2, obj.getId_area());
            cst.setString(3, obj.getFecha_financiera());
            cst.setDouble(4, obj.getKilometros());
            cst.setDouble(5, obj.getVenta());
            cst.setInt(6, obj.getId());
            
            cst.execute();
            return 1;

        } catch (SQLException e) {
            obj.setError("Error " + e.getMessage());
            return 0;
        }

    }

}
