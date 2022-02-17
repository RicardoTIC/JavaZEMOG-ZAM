/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajesPendientes;
import Modelo.ViajesPendientes;
import java.awt.BorderLayout;
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
        mostrar("");
    }

    void mostrar(String buscar) {
        ListaViajesPendientes.setModel(func.showdata(buscar));
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
        lblNumeroViaje = new javax.swing.JLabel();

        setTitle("Estatus Pendiente");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Comentarios :");

        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        jScrollPane1.setViewportView(txtComentarios);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Estatus :");

        cboEstatusPendientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus", "Activo", "Inactivo" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Motivo Cancelacion :");

        cboMotivoError.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el motivo de cancelacion", "Error de captura", "Error de sistema", "Falla Mecanica", "Folio Cancelado" }));

        ListaViajesPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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

        jLabel4.setText("Buscar :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEstatusPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMotivoError, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnActualizar)
                                .addGap(30, 30, 30)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(lblNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumeroViaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cboEstatusPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboMotivoError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnSalir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            auxiliar.mensajeLateral("Registro Ingresado", "Se inserto correctamente el registro " + obj.getNumeroViaje(), "aceptado");
            mostrar("");
        } else {
            auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
        int codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());

        obj.setEstatusViajePendiente(cboEstatusPendientes.getSelectedItem().toString());
        obj.setNumeroViaje(numeroViaje);
        obj.setCodigoArea(codigoArea);
        obj.setComentarioError(txtComentarios.getText());
        obj.setAccion("3");

        if (func.matenimiento(obj)) {
            auxiliar.mensajeLateral("Registro Ingresado", "Se inserto correctamente el registro " + obj.getNumeroViaje(), "aceptado");
            mostrar("");
        } else {
            auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int numeroViaje = Integer.parseInt(frmViajes.txtNumeroViaje.getText());
        int codigoArea = Integer.parseInt(frmViajes.txtCodigoRuta.getText());

        
        
        obj.setEstatusViajePendiente(cboEstatusPendientes.getSelectedItem().toString());
        obj.setNumeroViaje(numeroViaje);
        obj.setSucursal(frmViajes.txtNombreCorto.getText());
        obj.setCodigoArea(codigoArea);
        obj.setComentarioError(txtComentarios.getText());
        obj.setAccion("2");
        
        if (lblNumeroViaje.getText().length()> 0) {
              auxiliar.mensaje("Actualizacion por seleccion", "informativo");
        }
        

        if (func.matenimiento(obj)) {
            auxiliar.mensajeLateral("Actualizado", "Se actualizo correctamente el registro " + obj.getNumeroViaje() + " : " + obj.getSucursal(), "aceptado");
            mostrar("");
        } else {
            auxiliar.mensajeLateral("No se ingreso ningun registro", "Error no se ingreso ningun registro ", "error");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void ListaViajesPendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaViajesPendientesMouseClicked
        int fila  = ListaViajesPendientes.rowAtPoint(evt.getPoint());
        
        try {
            
            lblNumeroViaje.setText(ListaViajesPendientes.getValueAt(fila, 1).toString());
            
            txtComentarios.setText(ListaViajesPendientes.getValueAt(fila, 11).toString());
            
            
        } catch (Exception e) {
              auxiliar.mensaje("Error al seleccionar el datos", "error");
        }
        
    }//GEN-LAST:event_ListaViajesPendientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaViajesPendientes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboEstatusPendientes;
    private javax.swing.JComboBox<String> cboMotivoError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtComentarios;
    // End of variables declaration//GEN-END:variables
}
