/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Helpers.Ayudas;
import Logica.fPowerZamUnidades;
import Modelo.EstatusUnidad;
import Modelo.Estatus_Pepsi;
import Modelo.PowerZamUnidades;
import Modelo.Sucursal;
import Modelo.Unidad;
import Vista.Indicadores.ResumenUnidades;
import java.awt.BorderLayout;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Ricardo Herrera
 */
public class frmPowerUnidades extends javax.swing.JInternalFrame {

    Logica.fPowerZamUnidades func = new fPowerZamUnidades();
    PowerZamUnidades pwo = new PowerZamUnidades();
    Helpers.Ayudas ayuda = new Ayudas();
//    DefaultComboBoxModel datos = new DefaultComboBoxModel(func.comboBoxEstatusUnidad());
//    DefaultComboBoxModel comboPepsi = new DefaultComboBoxModel(func.comboBoxEstatusUnidadPepsi());
    DefaultComboBoxModel comboSucursal = new DefaultComboBoxModel(func.comboSucursal());
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    GregorianCalendar fechaInicial = new GregorianCalendar();
    GregorianCalendar fechaFinal = new GregorianCalendar();

    Date dateStart;
    Date dateEnd;

    public frmPowerUnidades() {
        initComponents();
        mostrar("");

//        cboEstatus.setModel(datos);
//        cboEstatusPepsi.setModel(comboPepsi);
//        cboSucursal.setModel(comboSucursal);
        deshabilitar();
        txtMontoRentaFija.setText("0");
        txtFechaInicio.setText(formatoFecha.format(fechaInicial.getTime()));
        txtFechaFinal.setText("null");
        tamano_columnas();

    }

    void mostrar(String buscar) {
        ListaUnidades.setModel(func.mostrar(buscar));

    }

    void deshabilitar() {

        txtBuscar.setEnabled(false);

        cboEstatusPepsi.setEnabled(false);
        cboEstatus.setEnabled(false);
        txtFechaFinal.setEnabled(false);
        txtFechaInicio.setEnabled(false);

        txtUnidad.setEnabled(false);

    }

    void habilitar() {

        txtBuscar.setEnabled(true);

        cboEstatusPepsi.setEnabled(true);
        cboEstatus.setEnabled(true);
        txtFechaFinal.setEnabled(true);
        txtFechaInicio.setEnabled(true);

        txtUnidad.setEnabled(true);

    }

    void limpiarCasillas() {

        cboEstatusPepsi.setSelectedIndex(0);
        cboEstatus.setSelectedIndex(0);
        cboIndTitular.setSelectedIndex(0);
        cboIngresoXFlete.setSelectedIndex(0);
        cbo_ind_rentaFija.setSelectedIndex(0);
        cboRazonDetenida.setSelectedIndex(0);
        cboTipoCuota.setSelectedIndex(0);
        cboSucursal.setSelectedIndex(0);

        txtFechaFinal.setText("");
        txtFechaInicio.setText("");

        txtUnidad.setText("");
        txtComentario.setText("");

    }

