/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.ConcentradoDeUnidades;

import Helpers.Ayudas;
import Logica.fConcentradoDetalleUnidades;
import Modelo.ConcentradoDetalleUnidades;
import Modelo.Sucursal;
import Vista.Principal;
import Vista.frmResumenFlota;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JPopupMenu;

/**
 *
 * @author Ricardo Herrera
 */
public class frmConcentradoDetalleUnidades extends javax.swing.JInternalFrame {

    SimpleDateFormat fechaInicial = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat fechaFinal = new SimpleDateFormat("yyyy-MM-dd");
    fConcentradoDetalleUnidades func = new fConcentradoDetalleUnidades();
    Helpers.Ayudas aux = new Ayudas();
    LocalDate currentDate = LocalDate.parse(fechaFinal.format(new GregorianCalendar().getTime()));
    GregorianCalendar fechaActual = new GregorianCalendar(currentDate.getYear(), currentDate.getMonthValue() - 1, currentDate.getDayOfMonth());
    GregorianCalendar fechaInicialCampo = new GregorianCalendar(currentDate.getYear(), currentDate.getMonthValue() - 1, 1);
    ArrayList listaFilas = new ArrayList();

    ConcentradoDetalleUnidades obj = new ConcentradoDetalleUnidades();

    public frmConcentradoDetalleUnidades() {
        initComponents();
        txtFecha.setCalendar(fechaInicialCampo);
        txtFechaFinal.setCalendar(fechaActual);
        aux.popTable("Cerrar", "Maximizar", "Minimizar", this, new JPopupMenu(), jPanel1);

    }

    void mostrar(String fechaInicio, String fechaFinal, String buscar) {
        try {
            ListaUnidades.setModel(func.ListaDeDatos(fechaInicio, fechaFinal, buscar));
        } catch (Exception e) {
            aux.mensajeLateral("Error", "" + e.getMessage(), "error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUnidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtSucursal = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtNumeroUnidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboSucursal = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        CheckActualizaTodo = new javax.swing.JCheckBox();
        txtBuscador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBackups = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDetenidasPorEstrategia = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Detalle Unidades");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Unidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

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
        ListaUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUnidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUnidades);

        jLabel1.setText("Total de unidades :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sucursal :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha Inicial :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("# de unidades :");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        txtSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSucursalKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Codigo area :");

        lblCodigoArea.setBackground(new java.awt.Color(204, 204, 204));
        lblCodigoArea.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha Final :");

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Resumen");
        jPanel2.add(jLabel7, new java.awt.GridBagConstraints());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Id :");

        lblId.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sucursal :");

        cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una sucursal", "CCZD", "CCZ", "CMT", "CMP", "CMC", "CMM", "CMMD", "CMGD", "CMG", "GEPP", "CHH", "CUL", "DGO", "HMO", "JRZ", "LPZ", "MXL", "MZT", "NGL", "ZCT", "MEX" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLista.setText("Lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        CheckActualizaTodo.setBackground(new java.awt.Color(255, 255, 255));
        CheckActualizaTodo.setText("Actualizar todo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Buscar :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Unidades Backup:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Detenidas Por estra :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDetenidasPorEstrategia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtBackups, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSucursal)
                                    .addComponent(lblCodigoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addComponent(CheckActualizaTodo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEliminar)
                                                .addGap(44, 44, 44)
                                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtBuscador))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(383, 383, 383)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBackups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDetenidasPorEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnGuardar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckActualizaTodo)
                            .addComponent(btnLista))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {

            if (txtNumeroUnidades.getText().length() <= 0) {
                aux.mensaje("Ingresa el numero de unidades", "Informativo");
                txtNumeroUnidades.requestFocus();
                return;
            }
            if (txtSucursal.getText().length() <= 0) {
                aux.mensaje("Ingresa el numero de sucursal", "Informativo");
                txtSucursal.requestFocus();
                return;
            }
            if (lblCodigoArea.getText().length() <= 0) {
                aux.mensaje("Ingresa un codigo de sucursal", "Informativo");
                
            }
            if (txtBackups.getText().length() <= 0) {
                aux.mensaje("Ingresa el numero de unidades backups", "Informativo");
                txtBackups.requestFocus();
            }
            if (txtDetenidasPorEstrategia.getText().length()<=0) {
                aux.mensaje("Ingresa 0 o 1 unidad en detencion", "Informatico");
                txtDetenidasPorEstrategia.requestFocus();
            }
            

            obj.setNumeroUnidades(Integer.parseInt(txtNumeroUnidades.getText()));
            obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));
            obj.setFecha_unidades(fechaInicial.format(txtFecha.getDate()));
            obj.setFecha_final(Date.valueOf(fechaFinal.format(txtFechaFinal.getDate())));
            obj.setNumeroUnidadesBackup(Integer.parseInt(txtBackups.getText()));
            obj.setNumeroUnidadesDetenidasPorEstrategia(Integer.parseInt(txtDetenidasPorEstrategia.getText()));

            
            if (aux.mensajeConfirmacion("Deseas ingresar el numero de unidades de " + obj.getFecha_unidades() + " a " + obj.getFecha_final()) == 1) {
                return;
            }

