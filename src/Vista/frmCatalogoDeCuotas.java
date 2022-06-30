package Vista;

import Helpers.Ayudas;
import Logica.fTarifasAreas;
import Modelo.PowerTarifas;
import com.sun.glass.events.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPopupMenu;

public final class frmCatalogoDeCuotas extends javax.swing.JInternalFrame {

    Helpers.Ayudas help = new Ayudas();
    Calendar fecha = Calendar.getInstance();
    GregorianCalendar fechaInicio = new GregorianCalendar(2022, fecha.get(Calendar.MONTH), 1, 12, 59, 59);
    GregorianCalendar fechaFinal = new GregorianCalendar();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
    PowerTarifas obj = new PowerTarifas();
    fTarifasAreas func = new fTarifasAreas();

    public frmCatalogoDeCuotas() {
        initComponents();
        fechaInicio();
    }

    void fechaInicio() {

        txtfechaInicio.setDate(fechaInicio.getTime());
        txtFechaFinal.setDate(fechaFinal.getTime());
        txtid.setEnabled(false);
        help.popTable("Cerrar", "Maximizar", "Minimizar", this, new JPopupMenu(), jPanel1);

    }

    void mostrarDatos(String fechaInicio, String fechaFinal, String buscar) {

        try {

            tbTarifas.setModel(new fTarifasAreas().showAllData(fechaInicio, fechaFinal, buscar));
            lblTotalRegistros.setText("Total de unidades : " + String.valueOf(tbTarifas.getRowCount()));

        } catch (Exception e) {
            help.mensaje("Error a la hora de mostrar los datos  " + e.getMessage(), "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTarifas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtMetaMensual = new javax.swing.JTextField();
        txtCuotaPorMovimiento = new javax.swing.JTextField();
        txtFechaReporte = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblTotalRegistros = new javax.swing.JLabel();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        txtfechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActualizarTodo = new javax.swing.JButton();
        lblCodigoArea = new javax.swing.JLabel();
        btnEliminarTodo = new javax.swing.JButton();
        btnGuardarMesCompleto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tarifas sucursal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarifas Sucursal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Id :");

        tbTarifas.setAutoCreateRowSorter(true);
        tbTarifas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbTarifas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTarifasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTarifas);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sucursal :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Meta Mensual :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cuota Por Movimientos :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fecha Inicio :");

        txtSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucursalActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Buscar :");

        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblTotalRegistros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalRegistros.setText("Total registros :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha Inicio :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha Final :");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizarTodo.setText("Actualizar todo");
        btnActualizarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTodoActionPerformed(evt);
            }
        });

        lblCodigoArea.setText("-");

        btnEliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnEliminarTodo.setText("Eliminar todo");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        btnGuardarMesCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        btnGuardarMesCompleto.setText("Guardar Mes Completo");
        btnGuardarMesCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMesCompletoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSucursal)
                                    .addComponent(txtid)
                                    .addComponent(txtMetaMensual, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodigoArea)
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCuotaPorMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFechaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnGuardarMesCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btnActualizarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(lblTotalRegistros))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuotaPorMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnEliminar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoArea)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnEliminarTodo))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMetaMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarMesCompleto)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(txtfechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalRegistros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbTarifasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTarifasMouseClicked
        int fila = tbTarifas.getSelectedRow();

        try {

            txtid.setText(tbTarifas.getValueAt(fila, 0).toString());
            txtSucursal.setText(tbTarifas.getValueAt(fila, 1).toString());
            txtMetaMensual.setText(tbTarifas.getValueAt(fila, 2).toString());
            txtCuotaPorMovimiento.setText(tbTarifas.getValueAt(fila, 3).toString());
            txtFechaReporte.setText(tbTarifas.getValueAt(fila, 4).toString());
            lblCodigoArea.setText(String.valueOf(func.codigo_area(txtSucursal.getText()).getId_area()));

        } catch (Exception e) {
            help.mensaje("error al seleccionar los datos " + e.getMessage(), title);
        }
    }//GEN-LAST:event_tbTarifasMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

        try {

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
                txtSucursal.setText(txtBuscar.getText());
                lblCodigoArea.setText(String.valueOf(func.codigo_area(txtSucursal.getText()).getId_area()));
            }

        } catch (Exception e) {

            help.mensaje("Error al realizar las busqueda " + e.getMessage(), "Error");

        }

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnActualizarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTodoActionPerformed

        try {

            if (txtid.getText().length() <= 0) {
                help.mensaje("Debes selecciona una registro de la tabla para seleccionar un id valido", "informativo");
                return;
            }

            if (txtSucursal.getText().length() <= 0) {
                help.mensaje("Debes de selecciona un sucursal valida ", "informativo");
                return;
            }

            if (txtMetaMensual.getText().length() <= 0) {
                help.mensaje("Debes de ingresar una menta  mensual valida  ", "informativo");
                return;
            }

            if (txtCuotaPorMovimiento.getText().length() <= 0) {
                help.mensaje("Debes de ingresar un numero de movimiento valido o mayor a cero ", "informativo");
                return;
            }
            if (txtFechaReporte.getText().length() <= 0) {
                help.mensaje("Debes de ingresar una fecha valida ", "informativo");
                return;
            }

            obj.setAccion("actualizar todo");

            obj.setId(Integer.parseInt(txtid.getText()));
            obj.setFechaInicio(formatoFecha.format(txtfechaInicio.getDate()));
            obj.setFechaFinal(formatoFecha.format(txtFechaFinal.getDate()));
            obj.setFecha_inicio(txtFechaReporte.getText());
            obj.setCuotaKmUnidad(Integer.parseInt(txtMetaMensual.getText()));
            obj.setCuotaViajesUnidad(Double.parseDouble(txtCuotaPorMovimiento.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));

            if (help.mensajeConfirmacion("Estas por actualizar el registro : " + obj.getId() + " Del area : " + txtSucursal.getText()) == 0) {

                if (new fTarifasAreas().manteniminetoTarifas(obj)) {

                    mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
                    help.mensaje("Se ingesaron correctamente los datos ", "informativo");

                } else {

                    help.mensaje("Error " + obj.getError(), "Error");

                }
            }

        } catch (NumberFormatException e) {

            help.mensaje("Error " + e.getMessage(), "Error");

        }


    }//GEN-LAST:event_btnActualizarTodoActionPerformed

    private void txtSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucursalActionPerformed

        lblCodigoArea.setText(String.valueOf(func.codigo_area(txtSucursal.getText()).getId_area()));
    }//GEN-LAST:event_txtSucursalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {

            if (txtid.getText().length() <= 0) {
                help.mensaje("Debes selecciona una registro de la tabla para seleccionar un id valido", "informativo");
                return;
            }

            if (txtSucursal.getText().length() <= 0) {
                help.mensaje("Debes de selecciona un sucursal valida ", "informativo");
                return;
            }

            if (txtMetaMensual.getText().length() <= 0) {
                help.mensaje("Debes de ingresar una menta  mensual valida  ", "informativo");
                return;
            }

            if (txtCuotaPorMovimiento.getText().length() <= 0) {
                help.mensaje("Debes de ingresar un numero de movimiento valido o mayor a cero ", "informativo");
                return;
            }
            if (txtFechaReporte.getText().length() <= 0) {
                help.mensaje("Debes de ingresar una fecha valida ", "informativo");
                return;
            }

            obj.setAccion("actualizar");
            obj.setId(Integer.parseInt(txtid.getText()));
            obj.setFechaInicio(formatoFecha.format(txtfechaInicio.getDate()));
            obj.setFechaFinal(formatoFecha.format(txtFechaFinal.getDate()));
            obj.setFecha_inicio(txtFechaReporte.getText());
            obj.setCuotaKmUnidad(Integer.parseInt(txtMetaMensual.getText()));
            obj.setCuotaViajesUnidad(Double.parseDouble(txtCuotaPorMovimiento.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));

            if (help.mensajeConfirmacion("Estas por actualizar el registro : " + obj.getId() + " Del area : " + txtSucursal.getText()) == 0) {

                if (new fTarifasAreas().manteniminetoTarifas(obj)) {

                    mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
                    help.mensaje("Se ingesaron correctamente los datos ", "informativo");

                } else {

                    help.mensaje("Error " + obj.getError(), "Error");

                }
            }

        } catch (NumberFormatException e) {

            help.mensaje("Error " + e.getMessage(), "Error");

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked

        if (evt.getClickCount() == 2) {

            txtBuscar.setText("");

        }


    }//GEN-LAST:event_txtBuscarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            if (txtSucursal.getText().length() <= 0) {
                help.mensaje("Debes de selecciona un sucursal valida ", "informativo");
                return;
            }

            if (txtMetaMensual.getText().length() <= 0) {
                help.mensaje("Debes de ingresar una menta  mensual valida  ", "informativo");
                return;
            }

            if (txtCuotaPorMovimiento.getText().length() <= 0) {
                help.mensaje("Debes de ingresar un numero de movimiento valido o mayor a cero ", "informativo");
                return;
            }

            obj.setAccion("insertar");
            obj.setId(0);
            obj.setFechaInicio(formatoFecha.format(txtfechaInicio.getDate()));
            obj.setFechaFinal(formatoFecha.format(txtFechaFinal.getDate()));
            obj.setFecha_inicio(txtFechaReporte.getText());
            obj.setCuotaKmUnidad(Integer.parseInt(txtMetaMensual.getText()));
            obj.setCuotaViajesUnidad(Double.parseDouble(txtCuotaPorMovimiento.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));

            if (help.mensajeConfirmacion("Vas a ingresar 1 mes completo qde cuota de la sucursal : " + txtSucursal.getText()) == 0) {

                if (new fTarifasAreas().manteniminetoTarifas(obj)) {

                    mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
                    help.mensaje("Se ingesaron correctamente los datos ", "informativo");

                } else {

                    help.mensaje("Error " + obj.getError(), "Error");

                }
            }

        } catch (NumberFormatException e) {

            help.mensaje("Error " + e.getMessage(), "Error");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarMesCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMesCompletoActionPerformed

        String[] sucursal
                = {
                    "GEPP", "CCZ", "CHH", "JRZ", "DGO", "CUL", "MXL",
                    "CMP", "HMO", "NGL", "CMG", "CMMD", "CMGD", "CMT",
                    "CMM", "CMC", "CMPD", "LPZ", "MZT", "CCZD", "MTY",
                    "ZCT", "MEX"
                };

        int[] meta
                = {
                    14000, 14000, 16000, 16000, 16000, 16000, 16000,
                    14000, 16000, 16000, 13000, 8000, 8500, 14000,
                    13000, 8000, 16000, 16000, 14000, 16000, 16000,
                    16000, 14000
                };
        float[] metaViajes
                = {
                    1, 1, 1, 1, 1, 1, 1,
                    1, 1, 1, 1, 2, 3.5f, 1,
                    1, 1, 1, 1, 1, 1, 1,
                    1, 1
                };

        System.out.println("Tamano Sucursal " + sucursal.length + " Tamano meta " + meta.length);

        for (int i = 0; i < sucursal.length; i++) {
            System.out.println("Numero de sucursal " + sucursal[i] + " = " + meta[i] + " Meta Mov " + metaViajes[i]);

        }


    }//GEN-LAST:event_btnGuardarMesCompletoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {

            if (txtid.getText().length() <= 0) {
                help.mensaje("Debes de ingresar o seleccionar un registro", "informativo");
                txtid.requestFocus();
                return;
            }

            obj.setAccion("eliminar");
            obj.setId(Integer.parseInt(txtid.getText()));
            if (help.mensajeConfirmacion("Deseas eliminar el registro ? ") == 0) {

                func.manteniminetoTarifas(obj);
                mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
            }

        } catch (NumberFormatException e) {
            help.mensaje("Error " + obj.getError(), "Error");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        try {

            
            if (txtSucursal.getText().length()<=0) {
                help.mensaje("Debes seleccionar una sucursal", "Informativo");
                return;
            }
            
            obj.setAccion("eliminar todo");
            obj.setId(Integer.parseInt(txtid.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));
            
            if (help.mensajeConfirmacion("Deseas eliminar todos los registros de la base ? " + txtSucursal.getText()) == 0) {
                
                func.manteniminetoTarifas(obj);
                mostrarDatos(formatoFecha.format(txtfechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), txtBuscar.getText());
            }

        } catch (NumberFormatException e) {
            help.mensaje("Error " + obj.getError(), "Error");
        }
    }//GEN-LAST:event_btnEliminarTodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTodo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGuardarMesCompleto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTable tbTarifas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCuotaPorMovimiento;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private javax.swing.JTextField txtFechaReporte;
    private javax.swing.JTextField txtMetaMensual;
    private javax.swing.JTextField txtSucursal;
    private com.toedter.calendar.JDateChooser txtfechaInicio;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
