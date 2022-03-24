/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Helpers.Ayudas;
import Vista.Principal;
import Vista.Viajes.frmBarraProgreso;

/**
 *
 * @author Ricardo Herrera
 */
public class BarraProgresoHilo extends Thread{

    frmBarraProgreso progreso = new frmBarraProgreso();
    Helpers.Ayudas aux = new Ayudas();
    
    @Override
    public void run() {
       
     cargarBarra();
    }
    
    void cargarBarra(){
        
        Principal.escritorio.add(progreso);
        aux.centrarPantalla(Principal.escritorio, progreso);
        progreso.show();
        
        try {

            for (int i = 0; i < 100; i++) {
                frmBarraProgreso.lblPorcentaje.setText(String.valueOf(i) + " % ");
                progreso.jProgressBar1.setValue(i);
                
                Thread.sleep(35);
            }
            
        } catch (InterruptedException e) {
            aux.mensaje("Error en el hilos " +getName(), "error");
        }
        progreso.dispose();
    }
    
}
