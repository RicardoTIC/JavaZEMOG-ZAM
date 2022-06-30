/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.ConcentradoDeUnidades.frmConcentradoDetalleUnidades;
import Vista.Operadores.frmBonosOperadores;
import Vista.Operadores.frmOperadores;
import Vista.Rutas.frmRutas;
import Vista.Viajes.frmViajes;
import Vista.Indicadores.ResumenKilometros;
import Helpers.Ayudas;
import Reportes.ImagenesFondo;
import Vista.CartaPorte.frmCartaPorte;
import Vista.Indicadores.frmResumenCapi;
import Vista.Login.IniciarSesion;
import Vista.ResumenUnidades.frmResumenIndicadores;
import Vista.Viajes.frmBarraProgreso;
import Vista.Viajes.frmCancelacionDeviaje;
import Vista.Viajes.frmValidacionFacturas;
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
    public boolean validacionAbierto;

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
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Sucursal = new javax.swing.JMenu();
        Unidades = new javax.swing.JMenuItem();
        Operadores = new javax.swing.JMenuItem();
        Rutas = new javax.swing.JMenuItem();
        PowerZAM = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        BonoOperadores = new javax.swing.JMenuItem();
        Openbook = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        menuBar.setAutoscrolls(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menu Principal");

        HistoricoDeViajes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        HistoricoDeViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_calendar_month_black_24dp.png"))); // NOI18N
        HistoricoDeViajes.setMnemonic('o');
        HistoricoDeViajes.setText("Historico de viajes");
        HistoricoDeViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoDeViajesActionPerformed(evt);
            }
        });
        fileMenu.add(HistoricoDeViajes);

        ResumenDeKilometros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ResumenDeKilometros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_trending_down_black_24dp.png"))); // NOI18N
        ResumenDeKilometros.setMnemonic('s');
        ResumenDeKilometros.setText("Resumen de kilometros");
        ResumenDeKilometros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumenDeKilometrosActionPerformed(evt);
            }
        });
        fileMenu.add(ResumenDeKilometros);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_leaderboard_black_24dp.png"))); // NOI18N
        jMenuItem8.setText("Capi General");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_transit_black_24dp.png"))); // NOI18N
        jMenuItem10.setText("Capi por unidad");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem10);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_close_black_24dp.png"))); // NOI18N
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

        Unidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        Unidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_bus_filled_black_24dp.png"))); // NOI18N
        Unidades.setMnemonic('t');
        Unidades.setText("Unidades");
        Unidades.setToolTipText("");
        Unidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadesActionPerformed(evt);
            }
        });
        Sucursal.add(Unidades);

        Operadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Operadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_groups_black_24dp.png"))); // NOI18N
        Operadores.setMnemonic('y');
        Operadores.setText("Operadores");
        Operadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresActionPerformed(evt);
            }
        });
        Sucursal.add(Operadores);

        Rutas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Rutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_share_location_black_24dp.png"))); // NOI18N
        Rutas.setMnemonic('p');
        Rutas.setText("RutasSucursal");
        Rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutasActionPerformed(evt);
            }
        });
        Sucursal.add(Rutas);

        PowerZAM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        PowerZAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_bus_filled_black_24dp.png"))); // NOI18N
        PowerZAM.setText("Unidades PowerZAM");
        PowerZAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerZAMActionPerformed(evt);
            }
        });
        Sucursal.add(PowerZAM);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_home_black_24dp.png"))); // NOI18N
        jMenuItem1.setText("Sucursal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Sucursal.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_file_download_done_black_24dp.png"))); // NOI18N
        jMenuItem3.setText("Convenios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Sucursal.add(jMenuItem3);

        BonoOperadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_COMMA, java.awt.event.InputEvent.CTRL_MASK));
        BonoOperadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_groups_black_24dp.png"))); // NOI18N
        BonoOperadores.setText("Bono de operadores");
        BonoOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonoOperadoresActionPerformed(evt);
            }
        });
        Sucursal.add(BonoOperadores);

        Openbook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        Openbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/free.png"))); // NOI18N
        Openbook.setText("Open Book");
        Openbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenbookActionPerformed(evt);
            }
        });
        Sucursal.add(Openbook);

        menuBar.add(Sucursal);

        jMenu1.setText("Vistas Avanzadas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_text_snippet_black_24dp.png"))); // NOI18N
        jMenuItem2.setText("Carta Porte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_bus_filled_black_24dp.png"))); // NOI18N
        jMenuItem4.setText("Concentrado Unidades");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sql.png"))); // NOI18N
        jMenuItem5.setText("Generador de codigo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_sync_alt_black_24dp.png"))); // NOI18N
        jMenuItem6.setText("Validacion de viajes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paid_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jMenuItem7.setText("Venta financiera");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_bus_filled_black_24dp.png"))); // NOI18N
        jMenuItem9.setText("Kilometros Acumulados");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_calendar_month_black_24dp.png"))); // NOI18N
        jMenuItem11.setText("Tarifa De Sucursales");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_help_outline_black_24dp.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        IniciarSesion login = new IniciarSesion();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void HistoricoDeViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoDeViajesActionPerformed
        frmViajes viajes = new frmViajes();

        escritorio.add(viajes);

        help.centrarPantalla(escritorio, viajes);

        try {
            viajes.setMaximum(true);

        } catch (PropertyVetoException ex) {
            System.out.println("Error");
        }

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

        frmOperadores operadores = new frmOperadores();

        escritorio.add(operadores);

        help.centrarPantalla(escritorio, operadores);
        operadores.show();

    }//GEN-LAST:event_OperadoresActionPerformed

    private void RutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutasActionPerformed
        frmRutas rutas = new frmRutas();

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
        frmSucursal formularioSucursal = new frmSucursal();
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmCartaPorte frm = new frmCartaPorte();

        escritorio.add(frm);
        help.centrarPantalla(escritorio, frm);
        frm.show();


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       frmConveniosRutas frm  = new frmConveniosRutas();
       
       escritorio.add(frm);
       help.centrarPantalla(escritorio, frm);
       frm.show();
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        frmConcentradoDetalleUnidades frm = new frmConcentradoDetalleUnidades();
        
        escritorio.add(frm);
        help.centrarPantalla(escritorio, frm);
        frm.show();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      frmGeneradorSQLServer sql = new  frmGeneradorSQLServer();
      help.centrarPantalla(escritorio, sql);
      escritorio.add(sql);
      sql.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      frmValidacionFacturas frm = new  frmValidacionFacturas();
      help.centrarPantalla(escritorio, frm);
      escritorio.add(frm);
      
      frm.show();
      
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        frmFinenciero frm  = new frmFinenciero();
        help.centrarPantalla(escritorio, frm);
        escritorio.add(frm);
        
        frm.show();
                
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void OpenbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenbookActionPerformed
        frmUnidadesOpenBook uni = new frmUnidadesOpenBook();
        help.centrarPantalla(escritorio, uni);
        escritorio.add(uni);
        uni.show();
    }//GEN-LAST:event_OpenbookActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       
        frmResumenCapi frm  = new frmResumenCapi();
        
        help.centrarPantalla(escritorio, frm);
        escritorio.add(frm);
        frm.show();
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        frmAcumuladoResumenKm frm = new frmAcumuladoResumenKm();
        
        help.centrarPantalla(escritorio, frm);
        escritorio.add(frm);
        frm.show();
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        frmResumenIndicadores frm = new frmResumenIndicadores();
        help.centrarPantalla(escritorio, frm);
        escritorio.add(frm);
        frm.show();
        
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        frmCatalogoDeCuotas frm = new frmCatalogoDeCuotas();
        help.centrarPantalla(escritorio, frm);
        escritorio.add(frm);
        frm.show();
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
    private javax.swing.JMenuItem Openbook;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
