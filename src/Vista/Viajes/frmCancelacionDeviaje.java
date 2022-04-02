/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fTrafico_guia;
import Logica.fTrafico_viaje;
import Logica.fViajes;
import Modelo.Trafico_guia;
import Vista.Principal;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo Herrera
 */
public class frmCancelacionDeviaje extends javax.swing.JInternalFrame {

    Ayudas aux = new Ayudas();
    fViajes func = new fViajes();
    fTrafico_viaje funcTraficoviaje = new fTrafico_viaje();
    fTrafico_guia funcTraficoGuia = new fTrafico_guia();

    public frmCancelacionDeviaje() {
        initComponents();
        lblCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        lblNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtTraficoViajeNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtTraficoViajeCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        txtNumeroGuia.setText(frmViajes.txtNumeroGuia.getText());
        btnActualizarCancelacionviaje.setEnabled(false);

        if (lblCodigoArea.getText().length() <= 0 || lblNumeroViaje.getText().length() <= 0) {
            mostrar("", "");
        } else {
            mostrar(lblNumeroViaje.getText(), lblCodigoArea.getText());
        }
        habilitarCajas(false);
    }

    public void validacion_formulario() {
        informacion_viaje();
        habilitarCajas(false);

    }

    void informacion_viaje() {
        lblCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        lblNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtTraficoViajeNumeroViaje.setText(frmViajes.txtNumeroViaje.getText());
        txtTraficoViajeCodigoArea.setText(frmViajes.txtCodigoRuta.getText());
        txtNumeroGuia.setText(frmViajes.txtNumeroGuia.getText());
        btnActualizarCancelacionviaje.setEnabled(false);

        if (lblCodigoArea.getText().length() <= 0 || lblNumeroViaje.getText().length() <= 0) {
            mostrar("", "");
        } else {
            mostrar(lblNumeroViaje.getText(), lblCodigoArea.getText());
        }

    }

    void mostrar(String numeroViaje, String numeroArea) {
        listaViaticos.setModel(func.ViaticosDispersos(numeroViaje, numeroArea));
        ajuste_Columnas();
    }

    void ajuste_Columnas() {
        for (int i = 0; i < listaViaticos.getColumnCount(); i++) {
            listaViaticos.getColumnModel().getColumn(i).setMaxWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setMinWidth(150);
            listaViaticos.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
    }

    void mostrarTraficoViaje(int numeroViaje, int codigoArea) {

        this.TablaTrafico.setModel(funcTraficoviaje.showData(numeroViaje, codigoArea));

    }

    void mostrarTraficoGuia(Trafico_guia obj) {
        try {
            ListaTraficoGuia.setModel(funcTraficoGuia.showDataTravelTraffic(obj));
        } catch (Exception e) {
            aux.mensaje(e.getMessage(), "Error");
        }

    }

    void habilitarCajas(boolean validacion) {

        txtComentariosTraficoGuia.setVisible(validacion);
        cboEstatusPrestamoTraficoGuia.setVisible(validacion);
        txtNumGuiaTraficoGuia.setEnabled(validacion);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboEstatusAnticipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumeroViaje = new javax.swing.JLabel();
        lblCodigoArea = new javax.swing.JLabel();
        lbltotalviatico = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaViaticos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cboEstatusGuia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboPrestamo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboEstatusAsignacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboEstatusPedido = new javax.swing.JComboBox<>();
        btnActualizarCancelacionviaje = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtNumeroGuia = new javax.swing.JTextField();
        checkManual = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboEstatusViajeTraficoViaje = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTrafico = new javax.swing.JTable(){

            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }

        };
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTraficoViajeNumeroViaje = new javax.swing.JTextField();
        txtTraficoViajeCodigoArea = new javax.swing.JTextField();
        btnBuscarTraficoViaje = new javax.swing.JButton();
        btnActualizarEstatusTraficoViaje = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaTraficoGuia = new javax.swing.JTable(){

            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumeroViajeTraficoGuia = new javax.swing.JTextField();
        txtCodigoAreaTraficoGuia = new javax.swing.JTextField();
        cboEstatusTraficoGuia = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtComentariosTraficoGuia = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        cboEstatusPrestamoTraficoGuia = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtRemisionTraficoGuia = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechaCancelacionTraficoGuia = new com.toedter.calendar.JDateChooser();
        btnActualizarTraficoGuia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblEstatusTraficoGuia = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNumGuiaTraficoGuia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximizable(true);
        setTitle("Estatus viaje");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Estatus anticipo :");

        cboEstatusAnticipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus anticipo", "Aceptado", "Cancelado", "Edicion", "Liquidado" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Observaciones :");

        txtObservaciones.setColumns(20);
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtObservaciones);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numero de viaje :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Area :");

