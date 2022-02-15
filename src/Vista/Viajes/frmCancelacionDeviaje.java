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
        for (int i = 0; i <listaViaticos.getColumnCount(); i++) {
            listaViaticos.getColumnModel().getColumn(i).setMaxWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setMinWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estatus anticipo :");

        cboEstatusAnticipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus anticipo", "Aceptado", "Cancelado", "Edicion", "Liquidado" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Observaciones :");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(5);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addGap(426, 426, 426)
                        .addComponent(lbltotalviatico, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCodigoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusGuia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                        .addComponent(cboPrestamo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEstatusPedido, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltotalviatico)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cancelacion de viaje", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("trafico viaje", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        String estatus_Anticipo = "",estatus_Guia="",estatus_Prestamo = "";
        int estatus_Asignacion = 0 , estatus_Pedido = 0;
        
        if (lblCodigoArea.getText().length() <=0 ) {
            aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
            return;
            
        }
        if (lblNumeroViaje.getText().length() <=0 ) {
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
        
        
        /*El estatus guia y el estatus trafico_viaje tiene la misma nomeclatura de estatus */
        
        if(cboEstatusGuia.getSelectedItem().toString().equals("Confirmado")) {
            estatus_Guia = "C";
        }else if(cboEstatusGuia.getSelectedItem().toString().equals("Regreso")){
            estatus_Guia = "R";
        }else if(cboEstatusGuia.getSelectedItem().toString().equals("Pendiente")){
            estatus_Guia = "A";
        
        }else if(cboEstatusGuia.getSelectedItem().toString().equals("Transito")){
            estatus_Guia = "T";
        
        }else if(cboEstatusGuia.getSelectedItem().toString().equals("Cancelado")){
            estatus_Guia = "B";
        }
        
        
        
        if (cboEstatusAnticipo.getSelectedItem().toString().equals("Aceptado")) {
            estatus_Anticipo = "A";
        }else if(cboEstatusAnticipo.getSelectedItem().toString().equals("Cancelado")){
            estatus_Anticipo = "C";
        }
        else if(cboEstatusAnticipo.getSelectedItem().toString().equals("Edicion")){
            estatus_Anticipo = "E";
        
        }else if(cboEstatusAnticipo.getSelectedItem().toString().equals("Liquidado")){
            estatus_Anticipo = "L";
        }
        
        
        if (cboEstatusAsignacion.getSelectedItem().toString().equals("Todos")) {
            estatus_Asignacion = 0;
        }else if(cboEstatusAsignacion.getSelectedItem().toString().equals("Capturado")){
            estatus_Asignacion = 1;
        
        }else if(cboEstatusAsignacion.getSelectedItem().toString().equals("Asignado")){
            estatus_Asignacion = 2;
        
        }else if(cboEstatusAsignacion.getSelectedItem().toString().equals("Entregado")){
            estatus_Asignacion = 3;
        
        }else if(cboEstatusAsignacion.getSelectedItem().toString().equals("Cancelado")){
            estatus_Asignacion = 4;
        
        }else if(cboEstatusAsignacion.getSelectedItem().toString().equals("En transito")){
            estatus_Asignacion = 5;
        }
        
        
                
        if (cboEstatusPedido.getSelectedItem().toString().equals("Todos")) {
            estatus_Pedido = 0;
        }else if(cboEstatusPedido.getSelectedItem().toString().equals("Capturado")){
            estatus_Pedido = 1;
        
        }else if(cboEstatusPedido.getSelectedItem().toString().equals("Asignado")){
            estatus_Pedido = 2;
        
        }else if(cboEstatusPedido.getSelectedItem().toString().equals("Entregado")){
            estatus_Pedido = 3;
        
        }else if(cboEstatusPedido.getSelectedItem().toString().equals("Cancelado")){
            estatus_Pedido = 4;
        
        }else if(cboEstatusPedido.getSelectedItem().toString().equals("En transito")){
            estatus_Pedido = 5;
        }
        
        if (cboPrestamo.getSelectedItem().toString().equalsIgnoreCase("Pendiente")) {
            estatus_Prestamo = "P";
        }else{
            estatus_Prestamo = "A";
        }
        
        
        
        /*si retorna un 0 = si, si retorna 1  = no*/
        if (aux.mensajeConfirmacion("Deseas Cancelar el viaje") == 0) {
            
            
            if (func.cancelacion_Carta_Porte(Integer.parseInt(lblCodigoArea.getText()),Integer.parseInt(lblNumeroViaje.getText()),estatus_Guia,estatus_Prestamo
                    ,txtObservaciones.getText(), estatus_Anticipo, estatus_Pedido, estatus_Asignacion)) {
                aux.mensajeLateral("Viaje Cancelado", "Se a cancelado correctamente el viaje", "aceptado");
            }else{
                aux.mensajeLateral("Viaje Cancelado", "No se puedo cancelar el viaje", "fallo");
            }
            

            
            
            
        }
        

        
        
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cboEstatusAnticipo;
    private javax.swing.JComboBox<String> cboEstatusAsignacion;
    private javax.swing.JComboBox<String> cboEstatusGuia;
    private javax.swing.JComboBox<String> cboEstatusPedido;
    private javax.swing.JComboBox<String> cboPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lbltotalviatico;
    private javax.swing.JTable listaViaticos;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
