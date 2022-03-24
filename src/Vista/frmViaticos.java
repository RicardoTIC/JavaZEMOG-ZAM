/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Viajes.frmViajes;
import Logica.fViajes;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmViaticos extends javax.swing.JInternalFrame {

    fViajes viaje = new fViajes();

    public frmViaticos() {
        initComponents();
        
        lblNumeroArea.setText(frmViajes.txtCodigoRuta.getText());
        lblNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        lblRuta.setText(frmViajes.txtNombreRuta.getText());
        if (lblNumeroArea.getText().length() == 0 || lblNumeroViaje.getText().length() == 0) {
            mostrar("", "");
        } else {
            mostrar(lblNumeroViaje.getText(), lblNumeroArea.getText());
        }

    }

    void seleccionar_fila() {
        int fila = ListaViaticos.getSelectedRow();

        txtFechaCita.setText(ListaViaticos.getValueAt(fila, 0).toString());
        txtKm.setText(ListaViaticos.getValueAt(fila, 1).toString());
        txtNombreOperador.setText(ListaViaticos.getValueAt(fila, 4).toString());
        txtEstatusAnticipo.setText(ListaViaticos.getValueAt(fila, 8).toString());
        txtImporteAnticipo.setText(ListaViaticos.getValueAt(fila, 11).toString());
        txtRuta.setText(ListaViaticos.getValueAt(fila, 5).toString());

    }

    void mostrar(String numeroViaje, String numeroArea) {

        ListaViaticos.setModel(viaje.ViaticosDispersos(numeroViaje, numeroArea));

        try {
            if (ListaViaticos.getValueAt(0, 2).equals(numeroViaje)) {

                ListaViaticos.changeSelection(0, 2, false, false);
                seleccionar_fila();

            }

        } catch (Exception e) {
            System.out.println("Error al selecciona viaticos  " +  e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaViaticos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sucursal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumeroViaje = new javax.swing.JLabel();
        lblNumeroArea = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreOperador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRuta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEstatusAnticipo = new javax.swing.JTextField();
        txtImporteAnticipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblRuta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Viaticos");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ListaViaticos.setModel(new javax.swing.table.DefaultTableModel(
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
        ListaViaticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaViaticos);
        add(pane, BorderLayout.CENTER);
        ListaViaticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaViaticosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaViaticos);

        jLabel1.setText("Numero de viaje :");

        jLabel2.setText("Numero de area :");

        Sucursal.setText("Sucursal");

        jLabel3.setText("Total viaje :");

        lblNumeroViaje.setText("-");

        lblNumeroArea.setText("-");

        lblSucursal.setText("-");

        jLabel4.setText("Fecha Cita :");

        jLabel5.setText("Kilometros");

        jLabel6.setText("Nombre Operador");

        jLabel7.setText("Nombre ruta :");

        txtRuta.setColumns(20);
        txtRuta.setLineWrap(true);
        txtRuta.setRows(5);
        jScrollPane2.setViewportView(txtRuta);

        jLabel8.setText("Estatus anticipo");

        jLabel9.setText("Importe anticipo");

        jLabel10.setText("Nombre Ruta :");

        lblRuta.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaCita))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumeroViaje)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(lblNumeroArea, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(lblRuta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sucursal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSucursal)
                                .addGap(86, 86, 86))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstatusAnticipo, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtImporteAnticipo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Sucursal)
                    .addComponent(lblNumeroViaje)
                    .addComponent(lblSucursal)
                    .addComponent(jLabel2)
                    .addComponent(lblNumeroArea)
                    .addComponent(jLabel10)
                    .addComponent(lblRuta))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtEstatusAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtImporteAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNombreOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
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

    private void ListaViaticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaViaticosMouseClicked
        int fila = ListaViaticos.rowAtPoint(evt.getPoint());

        txtFechaCita.setText(ListaViaticos.getValueAt(fila, 0).toString());
        txtKm.setText(ListaViaticos.getValueAt(fila, 1).toString());
        txtNombreOperador.setText(ListaViaticos.getValueAt(fila, 4).toString());
        txtEstatusAnticipo.setText(ListaViaticos.getValueAt(fila, 8).toString());
        txtImporteAnticipo.setText(ListaViaticos.getValueAt(fila, 11).toString());
        txtRuta.setText(ListaViaticos.getValueAt(fila, 5).toString());


    }//GEN-LAST:event_ListaViaticosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaViaticos;
    private javax.swing.JLabel Sucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lblNumeroArea;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JTextField txtEstatusAnticipo;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtImporteAnticipo;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtNombreOperador;
    private javax.swing.JTextArea txtRuta;
    // End of variables declaration//GEN-END:variables
}