            if (func.insertData(obj).equals("success")) {
                aux.mensajeLateral("Registro insertado", "Se inserto correctamente el registro", "aceptado");
                mostrar("", "", "");
            } else {

                aux.mensajeLateral("No se puedo ingresar el registro", "No se puedo ingresar el registro " + obj.getMensajeError(), "error");
            }

        } catch (NumberFormatException e) {

        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtSucursalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSucursalKeyReleased

        Sucursal suc = new Sucursal();

        //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            suc = func.dataRegistre(txtSucursal.getText());

            lblCodigoArea.setText(String.valueOf(suc.getId_area()));
       // }


    }//GEN-LAST:event_txtSucursalKeyReleased

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        frmResumenFlota flota = new frmResumenFlota();
        Principal.escritorio.add(flota);
        aux.centrarPantalla(Principal.escritorio, flota);
        flota.show();


    }//GEN-LAST:event_jPanel2MouseClicked

    private void ListaUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUnidadesMouseClicked
        
        int fila = ListaUnidades.rowAtPoint(evt.getPoint());

        try {

            listaFilas.add(ListaUnidades.getValueAt(fila, 0).toString());

            lblId.setText(ListaUnidades.getValueAt(fila, 0).toString());
            txtNumeroUnidades.setText(ListaUnidades.getValueAt(fila, 2).toString());

            
            
        } catch (Exception e) {
        }


    }//GEN-LAST:event_ListaUnidadesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        
        
        
        String dateStart = fechaInicial.format(txtFecha.getDate());
        String dateEnd = fechaFinal.format(txtFechaFinal.getDate());

        if (lblId.getText().length() <= 0) {

            aux.mensaje("Selecciona un registro para actualizar", "informativo");
            return;

        }

        if (txtNumeroUnidades.getText().length() <= 0) {
            aux.mensaje("No haz cambiado o bien la casilla unidades esta vacio", "Informativo");
            return;
        }
        
        
        if (lblCodigoArea.getText().length()<= 0) {
            aux.mensaje("Selecciona un codigo de area", "Informativo");
            return;
        }

        obj.setId(Integer.parseInt(lblId.getText()));
        obj.setNumeroUnidades(Integer.parseInt(txtNumeroUnidades.getText()));
        obj.setId_area(Integer.parseInt(lblCodigoArea.getText()));
        
        if (CheckActualizaTodo.isSelected()) {

        if (func.actualizarTodo(obj).equalsIgnoreCase("success")) {
            aux.mensajeLateral("Registro ingresado correctamente", "Se ingreso correctamente el registro " + obj.getId(), "aceptado");
            mostrar(dateStart, dateEnd, cboSucursal.getSelectedItem().toString());
        } else {
            aux.mensaje("No se ingreso correctamente el registro revisar" + getClass().getName(), "Error");
        }            
            
            
        }else{
        
        if (func.actualizar(obj).equalsIgnoreCase("success")) {
            aux.mensajeLateral("Registro ingresado correctamente", "Se ingreso correctamente el registro " + obj.getId(), "aceptado");
            mostrar(dateStart, dateEnd, cboSucursal.getSelectedItem().toString());
        } else {
            aux.mensaje("No se ingreso correctamente el registro revisar" + getClass().getName(), "Error");
        }
        
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String dateStart = fechaInicial.format(txtFecha.getDate());
        String dateEnd = fechaFinal.format(txtFechaFinal.getDate());
        
        mostrar(dateStart, dateEnd, cboSucursal.getSelectedItem().toString());
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        for (Object listaFila : listaFilas) {
            System.out.println(listaFila);
        }
    }//GEN-LAST:event_btnListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckActualizaTodo;
    private javax.swing.JTable ListaUnidades;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLista;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtBackups;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtDetenidasPorEstrategia;
    private com.toedter.calendar.JDateChooser txtFecha;
    public static com.toedter.calendar.JDateChooser txtFechaFinal;
    private javax.swing.JTextField txtNumeroUnidades;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
