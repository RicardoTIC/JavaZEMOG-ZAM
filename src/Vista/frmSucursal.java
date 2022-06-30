/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Helpers.Ayudas;
import Logica.fSucursal;
import Logica.fUnidades;
import Modelo.Sucursal;
import Vista.Viajes.frmCambioRuta;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static Vista.Viajes.frmViajes.validacionformulario;

/**
 *
 * @author Ricardo Herrera
 */
public class frmSucursal extends javax.swing.JInternalFrame {

    Logica.fSucursal func = new fSucursal();
    Helpers.Ayudas aux = new Ayudas();
    Sucursal obj = new Sucursal();

    public frmSucursal() {
        initComponents();
        btnEnviarCambioRuta.setVisible(false);
        if (validacionformulario) {
            btnEnviarCambioRuta.setVisible(true);

        }

        this.maximizable = true;
        mostrar("");
    }

    void mostrar(String buscar) {
        func.totalRegistros = 0;
        listaSucursales.setModel(func.showdata(buscar));
        lblTotalUnidades.setText(String.valueOf(func.totalRegistros));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotalUnidades = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscardor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSucursales = new javax.swing.JTable();
        lblSucursal = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        btnEnviarGenerador = new javax.swing.JButton();
        btnEnviarCambioRuta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPresupuesto = new javax.swing.JTextField();
        txtNumeroUnidades = new javax.swing.JTextField();
        txtCostoPorUnidad = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Sucursales");

        lblTotalUnidades.setText("--------");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigos de Area Sucursales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscar :");

        txtBuscardor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscardorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscardorKeyTyped(evt);
            }
        });

        listaSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listaSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSucursalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaSucursales);

        lblSucursal.setText("--------");

        lblCodigoArea.setText("---------");

        btnEnviarGenerador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_send_black_24dp.png"))); // NOI18N
        btnEnviarGenerador.setText("Enviar Generador");
        btnEnviarGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarGeneradorActionPerformed(evt);
            }
        });

        btnEnviarCambioRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_send_black_24dp.png"))); // NOI18N
        btnEnviarCambioRuta.setText("Enviar");
        btnEnviarCambioRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCambioRutaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero de unidad :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Presupuesto :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Costo por unidad :");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lblSucursal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(538, 538, 538)
                                .addComponent(lblCodigoArea))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPresupuesto)
                                    .addComponent(txtCostoPorUnidad)))
                            .addComponent(btnEnviarGenerador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnviarCambioRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblSucursal)
                    .addComponent(lblCodigoArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCostoPorUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addComponent(btnEnviarGenerador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarCambioRuta)
                        .addGap(16, 16, 16)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalUnidades)
                .addContainerGap(852, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalUnidades)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscardorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscardorKeyReleased
        mostrar(txtBuscardor.getText());
    }//GEN-LAST:event_txtBuscardorKeyReleased

    private void btnEnviarCambioRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCambioRutaActionPerformed
        int fila = listaSucursales.getSelectedRow();

        frmCambioRuta.txtSucursal.setText(listaSucursales.getValueAt(fila, 1).toString());
        frmCambioRuta.lblCodigoArea.setText(listaSucursales.getValueAt(fila, 0).toString());

        this.dispose();
    }//GEN-LAST:event_btnEnviarCambioRutaActionPerformed

    private void listaSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSucursalesMouseClicked

        int fila = listaSucursales.getSelectedRow();

        lblCodigoArea.setText(listaSucursales.getValueAt(fila, 0).toString());
        lblSucursal.setText(listaSucursales.getValueAt(fila, 1).toString());

        txtPresupuesto.setText(listaSucursales.getValueAt(fila, 4).toString());
        txtNumeroUnidades.setText(listaSucursales.getValueAt(fila, 5).toString());
        txtCostoPorUnidad.setText(listaSucursales.getValueAt(fila, 6).toString());


    }//GEN-LAST:event_listaSucursalesMouseClicked

    private void txtBuscardorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscardorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscardorKeyTyped

    private void btnEnviarGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarGeneradorActionPerformed

    }//GEN-LAST:event_btnEnviarGeneradorActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            
            if (aux.mensajeConfirmacion("Deseas actualizar el registros  ?") == 0) 
                
            
            

            if (lblCodigoArea.getText().length() <= 0) {
                aux.mensaje("Debes de seleccionar una sucursal ", "Informativo");
                return;
            }
            if (txtPresupuesto.getText().length() <= 0) {
                aux.mensaje("Debes de Ingresar un  presupuesto ", "Informativo");
                return;
            }
            if (txtCostoPorUnidad.getText().length() <= 0) {
                aux.mensaje("Debes de seleccionar una costo por unidad correcto ", "Informativo");
                return;
            }
            if (txtNumeroUnidades.getText().length() <= 0) {
                aux.mensaje("Debes de seleccionar un numero de unidad correcto ", "Informativo");
                return;
            }

            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));
            obj.setPresupuesto(Float.parseFloat(txtPresupuesto.getText()));
            obj.setCostoPorEquipo(Integer.parseInt(txtCostoPorUnidad.getText()));
            obj.setNumeroUnidades(Integer.parseInt(txtNumeroUnidades.getText()));

            if (func.update(obj)) {

                aux.mensaje("Se actualizaron correctamente los datos", "Informativo");

                txtPresupuesto.setText("");
                txtCostoPorUnidad.setText("");
                txtNumeroUnidades.setText("");

                txtPresupuesto.requestFocus();
                if (txtBuscardor.getText().length() <= 0 ) {
                    mostrar("");
                }else{
                    mostrar(txtBuscardor.getText());
                    txtBuscardor.setText("");
                }
                
                        
                
            } else {
                aux.mensaje("Error " + obj.getMensajeError(), "Error");
            }

        } catch (NumberFormatException e) {
            aux.mensaje("Error " + obj.getMensajeError(), "Error");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEnviarCambioRuta;
    private javax.swing.JButton btnEnviarGenerador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTotalUnidades;
    private javax.swing.JTable listaSucursales;
    private javax.swing.JTextField txtBuscardor;
    private javax.swing.JTextField txtCostoPorUnidad;
    private javax.swing.JTextField txtNumeroUnidades;
    private javax.swing.JTextField txtPresupuesto;
    // End of variables declaration//GEN-END:variables
}
