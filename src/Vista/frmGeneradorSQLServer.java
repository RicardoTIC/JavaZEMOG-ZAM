/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Helpers.Ayudas;
import Logica.fSucursal;
import Modelo.Sucursal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.ActionMap;
import javax.swing.JSpinner;

/**
 *
 * @author Ricardo Herrera
 */
public class frmGeneradorSQLServer extends javax.swing.JInternalFrame {

    Helpers.Ayudas aux = new Ayudas();
    fSucursal funcSucursal = new fSucursal();

    public frmGeneradorSQLServer() {
        initComponents();
        lblError.setVisible(false);
        txtCodigoRuta.setVisible(false);
        lblCodigoRuta.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFolios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboAcciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        txtCodigoRuta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelCodigoRuta = new javax.swing.JLabel();
        lblCodigoRuta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SQL");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtFolios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFoliosMouseClicked(evt);
            }
        });

        jLabel1.setText("folios :");

        jLabel2.setText("Acciones :");

        cboAcciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una accion", "Liberacion de carta de cobro", "Libreacion de factura", "Liberacion carta porte" }));
        cboAcciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAccionesActionPerformed(evt);
            }
        });

        txtConsulta.setColumns(20);
        txtConsulta.setLineWrap(true);
        txtConsulta.setRows(5);
        txtConsulta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtConsulta);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblError.setText("Error");

        txtCodigoRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoRutaMouseClicked(evt);
            }
        });
        txtCodigoRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoRutaKeyReleased(evt);
            }
        });

        jLabel3.setText("Sucursal :");

        labelCodigoRuta.setText("Codigo Ruta :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addComponent(cboAcciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFolios)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelCodigoRuta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolios, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoRuta)
                    .addComponent(lblCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnGenerar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String[] folios = txtFolios.getText().split(" ");
        String[] nuevoCadenaSql = new String[folios.length];

        txtConsulta.setText("");

        try {

            if (cboAcciones.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar una estatus", "Informativo");
                return;
            }

            if (txtFolios.getText().length() <= 0) {
                aux.mensaje("No haz ingresado folios en el cuadro de texto", "informativo");
                txtFolios.requestFocus();
                return;
            }

            if (cboAcciones.getSelectedItem().toString().equalsIgnoreCase("Liberacion de carta de cobro")) {

                for (int i = 0; i < folios.length; i++) {

                    nuevoCadenaSql[i] = "update dbo.trafico_guia set no_carta = null where no_remision in ('" + folios[i] + "') and no_carta is not null";
                }
                txtConsulta.append("BEGIN TRANSACTION \n");
                for (int i = 0; i <= nuevoCadenaSql.length - 1; i++) {
                    txtConsulta.append(nuevoCadenaSql[i] + "\n");
                    txtConsulta.append("" + "\n");

                }

            } else if (cboAcciones.getSelectedItem().toString().equalsIgnoreCase("Liberacion carta porte")) {
                int codigoRuta = Integer.parseInt(lblCodigoRuta.getText());
                for (int i = 0; i < folios.length; i++) {

                    nuevoCadenaSql[i] = "update dbo.trafico_guia set prestamo = 'P', status_guia = 'A' where no_guia in (" + folios[i] + ") and id_area = "+ codigoRuta +"";
                }
                txtConsulta.append("BEGIN TRANSACTION \n");
                for (int i = 0; i <= nuevoCadenaSql.length - 1; i++) {
                    txtConsulta.append(nuevoCadenaSql[i] + "\n");
                    txtConsulta.append("" + "\n");

                }

            } else {

                for (int i = 0; i < folios.length; i++) {
                    nuevoCadenaSql[i] = "update dbo.trafico_guia set prestamo = 'P' , status_guia = 'A' where num_guia in('" + folios[i] + "')";
                }

                for (int i = 0; i <= nuevoCadenaSql.length - 1; i++) {
                    txtConsulta.append("BEGIN TRANSACTION \n");
                    txtConsulta.append(nuevoCadenaSql[i] + "\n");
                    txtConsulta.append("" + "\n");

                }

            }

        } catch (Exception e) {
            lblError.setVisible(true);
            lblError.setText("Error " + e.getMessage() + " Clase" + getClass().getName());
            lblError.setOpaque(false);
            lblError.setForeground(Color.red);
            lblError.setFont(new Font("Arial", Font.BOLD, 12));
        }


    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtFoliosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFoliosMouseClicked
        if (evt.getClickCount() >= 2) {

            txtFolios.setText("");
        }
    }//GEN-LAST:event_txtFoliosMouseClicked

    private void cboAccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAccionesActionPerformed

        if (cboAcciones.getSelectedItem().toString().equalsIgnoreCase("Libreacion de factura")) {

            aux.mensaje("Recuerda que debes de ingresar las guias para poder liberar la carta porte", "Informativo");

        }
        
        if (cboAcciones.getSelectedItem().toString().equalsIgnoreCase("Liberacion carta porte")) {
              txtCodigoRuta.setVisible(true);
              lblCodigoRuta.setVisible(true);
              
              aux.mensaje("Debes de ingresar un codigo de ruta y numero de guia", "Informativo");
              
              
        }
        

    }//GEN-LAST:event_cboAccionesActionPerformed

    private void txtCodigoRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoRutaMouseClicked
       
        
    }//GEN-LAST:event_txtCodigoRutaMouseClicked

    private void txtCodigoRutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoRutaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
             
            Sucursal suc = funcSucursal.datosSucursal(txtCodigoRuta.getText());
            lblCodigoRuta.setText(String.valueOf(suc.getId_area()));
            
            
            
            
            
        }
    }//GEN-LAST:event_txtCodigoRutaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cboAcciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigoRuta;
    private javax.swing.JLabel lblCodigoRuta;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtCodigoRuta;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextField txtFolios;
    // End of variables declaration//GEN-END:variables
}
