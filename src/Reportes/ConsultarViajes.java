/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Logica.fViajes;
import Vista.Viajes.frmBarraProgreso;
import Vista.Viajes.frmViajes;
import static Vista.Viajes.frmViajes.ListaDatos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultarViajes extends Thread {

    fViajes func = new fViajes();

    private String fechainiciales;
    private String fechafinales;
    private String[] buscar;
    
    @Override
    public void run() {
        bucle();
    }

    public void bucle() {
        int numero = 0;
        try {
            frmViajes.ListaDatos.setModel(func.showdataFordate(fechainiciales, fechafinales, buscar));
            
            Thread.sleep(10000);
            
        } catch (InterruptedException e) {
        
            
        }
        
            
       
        
        frmViajes.lblEstatusGuia.setForeground(Color.black);        
        frmViajes.lblEstatusGuia.setText("");

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

    public fViajes getFunc() {
        return func;
    }

    public void setFunc(fViajes func) {
        this.func = func;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

}
