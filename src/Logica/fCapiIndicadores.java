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


public class fCapiIndicadores {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private Ayudas help = new Ayudas();

    public DefaultTableModel showAllData(String fechaInicio, String fechaFinal, String buscador) {

        DefaultTableModel modelo;

        String[] columnas = {
            "Operacion", "Sucursal", "Unidades","Unidades Backup","Total Flota", "Km/Uni",
            "Presupuesto", "Reales", "VS Proyecto", "Capi Real",
            "Kms Mes Anterior", "% Diferencia Mensual", "Kms Anio Anterior",
            "% Diferencia Anual", "Cuota Diaria", "Kms Ayer", "Kms recorridos",
            "% Capi Dia", "Presupuesto","Venta Variable"

        };

        modelo = new DefaultTableModel(null, columnas);

        int contador = 1;
        String[] registros = new String[columnas.length];

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_capi_indicadores(?,?,?)}");
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
    
    
    
}
