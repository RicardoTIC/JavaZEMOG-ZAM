/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Viajes.frmViajes;
import Vista.Indicadores.ResumenKilometros;
import Helpers.Ayudas;
import Reportes.ImagenesFondo;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Ricardo Herrera
 */
public class Principal extends javax.swing.JFrame {
    Helpers.Ayudas help = new Ayudas();
    public Principal() {
        initComponents();
        escritorio.setBorder(new ImagenesFondo());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Pantalla Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        HistoricoDeViajes = new javax.swing.JMenuItem();
        ResumenDeKilometros = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Sucursal = new javax.swing.JMenu();
        Unidades = new javax.swing.JMenuItem();
        Operadores = new javax.swing.JMenuItem();
        Rutas = new javax.swing.JMenuItem();
        PowerZAM = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        BonoOperadores = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setAutoscrolls(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menu Principal");

        HistoricoDeViajes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        HistoricoDeViajes.setMnemonic('o');
        HistoricoDeViajes.setText("Historico de viajes");
        HistoricoDeViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoDeViajesActionPerformed(evt);
            }
        });
        fileMenu.add(HistoricoDeViajes);

        ResumenDeKilometros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ResumenDeKilometros.setMnemonic('s');
        ResumenDeKilometros.setText("Resumen de kilometros");
        ResumenDeKilometros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumenDeKilometrosActionPerformed(evt);
            }
        });
        fileMenu.add(ResumenDeKilometros);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        Sucursal.setMnemonic('e');
        Sucursal.setText("Catalogos");

        Unidades.setMnemonic('t');
        Unidades.setText("Unidades");
        Unidades.setToolTipText("");
        Unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadesActionPerformed(evt);
            }
        });
        Sucursal.add(Unidades);

        Operadores.setMnemonic('y');
        Operadores.setText("Operadores");
        Operadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresActionPerformed(evt);
            }
        });
        Sucursal.add(Operadores);

        Rutas.setMnemonic('p');
        Rutas.setText("RutasSucursal");
        Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutasActionPerformed(evt);
            }
        });
        Sucursal.add(Rutas);

        PowerZAM.setText("Unidades PowerZAM");
        PowerZAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerZAMActionPerformed(evt);
            }
        });
        Sucursal.add(PowerZAM);

        jMenuItem1.setText("Sucursal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Sucursal.add(jMenuItem1);

        BonoOperadores.setText("Bono de operadores");
        BonoOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonoOperadoresActionPerformed(evt);
            }
        });
        Sucursal.add(BonoOperadores);

        menuBar.add(Sucursal);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void HistoricoDeViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoDeViajesActionPerformed
        frmViajes viajes = new frmViajes();
        
        escritorio.add(viajes);
        
        help.centrarPantalla(escritorio, viajes);
        
//        try {
//            viajes.setMaximum(true);
//            
//        } catch (PropertyVetoException ex) {
//            System.out.println("Error");
//        }
        viajes.show();
                
        
    }//GEN-LAST:event_HistoricoDeViajesActionPerformed

    private void ResumenDeKilometrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumenDeKilometrosActionPerformed
        ResumenKilometros frm = new ResumenKilometros();
       
        escritorio.add(frm);
        help.centrarPantalla(escritorio, frm);
        frm.show();
        
    }//GEN-LAST:event_ResumenDeKilometrosActionPerformed

    private void UnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadesActionPerformed
       frmUnidades unidades = new frmUnidades();
       
       escritorio.add(unidades);
       help.centrarPantalla(escritorio, unidades);
       unidades.show();
    }//GEN-LAST:event_UnidadesActionPerformed

    private void OperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresActionPerformed
        
        frmOperadores operadores  = new frmOperadores();
        
        escritorio.add(operadores);
        
        help.centrarPantalla(escritorio, operadores);
        operadores.show();
        
    }//GEN-LAST:event_OperadoresActionPerformed

    private void RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutasActionPerformed
        frmRutas rutas  = new frmRutas();
        
        escritorio.add(rutas);
        help.centrarPantalla(escritorio, rutas);
        
        rutas.show();
        
    }//GEN-LAST:event_RutasActionPerformed

    private void PowerZAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerZAMActionPerformed
        frmPowerUnidades pwr = new frmPowerUnidades();
        escritorio.add(pwr);
        help.centrarPantalla(escritorio, pwr);
        pwr.show();
    }//GEN-LAST:event_PowerZAMActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmSucursal formularioSucursal  = new frmSucursal();
        escritorio.add(formularioSucursal);
        help.centrarPantalla(escritorio, formularioSucursal);
        formularioSucursal.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BonoOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonoOperadoresActionPerformed
        frmBonosOperadores frmOperadores = new frmBonosOperadores();
        escritorio.add(frmOperadores);
        help.centrarPantalla(escritorio, frmOperadores);
        frmOperadores.show();
        
               
    }//GEN-LAST:event_BonoOperadoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        Nimbus
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BonoOperadores;
    private javax.swing.JMenuItem HistoricoDeViajes;
    private javax.swing.JMenuItem Operadores;
    private javax.swing.JMenuItem PowerZAM;
    private javax.swing.JMenuItem ResumenDeKilometros;
    private javax.swing.JMenuItem Rutas;
    private javax.swing.JMenu Sucursal;
    private javax.swing.JMenuItem Unidades;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
