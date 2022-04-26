
package Vista;

import Helpers.Ayudas;
import Logica.fFinanciero;
import Modelo.Sucursal;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class frmFinenciero extends javax.swing.JInternalFrame {
    
    fFinanciero func = new fFinanciero();
    String [] bases = {"Selecciona una sucursal","CCT","CCZ","CCZD","CHH","CMC","CMG","CMGD","CMM","CMMD",""
            + "CMP","CMPD","CMT","COR","CUL","DGO",
            "GEPP","HMO","JRZ","LPZ","MTY","MXL","MZT","NGL","QRO","SA","ZCT"};
    
    DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>(bases);
    Helpers.Ayudas aux = new Ayudas();
    private int totalRegistros;
    
    public frmFinenciero() {
        initComponents();
        cboSucursal.setModel(modeloCombo);
        mostrar();
    }
    
    void mostrar(){
        try {
            tbfinanciero.setModel(func.listaDatos());
            totalRegistros = tbfinanciero.getRowCount();
            
            lblTotalRegistros.setText(String.valueOf(totalRegistros));
            
        } catch (Exception e) {
            aux.mensaje("error" + e.getMessage(), "error");
        }
        
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
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jLabel13 = new javax.swing.JLabel();
            jLabel14 = new javax.swing.JLabel();
            txtFechaFinanciera = new com.toedter.calendar.JDateChooser();
            txtDiaFinMes = new javax.swing.JTextField();
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

            setClosable(true);
            setIconifiable(true);
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

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
            jButton1.setText("Buscar");

            jLabel7.setText("Fecha financiera :");

            jLabel8.setText("Dia fin de mes :");

            jLabel9.setText("Kilometros :");

            jLabel10.setText("Venta :");

            jLabel11.setText("Venta por Km :");

            jLabel12.setText("Venta Diaria :");

            jLabel13.setText("Km Diarios :");

            jLabel14.setText("Sucursal :");

            cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

            btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
            btnGuardar.setText("Guardar");

            btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_delete_black_24dp.png"))); // NOI18N
            btnEliminar.setText("Eliminar");

            btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
            btnActualizar.setText("Actualizar");

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel2.setText("Total de registros :");

            lblTotalRegistros.setText("-");

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
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFechaFinanciera, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(txtDiaFinMes)
                                        .addComponent(txtKm)
                                        .addComponent(txtVenta)
                                        .addComponent(txtVentaPorKM)
                                        .addComponent(txtVentaDiaria)
                                        .addComponent(txtKmDiarios)
                                        .addComponent(cboSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnActualizar))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(txtFechaFinanciera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtDiaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtVentaPorKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtVentaDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txtKmDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardar)
                                .addComponent(btnEliminar)
                                .addComponent(btnActualizar)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
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
        int fila = tbfinanciero.getRowCount();
        try {
            
            cboSucursal.setSelectedItem( tbfinanciero.getValueAt(fila, 0).toString());
//            txtDiaFinMes.setText(tbfinanciero.getValueAt(fila, 1).toString());
//            txtKm.setText(tbfinanciero.getValueAt(fila, 5).toString());
//            txtVenta.setText(tbfinanciero.getValueAt(fila, 6).toString());
//            txtVentaPorKM.setText(tbfinanciero.getValueAt(fila, 7).toString());
//            txtVentaDiaria.setText(tbfinanciero.getValueAt(fila, 8).toString());
//            txtKmDiarios.setText(tbfinanciero.getValueAt(fila, 8).toString());

            
            
            
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_tbfinancieroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tbfinanciero;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDiaFinMes;
    private com.toedter.calendar.JDateChooser txtFechaFinanciera;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtKmDiarios;
    private javax.swing.JTextField txtVenta;
    private javax.swing.JTextField txtVentaDiaria;
    private javax.swing.JTextField txtVentaPorKM;
    // End of variables declaration//GEN-END:variables
}
