/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Vista.Viajes.frmViajes;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reloj extends TimerTask {

    @Override
    public void run() {
        try {
            etiquetaReloj();
        } catch (InterruptedException ex) {
            Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void etiquetaReloj() throws InterruptedException{
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        frmViajes.lblReloj.setText(formato.format(new Date()));
        
        Thread.sleep(1000);

        
    }
    
    
}
