package Vista;

import Vista.Viajes.frmViajes;
import Helpers.Ayudas;
import Logica.fUnidades;
import Vista.Indicadores.ResumenUnidades;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmUnidades extends javax.swing.JInternalFrame {

    fUnidades func = new fUnidades();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    GregorianCalendar fechainicial = new GregorianCalendar();
    GregorianCalendar fechafinal = new GregorianCalendar(2021, 11, 1, 12, 59, 59);
    Ayudas help = new Ayudas();

    public frmUnidades() {
        initComponents();
        mostrar("");
    }

    void mostrar(String buscar) {

        ListaUnidades.setModel(func.showdata(buscar));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUnidades = new javax.swing.JTable(){

            @Override
            public boolean isCellEditable(int fila , int columnas){
                if(columnas == 1){
                    return true;
                }else{
                    return false;
                }
            }

        };
        jLabel1 = new javax.swing.JLabel();
        txtBuscardo = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtTarjetaIAVE = new javax.swing.JTextField();
        txtNumeroSerie = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlacas = new javax.swing.JTextField();
        txtTipoUnidad = new javax.swing.JTextField();
        CheckRemolque1 = new javax.swing.JCheckBox();
        CheckRemolque2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Unidades");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de unidades"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ListaUnidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(ListaUnidades);
        add(pane,BorderLayout.CENTER);
        ListaUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUnidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUnidades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 77, 716, 215));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 42, -1, -1));

        txtBuscardo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscardoKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscardo, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 39, 222, -1));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_sync_alt_black_24dp.png"))); // NOI18N
        btnEnviar.setText("Seleccionar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 304, 124, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Resumen:");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 42, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de unidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Unidad :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 51, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 93, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Numero de serie :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 173, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Modelo :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 51, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Placas :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 93, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tarjeta Circulacion :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo de unidad :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 138, -1, -1));

        txtUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUnidadMouseClicked(evt);
            }
        });
        txtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadActionPerformed(evt);
            }
        });
        jPanel2.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 48, 212, -1));
        jPanel2.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 90, 212, -1));
        jPanel2.add(txtTarjetaIAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 135, 212, -1));
        jPanel2.add(txtNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 170, 212, -1));
        jPanel2.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 48, 181, -1));
        jPanel2.add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 90, 181, -1));
        jPanel2.add(txtTipoUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 135, 181, -1));

        CheckRemolque1.setBackground(new java.awt.Color(255, 255, 255));
        CheckRemolque1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckRemolque1.setText("Remolque 1");
        jPanel2.add(CheckRemolque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 169, -1, -1));

        CheckRemolque2.setBackground(new java.awt.Color(255, 255, 255));
        CheckRemolque2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckRemolque2.setText("Remolque 2");
        jPanel2.add(CheckRemolque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 192, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscardoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscardoKeyReleased
        mostrar(txtBuscardo.getText());
    }//GEN-LAST:event_txtBuscardoKeyReleased

    private void ListaUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUnidadesMouseClicked
        int fila = ListaUnidades.rowAtPoint(evt.getPoint());

        txtUnidad.setText(ListaUnidades.getValueAt(fila, 0).toString());
        txtSucursal.setText(ListaUnidades.getValueAt(fila, 1).toString());
        txtNumeroSerie.setText(ListaUnidades.getValueAt(fila, 2).toString());
        txtModelo.setText(ListaUnidades.getValueAt(fila, 3).toString());
        txtPlacas.setText(ListaUnidades.getValueAt(fila, 4).toString());
        txtTarjetaIAVE.setText(ListaUnidades.getValueAt(fila, 5).toString());
        txtTipoUnidad.setText(ListaUnidades.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_ListaUnidadesMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        if (evt.getClickCount() == 2) {
            ResumenUnidades RU = new ResumenUnidades();

            Principal.escritorio.add(RU);
            help.centrarPantalla(Principal.escritorio, RU);
            RU.show();
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        String tipo = txtTipoUnidad.getText();

        if (tipo.equalsIgnoreCase("Tractor")) {

            frmViajes.txtUnidad.setText(txtUnidad.getText());
            this.dispose();
        }

        if (tipo.equalsIgnoreCase("Dolly")) {
            frmViajes.txtDolly.setText(txtUnidad.getText());
            this.dispose();
        }


        if (CheckRemolque1.isSelected() && tipo.equalsIgnoreCase("Remolque")) {
            frmViajes.txtRemolque1.setText(txtUnidad.getText());
            this.dispose();
        }

        if (CheckRemolque2.isSelected() && tipo.equalsIgnoreCase("Remolque")) {
            frmViajes.txtRemolque2.setText(txtUnidad.getText());
            this.dispose();
        }

//        if (frmViajes.validacionEnvio == 1) {
//            frmViajes.txtUnidad.setText(txtUnidad.getText());
//            
//            this.dispose();
//        }
//        
//        if (frmViajes.validacionEnvio == 2) {
//            frmViajes.txtRemolque1.setText(txtUnidad.getText());
//            this.dispose();
//            
//        }
//        
//        if (frmViajes.validacionEnvio == 3) {
//            
//            frmViajes.txtRemolque2.setText(txtUnidad.getText());
//            this.dispose();
//        }
//        
//        if (frmViajes.validacionEnvio == 4) {
//            frmViajes.txtDolly.setText(txtUnidad.getText());
//            this.dispose();
//            
//        }
        //frmPowerUnidades.txtUnidad.setText(txtUnidad.getText());

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadActionPerformed

    private void txtUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUnidadMouseClicked
        if (evt.getClickCount() == 2) {

            frmUnidades unidades = new frmUnidades();

            Principal.escritorio.add(unidades);
            unidades.show();

        }
    }//GEN-LAST:event_txtUnidadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckRemolque1;
    private javax.swing.JCheckBox CheckRemolque2;
    private javax.swing.JTable ListaUnidades;
    private javax.swing.JButton btnEnviar;
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
    private javax.swing.JTextField txtBuscardo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumeroSerie;
    private javax.swing.JTextField txtPlacas;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtTarjetaIAVE;
    private javax.swing.JTextField txtTipoUnidad;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
