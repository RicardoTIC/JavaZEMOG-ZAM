package Vista;

import Helpers.Ayudas;
import Logica.fFinanciero;
import Modelo.Sucursal;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Modelo.Financiera;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class frmFinenciero extends javax.swing.JInternalFrame {

    fFinanciero func = new fFinanciero();
    Financiera obj = new Financiera();

    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
    //Cremos una instancia de Calendar para optener la fecha actual
    Calendar fecha = Calendar.getInstance();
    GregorianCalendar fechafinal = new GregorianCalendar(2022, fecha.get(Calendar.MONTH), 1, 12, 59, 59);

    String[] bases = {"Selecciona una sucursal", "CCT", "CCZ", "CCZD", "CHH", "CMC", "CMG", "CMGD", "CMM", "CMMD", ""
        + "CMP", "CMPD", "CMT", "COR", "CUL", "DGO",
        "GEPP", "HMO", "JRZ", "LPZ", "MTY", "MXL", "MZT", "NGL", "QRO", "SA", "ZCT"};

    DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>(bases);
    Helpers.Ayudas aux = new Ayudas();
    private int totalRegistros;

    public frmFinenciero() {
        initComponents();
        cboSucursal.setModel(modeloCombo);
        txtFechaFinanciera.setDate(fechafinal.getTime());
        mostrar("");
        ocultar_cajas(false);
        lblCodigoArea.setVisible(false);
        lblId.setVisible(false);
    }

    void mostrar(String buscar) {
        try {
            tbfinanciero.setModel(func.listaDatos(buscar));
            totalRegistros = tbfinanciero.getRowCount();

            lblTotalRegistros.setText(String.valueOf(totalRegistros));

        } catch (Exception e) {
            aux.mensaje("error" + e.getMessage(), "error");
        }

    }

    void ocultar_cajas(boolean activacion) {
        txtKmDiarios.setVisible(activacion);
        txtVentaDiaria.setVisible(activacion);
        txtVentaPorKM.setVisible(activacion);

        jLabel11.setVisible(activacion);
        jLabel12.setVisible(activacion);
        jLabel13.setVisible(activacion);
        jLabel14.setVisible(activacion);

    }

    void limpiarCajas() {
        
        txtKm.setText("");
        txtVenta.setText("");
        cboSucursal.setSelectedIndex(0);
        txtKmDiarios.setText("");
        txtVentaDiaria.setText("");
        txtVentaPorKM.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfinanciero = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }}
            ;
            jLabel1 = new javax.swing.JLabel();
            txtBuscar = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            txtFechaFinanciera = new com.toedter.calendar.JDateChooser();
            txtKm = new javax.swing.JTextField();
            txtVenta = new javax.swing.JTextField();
            txtVentaPorKM = new javax.swing.JTextField();
            txtVentaDiaria = new javax.swing.JTextField();
            txtKmDiarios = new javax.swing.JTextField();
            cboSucursal = new javax.swing.JComboBox<>();
            btnGuardar = new javax.swing.JButton();
            btnEliminar = new javax.swing.JButton();
            btnActualizar = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            lblTotalRegistros = new javax.swing.JLabel();
            lblCodigoArea = new javax.swing.JLabel();
            lblId = new javax.swing.JLabel();
            btnNuevo = new javax.swing.JButton();

            setClosable(true);
            setIconifiable(true);
            setMaximizable(true);
            setTitle("Financiero");

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Financiero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

            tbfinanciero.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {},
                    {},
                    {},
                    {}
                },
                new String [] {

                }
            ));
            tbfinanciero.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            JScrollPane pane = new JScrollPane(tbfinanciero);
            add(pane, BorderLayout.CENTER);
            tbfinanciero.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbfinancieroMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tbfinanciero);

            jLabel1.setText("Buscar :");

            txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscarKeyReleased(evt);
                }
            });

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
            jButton1.setText("Buscar");

            jLabel7.setText("Fecha financiera :");

            jLabel9.setText("Kilometros :");

            jLabel10.setText("Venta :");

            jLabel11.setText("Venta por Km :");

            jLabel12.setText("Venta Diaria :");

            jLabel13.setText("Km Diarios :");

            jLabel14.setText("Sucursal :");

            txtKm.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtKmActionPerformed(evt);
                }
            });

            cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            cboSucursal.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cboSucursalActionPerformed(evt);
                }
            });

            btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
            btnGuardar.setText("Guardar");
            btnGuardar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGuardarActionPerformed(evt);
                }
            });

            btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_delete_black_24dp.png"))); // NOI18N
            btnEliminar.setText("Eliminar");

            btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
            btnActualizar.setText("Actualizar");
            btnActualizar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnActualizarActionPerformed(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel2.setText("Total de registros :");

            lblTotalRegistros.setText("-");

            btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_add_black_24dp.png"))); // NOI18N
            btnNuevo.setText("Nuevo");
            btnNuevo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnNuevoActionPerformed(evt);
                }
            });

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
                                    .addComponent(jLabel1)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnActualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtFechaFinanciera, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                .addComponent(txtVenta)
                                                .addComponent(txtVentaPorKM)
                                                .addComponent(txtVentaDiaria)
                                                .addComponent(txtKmDiarios)
                                                .addComponent(cboSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(26, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId)
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblId)
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(txtFechaFinanciera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtVentaPorKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtVentaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKmDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardar)
                                .addComponent(btnEliminar)
                                .addComponent(btnActualizar)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblTotalRegistros)))
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

    private void tbfinancieroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbfinancieroMouseClicked
        int fila = tbfinanciero.rowAtPoint(evt.getPoint());
        try {

            ocultar_cajas(true);

            lblId.setText(tbfinanciero.getValueAt(fila, 0).toString());
            txtKm.setText(tbfinanciero.getValueAt(fila, 6).toString());
            txtVenta.setText(tbfinanciero.getValueAt(fila, 7).toString());

            txtVentaDiaria.setText(tbfinanciero.getValueAt(fila, 8).toString());
            txtVentaPorKM.setText(tbfinanciero.getValueAt(fila, 10).toString());
            txtKmDiarios.setText(tbfinanciero.getValueAt(fila, 9).toString());
            cboSucursal.setSelectedItem(tbfinanciero.getValueAt(fila, 1).toString());

        } catch (Exception e) {
        }

    }//GEN-LAST:event_tbfinancieroMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int codigoRuta = 0;
        codigoRuta = func.extraccion_CodigoArea(cboSucursal.getSelectedItem().toString());
        String accion = "insertar";

        if (txtKm.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un kilometraje", "Informativo");
            return;
        }

        if (txtVenta.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar una venta en el cuadro de texto", "Informativo");
            return;
        }

        if (lblCodigoArea.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un codigo de area", "informativo");
            return;

        }

        if (cboSucursal.getSelectedIndex() == 0) {
            aux.mensaje("Selecciona una sucursal", "informativo");
            return;

        }

        if (lblId.getText().length() <= 0) {

            lblId.setText("0");

        }

        obj.setAccion("insertar");
        obj.setId(Integer.parseInt(lblId.getText()));
        obj.setFecha_financiera(formatoFecha.format(txtFechaFinanciera.getDate()));
        obj.setKilometros(Integer.parseInt(txtKm.getText()));
        obj.setVenta(Double.parseDouble(txtVenta.getText()));
        obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));

        if (func.mantenimientoFinanciero(obj) == 1) {

            aux.mensaje("Se insertaron correctamente los datos ", "Informativo");
            limpiarCajas();
            mostrar("");
        } else {
            aux.mensaje("error " + obj.getError(), "Informativo");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cboSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSucursalActionPerformed
        int codigoRuta = 0;
        codigoRuta = func.extraccion_CodigoArea(cboSucursal.getSelectedItem().toString());
        lblCodigoArea.setText(String.valueOf(codigoRuta));
    }//GEN-LAST:event_cboSucursalActionPerformed

    private void txtKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ocultar_cajas(false);
        limpiarCajas();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        
        try {
            
        if (txtKm.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un kilometraje", "Informativo");
            return;
        }

        if (txtVenta.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar una venta en el cuadro de texto", "Informativo");
            return;
        }

        if (lblCodigoArea.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un codigo de area", "informativo");
            return;

        }

        if (cboSucursal.getSelectedIndex() == 0) {
            aux.mensaje("Selecciona una sucursal", "informativo");
            return;

        }

        if (lblId.getText().length() <= 0) {
            lblId.setText("0");
        }

        
        obj.setAccion("actualizar");
        obj.setId(Integer.parseInt(lblId.getText()));
        obj.setFecha_financiera(formatoFecha.format(txtFechaFinanciera.getDate()));
        obj.setKilometros(Double.parseDouble(txtKm.getText()));
        obj.setVenta(Double.parseDouble(txtVenta.getText()));
        obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));

        if (func.mantenimientoFinanciero(obj) == 1) {

            aux.mensaje("Se actualizaron correctamente los datos ", "Informativo");
            limpiarCajas();
            mostrar("");
        } else {
            aux.mensaje("error " + obj.getError(), "Informativo");
        }
        

        } catch (NumberFormatException e) {
            
            aux.mensaje("Error "+e.getMessage(), "Error");
            
        }
        


    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tbfinanciero;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser txtFechaFinanciera;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtKmDiarios;
    private javax.swing.JTextField txtVenta;
    private javax.swing.JTextField txtVentaDiaria;
    private javax.swing.JTextField txtVentaPorKM;
    // End of variables declaration//GEN-END:variables

    private void extraccion_CodigoArea(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
