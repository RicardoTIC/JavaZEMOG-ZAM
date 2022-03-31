package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajes;
import Vista.Principal;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;

public class frmViajesCancelados extends javax.swing.JInternalFrame {

    //Establecemos el anio mes y dia actual
    SimpleDateFormat mesActual = new SimpleDateFormat("MM");

    //creamos el formato de fecha 
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //establecemos la fecha inicial
    GregorianCalendar fechaInicial = new GregorianCalendar(2022, 0, 1, 12, 59, 59);
    //establecemos la fecha final
    GregorianCalendar fechafinal = new GregorianCalendar();
    //Instanciamos el objeto que conecta la base de datos.
    fViajes func = new fViajes();
    //Intanciamos nuestra clase auxiliar o helpers
    Ayudas help = new Ayudas();

    public frmViajesCancelados() {
        initComponents();
        txtFechaInicio.setDate(fechaInicial.getTime());
        txtFechaFinal.setDate(fechafinal.getTime());
        System.out.println(mesActual);

    }

    /*Metodo que invoca a la logica de buscar viaje*/
    void mostrar(String fechainicio, String fechafinal, String[] buscar) {
        ListaViajesCancelados.setModel(func.showDataCancel(fechainicio, fechafinal, buscar));
        for (int i = 0; i < ListaViajesCancelados.getColumnCount(); i++) {
            help.ordernarColumnas(ListaViajesCancelados, 150, i);
        }
        lbltotalRegistro.setText(String.valueOf(ListaViajesCancelados.getRowCount()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaViajesCancelados = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JTextField();
        txtNumeroViaje = new javax.swing.JTextField();
        txtSucursal = new javax.swing.JTextField();
        txtCodigoArea = new javax.swing.JTextField();
        txtEstatusViaje = new javax.swing.JTextField();
        txtNumeroGuia = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcomentarios = new javax.swing.JTextArea();
        txtCartaPorte = new javax.swing.JTextField();
        txtFechaCancelacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstatusGuia = new javax.swing.JTextField();
        txtFolios = new javax.swing.JTextField();
        txtNombreRuta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtkm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnReactivarViaje = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lbltotalRegistro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();

        setTitle("Listado de viajes cancelados");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viajes Cancelados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaViajesCancelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ListaViajesCancelados.setInheritsPopupMenu(true);
        ListaViajesCancelados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaViajesCancelados);
        add(pane, BorderLayout.CENTER);
        ListaViajesCancelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaViajesCanceladosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaViajesCancelados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 400, 959, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fecha Cita :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 55, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Unidad :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 93, -1, -1));
        jPanel1.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 52, 178, -1));
        jPanel1.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 90, 80, -1));
        jPanel1.add(txtNumeroViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 116, 80, -1));

        txtSucursal.setText(" ");
        jPanel1.add(txtSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 147, 80, -1));
        jPanel1.add(txtCodigoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 173, 80, -1));
        jPanel1.add(txtEstatusViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 204, 80, -1));
        jPanel1.add(txtNumeroGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 52, 165, -1));
        jPanel1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 90, 165, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sucursal:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Numero de viaje :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 119, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Codigo Area :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 176, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Estatus del Viaje :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 207, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Numero de guia :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 55, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Factura :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 93, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estatus Carta Porte :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 119, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Fecha Cancelacion :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Comentarios :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 55, -1, -1));

        txtcomentarios.setColumns(20);
        txtcomentarios.setLineWrap(true);
        txtcomentarios.setRows(4);
        jScrollPane2.setViewportView(txtcomentarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 52, 210, 107));
        jPanel1.add(txtCartaPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 116, 165, -1));
        jPanel1.add(txtFechaCancelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 147, 165, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Estatus Guia :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 176, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Folios :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 207, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Nombre Ruta :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 283, -1, -1));
        jPanel1.add(txtEstatusGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 173, 77, -1));
        jPanel1.add(txtFolios, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 204, 78, -1));
        jPanel1.add(txtNombreRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 280, 313, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Km :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 245, -1, -1));
        jPanel1.add(txtkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 242, 78, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Fecha Inicio :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha final :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 364, -1, -1));
        jPanel1.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 327, 142, -1));
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 358, 141, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Buscar :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, 30));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 355, 206, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 349, -1, -1));

        btnReactivarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_file_download_done_black_24dp.png"))); // NOI18N
        btnReactivarViaje.setText("Reactivar viaje");
        btnReactivarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactivarViajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnReactivarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 349, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Total Registros :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 656, -1, -1));

        lbltotalRegistro.setText("-");
        jPanel1.add(lbltotalRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 656, 112, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 311, 950, 10));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_close_black_24dp.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(133, 33));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 350, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            String[] arregloFolios = txtBuscar.getText().split(" ");

            for (int i = 0; i < arregloFolios.length; i++) {
                mostrar(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), arregloFolios);
            }

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ListaViajesCanceladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaViajesCanceladosMouseClicked
        int fila = ListaViajesCancelados.getSelectedRow();

        try {
            JTextComponent[] cajas = {
                txtFechaCita, txtUnidad, txtNumeroViaje, txtSucursal, txtCodigoArea, txtEstatusViaje, txtNumeroGuia,
                txtFactura, txtCartaPorte, txtFechaCancelacion, txtcomentarios, txtEstatusGuia, txtFolios, txtNombreRuta, txtkm};

            txtFechaCita.setText(ListaViajesCancelados.getValueAt(fila, 0).toString());
            txtUnidad.setText(ListaViajesCancelados.getValueAt(fila, 1).toString());
            txtNumeroViaje.setText(ListaViajesCancelados.getValueAt(fila, 2).toString());
            txtSucursal.setText(ListaViajesCancelados.getValueAt(fila, 3).toString());
            txtCodigoArea.setText(ListaViajesCancelados.getValueAt(fila, 4).toString());
            txtEstatusViaje.setText(ListaViajesCancelados.getValueAt(fila, 5).toString());
            txtNumeroGuia.setText(ListaViajesCancelados.getValueAt(fila, 6).toString());
            txtFactura.setText(ListaViajesCancelados.getValueAt(fila, 7).toString());
            txtCartaPorte.setText(ListaViajesCancelados.getValueAt(fila, 8).toString());
            txtFechaCancelacion.setText(ListaViajesCancelados.getValueAt(fila, 9).toString());
            txtcomentarios.setText(ListaViajesCancelados.getValueAt(fila, 10).toString());
            txtEstatusGuia.setText(ListaViajesCancelados.getValueAt(fila, 11).toString());
            txtFolios.setText(ListaViajesCancelados.getValueAt(fila, 12).toString());
            txtNombreRuta.setText(ListaViajesCancelados.getValueAt(fila, 13).toString());
            txtkm.setText(ListaViajesCancelados.getValueAt(fila, 14).toString());

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_ListaViajesCanceladosMouseClicked

    private void btnReactivarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarViajeActionPerformed
        frmMenuReactivacionViaje frm = new frmMenuReactivacionViaje();

        if (help.mensajeConfirmacion("Deseas Reactivar el viaje ?") == 0) {

            Principal.escritorio.add(frm);
            help.centrarPantalla(Principal.escritorio, frm);

            frm.show(true);
       

        }

    }//GEN-LAST:event_btnReactivarViajeActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaViajesCancelados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReactivarViaje;
    private javax.swing.JButton btnSalir;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbltotalRegistro;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCartaPorte;
    public static javax.swing.JTextField txtCodigoArea;
    private javax.swing.JTextField txtEstatusGuia;
    private javax.swing.JTextField txtEstatusViaje;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFechaCancelacion;
    private javax.swing.JTextField txtFechaCita;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtFolios;
    private javax.swing.JTextField txtNombreRuta;
    public static javax.swing.JTextField txtNumeroGuia;
    public static javax.swing.JTextField txtNumeroViaje;
    private javax.swing.JTextField txtSucursal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextArea txtcomentarios;
    private javax.swing.JTextField txtkm;
    // End of variables declaration//GEN-END:variables
}
