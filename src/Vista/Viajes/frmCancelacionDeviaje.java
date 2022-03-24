/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajes;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class frmCancelacionDeviaje extends javax.swing.JInternalFrame {

    Ayudas aux = new Ayudas();
    fViajes func = new fViajes();

    public frmCancelacionDeviaje() {
        initComponents();
        lblCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        lblNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        txtNumeroGuia.setText(frmViajes.txtNumeroGuia.getText());

        if (lblCodigoArea.getText().length() <= 0 || lblNumeroViaje.getText().length() <= 0) {
            mostrar("", "");
        } else {
            mostrar(lblNumeroViaje.getText(), lblCodigoArea.getText());
        }

    }

    void mostrar(String numeroViaje, String numeroArea) {
        listaViaticos.setModel(func.ViaticosDispersos(numeroViaje, numeroArea));
        ajuste_Columnas();
    }

    void ajuste_Columnas() {
        for (int i = 0; i < listaViaticos.getColumnCount(); i++) {
            listaViaticos.getColumnModel().getColumn(i).setMaxWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setMinWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEstatusAnticipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumeroViaje = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        lbltotalviatico = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaViaticos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cboEstatusGuia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboPrestamo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboEstatusAsignacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboEstatusPedido = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNumeroGuia = new javax.swing.JTextField();
        checkManual = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboEstatusViaje = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTrafico = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroViaje = new javax.swing.JTextField();
        txtCodigoArea = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximizable(true);
        setTitle("Estatus viaje");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estatus anticipo :");

        cboEstatusAnticipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus anticipo", "Aceptado", "Cancelado", "Edicion", "Liquidado" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Observaciones :");

        txtObservaciones.setColumns(20);
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtObservaciones);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero de viaje :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Area :");

        lblNumeroViaje.setText("-");

        lblCodigoArea.setText("-");

        lbltotalviatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalviatico.setText("-");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total viatico :");

        listaViaticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listaViaticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(listaViaticos);
        add(pane, BorderLayout.CENTER);
        jScrollPane2.setViewportView(listaViaticos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estatus Guia");

        cboEstatusGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus Guia", "Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Prestamo :");

        cboPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un prestamo", "Pendiente", "Aceptado" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Estatus Asignacion :");

        cboEstatusAsignacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus asignacion", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En transito", " " }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estatus Pedido :");

        cboEstatusPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus pedido", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En transito" }));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Numero de guia :");

        checkManual.setBackground(new java.awt.Color(255, 255, 255));
        checkManual.setText("Manual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(lbltotalviatico, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(checkManual))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusGuia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                        .addComponent(cboPrestamo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusPedido, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumeroViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigoArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEstatusGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboEstatusPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltotalviatico)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(jButton1)
                            .addComponent(checkManual))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cancelacion de viaje", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estatus trafico viaje :");

        cboEstatusViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "Cancelado", "Liquidado", "Pendiente", "Realizado", "Transito", "Liberado" }));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        TablaTrafico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaTrafico);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Numero de viaje :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Codigo Area :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEstatusViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txtCodigoArea, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboEstatusViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Trafico viaje", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Trafico Guia", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Desp_asignacion", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Trafico_guia", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        String accion = "Cancelar";
        if (frmViajes.lblEstatusGuia.getText().equalsIgnoreCase("Pendiente")) {
            aux.mensaje("NO PUEDES CANCELAR UNA VIAJE POR QUE ESTA EN ESTADO DE PENDIENTE FINALIZA EL VIAJE PARA CANCELAR", "INFORMATIVO");
        } else {

            String estatus_Anticipo = "", estatus_Guia = "", estatus_Prestamo = "", numero_guia ="";
            int estatus_Asignacion = 0, estatus_Pedido = 0;

            int codigoArea = 0, numeroViaje = 0, auxiliar = 0;

            if (lblCodigoArea.getText().length() <= 0) {
                aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
                return;

            }
            if (lblNumeroViaje.getText().length() <= 0) {
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
            
            if (txtNumeroGuia.getText().length() ==0) {
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

            /*si retorna un 0 = si, si retorna 1  = no*/
            if (aux.mensajeConfirmacion("Deseas Cancelar el viaje") == 0) {

                for (int i = 0; i < frmViajes.TablaFolio.getRowCount(); i++) { //Filas 

                    for (int j = 0; j < frmViajes.TablaFolio.getColumnCount(); j++) { //Columnas

                        auxiliar = j;
                        System.out.println(frmViajes.TablaFolio.getValueAt(i, j));

                        if (j == 1) {
                            numeroViaje = Integer.parseInt(frmViajes.TablaFolio.getValueAt(i, j).toString());

                        } else if (j == 2) {
                            codigoArea = Integer.parseInt(frmViajes.TablaFolio.getValueAt(i, j).toString());
//                            j = auxiliar;
                        }else if(j == 3){
                            numero_guia = frmViajes.TablaFolio.getValueAt(i, j).toString();
                        }

                        if (numeroViaje != 0 && codigoArea != 0 && !numero_guia.equalsIgnoreCase("")) {
                            System.out.println("Numero de viaje " + numeroViaje + " Codigo Area " + codigoArea + " Numero de guia " + numero_guia);
                            
                            if (func.cancelacion_Carta_Porte(codigoArea, numeroViaje, estatus_Guia, estatus_Prestamo,
                                    txtObservaciones.getText(), estatus_Anticipo, estatus_Pedido, estatus_Asignacion,numero_guia,accion)) {

                                aux.mensajeLateral("Viaje Cancelado", "Se a cancelado correctamente el viaje " + numeroViaje + " codigoArea " + codigoArea, "aceptado");
                                frmViajes.TablaFolio.setModel(new DefaultTableModel());
                                aux.mensaje("Tabla de folios eliminados limpia", "Informativo");
                                this.dispose();
                            } else {
                                aux.mensajeLateral("Viaje Cancelado", "No se puedo cancelar el viaje", "fallo");
                            }

                        }
                    }

                }

            }

            aux.mensajeLateral("Viaje Cancelado", "Se a cancelado correctamente todos los viajes ", "aceptado");
            frmViajes.TablaFolio.removeAll();

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ///Declaramos una varibale estado para definir el estatus del viaje
        String estado = "", validacion = "";

        int numero_vaje, codigo_area;
        try {

            //Validamos que ingresamos un estatus valido
            if (cboEstatusViaje.getSelectedIndex() == 0) {
                aux.mensaje("Debes de seleccionar un estatus valido", "Informativo");
                cboEstatusAnticipo.requestFocus();
                return;
            }

            if (txtCodigoArea.getText().length() == 0) {
                aux.mensaje("Ingresa un codigo de area ", "Informativo");
                txtCodigoArea.requestFocus();
                return;
            } else {
                codigo_area = Integer.parseInt(txtCodigoArea.getText());
            }

            if (txtNumeroViaje.getText().length() == 0) {
                aux.mensaje("Ingresa un numero de viaje", "Informativo");
                txtNumeroViaje.requestFocus();
                return;
            } else {
                numero_vaje = Integer.parseInt(txtNumeroViaje.getText());
            }

            //Condicion para la definicion de estado
            if (cboEstatusViaje.getSelectedItem().equals("Cancelado")) {
                estado = "B";
            }
            if (cboEstatusViaje.getSelectedItem().equals("Liquidado")) {
                estado = "C";
            }
            if (cboEstatusViaje.getSelectedItem().equals("Pendiente")) {
                estado = "A";
            }
            if (cboEstatusViaje.getSelectedItem().equals("Realizado")) {
                estado = "R";
            }
            if (cboEstatusViaje.getSelectedItem().equals("Transito")) {
                estado = "T";
            }
            if (cboEstatusViaje.getSelectedItem().equals("Liberado")) {
                estado = "L";
            }

            if (estado.equalsIgnoreCase("")) {
                aux.mensaje("El estatus esta vacio selecciona un estatus valido", "Informativo");
                return;
            }

            validacion = func.update_trafico_viaje(estado, numero_vaje, codigo_area);

            if (validacion.equalsIgnoreCase("success")) {

                aux.mensaje("Registro actualizado correctamente : " + numero_vaje + " Codigo area : " + codigo_area, "Informativo");
                this.dispose();
            } else {
                aux.mensaje(validacion, "Error");
            }

        } catch (Exception e) {

            aux.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTrafico;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cboEstatusAnticipo;
    private javax.swing.JComboBox<String> cboEstatusAsignacion;
    private javax.swing.JComboBox<String> cboEstatusGuia;
    private javax.swing.JComboBox<String> cboEstatusPedido;
    private javax.swing.JComboBox<String> cboEstatusViaje;
    private javax.swing.JComboBox<String> cboPrestamo;
    private javax.swing.JCheckBox checkManual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lbltotalviatico;
    private javax.swing.JTable listaViaticos;
    private javax.swing.JTextField txtCodigoArea;
    private javax.swing.JTextField txtNumeroGuia;
    private javax.swing.JTextField txtNumeroViaje;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
