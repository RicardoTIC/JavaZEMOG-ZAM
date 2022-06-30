package Vista.ResumenUnidades;

import Helpers.Ayudas;
import Logica.fCapacidadInstalada;
import static Vista.Viajes.frmViajes.ListaDatos;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPopupMenu;

public class frmResumenIndicadores extends javax.swing.JInternalFrame {

    Ayudas help = new Ayudas();
    Calendar fecha = Calendar.getInstance();
    fCapacidadInstalada func = new fCapacidadInstalada();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
    GregorianCalendar fechafinal = new GregorianCalendar();
    GregorianCalendar fechainicial = new GregorianCalendar(2022, fecha.get(Calendar.MONTH), 1, 12, 59, 59);

    public frmResumenIndicadores() {
        initComponents();
        help.popTable("Cerrar", "Maximizar", "Minimizar", this, new JPopupMenu(), jPanel1);
        txtFechaInicio.setDate(fechainicial.getTime());
        txtFechafinal.setDate(fechafinal.getTime());
        mostrar(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), "");
        mostrarDetalleSucursal(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), "");
    }

    //Este buscador es para encontrar datos en todas las tablas
    void mostrar(String fechaInicial, String fechaFinal, String buscar) {

        try {

            TablaCapiPorSucursal.setModel(func.showAllData(fechaInicial, fechaFinal, buscar));
            lblTotalRegistrosSucursal.setText("Total de unidades : " + String.valueOf(TablaCapiPorSucursal.getRowCount()));

        } catch (Exception e) {
            help.mensaje("Error " + func.Error, "Error");
        }

    }

    //Muestra las unidad con km en cero.
    void mostrarDetalleUnidadesEnCero(String fechaInicial, String fechaFinal, String buscar) {

        try {

            TablaCapiPorSucursal.setModel(func.showAllData(fechaInicial, fechaFinal, buscar));
            lblTotalRegistrosSucursal.setText("Total de unidades : " + String.valueOf(TablaCapiPorSucursal.getRowCount()));
        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }

    }

    //Muestra los viajes en detalle de la sucursal
    void mostrarDetalle(String fechaInicial, String fechaFinal, String buscar) {

        try {

            TablaDetallePorUnidad.setModel(func.showAllDataDatail(fechaInicial, fechaFinal, buscar));
            lblTotalRegistrosViajes.setText("Total viajes realizados : " + String.valueOf(TablaDetallePorUnidad.getRowCount()));

        } catch (Exception e) {
            help.mensaje("Error" + e.getMessage(), "Error");
        }

    }

    //Muestra el detalle de capi por sucursal 
    void mostrarDetalleSucursal(String fechaInicial, String fechaFinal, String buscar) {
        try {

            TablaResumenSucursal.setModel(func.showAllDataDatailSucursalSinFallos(fechaInicial, fechaFinal, buscar));
            lblTotalRegistrosSucursalGeneral.setText("Total de registros" + String.valueOf(TablaResumenSucursal.getRowCount()));
        } catch (Exception e) {
        }
    }

    //Muesta el detalle de capi por unidad al dar clic en una sucursal 
    void mostrarDetalleUnidad(String fechaInicial, String fechaFinal, String buscar) {

        try {

            TablaCapiPorUnidad.setModel(func.showAllDataDatailUnidadSinFallos(fechaInicial, fechaFinal, buscar));
            lblTotalKilometros.setText("Total Kilometros acumulados : " + func.totalKilometros);
            lblTotalNumeroViajes.setText("Total numero de viajes : " + func.totalViajes);
            lblTotalCuotaAcumulada.setText("Total numero de viajes : " + func.totalCuotaAcumulada);
            func.totalViajes = 0;
            func.totalKilometros = 0;
            func.totalCuotaAcumulada = 0;

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCapiPorSucursal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDetallePorUnidad = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblTotalRegistrosSucursal = new javax.swing.JLabel();
        lblTotalRegistrosViajes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        txtCuota = new javax.swing.JTextField();
        txtVenta = new javax.swing.JTextField();
        txtkms = new javax.swing.JTextField();
        txtNumeroUnidades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCapi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtFechafinal = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBusquedaAvanzada = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaResumenSucursal = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        lblTotalRegistrosSucursalGeneral = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaCapiPorUnidad = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscadorUnidadesCero = new javax.swing.JTextField();
        lblTotalKilometros = new javax.swing.JLabel();
        lblTotalNumeroViajes = new javax.swing.JLabel();
        lblTotalCuotaAcumulada = new javax.swing.JLabel();
        btnBuscarCeros = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Resumen Capi por unidad");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen Capi Unidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        TablaCapiPorSucursal.setAutoCreateRowSorter(true);
        TablaCapiPorSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaCapiPorSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCapiPorSucursalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCapiPorSucursal);

        TablaDetallePorUnidad.setAutoCreateRowSorter(true);
        TablaDetallePorUnidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaDetallePorUnidad);

        lblTotalRegistrosSucursal.setText("Total de Registros");

        lblTotalRegistrosViajes.setText("Total de Registros");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cuota Acumulada :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Venta :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Kms :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Numero de unidades :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Capi :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Fecha de Inicio :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Fecha Final :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_update_black_24dp.png"))); // NOI18N
        jButton2.setText("Editar");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        jButton3.setText("Eliminar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_text_snippet_black_24dp.png"))); // NOI18N
        jButton1.setText("Excel");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscar :");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Busqueda Avanzada :");

        txtBusquedaAvanzada.setToolTipText("Busqueda por ope, uni, ruta");
        txtBusquedaAvanzada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaAvanzadaKeyReleased(evt);
            }
        });

        TablaResumenSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaResumenSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaResumenSucursalMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaResumenSucursal);

        lblTotalRegistrosSucursalGeneral.setText("Total de Registros :");

        TablaCapiPorUnidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaCapiPorUnidad);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Detalle de viajes");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Unidades con cero km");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Buscar :");

        txtBuscadorUnidadesCero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorUnidadesCeroKeyReleased(evt);
            }
        });

        lblTotalKilometros.setText("Total Kilometros  :");

        lblTotalNumeroViajes.setText("Total Numero de viajes");

        lblTotalCuotaAcumulada.setText("Total CuotaAcumulada :");

        btnBuscarCeros.setText("Buscar");
        btnBuscarCeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCerosActionPerformed(evt);
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
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalKilometros)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSucursal)
                            .addComponent(txtCuota)
                            .addComponent(txtVenta)
                            .addComponent(txtkms, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumeroUnidades)
                                    .addComponent(txtCapi, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtFechafinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscadorUnidadesCero, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnBuscarCeros))
                            .addComponent(jLabel12)
                            .addComponent(lblTotalRegistrosSucursalGeneral)
                            .addComponent(lblTotalRegistrosSucursal)
                            .addComponent(lblTotalRegistrosViajes)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))
                            .addComponent(lblTotalNumeroViajes)
                            .addComponent(lblTotalCuotaAcumulada))
                        .addGap(0, 637, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtCapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtkms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalKilometros)
                .addGap(5, 5, 5)
                .addComponent(lblTotalNumeroViajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalCuotaAcumulada)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistrosSucursalGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBuscadorUnidadesCero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCeros))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalRegistrosSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistrosViajes)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaAvanzadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaAvanzadaKeyReleased
        int fila = TablaCapiPorSucursal.getSelectedRow();

        try {

            mostrarDetalle(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), txtBusquedaAvanzada.getText());

        } catch (Exception e) {
            help.mensaje("Error" + e.getMessage(), "Error");
        }
    }//GEN-LAST:event_txtBusquedaAvanzadaKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            mostrar(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), txtBuscar.getText());
            mostrarDetalleSucursal(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), txtBuscar.getText());

        } catch (Exception e) {
            help.mensaje("Error" + e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void TablaCapiPorSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCapiPorSucursalMouseClicked

        int fila = TablaCapiPorSucursal.getSelectedRow();

        try {

            mostrarDetalle(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), TablaCapiPorSucursal.getValueAt(fila, 0).toString());

        } catch (Exception e) {
            help.mensaje("Error" + e.getMessage(), "Error");
        }

    }//GEN-LAST:event_TablaCapiPorSucursalMouseClicked

    private void TablaResumenSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaResumenSucursalMouseClicked
        int fila = TablaResumenSucursal.rowAtPoint(evt.getPoint());

        try {

            mostrarDetalleUnidad(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), TablaResumenSucursal.getValueAt(fila, 0).toString());

            txtSucursal.setText(TablaResumenSucursal.getValueAt(fila, 0).toString());
            txtCuota.setText(TablaResumenSucursal.getValueAt(fila, 6).toString());
            txtNumeroUnidades.setText(TablaResumenSucursal.getValueAt(fila, 4).toString());
            txtVenta.setText(TablaResumenSucursal.getValueAt(fila, 9).toString());
            txtkms.setText(TablaResumenSucursal.getValueAt(fila, 1).toString());
            txtCapi.setText(TablaResumenSucursal.getValueAt(fila, 13).toString());

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }
    }//GEN-LAST:event_TablaResumenSucursalMouseClicked

    private void txtBuscadorUnidadesCeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorUnidadesCeroKeyReleased

    }//GEN-LAST:event_txtBuscadorUnidadesCeroKeyReleased

    private void btnBuscarCerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCerosActionPerformed

        try {

            mostrarDetalleUnidadesEnCero(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechafinal.getDate()), txtBuscadorUnidadesCero.getText());

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnBuscarCerosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCapiPorSucursal;
    private javax.swing.JTable TablaCapiPorUnidad;
    private javax.swing.JTable TablaDetallePorUnidad;
    private javax.swing.JTable TablaResumenSucursal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCeros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblTotalCuotaAcumulada;
    private javax.swing.JLabel lblTotalKilometros;
    private javax.swing.JLabel lblTotalNumeroViajes;
    private javax.swing.JLabel lblTotalRegistrosSucursal;
    private javax.swing.JLabel lblTotalRegistrosSucursalGeneral;
    private javax.swing.JLabel lblTotalRegistrosViajes;
    private javax.swing.JTextField txtBuscadorUnidadesCero;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBusquedaAvanzada;
    private javax.swing.JTextField txtCapi;
    private javax.swing.JTextField txtCuota;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private com.toedter.calendar.JDateChooser txtFechafinal;
    private javax.swing.JTextField txtNumeroUnidades;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtVenta;
    private javax.swing.JTextField txtkms;
    // End of variables declaration//GEN-END:variables

}
