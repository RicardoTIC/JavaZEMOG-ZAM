/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.fUnidadesOpenBook;
import Helpers.Ayudas;
import Modelo.UnidadesOpenBook;
import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Ricardo Herrera
 */
public class frmUnidadesOpenBook extends javax.swing.JInternalFrame {

    fUnidadesOpenBook func = new fUnidadesOpenBook();
    Ayudas aux = new Ayudas();
    UnidadesOpenBook obj = new UnidadesOpenBook();

    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    //Cremos una instancia de Calendar para optener la fecha actual
    Calendar fecha = Calendar.getInstance();
    GregorianCalendar fechainicial = new GregorianCalendar(2022, fecha.get(Calendar.MONTH), 1, 12, 59, 59);
    GregorianCalendar fechafinal = new GregorianCalendar(2022, fecha.get(Calendar.MONTH), fecha.get(Calendar.DAY_OF_MONTH));
    DefaultComboBoxModel modeloComoboBase = new DefaultComboBoxModel(func.bases().toArray());
    
    public frmUnidadesOpenBook() {
        initComponents();
        mostrar("");
        txtFechaInicio.setDate(fechainicial.getTime());
        txtFechaFinal.setDate(fechafinal.getTime());
        txtFechaFinal.setVisible(false);
        cboSucursal.setModel(modeloComoboBase);
        txtComentarios.setText("OpenBook");
        lblId.setVisible(false);
        lblFechaFinal.setVisible(false);
        aux.popTable("Cerrar", "Maximizar", "Minimizar", this, new JPopupMenu(), jPanel1);
    }

    void limpiar() {

        txtEconomico.setText("");
        lblId.setText("");
        cboSucursal.setSelectedIndex(0);
        cboTipoCuota.setSelectedIndex(0);
        cboEstatus.setSelectedIndex(0);
        cboEstatusOperativo.setSelectedIndex(0);
        cboEstatusPepsi.setSelectedIndex(0);
        txtComentarios.setText("");
        txtEconomico.requestFocus();

    }

    void mostrar(String buscar) {
        int totalRegistros = 0;
        try {
            TablaDeUnidades.setModel(func.showAllData(buscar));
            totalRegistros = TablaDeUnidades.getRowCount();
            lblTotalRegistros.setText("Total de registros " + totalRegistros);
        } catch (Exception e) {
            aux.mensaje("No se pudieron cargar los datos en la tabla ", "Error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblFechaFinal = new javax.swing.JLabel();
        txtEconomico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cboTipoCuota = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboEstatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboEstatusPepsi = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboEstatusOperativo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cboSucursal = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeUnidades = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        }
        ;
        jLabel10 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnResumen = new javax.swing.JButton();
        lblTotalRegistros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Unidades OpenBook");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Unidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        lblFechaFinal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechaFinal.setText("Fecha Final :");

        txtEconomico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEconomicoFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero Economico :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Estatus :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fecha inicio :");

        cboTipoCuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el tipo de cuota", "K", "M" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("tipo de cuota :");

        cboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus", "Titular con cuota", "Detenida por estrategia", "Backups", "Inactivo" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Estatus Pepsi :");

        cboEstatusPepsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus Pepsi", "Especial", "Cervecero", "Normal", "Dedicado", "Fuera" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estatus Operativo :");

        cboEstatusOperativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciiona el estatus operativo", "Activo", "Inactivo", "PT", "Mantenimiento", "Siniestro", "Robo" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Comentarios :");

        txtComentarios.setColumns(20);
        txtComentarios.setLineWrap(true);
        txtComentarios.setRows(5);
        txtComentarios.setWrapStyleWord(true);
        txtComentarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtComentariosMouseClicked(evt);
            }
        });
        txtComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComentariosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtComentarios);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_add_black_24dp.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_close_black_24dp.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la sucusal" }));

        TablaDeUnidades.setAutoCreateRowSorter(true);
        TablaDeUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDeUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeUnidadesMouseClicked(evt);
            }
        });
        TablaDeUnidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(TablaDeUnidades);
        add(pane, BorderLayout.CENTER);
        jScrollPane1.setViewportView(TablaDeUnidades);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Buscador :");

        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });

        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_leaderboard_black_24dp.png"))); // NOI18N
        btnResumen.setText("Resumen");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });

        lblTotalRegistros.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaFinal)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTipoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstatusPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstatusOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(19, 19, 19)
                                .addComponent(btnActualizar)
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(btnResumen)))
                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblId))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnResumen)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFechaFinal)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cboTipoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboEstatusPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboEstatusOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(4, 4, 4)
                        .addComponent(lblTotalRegistros))))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        obj.setAccion("insertar");

        try {
            if (txtEconomico.getText().length() <= 0) {
                aux.mensaje("Ingresa una unidad", "informativo");
                txtEconomico.requestFocus();
                return;

            }

            if (cboSucursal.getSelectedIndex() == 0) {
                aux.mensaje("Selecciona una sucursal", "informativo");
                cboSucursal.requestFocus();
                return;
            }

            if (cboTipoCuota.getSelectedIndex() == 0) {
                aux.mensaje("Selecciona un tipo de cuota", "informativo");
                cboTipoCuota.requestFocus();
                return;
            }

            if (cboEstatus.getSelectedIndex() == 0) {
                aux.mensaje("Selecciona un estatus", "informativo");
                cboEstatus.requestFocus();
                return;
            }

            if (cboEstatusPepsi.getSelectedIndex() == 0) {
                aux.mensaje("Selecciona un estatus pepsi", "informativo");
                cboEstatusPepsi.requestFocus();
                return;
            }

            if (cboEstatusOperativo.getSelectedIndex() == 0) {
                aux.mensaje("Selecciona un estatus operativo", "informativo");
                cboEstatusOperativo.requestFocus();
                return;
            }

            obj.setId_unidad(txtEconomico.getText());

            if (func.validacionExistenciaUnidad(obj.getId_unidad()) == 0) {
                aux.mensaje("No puedes insertar esta unidad ya que no existe en la base de datos", "Informativo");
                txtEconomico.requestFocus();
                return;
            }
            obj.setId_area(func.seleccion_base(cboSucursal.getSelectedItem().toString()));

            if (func.validacionDeSucursal(obj.getId_area()) == 0) {
                if (aux.mensajeConfirmacion("La sucursal que le vas a asignar a la unidad no es igual a la de Mtto deseas ingresarla") == 1) {
                    return;
                }
            }

            obj.setFechaInicio(formatoFecha.format(txtFechaInicio.getDate()));
            obj.setFechaFinal(formatoFecha.format(txtFechaFinal.getDate()));
            obj.setTipoCuota(cboTipoCuota.getSelectedItem().toString());
            obj.setId_estatus(func.powerzam_estatus_unidad(cboEstatus.getSelectedItem().toString()));
            obj.setId_estatus_pepsi(func.estatus_pepsi(cboEstatusPepsi.getSelectedItem().toString()));
            obj.setId_estatus_operativo(func.powerEstatusUnidadesOperativas(cboEstatusOperativo.getSelectedItem().toString()));
            obj.setComentario(txtComentarios.getText());

            if (func.mantenimientoUnidades(obj).equalsIgnoreCase("success")) {
                aux.mensaje("Se ingreso correctamente la unidad " + obj.getId_unidad(), "informativo");
                limpiar();
                mostrar(txtBuscador.getText());
            } else {
                aux.mensaje("Error " + obj.getError(), "Error");
            }

        } catch (Exception e) {
            aux.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txtFechaFinal.setVisible(false);
        lblFechaFinal.setVisible(false);

        obj.setAccion("eliminar");

        if (lblId.getText().length() <= 0) {
            aux.mensaje("No puedes eliminar un viaje si no haz seleccionado una unidad del listado", "informativo");
            return;
        }

        obj.setId(Integer.parseInt(lblId.getText()));

        if (func.mantenimientoUnidades(obj).equalsIgnoreCase("success")) {
            aux.mensaje("Registro eliminado correctamente", "informativo");
            limpiar();
            mostrar("");
        } else {
            aux.mensaje("No se puedo eliminar el registro", "Error");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        mostrar(txtBuscador.getText());
    }//GEN-LAST:event_txtBuscadorKeyReleased

    private void TablaDeUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeUnidadesMouseClicked
        int fila = TablaDeUnidades.getSelectedRow();

        try {
            txtFechaFinal.setVisible(true);
            lblFechaFinal.setVisible(true);
            lblId.setText(TablaDeUnidades.getValueAt(fila, 0).toString());
            txtEconomico.setText(TablaDeUnidades.getValueAt(fila, 1).toString());
            cboSucursal.setSelectedItem(TablaDeUnidades.getValueAt(fila, 7).toString());
            cboTipoCuota.setSelectedItem(TablaDeUnidades.getValueAt(fila, 9).toString());
            cboEstatus.setSelectedItem(TablaDeUnidades.getValueAt(fila, 8).toString());
            cboEstatusOperativo.setSelectedItem(TablaDeUnidades.getValueAt(fila, 6).toString());
            cboEstatusPepsi.setSelectedItem(TablaDeUnidades.getValueAt(fila, 10).toString());
            txtComentarios.setText(TablaDeUnidades.getValueAt(fila, 11).toString());

        } catch (Exception e) {
            aux.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_TablaDeUnidadesMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        txtFechaFinal.setVisible(false);
        lblFechaFinal.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtComentariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComentariosMouseClicked
        txtComentarios.setText("");
    }//GEN-LAST:event_txtComentariosMouseClicked

    private void txtComentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentariosKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtComentariosKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        obj.setAccion("actualizar");
        
        try {
            
            if (lblId.getText().length() <= 0) {
                aux.mensaje("No puedes actualizar un viaje si no haz seleccionado una unidad del listado", "informativo");
                return;
            }

            obj.setId_unidad(txtEconomico.getText());

            if (func.validacionExistenciaUnidad(obj.getId_unidad()) == 0) {
                aux.mensaje("No puedes insertar esta unidad ya que no existe en la base de datos", "Informativo");
                txtEconomico.requestFocus();
                txtComentarios.setText("OpenBook");
                return;
            }
            

            obj.setId(Integer.parseInt(lblId.getText()));
            obj.setId_area(func.seleccion_base(cboSucursal.getSelectedItem().toString()));
            obj.setFechaInicio(formatoFecha.format(txtFechaInicio.getDate()));
            obj.setFechaFinal(formatoFecha.format(txtFechaFinal.getDate()));
            obj.setTipoCuota(cboTipoCuota.getSelectedItem().toString());
            obj.setId_estatus(func.powerzam_estatus_unidad(cboEstatus.getSelectedItem().toString()));
            obj.setId_estatus_pepsi(func.estatus_pepsi(cboEstatusPepsi.getSelectedItem().toString()));
            obj.setId_estatus_operativo(func.powerEstatusUnidadesOperativas(cboEstatusOperativo.getSelectedItem().toString()));
            obj.setComentario(txtComentarios.getText());

            if (func.mantenimientoUnidades(obj).equalsIgnoreCase("success")) {

                aux.mensaje("Se actualizo correctamente la unidad " + obj.getId_unidad(), "informativo");
                if (txtBuscador.getText().length() <= 0) {
                    mostrar("");
                }else{
                    mostrar(txtBuscador.getText());
                }
                
                limpiar();
                txtFechaFinal.setVisible(false);
                lblFechaFinal.setVisible(false);

            }

        } catch (Exception e) {
            aux.mensaje("Error al actualizar " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtEconomicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEconomicoFocusGained
        txtEconomico.setText("TZ-");
    }//GEN-LAST:event_txtEconomicoFocusGained

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
       
    }//GEN-LAST:event_btnResumenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeUnidades;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResumen;
    private javax.swing.JComboBox<String> cboEstatus;
    private javax.swing.JComboBox<String> cboEstatusOperativo;
    private javax.swing.JComboBox<String> cboEstatusPepsi;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JComboBox<String> cboTipoCuota;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JTextField txtEconomico;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
