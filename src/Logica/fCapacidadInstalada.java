/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fCapacidadInstalada {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private Ayudas help = new Ayudas();
    
    public int totalKilometros = 0;
    public int totalViajes = 0;
    public int totalCuotaAcumulada = 0;
    public String Error ;
    

    public DefaultTableModel showAllData(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Unidad", "Tipo Cuota", "Kms", "Venta",
            "# de viajes", "Sucursal", "Sucursal Openbook", "Estatus Operativo",
            "Cuota Mensual", "Dia", "Nombre Estatus",
            "Cambio Sucursal", "Cuota Diaria", "Cuota Acumulada", "Capi"
        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call [sp_ZEMOG_km_por_Unidad](?,?,?)}");
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
            Error = "No se puede ejecutar el comando SQL "+ e.getMessage();
            return null;
        }

    }

    public DefaultTableModel showAllDataDatail(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Unidad", "Sucursal", "Nombre Operador", "Ruta", "Trayecto",
            "Kms", "Total Venta", "Folio", "Pre-Factura",
            "Factura","Fecha Cita"
        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_detalle_selecciona(?,?,?)}");
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

    public DefaultTableModel showAllDataDatailSucursal(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Unidad", "Sucursal", "Nombre Operador", "Ruta", "Trayecto",
            "Kms", "Total Venta", "Folio", "Pre-Factura",
            "Factura"
        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_detalle_selecciona(?,?,?)}");
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

    public DefaultTableModel showAllDataDatailSucursalSinFallos(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = 
        {
            "Sucursal", "Kms", "Cuota Sucursal", "Cuota Diaria", "Numero Unidades",
            "Dia", "CuotaAcumulada", "Numero de viajes", "Operacion","Venta","Cuota Presupuesto",
            "Capi", "Flota Total", "Porcentaje Unidades ","Representacion de capi CMG", "Capi General",
            "Promedio km"
        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_capi_real_sin_fallos(?,?,?)}");
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

    public DefaultTableModel showAllDataDatailUnidadSinFallos(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Unidad", "Operacion", "Sucursal", "Kms",
            "Venta", "# de viajes", "Meta", "Cuota Diaria", "Dia",
            "Cuota Acumulada", "Capi por Unidad"

        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_capi_por_unidad_sin_Fallos(?,?,?)}");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechaFinal);
            cst.setString(3, buscador);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {
                totalKilometros = totalKilometros + rs.getInt(4);
                totalViajes = totalViajes + rs.getInt(6);
                totalCuotaAcumulada = totalCuotaAcumulada + rs.getInt(10);
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

}
