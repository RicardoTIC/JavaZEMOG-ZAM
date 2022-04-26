/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Helpers.Ayudas;
import Logica.fConcentradoDetalleUnidades;
import Modelo.ConcentradoDetalleUnidades;
import Modelo.Sucursal;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.GregorianCalendar;

/**
 *
 * @author Ricardo Herrera
 */
public class frmConcentradoDetalleUnidades extends javax.swing.JInternalFrame {
    SimpleDateFormat fechaInicial = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat fechaFinal = new SimpleDateFormat("yyyy-MM-dd");
    fConcentradoDetalleUnidades func = new fConcentradoDetalleUnidades();
    Helpers.Ayudas aux = new Ayudas();
    LocalDate currentDate = LocalDate.parse(fechaFinal.format(new GregorianCalendar().getTime()));
    GregorianCalendar fechaActual = new GregorianCalendar(currentDate.getYear(), currentDate.getMonthValue()-1, currentDate.getDayOfMonth());
    GregorianCalendar fechaInicialCampo = new  GregorianCalendar(currentDate.getYear(),currentDate.getMonthValue()-1,1);

    ConcentradoDetalleUnidades obj = new ConcentradoDetalleUnidades();

    public frmConcentradoDetalleUnidades() {
        initComponents();
        txtFecha.setCalendar(fechaInicialCampo);
        txtFechaFinal.setCalendar(fechaActual);
        mostrar("");
    }

    void mostrar(String buscar) {
        try {
            ListaUnidades.setModel(func.ListaDeDatos());
        } catch (Exception e) {
            aux.mensajeLateral("Error", "" + e.getMessage(), "error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUnidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtNumeroUnidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Detalle Unidades");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Unidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        ListaUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUnidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUnidades);

        jLabel1.setText("Total de unidades :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sucursal :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha Inicial :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Numero de unidades :");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        txtSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSucursalKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Codigo area :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha Final :");

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Resumen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Id :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(44, 44, 44)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(txtNumeroUnidades)
                            .addComponent(txtSucursal)
                            .addComponent(lblCodigoArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {

            if (txtNumeroUnidades.getText().length() <= 0) {
                aux.mensaje("Ingresa el numero de unidades", "Informativo");
                txtNumeroUnidades.requestFocus();
                return;
            }
            if (txtSucursal.getText().length() <= 0) {
                aux.mensaje("Ingresa el numero de sucursal", "Informativo");
                txtSucursal.requestFocus();
                return;
            }
            if (lblCodigoArea.getText().length() <= 0) {
                aux.mensaje("Ingresa un codigo de sucursal", "Informativo");
            }

            obj.setNumeroUnidades(Integer.parseInt(txtNumeroUnidades.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));
            obj.setFecha_unidades(fechaInicial.format(txtFecha.getDate()));
            obj.setFecha_final(Date.valueOf(fechaFinal.format(txtFechaFinal.getDate())));
            
            if (aux.mensajeConfirmacion("Deseas ingresar el numero de unidades de " + obj.getFecha_unidades() + " a " + obj.getFecha_final()) == 1) {
                return;
            }
            

            if (func.insertData(obj).equals("success")) {
                aux.mensajeLateral("Registro insertado", "Se inserto correctamente el registro", "aceptado");
                mostrar("");
            } else {

                aux.mensajeLateral("No se puedo ingresar el registro", "No se puedo ingresar el registro " + obj.getMensajeError(), "error");
            }

        } catch (NumberFormatException e) {

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtSucursalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSucursalKeyReleased

        Sucursal suc = new Sucursal();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                suc = func.dataRegistre(txtSucursal.getText());

            lblCodigoArea.setText(String.valueOf(suc.getId_area()));
        }


    }//GEN-LAST:event_txtSucursalKeyReleased

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
        frmResumenFlota flota = new frmResumenFlota();
        Principal.escritorio.add(flota);
        aux.centrarPantalla(Principal.escritorio, flota);
        flota.show();
        
                
    }//GEN-LAST:event_jPanel2MouseClicked

    private void ListaUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUnidadesMouseClicked
      
        int fila = ListaUnidades.rowAtPoint(evt.getPoint());
        
        try {
            
            lblId.setText(ListaUnidades.getValueAt(fila, 0).toString());
            txtNumeroUnidades.setText(ListaUnidades.getValueAt(fila, 2).toString());
           
                        

        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_ListaUnidadesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        if (lblId.getText().length() <= 0) {
            
            aux.mensaje("Selecciona un registro para actualizar", "informativo");
            return;
            
        }
        
        if (txtNumeroUnidades.getText().length()<=0) {
            aux.mensaje("No haz cambiado o bien la casilla unidades esta vacio", "Informativo");
            return;
        }
        
        obj.setId(Integer.parseInt(lblId.getText()));
        obj.setNumeroUnidades(Integer.parseInt(txtNumeroUnidades.getText()));
        
        
        if (func.actualizar(obj).equalsIgnoreCase("success")) {
            aux.mensajeLateral("Registro ingresado correctamente", "Se ingreso correctamente el registro "+ obj.getId(), "aceptado");
            mostrar("");
        }else{
            aux.mensaje("No se ingreso correctamente el registro revisar"+getClass().getName(), "Error");
        }
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaUnidades;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblId;
    private com.toedter.calendar.JDateChooser txtFecha;
    public static com.toedter.calendar.JDateChooser txtFechaFinal;
    private javax.swing.JTextField txtNumeroUnidades;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
