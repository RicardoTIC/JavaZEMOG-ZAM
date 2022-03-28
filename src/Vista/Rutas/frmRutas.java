/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Rutas;

import Vista.Viajes.frmViajes;
import Helpers.Ayudas;
import Logica.fRutas;
import Vista.Viajes.frmCambioRuta;
import static Vista.Viajes.frmViajes.validacionformulario;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Ricardo Herrera
 */
public class frmRutas extends javax.swing.JInternalFrame {

    Helpers.Ayudas help = new Ayudas();
    fRutas ruta = new fRutas();

    public frmRutas() {
        initComponents();
        mostrar_informacion_nueva();

    }

    void mostrar_informacion_nueva() {
        //El metodo nos sirve para poder visualizar la informacion de ruta dependiendo si nuestro formulario de viajes esta abuerto o no 
        frmViajes frm = new frmViajes();
        try {

            if (frm.isShowing()) {
                txtBuscar.setText(frmViajes.txtNombreCorto.getText());
                mostrar(frmViajes.txtNombreCorto.getText());
            }else{
                mostrar("");
            }


        } catch (Exception e) {
            help.mensaje("La tabla de datos esta vacia " + e.getMessage(), "Error");
        }

    }

    void mostrar(String buscar) {

        ListaRutas.setModel(new Logica.fRutas().showdata(buscar));
        lbltotalRegistros.setText("Total de registros " + String.valueOf(ruta.totalRegistros));
        tamano_columna();
    }

    void tamano_columna() {

        ListaRutas.getColumnModel().getColumn(2).setMaxWidth(250);
        ListaRutas.getColumnModel().getColumn(2).setMinWidth(250);
        ListaRutas.getColumnModel().getColumn(2).setPreferredWidth(250);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombreRuta = new javax.swing.JTextField();
        txtKilometros = new javax.swing.JTextField();
        txtCodigoRuta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVentaSencillo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMontoFull = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaRutas = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int fila, int col){

                if(col == 1){
                    return true;
                }else{
                    return false;
                }

            }

        };
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lbltotalRegistros = new javax.swing.JLabel();
        lblcodigoArea = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Catalogo de Rutas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Catalogo de Rutas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre ruta :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Kilometros :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Id :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Codigo Ruta :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Monto Sencillo :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Monto Full :");

        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_send_black_24dp.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Sucursal :");

        ListaRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaRutas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaRutas);
        add(pane, BorderLayout.CENTER);
        ListaRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaRutasMouseClicked(evt);
            }
        });
        ListaRutas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ListaRutasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ListaRutas);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lbltotalRegistros.setText("Total de registros :");

        lblcodigoArea.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMontoFull, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVentaSencillo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoRuta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKilometros, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreRuta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSucursal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltotalRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtVentaSencillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMontoFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalRegistros)
                    .addComponent(lblcodigoArea))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaRutasMouseClicked

        try {

            int fila = ListaRutas.rowAtPoint(evt.getPoint());

            txtId.setText(ListaRutas.getValueAt(fila, 0).toString());
            txtSucursal.setText(ListaRutas.getValueAt(fila, 1).toString());
            txtNombreRuta.setText(ListaRutas.getValueAt(fila, 2).toString());
            txtKilometros.setText(ListaRutas.getValueAt(fila, 3).toString());
            txtCodigoRuta.setText(ListaRutas.getValueAt(fila, 4).toString());
            txtVentaSencillo.setText(ListaRutas.getValueAt(fila, 5).toString());
            txtMontoFull.setText(ListaRutas.getValueAt(fila, 6).toString());
            lblcodigoArea.setText(ListaRutas.getValueAt(fila, 7).toString());

        } catch (Exception e) {
            help.mensaje("Error al seleccionar la fila", "Error");
        }


    }//GEN-LAST:event_ListaRutasMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        if (validacionformulario) {
            System.out.println(txtNombreRuta.getText());
            frmCambioRuta.txtNombreRutaActual.setText(txtNombreRuta.getText());
            frmCambioRuta.lblId_actual.setText(txtId.getText());
            frmCambioRuta.txtSucursal.setText(txtSucursal.getText());
            frmCambioRuta.lblCodigoArea.setText(lblcodigoArea.getText());
            this.dispose();

            return;
        }

        if (!txtSucursal.getText().equalsIgnoreCase(frmViajes.txtNombreCorto.getText())) {

            help.mensaje("No puedes ingresar esta ruta debido a que no conside con la sucursal del viaje alta de ruta", "Error");
            return;

        } else {
            frmViajes.idrutas.setText(txtId.getText());
        }

        frmViajes.txtNombreRuta.setText(txtNombreRuta.getText());

        this.dispose();

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void ListaRutasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ListaRutasKeyPressed
        try {

            int fila = ListaRutas.getSelectedRow();

            txtId.setText(ListaRutas.getValueAt(fila, 0).toString());
            txtSucursal.setText(ListaRutas.getValueAt(fila, 1).toString());
            txtNombreRuta.setText(ListaRutas.getValueAt(fila, 2).toString());
            txtKilometros.setText(ListaRutas.getValueAt(fila, 3).toString());
            txtCodigoRuta.setText(ListaRutas.getValueAt(fila, 4).toString());
            txtVentaSencillo.setText(ListaRutas.getValueAt(fila, 5).toString());
            txtMontoFull.setText(ListaRutas.getValueAt(fila, 6).toString());
            lblcodigoArea.setText(ListaRutas.getValueAt(fila, 7).toString());

        } catch (Exception e) {
            help.mensaje("Error al seleccionar la fila", "Error");
        }
    }//GEN-LAST:event_ListaRutasKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaRutas;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblcodigoArea;
    private javax.swing.JLabel lbltotalRegistros;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoRuta;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKilometros;
    private javax.swing.JTextField txtMontoFull;
    public static javax.swing.JTextField txtNombreRuta;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtVentaSencillo;
    // End of variables declaration//GEN-END:variables
}
