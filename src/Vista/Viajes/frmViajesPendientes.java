/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajesPendientes;
import Modelo.ViajesPendientes;
import Vista.Indicadores.ResumenViajesCancelados;
import Vista.Principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Ricardo Herrera
 */
public class frmViajesPendientes extends javax.swing.JInternalFrame {

    Ayudas auxiliar = new Ayudas();
    ViajesPendientes obj = new ViajesPendientes();
    fViajesPendientes func = new fViajesPendientes();

    public frmViajesPendientes() {
        initComponents();
        mostrar("", "Activo");
        mostrarNumeroViaje();
        
        alertasPendientes();
        
      
    }

    void tamano_imagen(JLabel btn, String nombreImagen) {

        try {

            ImageIcon img = new ImageIcon(getClass().getResource("Imagenes/" + nombreImagen));
            Image imgEscale = img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);

            Icon imagen = new ImageIcon(imgEscale);
            btn.setIcon(imagen);

        } catch (Exception e) {
            auxiliar.mensaje("Error " + e.getMessage(), "Error");
        }

    }

    void alertasPendientes() {

        int alertas = func.alertasPendientes();
        lblAlertasPendientes.setText(String.valueOf(alertas));
        lblAlertasPendientes.setOpaque(false);
        lblAlertasPendientes.setForeground(Color.red);
        lblAlertasPendientes.setFont(new Font("Arial", Font.BOLD, 15));
        

    }

    void mostrarNumeroViaje() {
        
        try {
            int numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
            int codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());
            
            String folio = frmViajes.txtfolio.getText();

            lblNumeroViaje.setText("Numero de viaje "+String.valueOf(numeroViaje));
            lblCodigoArea.setText("Codigo de ruta "+String.valueOf(codigoArea));
            txtFolio.setText(folio);

        } catch (Exception e) {
            auxiliar.mensaje("No haz seleccionado ningun viaje realiza una consulta en la venta de viaje", "Error");
        }

    }

    void mostrar(String buscar, String estatus) {
        ListaViajesPendientes.setModel(func.showdata(buscar, estatus));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboEstatusPendientes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboMotivoError = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaViajesPendientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnResumen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroViajes = new javax.swing.JTextField();
        txtNumeroEconomico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtMotivoError = new javax.swing.JTextField();
        txtEstatusViaje = new javax.swing.JTextField();
        lblNumeroViaje = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboEstatusActivo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        lblAlertasPendientes = new javax.swing.JLabel();
        lblImagenAlertas = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Estatus Pendiente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estatus viajes por corrección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_disabled_by_default_black_24dp.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Comentarios :");

        txtComentarios.setColumns(20);
        txtComentarios.setLineWrap(true);
        txtComentarios.setRows(5);
        txtComentarios.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtComentarios);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_sync_alt_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_delete_black_24dp.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sucursal :");

        cboEstatusPendientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus", "Activo", "Inactivo" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Motivo Cancelacion :");

        cboMotivoError.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el motivo de cancelacion", "Error de captura", "Error de sistema", "Falla Mecanica", "Folio Cancelado" }));

        ListaViajesPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ListaViajesPendientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaViajesPendientes);
        add(pane, BorderLayout.CENTER);
        ListaViajesPendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaViajesPendientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaViajesPendientes);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Buscar :");

        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnResumen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_trending_down_black_24dp.png"))); // NOI18N
        btnResumen.setText("Resumen");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Numero de viaje :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Folio :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Numero Economico :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estatus :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Motivo Error :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estatus viaje :");

        lblNumeroViaje.setText("Numero de viaje");

        lblCodigoArea.setText("Codigo area");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Estatus viaje :");

        cboEstatusActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "Activo", "Inactivo" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblAlertasPendientes.setText("Alertas Pendientes");

        lblImagenAlertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alerta.png"))); // NOI18N
        lblImagenAlertas.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImagenAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlertasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboMotivoError, 0, 214, Short.MAX_VALUE)
                                    .addComponent(txtNumeroViajes)
                                    .addComponent(txtFolio)
                                    .addComponent(txtNumeroEconomico)
                                    .addComponent(txtSucursal)
                                    .addComponent(txtMotivoError)
                                    .addComponent(txtEstatusViaje)
                                    .addComponent(cboEstatusPendientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnActualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNumeroViaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCodigoArea))
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEstatusActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroViaje)
                            .addComponent(lblCodigoArea)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlertasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagenAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResumen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(cboEstatusActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNumeroEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEstatusPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMotivoError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstatusViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMotivoError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)
                            .addComponent(btnGuardar)))
                    .addComponent(jScrollPane2))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
        int codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());

        if (cboMotivoError.getSelectedIndex() == 0) {
            auxiliar.mensajeLateral("Selecciona un dato", "Selecciona un motivo de error ", "error");

            return;
        }
        if (cboEstatusPendientes.getSelectedIndex() == 0) {
            auxiliar.mensajeLateral("Selecciona un Estatus", "Selecciona un Estatus", "error");
            return;
        }
        if (txtComentarios.getText().length() <= 0) {
            auxiliar.mensajeLateral("Comentarios", "Debes de ingresar un comentario", "error");
            return;
        }

        obj.setEstatusViajePendiente(cboEstatusPendientes.getSelectedItem().toString());
        obj.setNumeroViaje(numeroViaje);
        obj.setCodigoArea(codigoArea);
        obj.setMotivoError(cboMotivoError.getSelectedItem().toString());
        obj.setComentarioError(txtComentarios.getText());
        obj.setAccion("1");

        if (func.matenimiento(obj)) {
            try {
                auxiliar.mensajeLateral("Registro Ingresado", "Se inserto correctamente el registro " + obj.getNumeroViaje(), "aceptado");

                alertasPendientes();
                mostrar("", cboEstatusActivo.getSelectedItem().toString());
                Thread.sleep(1000);

                // this.dispose();
            } catch (InterruptedException ex) {
                Logger.getLogger(frmViajesPendientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
        int codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());

        try {
            obj.setEstatusViajePendiente(cboEstatusPendientes.getSelectedItem().toString());
            obj.setNumeroViaje(numeroViaje);
            obj.setCodigoArea(codigoArea);
            obj.setComentarioError(txtComentarios.getText());
            obj.setAccion("3");

            if (func.matenimiento(obj)) {
                auxiliar.mensajeLateral("Registro Ingresado", "Se inserto correctamente el registro " + obj.getNumeroViaje(), "aceptado");
                alertasPendientes();
                mostrar("", "");
            } else {
                auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
            }
        } catch (Exception e) {
         auxiliar.mensajeLateral("Error "+e.getMessage(), "Error en "+getClass().getName(),"Error");
                 
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        int numeroViaje = 0;
        int codigoArea = 0;

        if (numeroViaje > 0 || codigoArea > 0) {
            numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
            codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());

            if (numeroViaje != Integer.parseInt(lblNumeroViaje.getText()) || codigoArea != Integer.parseInt(lblCodigoArea.getText())) {

                numeroViaje = Integer.parseInt(lblNumeroViaje.getText());
                codigoArea = Integer.parseInt(lblCodigoArea.getText());

            }

        } else {

            if (numeroViaje != Integer.parseInt(lblNumeroViaje.getText()) || codigoArea != Integer.parseInt(lblCodigoArea.getText())) {

                numeroViaje = Integer.parseInt(lblNumeroViaje.getText());
                codigoArea = Integer.parseInt(lblCodigoArea.getText());

            }
        }

        obj.setEstatusViajePendiente(cboEstatusPendientes.getSelectedItem().toString());
        obj.setNumeroViaje(numeroViaje);
        obj.setSucursal(frmViajes.txtNombreCorto.getText());
        obj.setCodigoArea(codigoArea);
        obj.setComentarioError(txtComentarios.getText());
        obj.setAccion("2");

        if (lblNumeroViaje.getText().length() > 0) {
            auxiliar.mensaje("Actualizacion por seleccion", "informativo");
        }

        if (func.matenimiento(obj)) {
            auxiliar.mensajeLateral("Actualizado", "Se actualizo correctamente el registro " + obj.getNumeroViaje() + " : " + obj.getSucursal(), "aceptado");
            alertasPendientes();
            mostrar("", cboEstatusActivo.getSelectedItem().toString());
        } else {
            auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void ListaViajesPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaViajesPendientesMouseClicked

        if (evt.getClickCount() == 2) {

            frmViajes.txtBuscar.setText(txtFolio.getText());

        }

        int fila = ListaViajesPendientes.rowAtPoint(evt.getPoint());
        int id = 0;

        try {
            
            lblCodigoArea.setText("Codigo de area "+ListaViajesPendientes.getValueAt(fila, 4).toString());
            lblNumeroViaje.setText("Numero de viaje "+ListaViajesPendientes.getValueAt(fila, 1).toString());
            txtNumeroViajes.setText(ListaViajesPendientes.getValueAt(fila, 1).toString());
            txtFolio.setText(ListaViajesPendientes.getValueAt(fila, 2).toString());
            txtNumeroEconomico.setText(ListaViajesPendientes.getValueAt(fila, 3).toString());
            txtSucursal.setText(ListaViajesPendientes.getValueAt(fila, 5).toString());
            txtMotivoError.setText(ListaViajesPendientes.getValueAt(fila, 13).toString());
            txtEstatusViaje.setText(ListaViajesPendientes.getValueAt(fila, 11).toString());
            txtComentarios.setText(ListaViajesPendientes.getValueAt(fila, 14).toString());
            id = Integer.parseInt(ListaViajesPendientes.getValueAt(fila, 0).toString());
            cboEstatusPendientes.setSelectedItem(func.Buscar_comboBox(id));
            cboMotivoError.setSelectedItem(func.Buscar_comboBoxEstatus(id));

        } catch (NumberFormatException e) {
            auxiliar.mensaje("Error al seleccionar el datos", "error");
        }

    }//GEN-LAST:event_ListaViajesPendientesMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        mostrar(txtBuscar.getText(), cboEstatusPendientes.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        ResumenViajesCancelados frm = new ResumenViajesCancelados();

        Principal.escritorio.add(frm);
        auxiliar.centrarPantalla(Principal.escritorio, frm);
        frm.show();


    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText(), cboEstatusActivo.getSelectedItem().toString());
        alertasPendientes();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        if (evt.getClickCount() >= 2) {
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_txtBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaViajesPendientes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnResumen;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboEstatusActivo;
    private javax.swing.JComboBox<String> cboEstatusPendientes;
    private javax.swing.JComboBox<String> cboMotivoError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlertasPendientes;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblImagenAlertas;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JTextField txtEstatusViaje;
    public static final javax.swing.JTextField txtFolio = new javax.swing.JTextField();
    private javax.swing.JTextField txtMotivoError;
    private javax.swing.JTextField txtNumeroEconomico;
    private javax.swing.JTextField txtNumeroViajes;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
