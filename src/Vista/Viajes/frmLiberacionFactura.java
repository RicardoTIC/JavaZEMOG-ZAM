/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import java.awt.Font;
import Helpers.Ayudas;
import Logica.fViajes;

/**
 *
 * @author Ricardo Herrera
 */
public class frmLiberacionFactura extends javax.swing.JInternalFrame {

    Ayudas aux = new Ayudas();
    String[] mensaje = {"error", "informativo"};
    String[] estatusGuia = {"Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado"};
    fViajes func = new fViajes();

    public frmLiberacionFactura() {
        initComponents();
        if (frmViajes.txtNumeroGuia.getText().length() == 0 || frmViajes.txtEstatusFactura.getText().length() == 0) {
            lblNumeroGuia.setText("Sin seleccion de numero guia");
            lblEstatus.setText("Sin estatus");

            lblNumeroGuia.setFont(new Font("Arial", Font.BOLD, 12));
        } else {

            lblEstatus.setText(frmViajes.lblEstatusGuia.getText());
            lblNumeroGuia.setText(frmViajes.txtNumeroGuia.getText());
            lblEstatusFactura.setText(frmViajes.txtEstatusFactura.getText());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEstatusCartaPorte = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboPrestamo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblNumeroGuia = new javax.swing.JLabel();
        lblEstatus = new javax.swing.JLabel();
        lblEstatusFactura = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Liberacion Carta Porte");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estatus Carta Porte :");

        cboEstatusCartaPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus", "Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Estatus Prestamo :");

        cboPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus prestamo", "Aceptada", "Pendiente" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero Guia :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Estatus :");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblNumeroGuia.setText("-");

        lblEstatus.setText("-");

        lblEstatusFactura.setText("-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estatus Factura :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnActualizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEstatusCartaPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstatusFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumeroGuia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEstatusCartaPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumeroGuia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblEstatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblEstatusFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(14, 14, 14))
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

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ///    String [] estatusGuia = {"Confirmado","Regreso","Pendiente","Transito","Cancelado"};
        String mensajeError = "error";
        String mensajeInformativo = "informativo";
        String seleccionEstatus = "";
        String prestamo = "";
        String numeroGuia = lblNumeroGuia.getText();

        if (lblEstatusFactura.getText().equalsIgnoreCase("facturado")) {
            aux.mensaje("NO se puede canceladar una carta porte si ya tiene factura", "error");
        }

        if (cboEstatusCartaPorte.getSelectedItem().equals("Confirmado")) {
            seleccionEstatus = "C";
            aux.mensajeLateral(seleccionEstatus, "Seleccionaste el estatus", "aceptado");
        } else if (cboEstatusCartaPorte.getSelectedItem().equals("Regreso")) {
            seleccionEstatus = "R";
            aux.mensajeLateral(seleccionEstatus, "Seleccionaste el estatus", "aceptado");
        } else if (cboEstatusCartaPorte.getSelectedItem().equals("Pendiente")) {
            seleccionEstatus = "A";
            aux.mensajeLateral(seleccionEstatus, "Seleccionaste el estatus", "aceptado");
        } else if (cboEstatusCartaPorte.getSelectedItem().equals("Transito")) {
            seleccionEstatus = "T";
            aux.mensajeLateral(seleccionEstatus, "Seleccionaste el estatus", "aceptado");
        } else if (cboEstatusCartaPorte.getSelectedItem().equals("Cancelado")) {
            seleccionEstatus = "B";
            aux.mensajeLateral(seleccionEstatus, "Seleccionaste el estatus", "aceptado");
        } else if (cboEstatusCartaPorte.getSelectedItem().equals("Selecciona el estatus")) {

            aux.mensajeLateral("Seleccion un estatua para poder liberar carta porte", "Validacion denegada", "error");
        }

        if (cboPrestamo.getSelectedItem().equals("Pendiente")) {
            prestamo = "P";
        } else if (cboPrestamo.getSelectedItem().equals("Aceptada")) {
            prestamo = "N";
        }

        if (cboEstatusCartaPorte.getSelectedIndex() == 0) {
            aux.mensaje("Selecciona un estatus para liberar", mensajeInformativo);
            return;
        }
        if (cboPrestamo.getSelectedIndex() == 0) {
            aux.mensaje("Selecciona un estatus prestamo", mensajeInformativo);
            return;
        }
        
        if (func.liberacionCartaPorte(numeroGuia, seleccionEstatus, prestamo)) {
            aux.mensajeLateral("Actualizaste la carta porte " + numeroGuia, mensajeInformativo, "aceptado");
            
            this.dispose();
        }


    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cboEstatusCartaPorte;
    private javax.swing.JComboBox<String> cboPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstatus;
    private javax.swing.JLabel lblEstatusFactura;
    private javax.swing.JLabel lblNumeroGuia;
    // End of variables declaration//GEN-END:variables
}
