/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import Helpers.Ayudas;
import javafx.scene.paint.Color;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Logica.fViajes;
import Vista.Viajes.frmViajes;
import static Vista.Viajes.frmViajes.txtBuscar;
import static Vista.Viajes.frmViajes.txtFechaFinal;
import static Vista.Viajes.frmViajes.txtFechaInicio;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Excel extends Thread {

    fViajes func = new fViajes();
    
    private String fechainiciales;
    private String fechafinales;
    private String buscar;
    
    
    @Override
    public void run() {
        func.cargarDB_Excel(fechainiciales, fechafinales, buscar);
    }

    public String getFechainiciales() {
        return fechainiciales;
    }

    public void setFechainiciales(String fechainiciales) {
        this.fechainiciales = fechainiciales;
    }

    public String getFechafinales() {
        return fechafinales;
    }

    public void setFechafinales(String fechafinales) {
        this.fechafinales = fechafinales;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    
    
    
    public void crearExcel() {

        Workbook libro = new XSSFWorkbook();

        Ayudas help = new Ayudas();
        //Creamos la hoja

        Sheet hoja = libro.createSheet("Detalle de viajes");

        Sheet hoja2 = libro.createSheet("Indicador de viaje");

        Row fila0 = hoja.createRow(0);

        fila0.createCell(0).setCellValue("Nombre");
        fila0.createCell(1).setCellValue("Apellido");
        fila0.createCell(2).setCellValue("Edad");
        fila0.createCell(3).setCellValue("Direccion");

        try {

            FileOutputStream archivo = new FileOutputStream("Excel.xlsx");
            libro.write(archivo);
            archivo.close();
            help.mensaje("Se creo correctamente el archivo", "Informativo");

        } catch (Exception e) {
            help.mensaje("Hubo un error al crear el archivo de Excel", "Error" + e.getMessage());

        }

    }

}
