/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.fSucursal;
import Logica.fUnidades;
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
    
    public frmSucursal() {
        initComponents();
        btnEnviarCambioRuta.setVisible(false);
        if (validacionformulario) {
            btnEnviarCambioRuta.setVisible(true);
            
        }
        
        this.maximizable = true;
        mostrar("");
    }
    
    void mostrar(String buscar){
        
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
        btnEnviarCambioRuta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Sucursales");

        lblTotalUnidades.setText("--------");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Buscar :");

        txtBuscardor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscardorKeyReleased(evt);
            }
        });

        listaSucursales.setModel(new javax.swing.table.DefaultTableModel(
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
        listaSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSucursalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaSucursales);

        lblSucursal.setText("--------");

        lblCodigoArea.setText("---------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lblSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCodigoArea)
                .addGap(82, 82, 82))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEnviarCambioRuta.setText("Seleccionar");
        btnEnviarCambioRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCambioRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTotalUnidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnviarCambioRuta)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalUnidades)
                    .addComponent(btnEnviarCambioRuta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        


    }//GEN-LAST:event_listaSucursalesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCambioRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTotalUnidades;
    private javax.swing.JTable listaSucursales;
    private javax.swing.JTextField txtBuscardor;
    // End of variables declaration//GEN-END:variables
}
