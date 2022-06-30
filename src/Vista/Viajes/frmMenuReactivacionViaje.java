/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajes;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class frmMenuReactivacionViaje extends javax.swing.JInternalFrame {

    Ayudas aux = new Ayudas();
    fViajes func = new fViajes();

    public frmMenuReactivacionViaje() {
        initComponents();
        ocultar(false);
        selected_data();
    }
    void ocultar(boolean activar){
        lblReactivacion.setVisible(activar);
    }

    void selected_data() {

        txtCodigoArea.setText(frmViajesCancelados.txtCodigoArea.getText());
        txtNumeroViaje.setText(frmViajesCancelados.txtNumeroViaje.getText());
        txtNumeroGuia.setText(frmViajesCancelados.txtNumeroGuia.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroViaje = new javax.swing.JTextField();
        txtCodigoArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboEstatusGuia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboPrestamo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboEstatusAnticipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroGuia = new javax.swing.JTextField();
        cboEstatusPedido = new javax.swing.JComboBox<>();
        cboEstatusAsignacion = new javax.swing.JComboBox<>();
        btnSeleccionar = new javax.swing.JButton();
        lblReactivacion = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Estatus viajes");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reactivacion de viajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Numero De Viaje :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Codigo Area :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Estatus Guia :");

        cboEstatusGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus Guia", "Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Prestamo :");

        cboPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el prestamo", "Pendiente", "Aceptado" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Estatus anticipo :");

        cboEstatusAnticipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus anticipo", "Aceptado", "Cancelado", "Edicion", "Liquidado" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Estatus Pedido :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Estatus Asignacion :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Numero de guia :");

        cboEstatusPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus pedido", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En Transito" }));

        cboEstatusAsignacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estatus Asignacion", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En Transito" }));

        btnSeleccionar.setBackground(new java.awt.Color(255, 0, 102));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_file_download_done_black_24dp.png"))); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        lblReactivacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblReactivacion.setText("Validacion Reactivacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboEstatusAnticipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 68, Short.MAX_VALUE)))
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEstatusGuia, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusAsignacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusPedido, 0, 164, Short.MAX_VALUE)))
                            .addComponent(lblReactivacion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblReactivacion)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstatusPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboEstatusGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        String estatus_Anticipo = "", estatus_Guia = "", estatus_Prestamo = "", numero_guia = "",accion = "";
        int estatus_Asignacion = 0, estatus_Pedido = 0;
        
        accion = "activar";
        
        int codigoArea = 0, numeroViaje = 0, auxiliar = 0;

        codigoArea = Integer.parseInt(txtCodigoArea.getText());
        numeroViaje = Integer.parseInt(txtNumeroViaje.getText());
        numero_guia = txtNumeroGuia.getText();
            
        if (txtCodigoArea.getText().length() <= 0) {
            aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
            return;

        }
        if (txtCodigoArea.getText().length() <= 0) {
            aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
            return;
        }

        if (cboEstatusAnticipo.getSelectedIndex() == 0) {
            aux.mensaje("Debes seleccionar un estatos de anticipo correcto", "Informativo");
            return;
        }
        if (cboEstatusGuia.getSelectedIndex() == 0) {
            aux.mensaje("Debes seleccionar un estatos guia carta porte correcto", "Informativo");
            return;
        }
        if (cboEstatusAsignacion.getSelectedIndex() == 0) {
            aux.mensaje("Debes seleccionar un estatos de asigacion correcto", "Informativo");
            return;
        }
        if (cboEstatusPedido.getSelectedIndex() == 0) {
            aux.mensaje("Debes seleccionar un estatus pedido correcto", "Informativo");
            return;
        }
        if (cboPrestamo.getSelectedIndex() == 0) {
            aux.mensaje("Debes seleccionar un estatus de prestamo correcto", "Informativo");
            return;
        }

        if (txtNumeroGuia.getText().length() == 0) {
            aux.mensaje("Debes de ingresar un numero de guia para cancelar el viaje", "Informativo");
            txtNumeroGuia.requestFocus();
            return;
        }

        /*El estatus guia y el estatus trafico_viaje tiene la misma nomeclatura de estatus */
        if (cboEstatusGuia.getSelectedItem().toString().equals("Confirmado")) {
            estatus_Guia = "C";
        } else if (cboEstatusGuia.getSelectedItem().toString().equals("Regreso")) {
            estatus_Guia = "R";
        } else if (cboEstatusGuia.getSelectedItem().toString().equals("Pendiente")) {
            estatus_Guia = "A";

        } else if (cboEstatusGuia.getSelectedItem().toString().equals("Transito")) {
            estatus_Guia = "T";

        } else if (cboEstatusGuia.getSelectedItem().toString().equals("Cancelado")) {
            estatus_Guia = "B";
        }

        if (cboEstatusAnticipo.getSelectedItem().toString().equals("Aceptado")) {
            estatus_Anticipo = "A";
        } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Cancelado")) {
            estatus_Anticipo = "C";
        } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Edicion")) {
            estatus_Anticipo = "E";

        } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Liquidado")) {
            estatus_Anticipo = "L";
        }

        if (cboEstatusAsignacion.getSelectedItem().toString().equals("Todos")) {
            estatus_Asignacion = 0;
        } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Capturado")) {
            estatus_Asignacion = 1;

        } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Asignado")) {
            estatus_Asignacion = 2;

        } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Entregado")) {
            estatus_Asignacion = 3;

        } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Cancelado")) {
            estatus_Asignacion = 4;

        } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("En transito")) {
            estatus_Asignacion = 5;
        }

        if (cboEstatusPedido.getSelectedItem().toString().equals("Todos")) {
            estatus_Pedido = 0;
        } else if (cboEstatusPedido.getSelectedItem().toString().equals("Capturado")) {
            estatus_Pedido = 1;

        } else if (cboEstatusPedido.getSelectedItem().toString().equals("Asignado")) {
            estatus_Pedido = 2;

        } else if (cboEstatusPedido.getSelectedItem().toString().equals("Entregado")) {
            estatus_Pedido = 3;

        } else if (cboEstatusPedido.getSelectedItem().toString().equals("Cancelado")) {
            estatus_Pedido = 4;

        } else if (cboEstatusPedido.getSelectedItem().toString().equals("En transito")) {
            estatus_Pedido = 5;
        }

        if (cboPrestamo.getSelectedItem().toString().equalsIgnoreCase("Pendiente")) {
            estatus_Prestamo = "P";
        } else {
            estatus_Prestamo = "A";
        }
        
        
        
        
        if (numeroViaje != 0 && codigoArea != 0 && !numero_guia.equalsIgnoreCase("")) {
            System.out.println("Numero de viaje " + numeroViaje + " Codigo Area " + codigoArea + " Numero de guia " + numero_guia + " Accion a ejecutar " + accion);

            if (func.cancelacion_Carta_Porte(codigoArea, numeroViaje, estatus_Guia, estatus_Prestamo,
                    "", estatus_Anticipo, estatus_Pedido, estatus_Asignacion, numero_guia,accion)) {

                aux.mensajeLateral("Viaje Reactivado", "Se reactivo correctamente el viaje " + numeroViaje + " codigoArea " + codigoArea, "aceptado");
                frmViajes.TablaFolio.setModel(new DefaultTableModel());
                ocultar(true);
                this.dispose();
                
            } else {
                aux.mensajeLateral("Viaje Cancelado", "No se puedo cancelar el viaje", "fallo");
                lblReactivacion.setForeground(Color.RED);
            }
        }

    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cboEstatusAnticipo;
    private javax.swing.JComboBox<String> cboEstatusAsignacion;
    private javax.swing.JComboBox<String> cboEstatusGuia;
    private javax.swing.JComboBox<String> cboEstatusPedido;
    private javax.swing.JComboBox<String> cboPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblReactivacion;
    private javax.swing.JTextField txtCodigoArea;
    private javax.swing.JTextField txtNumeroGuia;
    private javax.swing.JTextField txtNumeroViaje;
    // End of variables declaration//GEN-END:variables
}
