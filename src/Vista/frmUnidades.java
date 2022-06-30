package Vista;

import Vista.Viajes.frmViajes;
import Helpers.Ayudas;
import Logica.fUnidades;
import Modelo.Sucursal;
import Modelo.Unidad;
import Vista.Indicadores.ResumenUnidades;
import com.sun.glass.events.KeyEvent;
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
    Unidad obj = new Unidad();
    Ayudas help = new Ayudas();

    public frmUnidades() {
        initComponents();
        mostrar("");
        help.popTable("Cerrar", "Maximizar", "Minimizar", this, jPopupMenu1, jPanel2);

    }

    void mostrar(String buscar) {

        try {

            ListaUnidades.setModel(func.showdata(buscar));

        } catch (Exception e) {
            help.mensaje("Error" + e.getMessage(), "Error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
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
        jSeparator1 = new javax.swing.JSeparator();
        btnActivacion = new javax.swing.JButton();
        CheckActivar = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        lblCodigoArea = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Unidades");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de unidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Unidad :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Numero de serie :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Modelo :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Placas :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tarjeta Circulacion :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tipo de unidad :");

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

        txtSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSucursalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSucursalKeyReleased(evt);
            }
        });

        CheckRemolque1.setBackground(new java.awt.Color(255, 255, 255));
        CheckRemolque1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckRemolque1.setText("Remolque 1");

        CheckRemolque2.setBackground(new java.awt.Color(255, 255, 255));
        CheckRemolque2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckRemolque2.setText("Remolque 2");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscador");

        txtBuscardo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscardoKeyReleased(evt);
            }
        });

        btnActivacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_file_download_done_black_24dp.png"))); // NOI18N
        btnActivacion.setText("Activar Unidad");
        btnActivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivacionActionPerformed(evt);
            }
        });

        CheckActivar.setBackground(new java.awt.Color(255, 255, 255));
        CheckActivar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckActivar.setText("Activar");
        CheckActivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckActivarMouseClicked(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Cambio Sucursal");

        lblCodigoArea.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(txtTarjetaIAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(txtTipoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(CheckRemolque1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(CheckRemolque2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscardo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnActivacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigoArea))
                    .addComponent(txtPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTarjetaIAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CheckRemolque1))
                .addComponent(CheckRemolque2)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnActivacion)
                    .addComponent(txtBuscardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar)
                    .addComponent(CheckActivar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
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

    private void btnActivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivacionActionPerformed
        String estatus = "";
        try {

            if (help.mensajeConfirmacion("Estas por activar una unidad deseas continuar con la activacion ? ") == 0) {

                if (txtUnidad.getText().length() <= 0) {
                    help.mensaje("Debes seleccionar una unidad", "Informativo");
                    return;
                }

                if (CheckActivar.isSelected()) {
                    obj.setEstatusUnidad("A");
                } else {
                    obj.setEstatusUnidad("B");
                }

                obj.setId_unidad(txtUnidad.getText());

                if (func.update(obj)) {

                    if (obj.getEstatusUnidad().equalsIgnoreCase("A")) {
                        estatus = "Activo";
                    } else {
                        estatus = "Inactivo";
                    }

                    help.mensajeLateral("Actualizado", "Se actualizo correctamente  la unidad a estado " + estatus, "aceptado");
                    mostrar(txtBuscardo.getText());
                }
            }

        } catch (Exception e) {

            help.mensaje("Error :  " + e.getMessage() + " - " + obj.getMensajeError(), "Error");

        }


    }//GEN-LAST:event_btnActivacionActionPerformed

    private void CheckActivarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckActivarMouseClicked

    }//GEN-LAST:event_CheckActivarMouseClicked

    private void txtSucursalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSucursalKeyReleased


    }//GEN-LAST:event_txtSucursalKeyReleased

    private void txtSucursalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSucursalKeyPressed

        

        try {
            
            if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
                
                Sucursal uni = func.seleccionSucursal(txtSucursal.getText());
                
                
                
                help.mensaje("Sucursal : " + uni.getNombrecorto() + " Codigo Area  : " + uni.getId_area(), "Informativo");
            }
            
        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_txtSucursalKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckActivar;
    private javax.swing.JCheckBox CheckRemolque1;
    private javax.swing.JCheckBox CheckRemolque2;
    private javax.swing.JTable ListaUnidades;
    private javax.swing.JButton btnActivacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigoArea;
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
