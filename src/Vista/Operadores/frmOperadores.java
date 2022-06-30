package Vista.Operadores;

import Helpers.Ayudas;
import Vista.Viajes.frmViajes;
import Logica.fOperadores;
import Logica.fPowerZamUnidades;
import Logica.fUnidades;
import Modelo.Operador;

import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmOperadores extends javax.swing.JInternalFrame {

    fOperadores funcionesOperadores = new fOperadores();
    fPowerZamUnidades funcUnidades = new fPowerZamUnidades();
    DefaultComboBoxModel modeloSucursal = new DefaultComboBoxModel(funcUnidades.comboSucursal());
    JPopupMenu menu = new JPopupMenu();
    Helpers.Ayudas hp = new Ayudas();

    public frmOperadores() {
        initComponents();
        mostrar("", "", "");
        hp.popTable("Cerrar", "Maximizar", "Minimizar", this,menu, jPanel1);

    }

    void ocultar_columnas() {
        
       
        //Ampliadno la columna nombre de operadores
        ListaOperadores.getColumnModel().getColumn(1).setMaxWidth(300);
        ListaOperadores.getColumnModel().getColumn(1).setMinWidth(300);
        ListaOperadores.getColumnModel().getColumn(1).setPreferredWidth(300);
        
        //Ampliando columna puesto
        ListaOperadores.getColumnModel().getColumn(2).setMaxWidth(300);
        ListaOperadores.getColumnModel().getColumn(2).setMinWidth(300);
        ListaOperadores.getColumnModel().getColumn(2).setPreferredWidth(300);
        
        //Ampliando columna puesto
        ListaOperadores.getColumnModel().getColumn(3).setMaxWidth(300);
        ListaOperadores.getColumnModel().getColumn(3).setMinWidth(300);
        ListaOperadores.getColumnModel().getColumn(3).setPreferredWidth(300);        

        //Ampliando columna puesto
        ListaOperadores.getColumnModel().getColumn(5).setMaxWidth(300);
        ListaOperadores.getColumnModel().getColumn(5).setMinWidth(300);
        ListaOperadores.getColumnModel().getColumn(5).setPreferredWidth(300);        
    }
    void mostrar(String buscar, String sucursal, String activo) {
        try {
            
            ListaOperadores.setModel(funcionesOperadores.showdata(buscar, sucursal, activo));
            lblTotalRegistros.setText(String.valueOf(funcionesOperadores.totalRegistros));
            funcionesOperadores.totalRegistros = 0;
            ocultar_columnas();
            
        } catch (Exception e) {
        }

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaOperadores = new javax.swing.JTable(){

            public boolean isCellEditable(int fila, int col){
                if(col == 1){
                    return true;
                }else{
                    return false;
                }
            }

        };
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtNombreSucursal = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtTipoEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblTotalRegistros = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CheckBoxActivo = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        JCheckActivos = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtFechaBaja = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Empleados");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado Zemog", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        ListaOperadores.setAutoCreateRowSorter(true);
        ListaOperadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaOperadores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaOperadores);
        add(pane, BorderLayout.CENTER);
        ListaOperadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaOperadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaOperadores);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("id empleado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre Empleado :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Sucursal :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tipo de empleado :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total registros  :");

        lblTotalRegistros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalRegistros.setText("-");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_send_black_24dp.png"))); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CheckBoxActivo.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxActivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckBoxActivo.setSelected(true);
        CheckBoxActivo.setText("Activar");
        CheckBoxActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActivoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        JCheckActivos.setBackground(new java.awt.Color(255, 255, 255));
        JCheckActivos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JCheckActivos.setText("Estatus de Operador");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de baja :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidEmpleado)
                    .addComponent(txtNombreEmpleado)
                    .addComponent(txtDescripcion)
                    .addComponent(txtNombreSucursal)
                    .addComponent(txtTelefono)
                    .addComponent(txtTipoEmpleado)
                    .addComponent(txtEstado)
                    .addComponent(txtFechaBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CheckBoxActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(JCheckActivos)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblTotalRegistros)
                            .addComponent(JCheckActivos)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnActualizar)
                    .addComponent(CheckBoxActivo))
                .addGap(23, 23, 23))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        funcionesOperadores.totalRegistros = 0;

        if (JCheckActivos.isSelected()) {
            mostrar(txtBuscar.getText(), "", "A");
        } else {
            mostrar(txtBuscar.getText(), "", "");
        }

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void ListaOperadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaOperadoresMouseClicked

        int fila = ListaOperadores.rowAtPoint(evt.getPoint());
        
        try {
            
        txtidEmpleado.setText(ListaOperadores.getValueAt(fila, 0).toString());
        txtNombreEmpleado.setText(ListaOperadores.getValueAt(fila, 1).toString());
        txtFechaBaja.setText(ListaOperadores.getValueAt(fila, 2).toString());
        txtDescripcion.setText(ListaOperadores.getValueAt(fila, 3).toString());
        txtNombreSucursal.setText(ListaOperadores.getValueAt(fila, 4).toString());
        txtTipoEmpleado.setText(ListaOperadores.getValueAt(fila, 5).toString());
        txtEstado.setText(ListaOperadores.getValueAt(fila, 6).toString());            
            
            
            
        } catch (Exception e) {
            hp.mensaje("NO se pueden seleccionar datos ", "Error");
        }
        


    }//GEN-LAST:event_ListaOperadoresMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmViajes.lblIDOperadores.setText(txtidEmpleado.getText());
        frmViajes.txtOperador.setText(txtNombreEmpleado.getText());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Operador op = new Operador();

        if (txtidEmpleado.getText().length() <= 0) {

            hp.mensaje("Debes selecciona una id de operador", "Informativo");
            return;
        }

        op.setId_operador(Integer.parseInt(txtidEmpleado.getText()));

        if (CheckBoxActivo.isSelected()) {

            op.setEstado("A");
            if (op.getEstado().equals("A")) {
                op.setEstatus("Activo");
            }

        } else {
            op.setEstado("B");
            if (op.getEstado().equals("B")) {
                op.setEstatus("Baja");
            }
        }

        if (hp.mensajeConfirmacion("Deseas activara al operador " + txtNombreEmpleado.getText()) == 0) {

            if (funcionesOperadores.updateOperator(op)) {
                hp.mensajeLateral("Se actualizo correctamente a el operador " + txtNombreEmpleado.getText() + " Al estado " + op.getEstatus(), "Actualizado", "aceptado");
                //buscar, sucursal , estatus    
                mostrar(txtNombreEmpleado.getText(),"", "");
            
            } else {
                hp.mensajeLateral("No se actualizo correctamente el estado del operador " + txtNombreEmpleado.getText() + " # Empleado " + txtidEmpleado.getText(), "No se actualizado ", "error");
            }
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void CheckBoxActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActivoActionPerformed
        if (CheckBoxActivo.isSelected()) {
            hp.mensaje("Activaste al operador", "Informativo");
            CheckBoxActivo.setText("Activo");
        }else{
            hp.mensaje("Desactivaste", "Informativo");
            CheckBoxActivo.setText("Inactivo");
        }
    }//GEN-LAST:event_CheckBoxActivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxActivo;
    private javax.swing.JCheckBox JCheckActivos;
    private javax.swing.JTable ListaOperadores;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaBaja;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreSucursal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoEmpleado;
    private javax.swing.JTextField txtidEmpleado;
    // End of variables declaration//GEN-END:variables
}
