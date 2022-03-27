/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fCartaCobro;
import Modelo.Carta_de_Cobro;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class frmCartasDeCobro extends javax.swing.JInternalFrame {

    fCartaCobro func = new fCartaCobro();
    Helpers.Ayudas hp = new Ayudas();

    public frmCartasDeCobro() {
        initComponents();

        if (frmViajes.txtfolio.getText().length() == 0) {
            mostrar("");
        } else {
            mostrar(frmViajes.txtfolio.getText());
        }

    }

    void seleccionar_fila() {
        int fila = ListaCartaCobro.getSelectedRow();
        try {

            txtCodigoArea.setText(ListaCartaCobro.getValueAt(fila, 0).toString());
            txtNumeroguia.setText(ListaCartaCobro.getValueAt(fila, 1).toString());
            txtFactura.setText(ListaCartaCobro.getValueAt(fila, 2).toString());
            txtCartaCobro.setText(ListaCartaCobro.getValueAt(fila, 3).toString());
            txtFlete.setText(ListaCartaCobro.getValueAt(fila, 4).toString());
            txtRemision.setText(ListaCartaCobro.getValueAt(fila, 5).toString());

        } catch (Exception e) {
        }
    }

    void mostrar(String buscar) {
        try {
            
            
            
            
            ListaCartaCobro.setModel(func.showdata(buscar));

        } catch (Exception e) {
            hp.mensaje("error " + e.getMessage(), "Error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCartaCobro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoArea = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        txtNumeroguia = new javax.swing.JTextField();
        txtCartaCobro = new javax.swing.JTextField();
        txtFlete = new javax.swing.JTextField();
        txtRemision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCancelarCartaDeCobro = new javax.swing.JButton();

        setClosable(true);
        setTitle("Carta de Cobro");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ListaCartaCobro.setModel(new javax.swing.table.DefaultTableModel(
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
        ListaCartaCobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaCartaCobroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaCartaCobro);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo area :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero Guia :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Factura :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Carta de Cobro :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Flete :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Remision :");

        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });

        txtNumeroguia.setText(" ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha Vencimiento :");

        btnCancelarCartaDeCobro.setText("Cancelar Carta de cobro");
        btnCancelarCartaDeCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCartaDeCobroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtNumeroguia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFlete, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(txtRemision, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(txtFechaVencimiento))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCartaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelarCartaDeCobro))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroguia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCartaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCartaDeCobro))
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed

    }//GEN-LAST:event_txtFacturaActionPerformed

    private void ListaCartaCobroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaCartaCobroMouseClicked

        int fila = ListaCartaCobro.getSelectedRow();
        try {

            txtCodigoArea.setText(ListaCartaCobro.getValueAt(fila, 0).toString());
            txtNumeroguia.setText(ListaCartaCobro.getValueAt(fila, 1).toString());
            txtFactura.setText(ListaCartaCobro.getValueAt(fila, 2).toString());
            txtCartaCobro.setText(ListaCartaCobro.getValueAt(fila, 3).toString());
            txtFlete.setText(ListaCartaCobro.getValueAt(fila, 4).toString());
            txtRemision.setText(ListaCartaCobro.getValueAt(fila, 5).toString());
            txtFechaVencimiento.setText(ListaCartaCobro.getValueAt(fila, 6).toString());

        } catch (Exception e) {
        }

    }//GEN-LAST:event_ListaCartaCobroMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnCancelarCartaDeCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCartaDeCobroActionPerformed

        Carta_de_Cobro obj = new Carta_de_Cobro();

        try {
        if (hp.mensajeConfirmacion("Deseas cancelar la carta de cobro") != 1) {

            if (txtCodigoArea.getText().length() == 0) {
                hp.mensaje("Debes de seleccionar una area ", "Informativo");
                txtCodigoArea.requestFocus();
                return;
            }

            if (txtNumeroguia.getText().length() == 0) {
                hp.mensaje("Debes seleccionar un numero guia", "Informativo");
                txtNumeroguia.requestFocus();
                return;
            }
            
            txtFechaVencimiento.setText("null");
            txtCartaCobro.setText("null");

            obj.setId_area(Integer.parseInt(txtCodigoArea.getText()));
            obj.setNo_guia(txtNumeroguia.getText());
            obj.setCartaCobro(txtCartaCobro.getText());
            obj.setRemision(txtRemision.getText());

            if (func.update(obj)) {
                hp.mensajeLateral("Se cancelo correctamente la carta de cobro " + txtCartaCobro.getText(), "Cancelacion exitosa", "aceptado");
                DefaultTableModel modelo =(DefaultTableModel)ListaCartaCobro.getModel();
              
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    modelo.removeRow(i);
                }
                
               mostrar(obj.getRemision());
               
            } else {
                hp.mensajeLateral("No se cancelo correctamente la carta de cobro " + txtCartaCobro.getText(), "Error", "error");
            }
            
        }
        
        } catch (Exception e) {
            hp.mensaje("Error " + e.getMessage(), "Error");
        }
        
        


    }//GEN-LAST:event_btnCancelarCartaDeCobroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaCartaCobro;
    private javax.swing.JButton btnCancelarCartaDeCobro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCartaCobro;
    private javax.swing.JTextField txtCodigoArea;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtFlete;
    private javax.swing.JTextField txtNumeroguia;
    private javax.swing.JTextField txtRemision;
    // End of variables declaration//GEN-END:variables
}