    void tamano_columnas() {

        for (int i = 0; i < ListaUnidades.getColumnCount(); i++) {
            ListaUnidades.getColumnModel().getColumn(i).setMaxWidth(150);
            ListaUnidades.getColumnModel().getColumn(i).setPreferredWidth(150);
            ListaUnidades.getColumnModel().getColumn(i).setMaxWidth(150);
        }

//        ListaUnidades.getColumnModel().getColumn(0).setMinWidth(150);
//        ListaUnidades.getColumnModel().getColumn(0).setPreferredWidth(150);
//        ListaUnidades.getColumnModel().getColumn(0).setMaxWidth(150);
//
//        ListaUnidades.getColumnModel().getColumn(1).setMinWidth(150);
//        ListaUnidades.getColumnModel().getColumn(1).setPreferredWidth(150);
//        ListaUnidades.getColumnModel().getColumn(1).setMaxWidth(150);
//
//        ListaUnidades.getColumnModel().getColumn(4).setMinWidth(150);
//        ListaUnidades.getColumnModel().getColumn(4).setPreferredWidth(150);
//        ListaUnidades.getColumnModel().getColumn(4).setMaxWidth(150);
//
//        ListaUnidades.getColumnModel().getColumn(5).setMinWidth(150);
//        ListaUnidades.getColumnModel().getColumn(5).setPreferredWidth(150);
//        ListaUnidades.getColumnModel().getColumn(5).setMaxWidth(150);
//        ListaUnidades.getColumnModel().getColumn(0).setMaxWidth(0);
//        ListaUnidades.getColumnModel().getColumn(0).setMinWidth(0);
//        ListaUnidades.getColumnModel().getColumn(0).setPreferredWidth(0);
//
//        ListaUnidades.getColumnModel().getColumn(8).setMaxWidth(0);
//        ListaUnidades.getColumnModel().getColumn(8).setMinWidth(0);
//        ListaUnidades.getColumnModel().getColumn(8).setPreferredWidth(0);
//
//        ListaUnidades.getColumnModel().getColumn(9).setMaxWidth(0);
//        ListaUnidades.getColumnModel().getColumn(9).setMinWidth(0);
//        ListaUnidades.getColumnModel().getColumn(9).setPreferredWidth(0);
//
//        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboEstatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFinal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cboEstatusPepsi = new javax.swing.JComboBox<>();
        cboSucursal = new javax.swing.JComboBox<>();
        btnResumen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cboTipoCuota = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboIngresoXFlete = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboIndTitular = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbo_ind_rentaFija = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboRazonDetenida = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtMontoRentaFija = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUnidades = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cboPruebas = new javax.swing.JComboBox<>();
        lblCodigoArea = new javax.swing.JLabel();
        lblId_estatus = new javax.swing.JLabel();
        lblid_estatus_pepsi = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Power Unidades");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unidades PowerBI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Unidad :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sucursal :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Inicio :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Final :");

        cboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus", "Titular con cuota", "Detenida por estrategia", "Backups", "Inactivo" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Estatus :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estatus Pepsi :");

        txtUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUnidadMouseClicked(evt);
            }
        });

        txtFechaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaInicioMouseClicked(evt);
            }
        });

        txtFechaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaFinalMouseClicked(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_save_black_24dp.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_add_black_24dp.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cboEstatusPepsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el estatus pepsi", "Especial", "Cervecero", "Fuera", "Dedicado" }));

        cboSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la sucursal", "CCZ", "CCZD", "GEPP", "CMMD", "CMM", "CMG", "CMGD", "CMP", "CMT", "NGL", "CHH", "DGO", "CUL", "HMO", "CCT", "CMC", "JRZ", "ZCT", "QRO", "MTY" }));
        cboSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSucursalItemStateChanged(evt);
            }
        });
        cboSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSucursalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboSucursalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cboSucursalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboSucursalMousePressed(evt);
            }
        });
        cboSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSucursalActionPerformed(evt);
            }
        });

        btnResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_leaderboard_black_24dp.png"))); // NOI18N
        btnResumen.setText("Resumen");
        btnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenActionPerformed(evt);
            }
        });

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane2.setViewportView(txtComentario);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Comentarios :");

        cboTipoCuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una cuota", "K", "M" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tipo Cuota:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("ind_Titular :");

        cboIngresoXFlete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "-1", "0", "1", "2" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ind_ingresoxflete :");

        cboIndTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "-1", "0", "1", "2" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("ind_rentaFija :");

        cbo_ind_rentaFija.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "-1", "0", "1", "2" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("id_razon_detenida :");

        cboRazonDetenida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un estatus", "-1", "0", "1", "2" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Monto Renta fija :");

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
        add(pane, BorderLayout.CENTER);
        ListaUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUnidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUnidades);

        jLabel7.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        cboPruebas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Este es una prueba" }));

        lblCodigoArea.setText("CodigoArea");

        lblId_estatus.setText("id_estatus");

        lblid_estatus_pepsi.setText("id_estatus_pepsi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboIngresoXFlete, javax.swing.GroupLayout.Alignment.LEADING, 0, 189, Short.MAX_VALUE)
                            .addComponent(cboIndTitular, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTipoCuota, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstatusPepsi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId_estatus)
                            .addComponent(lblid_estatus_pepsi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigoArea))
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRazonDetenida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbo_ind_rentaFija, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMontoRentaFija, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnGuardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnResumen)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboPruebas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUnidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblCodigoArea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(lblId_estatus)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cboEstatusPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblid_estatus_pepsi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTipoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cboIndTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboIngresoXFlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbo_ind_rentaFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtMontoRentaFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cboRazonDetenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)
                            .addComponent(btnResumen)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        limpiarCasillas();
        btnGuardar.setText("Guardar");

        cboEstatus.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void ListaUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUnidadesMouseClicked
        btnGuardar.setText("Editar");

        int id = 0, id_estatus = 0;
        habilitar();
        try {
            int fila = ListaUnidades.rowAtPoint(evt.getPoint());

            txtUnidad.setText(ListaUnidades.getValueAt(fila, 2).toString()); //Unidad
            txtFechaInicio.setText(ListaUnidades.getValueAt(fila, 0).toString()); // Fecha Inicio
            txtFechaFinal.setText(ListaUnidades.getValueAt(fila, 1).toString());
            id = Integer.parseInt(ListaUnidades.getValueAt(fila, 7).toString());
            id_estatus = Integer.parseInt(ListaUnidades.getValueAt(fila, 8).toString());
            lblId_estatus.setText(ListaUnidades.getValueAt(fila, 8).toString());
            lblid_estatus_pepsi.setText(ListaUnidades.getValueAt(fila, 9).toString());

            cboSucursal.setSelectedItem(func.buscar_estatus_unidad_sucursal(id));
            lblCodigoArea.setText(String.valueOf(func.buscar_codigo_area(cboSucursal.getSelectedItem().toString())));
            cboTipoCuota.setSelectedItem(ListaUnidades.getValueAt(fila, 11).toString());
            cboEstatus.setSelectedItem(func.buscar_estatus_unidad(id_estatus));
            cboEstatusPepsi.setSelectedItem(ListaUnidades.getValueAt(fila, 6).toString());

        } catch (Exception e) {
            System.out.println("Error al seleccionar datos null " + e.getMessage());
        }


    }//GEN-LAST:event_ListaUnidadesMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            
            
            Sucursal sc = (Sucursal) cboSucursal.getSelectedItem();
            EstatusUnidad eu = (EstatusUnidad) cboEstatus.getSelectedItem();
            Estatus_Pepsi ep = (Estatus_Pepsi) cboEstatusPepsi.getSelectedItem();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            GregorianCalendar fechafinal = new GregorianCalendar(1900, 1, 0, 12, 59, 59);

            if (cboSucursal.getSelectedIndex() == 0 || cboSucursal.getSelectedItem() == "Selecciona una Sucursal") {
                ayuda.mensaje("Selecciona una sucursal ", "Informativo");
                cboSucursal.requestFocus();
                return;
            }

            if (txtUnidad.getText().length() == 0) {
                ayuda.mensaje("Iingresa una unidad", "Informativo");
                txtUnidad.requestFocus();
                return;
            }

            if (txtFechaInicio.getText().length() == 0) {
                ayuda.mensaje("Ingresa una fecha inicio ", "Informativo");
                txtFechaFinal.requestFocus();
                return;
            }

            if (cboTipoCuota.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa una tipo de cuota correcta k o m ", "Informativo");
                cboTipoCuota.requestFocus();
                return;
            }

            if (cboIndTitular.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa el estatus titular", "Informativo");
                cboIndTitular.requestFocus();
                return;
            }

            if (cboIngresoXFlete.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa el tipo de flete ", "Informativo");
                cboIngresoXFlete.requestFocus();
                return;
            }

            if (cbo_ind_rentaFija.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa el tipo de renta fija ", "Informativo");
                cbo_ind_rentaFija.requestFocus();
                return;
            }
            if (cbo_ind_rentaFija.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa el tipo de renta fija ", "Informativo");
                cbo_ind_rentaFija.requestFocus();
                return;
            }

            if (txtMontoRentaFija.getText().length() < 0) {
                txtMontoRentaFija.setText(String.valueOf(0));
            }

            if (cboRazonDetenida.getSelectedIndex() == 0) {
                ayuda.mensaje("Ingresa una razon de detencion", "Informativo");
                cboRazonDetenida.requestFocus();
                return;
            }

            if (cboEstatus.getSelectedIndex() == 0 || cboEstatus.getSelectedItem() == "Selecciona un estatus") {
                ayuda.mensaje("Selecciona un estatus valido ", "Informativo");
                cboEstatus.requestFocus();
                return;
            }
            if (cboEstatusPepsi.getSelectedIndex() == 0 || cboEstatus.getSelectedItem() == "Selecciona un estatus") {
                ayuda.mensaje("Selecciona un estatus valido ", "Informativo");
                cboEstatusPepsi.requestFocus();
                return;
            }

            if (txtComentario.getText().length() == 0) {
                ayuda.mensaje("Ingresa un comentario para la unidad", "Informativo");
                txtComentario.requestFocus();
                return;
            }

            System.out.println(" Fecha Final " + txtFechaFinal.getText());

            pwo.setId_area(sc.getId_area());
            pwo.setId_unidad((txtUnidad.getText()));
            pwo.setF_inicial(Date.valueOf(txtFechaInicio.getText()));
            pwo.setF_fin(txtFechaFinal.getText());
            pwo.setTipocuota(cboTipoCuota.getSelectedItem().toString());
            pwo.setInd_titular(Integer.parseInt(cboIndTitular.getSelectedItem().toString()));
            pwo.setInd_ingresoxflete(Integer.parseInt(cboIngresoXFlete.getSelectedItem().toString()));
            pwo.setInd_ingresoventafija(Integer.parseInt(cbo_ind_rentaFija.getSelectedItem().toString()));
            pwo.setMontorentafija(Integer.parseInt(txtMontoRentaFija.getText()));
            pwo.setId_razon_detenida(Integer.parseInt(cboRazonDetenida.getSelectedItem().toString()));
            pwo.setId_estatus(eu.getId_estatus());
            pwo.setId_estatus_pepsi(ep.getId_estatus_pepsi());
            pwo.setComentarios(txtComentario.getText());

            if (func.insertarUnidad(pwo)) {
                ayuda.mensaje("Registros ingresados correctamente", "Informativo");
                limpiarCasillas();
            } else {
                ayuda.mensaje("No se ingreso ningun registro", "Informativo");
            }

        } catch (NumberFormatException e) {
            ayuda.mensaje("Error en la" + getClass().getName() + " :" + e.getMessage(), title);
        } catch (Exception ex) {

            ayuda.mensaje("Error en la" + getClass().getName() + " :" + ex.getMessage(), title);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        Vista.Indicadores.ResumenUnidades frmR = new ResumenUnidades();
        Principal.escritorio.add(frmR);
        ayuda.centrarPantalla(Principal.escritorio, frmR);
        frmR.show();
    }//GEN-LAST:event_btnResumenActionPerformed

    private void txtUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUnidadMouseClicked
        if (evt.getClickCount() == 2) {

            frmUnidades unidad = new frmUnidades();
            Principal.escritorio.add(unidad);
            ayuda.centrarPantalla(Principal.escritorio, unidad);
            unidad.show();

        }
    }//GEN-LAST:event_txtUnidadMouseClicked

    private void txtFechaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaInicioMouseClicked
        if (evt.getClickCount() == 2) {
            txtFechaInicio.setText(formatoFecha.format(fechaInicial.getTime()));
        }
    }//GEN-LAST:event_txtFechaInicioMouseClicked

    private void txtFechaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaFinalMouseClicked
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        GregorianCalendar fechafinal = new GregorianCalendar(1900, 0, 1, 0, 0, 0);

        if (evt.getClickCount() == 2) {
            txtFechaFinal.setText(formatoFecha.format(fechafinal.getTime()));
        }

    }//GEN-LAST:event_txtFechaFinalMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (ayuda.mensajeConfirmacion("Deseas eliminar el registro ?") == 0) {

            try {
                String FechaAuxiliar = txtFechaInicio.getText();
                java.util.Date aux;
                aux = formatoFecha.parse(FechaAuxiliar);

                System.out.println(aux);

                Sucursal sc = (Sucursal) cboSucursal.getSelectedItem();

                if (txtUnidad.getText().length() == 0) {
                    ayuda.mensaje("No puedes eliminar una unidad sin selecciona un economico", "Informativo");
                    txtUnidad.requestFocus();
                    return;
                }

                if (txtFechaInicio.getText().length() == 0) {
                    ayuda.mensaje("No puedes eliminar una unidad sin selecciona una fecha", "Informativo");
                    txtFechaInicio.requestFocus();
                    return;
                }

                System.out.println("Area " + pwo.getId_area());

                System.out.println("Unidad " + pwo.getId_unidad());
                pwo.setF_inicial(Date.valueOf(formatoFecha.format(aux)));

                System.out.println("Fecha : " + pwo.getF_inicial().getClass().getTypeName());

                if (func.deleteUnidad(pwo)) {
                    ayuda.mensaje("Registro eliminado", "Informativo");
                    limpiarCasillas();
                    mostrar(txtBuscar.getText());
                } else {
                    ayuda.mensaje("no se pudo eliminar el registro", "Error");
                }

            } catch (Exception e) {
                System.out.println("Error no se puede castear la fecha " + e.getMessage());
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboSucursalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSucursalMousePressed

    }//GEN-LAST:event_cboSucursalMousePressed

    private void cboSucursalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSucursalMouseEntered

    }//GEN-LAST:event_cboSucursalMouseEntered

    private void cboSucursalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSucursalMouseExited

    }//GEN-LAST:event_cboSucursalMouseExited

    private void cboSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSucursalMouseClicked

    }//GEN-LAST:event_cboSucursalMouseClicked

    private void cboSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSucursalItemStateChanged


    }//GEN-LAST:event_cboSucursalItemStateChanged

    private void cboSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSucursalActionPerformed

        int fila = ListaUnidades.getSelectedRow();

        lblCodigoArea.setText(String.valueOf(func.buscar_codigo_area_nombre_sucursal(cboSucursal.getSelectedItem().toString())));


    }//GEN-LAST:event_cboSucursalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaUnidades;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnResumen;
    private javax.swing.JComboBox<String> cboEstatus;
    private javax.swing.JComboBox<String> cboEstatusPepsi;
    private javax.swing.JComboBox<String> cboIndTitular;
    private javax.swing.JComboBox<String> cboIngresoXFlete;
    private javax.swing.JComboBox<String> cboPruebas;
    private javax.swing.JComboBox<String> cboRazonDetenida;
    private javax.swing.JComboBox<String> cboSucursal;
    private javax.swing.JComboBox<String> cboTipoCuota;
    private javax.swing.JComboBox<String> cbo_ind_rentaFija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblId_estatus;
    private javax.swing.JLabel lblid_estatus_pepsi;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtMontoRentaFija;
    public static javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