        lblNumeroViaje.setText("-");

        lblCodigoArea.setText("-");

        lbltotalviatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalviatico.setText("-");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnCancelar.setText("Cancelar viaje");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total viatico :");

        listaViaticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listaViaticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(listaViaticos);
        add(pane, BorderLayout.CENTER);
        jScrollPane2.setViewportView(listaViaticos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estatus Guia");

        cboEstatusGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus Guia", "Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Prestamo :");

        cboPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un prestamo", "Pendiente", "Aceptado" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Estatus Asignacion :");

        cboEstatusAsignacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus asignacion", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En transito", " " }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estatus Pedido :");

        cboEstatusPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus pedido", "Todos", "Capturado", "Asignado", "Entregado", "Cancelado", "En transito" }));

        btnActualizarCancelacionviaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_sync_alt_black_24dp.png"))); // NOI18N
        btnActualizarCancelacionviaje.setText("Actualizar");
        btnActualizarCancelacionviaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancelacionviajeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Numero de guia :");

        checkManual.setBackground(new java.awt.Color(255, 255, 255));
        checkManual.setText("Manual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCodigoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusGuia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                                    .addComponent(cboPrestamo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEstatusPedido, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(checkManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizarCancelacionviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(429, 429, 429)
                        .addComponent(lbltotalviatico, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNumeroViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigoArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEstatusAnticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboEstatusGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboEstatusAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboEstatusPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkManual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbltotalviatico)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNumeroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnActualizarCancelacionviaje))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cancelacion de viaje", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estatus trafico viaje :");

        cboEstatusViajeTraficoViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "Cancelado", "Liquidado", "Pendiente", "Realizado", "Transito", "Liberado" }));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_sync_alt_black_24dp.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        TablaTrafico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaTrafico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        add(pane, BorderLayout.CENTER);
        jScrollPane3.setViewportView(TablaTrafico);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Numero de viaje :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Codigo Area :");

        btnBuscarTraficoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_travel_explore_black_24dp.png"))); // NOI18N
        btnBuscarTraficoViaje.setText("Search");
        btnBuscarTraficoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTraficoViajeActionPerformed(evt);
            }
        });

        btnActualizarEstatusTraficoViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizarEstatusTraficoViaje.setText("Actualizar Estatus");
        btnActualizarEstatusTraficoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstatusTraficoViajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTraficoViajeNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(txtTraficoViajeCodigoArea, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboEstatusViajeTraficoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscarTraficoViaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarEstatusTraficoViaje)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTraficoViajeNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTraficoViajeCodigoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboEstatusViajeTraficoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTraficoViaje)
                    .addComponent(btnActualizarEstatusTraficoViaje))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trafico viaje", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaTraficoGuia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaTraficoGuia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        add(pane, BorderLayout.CENTER);
        ListaTraficoGuia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaTraficoGuiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaTraficoGuiaMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(ListaTraficoGuia);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 685, 255));

        jLabel14.setText("Numero de viaje :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        jLabel15.setText("Codigo area :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 72, -1, -1));

        jLabel16.setText("Estatus Guia :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 118, -1, -1));
        jPanel3.add(txtNumeroViajeTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 28, 94, -1));
        jPanel3.add(txtCodigoAreaTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 69, 94, -1));

        cboEstatusTraficoGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona estatus guia", "Confirmado", "Regreso", "Pendiente", "Transito", "Cancelado", " " }));
        cboEstatusTraficoGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstatusTraficoGuiaActionPerformed(evt);
            }
        });
        jPanel3.add(cboEstatusTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 115, 173, -1));

        jLabel17.setText("Comentarios :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 31, -1, -1));

        txtComentariosTraficoGuia.setColumns(20);
        txtComentariosTraficoGuia.setLineWrap(true);
        txtComentariosTraficoGuia.setRows(5);
        txtComentariosTraficoGuia.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtComentariosTraficoGuia);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 28, 243, 107));

        jLabel18.setText("Estatus Prestamo :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 156, -1, -1));

        cboEstatusPrestamoTraficoGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus prestamo", "Pendiente", "Aceptado" }));
        jPanel3.add(cboEstatusPrestamoTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 153, -1, -1));

        jLabel19.setText("Remision :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 194, -1, -1));
        jPanel3.add(txtRemisionTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 191, 243, -1));

        jLabel20.setText("Fecha cancelacion :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 156, -1, -1));
        jPanel3.add(txtFechaCancelacionTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 153, 243, -1));

        btnActualizarTraficoGuia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        btnActualizarTraficoGuia.setText("Update Guia");
        btnActualizarTraficoGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTraficoGuiaActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizarTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 217, 140, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 217, 122, 33));

        lblEstatusTraficoGuia.setText("Estatus");
        jPanel3.add(lblEstatusTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 240, 20));

        jLabel21.setText("# guia :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));
        jPanel3.add(txtNumGuiaTraficoGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 230, 104, -1));

        jTabbedPane1.addTab("Trafico Guia", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Desp_asignacion", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Trafico_guia", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        String accion = "Cancelar";
        if (frmViajes.lblEstatusGuia.getText().equalsIgnoreCase("Pendiente")) {
            aux.mensaje("NO PUEDES CANCELAR UNA VIAJE POR QUE ESTA EN ESTADO DE PENDIENTE FINALIZA EL VIAJE PARA CANCELAR", "INFORMATIVO");
        } else {

            String estatus_Anticipo = "", estatus_Guia = "", estatus_Prestamo = "", numero_guia = "";
            int estatus_Asignacion = 0, estatus_Pedido = 0;

            int codigoArea = 0, numeroViaje = 0, auxiliar = 0;

            if (lblCodigoArea.getText().length() <= 0) {
                aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
                return;

            }
            if (lblNumeroViaje.getText().length() <= 0) {
                aux.mensaje("No puedes cancelar una viaje sin codigo de ruta", "Informativo");
                return;
            }

            if (cboEstatusAnticipo.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatos de anticipo correcto", "Informativo");
                return;
            }
            if (cboEstatusGuia.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatos guia carta porte correcto", "Informativo");
                return;
            }
            if (cboEstatusAsignacion.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatos de asigacion correcto", "Informativo");
                return;
            }
            if (cboEstatusPedido.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatus pedido correcto", "Informativo");
                return;
            }
            if (cboPrestamo.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatus de prestamo correcto", "Informativo");
                return;
            }

            if (txtNumeroGuia.getText().length() == 0) {
                aux.mensaje("Debes de ingresar un numero de guia para cancelar el viaje", "Informativo");
                txtNumeroGuia.requestFocus();
                return;
            }

            /*El estatus guia y el estatus trafico_viaje tiene la misma nomeclatura de estatus */
            if (cboEstatusGuia.getSelectedItem().toString().equals("Confirmado")) {
                estatus_Guia = "C";
            } else if (cboEstatusGuia.getSelectedItem().toString().equals("Regreso")) {
                estatus_Guia = "R";
            } else if (cboEstatusGuia.getSelectedItem().toString().equals("Pendiente")) {
                estatus_Guia = "A";

            } else if (cboEstatusGuia.getSelectedItem().toString().equals("Transito")) {
                estatus_Guia = "T";

            } else if (cboEstatusGuia.getSelectedItem().toString().equals("Cancelado")) {
                estatus_Guia = "B";
            }

            if (cboEstatusAnticipo.getSelectedItem().toString().equals("Aceptado")) {
                estatus_Anticipo = "A";
            } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Cancelado")) {
                estatus_Anticipo = "C";
            } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Edicion")) {
                estatus_Anticipo = "E";

            } else if (cboEstatusAnticipo.getSelectedItem().toString().equals("Liquidado")) {
                estatus_Anticipo = "L";
            }

            if (cboEstatusAsignacion.getSelectedItem().toString().equals("Todos")) {
                estatus_Asignacion = 0;
            } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Capturado")) {
                estatus_Asignacion = 1;

            } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Asignado")) {
                estatus_Asignacion = 2;

            } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Entregado")) {
                estatus_Asignacion = 3;

            } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("Cancelado")) {
                estatus_Asignacion = 4;

            } else if (cboEstatusAsignacion.getSelectedItem().toString().equals("En transito")) {
                estatus_Asignacion = 5;
            }

            if (cboEstatusPedido.getSelectedItem().toString().equals("Todos")) {
                estatus_Pedido = 0;
            } else if (cboEstatusPedido.getSelectedItem().toString().equals("Capturado")) {
                estatus_Pedido = 1;

            } else if (cboEstatusPedido.getSelectedItem().toString().equals("Asignado")) {
                estatus_Pedido = 2;

            } else if (cboEstatusPedido.getSelectedItem().toString().equals("Entregado")) {
                estatus_Pedido = 3;

            } else if (cboEstatusPedido.getSelectedItem().toString().equals("Cancelado")) {
                estatus_Pedido = 4;

            } else if (cboEstatusPedido.getSelectedItem().toString().equals("En transito")) {
                estatus_Pedido = 5;
            }

            if (cboPrestamo.getSelectedItem().toString().equalsIgnoreCase("Pendiente")) {
                estatus_Prestamo = "P";
            } else {
                estatus_Prestamo = "A";
            }

            /*si retorna un 0 = si, si retorna 1  = no*/
            if (aux.mensajeConfirmacion("Deseas Cancelar el viaje") == 0) {

                for (int i = 0; i < frmViajes.TablaFolio.getRowCount(); i++) { //Filas 

                    for (int j = 0; j < frmViajes.TablaFolio.getColumnCount(); j++) { //Columnas

                        auxiliar = j;
                        System.out.println(frmViajes.TablaFolio.getValueAt(i, j));

                        if (j == 1) {
                            numeroViaje = Integer.parseInt(frmViajes.TablaFolio.getValueAt(i, j).toString());

                        } else if (j == 2) {
                            codigoArea = Integer.parseInt(frmViajes.TablaFolio.getValueAt(i, j).toString());
//                            j = auxiliar;
                        } else if (j == 3) {
                            numero_guia = frmViajes.TablaFolio.getValueAt(i, j).toString();
                        }

                        if (numeroViaje != 0 && codigoArea != 0 && !numero_guia.equalsIgnoreCase("")) {
                            System.out.println("Numero de viaje " + numeroViaje + " Codigo Area " + codigoArea + " Numero de guia " + numero_guia);

                            if (func.cancelacion_Carta_Porte(codigoArea, numeroViaje, estatus_Guia, estatus_Prestamo,
                                    txtObservaciones.getText(), estatus_Anticipo, estatus_Pedido, estatus_Asignacion, numero_guia, accion)) {

                                aux.mensajeLateral("Viaje Cancelado", "Se a cancelado correctamente el viaje " + numeroViaje + " codigoArea " + codigoArea, "aceptado");
                                frmViajes.TablaFolio.setModel(new DefaultTableModel());
                                aux.mensaje("Tabla de folios eliminados limpia", "Informativo");
                                this.dispose();
                            } else {
                                aux.mensajeLateral("Viaje Cancelado", "No se puedo cancelar el viaje", "fallo");
                            }

                        }
                    }

                }

            }

            aux.mensajeLateral("Viaje Cancelado", "Se a cancelado correctamente todos los viajes ", "aceptado");
            frmViajes.TablaFolio.removeAll();

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarCancelacionviajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancelacionviajeActionPerformed


    }//GEN-LAST:event_btnActualizarCancelacionviajeActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ///Declaramos una varibale estado para definir el estatus del viaje
        String estado = "", validacion = "";

        int numero_vaje, codigo_area;
        try {

            //Validamos que ingresamos un estatus valido
            if (cboEstatusViajeTraficoViaje.getSelectedIndex() == 0) {
                aux.mensaje("Debes de seleccionar un estatus valido", "Informativo");
                cboEstatusAnticipo.requestFocus();
                return;
            }

            if (txtTraficoViajeCodigoArea.getText().length() == 0) {
                aux.mensaje("Ingresa un codigo de area ", "Informativo");
                txtTraficoViajeCodigoArea.requestFocus();
                return;
            } else {
                codigo_area = Integer.parseInt(txtTraficoViajeCodigoArea.getText());
            }

            if (txtTraficoViajeNumeroViaje.getText().length() == 0) {
                aux.mensaje("Ingresa un numero de viaje", "Informativo");
                txtTraficoViajeNumeroViaje.requestFocus();
                return;
            } else {
                numero_vaje = Integer.parseInt(txtTraficoViajeNumeroViaje.getText());
            }

            //Condicion para la definicion de estado
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Cancelado")) {
                estado = "B";
            }
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Liquidado")) {
                estado = "C";
            }
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Pendiente")) {
                estado = "A";
            }
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Realizado")) {
                estado = "R";
            }
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Transito")) {
                estado = "T";
            }
            if (cboEstatusViajeTraficoViaje.getSelectedItem().equals("Liberado")) {
                estado = "L";
            }

            if (estado.equalsIgnoreCase("")) {
                aux.mensaje("El estatus esta vacio selecciona un estatus valido", "Informativo");
                return;
            }

            validacion = func.update_trafico_viaje(estado, numero_vaje, codigo_area);

            if (validacion.equalsIgnoreCase("success")) {

                aux.mensaje("Registro actualizado correctamente : " + numero_vaje + " Codigo area : " + codigo_area, "Informativo");
                this.dispose();
            } else {
                aux.mensaje(validacion, "Error");
            }

        } catch (Exception e) {

            aux.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarTraficoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTraficoViajeActionPerformed

        int numeroViaje = Integer.parseInt(txtTraficoViajeNumeroViaje.getText());
        int codigoArea = Integer.parseInt(txtTraficoViajeCodigoArea.getText());

        mostrarTraficoViaje(numeroViaje, codigoArea);

    }//GEN-LAST:event_btnBuscarTraficoViajeActionPerformed

    private void btnActualizarEstatusTraficoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstatusTraficoViajeActionPerformed
        String estatusDesicion = "";
        int numeroViaje = Integer.parseInt(txtTraficoViajeNumeroViaje.getText());
        int codigoArea = Integer.parseInt(txtTraficoViajeCodigoArea.getText());

        if (cboEstatusViajeTraficoViaje.getSelectedIndex() == 0) {
            aux.mensaje("Debes de seleccionar una estatus ", "Informativo");
            return;
        }

        if (txtTraficoViajeNumeroViaje.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un numero de viajes", "Error");
            txtTraficoViajeNumeroViaje.requestFocus();
            return;
        }

        if (txtTraficoViajeCodigoArea.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un codigo ruta ", "Error");
            txtTraficoViajeNumeroViaje.requestFocus();
            return;
        }

        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Cancelado")) {
            estatusDesicion = "B";
        }
        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Liquidado")) {
            estatusDesicion = "C";
        }
        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Pendiente")) {
            estatusDesicion = "A";
        }
        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Realizado")) {
            estatusDesicion = "R";
        }
        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Transito")) {
            estatusDesicion = "T";
        }
        if (cboEstatusViajeTraficoViaje.getSelectedItem().toString().equalsIgnoreCase("Liberado")) {
            estatusDesicion = "L";
        }

        if (funcTraficoviaje.updateStatusTraficoViaje(estatusDesicion, numeroViaje, codigoArea).equalsIgnoreCase("success")) {
            aux.mensaje("Estatus actualizado", "Informativo");
            aux.mensajeLateral("Actualizacion !!! ", "Se actualizo correctamente el estatus", "aceptado");
            mostrarTraficoViaje(numeroViaje, codigoArea);
        } else {

            aux.mensajeLateral("Error", funcTraficoviaje.updateStatusTraficoViaje(estatusDesicion, numeroViaje, codigoArea), "error");

        }


    }//GEN-LAST:event_btnActualizarEstatusTraficoViajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Trafico_guia objecto = new Trafico_guia();

        if (txtCodigoAreaTraficoGuia.getText().length() <= 0 || txtNumeroViajeTraficoGuia.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un numero de viaje y codigo area", "Informativo");
            txtCodigoAreaTraficoGuia.requestFocus();
            return;
        }

        objecto.setCodigo_area(Integer.parseInt(txtCodigoAreaTraficoGuia.getText().trim()));
        objecto.setNo_viaje(Integer.parseInt(txtNumeroViajeTraficoGuia.getText().trim()));
        mostrarTraficoGuia(objecto);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarTraficoGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTraficoGuiaActionPerformed
        
        Trafico_guia obj = new Trafico_guia();
        String estatusGuia = "";
        
        if (txtCodigoAreaTraficoGuia.getText().length() <= 0 || txtNumeroViajeTraficoGuia.getText().length() <= 0) {
            aux.mensaje("Debes de ingresar un numero de viaje y codigo area", "Informativo");
            txtCodigoAreaTraficoGuia.requestFocus();
            return;
        }
        
        if (cboEstatusTraficoGuia.getSelectedItem().toString().equalsIgnoreCase("Cancelado")) {
            
            if (cboEstatusPrestamoTraficoGuia.getSelectedIndex() == 0) {
                aux.mensaje("Debes seleccionar un estatus Prestamo", "Informativo");
                cboPrestamo.requestFocus();
                return;
                
            }
            
            if (txtComentariosTraficoGuia.getText().length() <=0) {
                aux.mensaje("Debes de agregar al menos un comentario", "Informativo");
                txtComentariosTraficoGuia.requestFocus();
                return;
            }
            
             switch(lblEstatusTraficoGuia.getText()){
                 
                 case "Confirmado" :
                     estatusGuia = "C";
                     break;
                 case "Regreso" :
                     estatusGuia = "R";
                     break;
                 case "Pendiente" :
                     estatusGuia = "A";
                     break;
                 case "Transito" :
                     estatusGuia = "T";
                     break;
                 case "Cancelado" :
                     estatusGuia = "B";
                     break;
                 default:
                     aux.mensaje("El estatus que ingresaste no exite", "Error");
                     break;
                 
             }
   
            
            obj.setStatus_guia(estatusGuia);
            obj.setNo_guia(Integer.parseInt(txtNumGuiaTraficoGuia.getText()));
            obj.setMotivo_cancelacion(txtComentariosTraficoGuia.getText());
            obj.setPrestamo(cboPrestamo.getSelectedItem().toString());
            
            
            aux.mensajeLateral("Datos ingresos " + estatusGuia, "Estatus guia "+obj.getStatus_guia() + " Numero de guia "+obj.getNo_guia() + " Motivo Cancelacion "+obj.getMotivo_cancelacion()+" Estatus prestamo "+obj.getPrestamo(), "ayuuda");
            
            
        }

    }//GEN-LAST:event_btnActualizarTraficoGuiaActionPerformed

    private void ListaTraficoGuiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaTraficoGuiaMouseClicked

        int fila = ListaTraficoGuia.getSelectedRow();

        try {
            txtRemisionTraficoGuia.setText(ListaTraficoGuia.getValueAt(fila, 18).toString());
            lblEstatusTraficoGuia.setText(ListaTraficoGuia.getValueAt(fila, 5).toString());
            txtNumGuiaTraficoGuia.setText(ListaTraficoGuia.getValueAt(fila, 3).toString());
        } catch (Exception e) {
            aux.mensaje("Error al seleccionar el dato linea  " + e.getLocalizedMessage() + " :" + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_ListaTraficoGuiaMouseClicked

    private void ListaTraficoGuiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaTraficoGuiaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaTraficoGuiaMouseEntered


    private void cboEstatusTraficoGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstatusTraficoGuiaActionPerformed

        if (cboEstatusTraficoGuia.getSelectedItem().toString().equalsIgnoreCase("Cancelado")) {
            habilitarCajas(true);
            aux.mensajeLateral("!!! success !!!","Se habilitaron los controles de comentarios para cancelar una viaje ","ayuuda");

        } else {
            habilitarCajas(false);
        }
        
        
        if (cboEstatusTraficoGuia.getSelectedItem().toString().equalsIgnoreCase("Transito")) {
            aux.mensajeLateral("!!! Warning !!!","Este estatus es cuando la unidad esta en despacho no es recomendable utilizalo ","cuidado");
        }

    }//GEN-LAST:event_cboEstatusTraficoGuiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaTraficoGuia;
    private javax.swing.JTable TablaTrafico;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarCancelacionviaje;
    private javax.swing.JButton btnActualizarEstatusTraficoViaje;
    private javax.swing.JButton btnActualizarTraficoGuia;
    private javax.swing.JButton btnBuscarTraficoViaje;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cboEstatusAnticipo;
    private javax.swing.JComboBox<String> cboEstatusAsignacion;
    private javax.swing.JComboBox<String> cboEstatusGuia;
    private javax.swing.JComboBox<String> cboEstatusPedido;
    private javax.swing.JComboBox<String> cboEstatusPrestamoTraficoGuia;
    private javax.swing.JComboBox<String> cboEstatusTraficoGuia;
    private javax.swing.JComboBox<String> cboEstatusViajeTraficoViaje;
    private javax.swing.JComboBox<String> cboPrestamo;
    private javax.swing.JCheckBox checkManual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblEstatusTraficoGuia;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lbltotalviatico;
    private javax.swing.JTable listaViaticos;
    private javax.swing.JTextField txtCodigoAreaTraficoGuia;
    private javax.swing.JTextArea txtComentariosTraficoGuia;
    private com.toedter.calendar.JDateChooser txtFechaCancelacionTraficoGuia;
    private javax.swing.JTextField txtNumGuiaTraficoGuia;
    private javax.swing.JTextField txtNumeroGuia;
    private javax.swing.JTextField txtNumeroViajeTraficoGuia;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRemisionTraficoGuia;
    private javax.swing.JTextField txtTraficoViajeCodigoArea;
    private javax.swing.JTextField txtTraficoViajeNumeroViaje;
    // End of variables declaration//GEN-END:variables
}
