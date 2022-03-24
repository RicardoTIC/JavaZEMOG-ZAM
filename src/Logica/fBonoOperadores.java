/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Modelo.BonoOperadores;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ricardo Herrera
 */
public class fBonoOperadores {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    public DefaultTableModel showdata(BonoOperadores op) {

        DefaultTableModel modelo;

        String[] columnas = {
            "# Empleado", "Nombre Operador", "Sucursal", "Meta", "Km", "Bono", "Capi"
        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_Bonos_Operador(?,?,?) }");
            cst.setString(1, op.getFechaInicio());
            cst.setString(2, op.getFechaFinal());
            cst.setString(3, op.getNombreOperador());

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }

    public void cargar_Excel_Bonos(String fechaInicio, String fechafinal, String buscar) {

        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Listado de operadores");

        //Creamos una fila cero para las columnas
        Row fila0 = hoja.createRow(0);

        String[] columnas = {"# Empleado", "Nombre Operador", "Sucursal", "Meta", "Km", "Bono", "Capi"};

        //recorremos el arreglo
        for (int i = 0; i < columnas.length; i++) {

            Cell celda = fila0.createCell(i);
            celda.setCellValue(columnas[i]);
        }

        

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_Bonos_Operador(?,?,?)}");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechafinal);
            cst.setString(3, buscar);

            ResultSet rs = cst.executeQuery();

            //Numero de columnas
            int numCol = rs.getMetaData().getColumnCount();
            int numFila = 1;
            
            while (rs.next()) {

                Row filaDatos = hoja.createRow(numFila);

                for (int i = 0; i < numCol; i++) {
                    Cell celda = filaDatos.createCell(i);
                    
                    if (i == 0) {
                        /*Se agrega i+1 ya que las columnas y filas en excel comienzan en 1 y no 0 */
                        celda.setCellValue(rs.getInt(i+1));
                    }
                    
                    celda.setCellValue(rs.getString(i+1));

                }

                numFila++;
            }

            String nombreArchivo = "Bonos de productividad.xlsx";
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            libro.write(archivo);
            archivo.close();
            File objetoFila = new File(nombreArchivo);
            Desktop.getDesktop().open(objetoFila);

            try {
                Thread.sleep(1000);
                help.mensaje("Excel descagado saticfactoriamente !!! " + nombreArchivo, "Success");
            } catch (InterruptedException ex) {
                Logger.getLogger(fViajes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException e) {
            help.mensaje("error " + e.getMessage(), "Error");
        } catch (SQLException ex) {
            help.mensaje("Error en el " + fSucursal.class.getName() + ex.getMessage() + " Contacta al adm de sistema al ricardo.herrera@zemog.com.mx", "Error");

        }

    }

}
