package Logica;

import Helpers.Ayudas;
import Modelo.Sucursal;
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

    public DefaultTableModel listaDatos() {
        int contador = 1;
        DefaultTableModel modelo;

        String[] columnas = {"Sucursal", "Dia fin Mes", "Operacion", "Mes", "Fecha financiera",
            "Kilometros", "Venta","Venta por Km" ,"Venta Diaria", "Kms Diarios"};

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);
        
        sql = "select a.nombrecorto,diafinMes,po.nombreCortoOperacion,DATENAME(month,pf.fecha_financiera) NombreMes, fecha_financiera,kilometros,\n"
                + "venta,ventaXkm,ventaDiaria,kmsDiarios\n"
                + "from powerPresupuestoFinanciero pf\n"
                + "inner join general_area a on a.id_area = pf.id_area\n"
                + "inner join powerOperacion po on po.id_operacion = a.id_operacion";
        
        try {

            PreparedStatement pst = con.prepareCall(sql);

            ResultSet rs = pst.executeQuery();
            formato.applyPattern(formatoNumero);

            while (rs.next()) {

                for (int i = 0; i < registros.length; i++) {

                    registros[i] = rs.getString(contador);

                    if (i == 5 || i == 6 || i == 7 || i == 8) {
                        registros[i] = formato.format(rs.getDouble(contador));
                    }

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

}
