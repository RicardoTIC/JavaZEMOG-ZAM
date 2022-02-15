/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fUnidades;
import Logica.fViajes;
import Modelo.Unidad;
import Reportes.Excel;
import Vista.Principal;
import Vista.frmBuscadorFolios;
import Vista.frmFacturas;
import Vista.frmOperadores;
import Vista.frmRutas;
import Vista.frmUnidades;
import Vista.frmViaticos;
import ds.desktop.notify.DesktopNotify;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Ricardo Herrera
 */
public class frmViajes extends javax.swing.JInternalFrame {

    fViajes func = new fViajes();
    fUnidades uni = new fUnidades();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    GregorianCalendar fechainicial = new GregorianCalendar();
    GregorianCalendar fechafinal = new GregorianCalendar(2022, 0, 1, 12, 59, 59);
    Ayudas help = new Ayudas();
    public static int validacionEnvio = 0;

    public frmViajes() {
        initComponents();
        txtFechaFinal.setDate(fechainicial.getTime());
        txtFechaInicio.setDate(fechafinal.getTime());
        lbltotalRegistros.setText("Total registro : ");
    }

    void mostrar(String buscar) {

        ListaDatos.setModel(func.showdata(buscar));
        tamano_columnas();

    }

    void seleccionar_fial() {
        try {

            int fila = ListaDatos.getSelectedRow();

            txtNumeroViaje.setText(ListaDatos.getValueAt(fila, 0).toString());
            txtCodigoRuta.setText(ListaDatos.getValueAt(fila, 1).toString());
            txtUnidad.setText(ListaDatos.getValueAt(fila, 2).toString());
            txtFechaCita.setText(ListaDatos.getValueAt(fila, 3).toString());
            if (ListaDatos.getValueAt(fila, 26) == null) {
                ListaDatos.setValueAt("Sin fecha programada", fila, 26);
            } else {
                txtFechaProgramada.setText(ListaDatos.getValueAt(fila, 26).toString());
            }

            if (ListaDatos.getValueAt(fila, 4) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 4);
            } else {
                txtRemolque1.setText(ListaDatos.getValueAt(fila, 4).toString());
            }

            if (ListaDatos.getValueAt(fila, 5) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 5);
            } else {
                txtRemolque2.setText(ListaDatos.getValueAt(fila, 5).toString());
            }
            if (ListaDatos.getValueAt(fila, 6) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 6);
            } else {
                txtDolly.setText(ListaDatos.getValueAt(fila, 6).toString());
            }

            txtAsignacion.setText(ListaDatos.getValueAt(fila, 7).toString());

            txtNombreRuta.setText(ListaDatos.getValueAt(fila, 8).toString());
            lblOrigen.setText("Origen : " + ListaDatos.getValueAt(fila, 9).toString());
            lblDestino.setText("Destino : " + ListaDatos.getValueAt(fila, 10).toString());
            lblCiudadOrigen.setText("Ciudad Origen : " + ListaDatos.getValueAt(fila, 11).toString());
            lbCiudadlDestino1.setText("Ciudad Destino : " + ListaDatos.getValueAt(fila, 12).toString());

            txtNombreCorto.setText(ListaDatos.getValueAt(fila, 13).toString());
            txtKilometros.setText(ListaDatos.getValueAt(fila, 14).toString());
            txtfolio.setText(ListaDatos.getValueAt(fila, 15).toString());
            txtNumeroGuia.setText(ListaDatos.getValueAt(fila, 16).toString());
            txtFlete.setText(ListaDatos.getValueAt(fila, 17).toString());
            txtventa.setText(ListaDatos.getValueAt(fila, 18).toString());
            if (ListaDatos.getValueAt(fila, 17) == null) {
                ListaDatos.setValueAt("", fila, 17);
            }
            txtExpedicion.setText(ListaDatos.getValueAt(fila, 19).toString());
            txtOperador.setText(ListaDatos.getValueAt(fila, 20).toString());
            txtDireccion.setText(ListaDatos.getValueAt(fila, 25).toString());
            txtNumeroGuias.setText(ListaDatos.getValueAt(fila, 27).toString());
            txtOperacion.setText(ListaDatos.getValueAt(fila, 29).toString());
            txtEstatus.setText(ListaDatos.getValueAt(fila, 30).toString());
            txtUsuarioAlta.setText(ListaDatos.getValueAt(fila, 31).toString());
            txtTipoCobro.setText(ListaDatos.getValueAt(fila, 33).toString());
            txtFactura.setText(ListaDatos.getValueAt(fila, 34).toString());

            if (txtEstatusFactura.getText().equalsIgnoreCase("facturado")) {
                txtEstatusFactura.setBackground(Color.GREEN);
            } else {
                txtEstatusFactura.setBackground(Color.RED);
            }

            txtEstatusFactura.setText(ListaDatos.getValueAt(fila, 35).toString());

            if (ListaDatos.getValueAt(fila, 21) == null) {
                ListaDatos.setValueAt("Sin viatico", fila, 21);
            } else {
                txtViatico.setText(ListaDatos.getValueAt(fila, 21).toString());
            }

            txtHoras.setText(ListaDatos.getValueAt(fila, 36).toString());

        } catch (Exception e) {
            help.mensaje("Error en evento clic " + e.getMessage(), "error");
        }

    }

    void mostarDetalladoFechasBuscardor(String fechainicio, String fechafinal, String buscar) {

        ListaDatos.setModel(func.showdataFordate(fechainicio, fechafinal, buscar));

        if (ListaDatos.getValueAt(0, 13).equals(buscar)) {

            ListaDatos.changeSelection(0, 13, false, false);
            seleccionar_fial();

        }

        lbltotalRegistros.setText("Total registros " + String.valueOf(func.totalRegistros));
        tamano_columnas();
    }

    void mostrarPorFechas(String fechainicio, String fechafinal) {

        ListaDatos.setModel(func.showdataFordate(fechainicio, fechafinal));
        lbltotalRegistros.setText("Total registros " + String.valueOf(func.totalRegistros));
        tamano_columnas();
    }

    void tamano_columnas() {
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();

        Alinear.setHorizontalAlignment(SwingConstants.CENTER);

        //Numero de viaje
        ListaDatos.getColumnModel().getColumn(0).setMaxWidth(150);
        ListaDatos.getColumnModel().getColumn(0).setMinWidth(150);
        ListaDatos.getColumnModel().getColumn(0).setPreferredWidth(150);

        ListaDatos.getColumnModel().getColumn(0).setCellRenderer(Alinear);

        //Unidad
        ListaDatos.getColumnModel().getColumn(1).setCellRenderer(Alinear);
        ListaDatos.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        ListaDatos.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        ListaDatos.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        ListaDatos.getColumnModel().getColumn(7).setCellRenderer(Alinear);

        //Fecha Cita
        ListaDatos.getColumnModel().getColumn(3).setMaxWidth(250);
        ListaDatos.getColumnModel().getColumn(3).setMinWidth(250);
        ListaDatos.getColumnModel().getColumn(3).setPreferredWidth(250);

        ListaDatos.getColumnModel().getColumn(3).setCellRenderer(Alinear);

        ListaDatos.getColumnModel().getColumn(4).setMaxWidth(250);
        ListaDatos.getColumnModel().getColumn(4).setMinWidth(250);
        ListaDatos.getColumnModel().getColumn(4).setPreferredWidth(250);

        ListaDatos.getColumnModel().getColumn(4).setCellRenderer(Alinear);

        //Nombre de la ruta
        ListaDatos.getColumnModel().getColumn(9).setMaxWidth(350);
        ListaDatos.getColumnModel().getColumn(9).setMinWidth(350);
        ListaDatos.getColumnModel().getColumn(9).setPreferredWidth(350);

        ListaDatos.getColumnModel().getColumn(9).setCellRenderer(Alinear);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaProgramada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRemolque1 = new javax.swing.JTextField();
        txtRemolque2 = new javax.swing.JTextField();
        txtDolly = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAsignacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreRuta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtViatico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreCorto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtKilometros = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumeroGuia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFlete = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtventa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtExpedicion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        btnUnidades = new javax.swing.JButton();
        lblIDOperadores = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNumeroViaje = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCodigoRuta = new javax.swing.JTextField();
        idrutas = new javax.swing.JLabel();
        btnViaticos = new javax.swing.JButton();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblCiudadOrigen = new javax.swing.JLabel();
        lbCiudadlDestino1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNumeroGuias = new javax.swing.JTextField();
        txtOperacion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEstatus = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtUsuarioAlta = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTipoCobro = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtEstatusFactura = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        lblEstatusGuia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lbltotalRegistros = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnActualizarUnidad = new javax.swing.JButton();
        btnCancelacionViaje = new javax.swing.JButton();
        btnFacturaCancelada = new javax.swing.JButton();
        btnModificarOperador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDatos = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Viajes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unidad :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 59, -1, -1));
        jPanel1.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 57, 108, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha Cita :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));
        jPanel1.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 85, 243, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de captura :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 110, -1, -1));
        jPanel1.add(txtFechaProgramada, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 108, 243, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Remolque 1:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 132, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Remolque 2 :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Dolly :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 182, -1, -1));

        txtRemolque1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemolque1MouseClicked(evt);
            }
        });
        jPanel1.add(txtRemolque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 130, 243, -1));

        txtRemolque2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemolque2MouseClicked(evt);
            }
        });
        jPanel1.add(txtRemolque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 156, 243, -1));

        txtDolly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDollyMouseClicked(evt);
            }
        });
        jPanel1.add(txtDolly, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 180, 243, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("idAsignacion :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 30, -1, -1));
        jPanel1.add(txtAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 28, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre Ruta :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, -1, -1));

        txtNombreRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreRutaMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombreRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 210, 310, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Total viatico :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));
        jPanel1.add(txtViatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 57, 130, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nombre corto :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 87, -1, -1));

        txtNombreCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCortoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 85, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Kilometros :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 110, -1, -1));
        jPanel1.add(txtKilometros, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 108, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Folio :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 136, -1, -1));
        jPanel1.add(txtfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 134, 197, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Numero Guia :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));
        jPanel1.add(txtNumeroGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 197, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("flete :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));
        jPanel1.add(txtFlete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 197, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Venta :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 20));
        jPanel1.add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 197, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Expedicion :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));
        jPanel1.add(txtExpedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 197, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Horas Transcurridos :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 140, -1));

        txtOperador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOperadorMouseClicked(evt);
            }
        });
        jPanel1.add(txtOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 197, -1));

        btnUnidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUnidades.setText("Buscar Eco");
        btnUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 56, -1, -1));

        lblIDOperadores.setText("idOperador");
        jPanel1.add(lblIDOperadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Numero de viaje :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));
        jPanel1.add(txtNumeroViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 28, 76, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Codigo Ruta :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 30, -1, -1));
        jPanel1.add(txtCodigoRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 28, 76, -1));

        idrutas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idrutas.setText("idRuta");
        jPanel1.add(idrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 231, -1, -1));

        btnViaticos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViaticos.setText("Mostrar Viaticos");
        btnViaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViaticosActionPerformed(evt);
            }
        });
        jPanel1.add(btnViaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        lblOrigen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrigen.setText("Origen :");
        jPanel1.add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 252, -1, -1));

        lblDestino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDestino.setText("Destino :");
        jPanel1.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        lblCiudadOrigen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCiudadOrigen.setText("Origen :");
        jPanel1.add(lblCiudadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lbCiudadlDestino1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCiudadlDestino1.setText("Destino :");
        jPanel1.add(lbCiudadlDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Nombre Operador :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Numero de guia :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 180, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Direccion :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));
        jPanel1.add(txtNumeroGuias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 180, -1));
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 180, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Operacion :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, -1));
        jPanel1.add(txtEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 180, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Estatus :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, 60, -1));
        jPanel1.add(txtUsuarioAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 180, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Usuario Alta :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 90, -1));
        jPanel1.add(txtTipoCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 180, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Tipo Cobro :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 90, -1));
        jPanel1.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 180, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Factura :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 70, -1));
        jPanel1.add(txtEstatusFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 180, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Estatus factura :");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 110, -1));
        jPanel1.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 180, -1));

        lblEstatusGuia.setText("-");
        jPanel1.add(lblEstatusGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 130, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Buscar :");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanel2.add(txtBuscar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(txtFechaFinal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(txtFechaInicio, gridBagConstraints);

        jLabel2.setText("Fecha Inicio :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Fecha final :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanel2.add(btnConsultar, gridBagConstraints);

        lbltotalRegistros.setText("total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(lbltotalRegistros, gridBagConstraints);

        btnExcel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnExcel.setText("Excel Viajes");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcel, new java.awt.GridBagConstraints());

        btnLiberar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnLiberar.setText("Liberacion Carta Porte");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLiberar, new java.awt.GridBagConstraints());

        btnActualizarUnidad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnActualizarUnidad.setText("Actualizar Unidad");
        btnActualizarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUnidadActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizarUnidad, new java.awt.GridBagConstraints());

        btnCancelacionViaje.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCancelacionViaje.setText("Cancelacion de viaje");
        btnCancelacionViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacionViajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelacionViaje, new java.awt.GridBagConstraints());

        btnFacturaCancelada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnFacturaCancelada.setText("Factura Cancelada");
        btnFacturaCancelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaCanceladaActionPerformed(evt);
            }
        });
        jPanel2.add(btnFacturaCancelada, new java.awt.GridBagConstraints());

        btnModificarOperador.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnModificarOperador.setText("Modificar Operadores");
        btnModificarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOperadorActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificarOperador, new java.awt.GridBagConstraints());

        ListaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaDatos);
        add(pane, BorderLayout.CENTER);
        ListaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDatosMouseClicked(evt);
            }
        });
        ListaDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ListaDatosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ListaDatos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 77;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {

                String fechainicial = formatoFecha.format(txtFechaInicio.getDate());
                String fechafinal = formatoFecha.format(txtFechaFinal.getDate());
                String buscar = txtBuscar.getText().trim();
                mostarDetalladoFechasBuscardor(fechainicial, fechafinal, buscar);
                func.totalRegistros = 0;
            } catch (Exception e) {
                System.out.println("Error en keyEvent-  Enter");
            }

        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        try {
            String fechainicial = formatoFecha.format(txtFechaInicio.getDate());
            String fechafinal = formatoFecha.format(txtFechaFinal.getDate());
            String buscar = txtBuscar.getText().trim();

            func.totalRegistros = 0;

            mostarDetalladoFechasBuscardor(fechainicial, fechafinal, buscar);

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void ListaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDatosMouseClicked

        try {

            int fila = ListaDatos.rowAtPoint(evt.getPoint());

            txtNumeroViaje.setText(ListaDatos.getValueAt(fila, 0).toString());
            txtCodigoRuta.setText(ListaDatos.getValueAt(fila, 1).toString());
            txtUnidad.setText(ListaDatos.getValueAt(fila, 2).toString());
            txtFechaCita.setText(ListaDatos.getValueAt(fila, 3).toString());
            if (ListaDatos.getValueAt(fila, 26) == null) {
                ListaDatos.setValueAt("Sin fecha programada", fila, 26);
            } else {
                txtFechaProgramada.setText(ListaDatos.getValueAt(fila, 26).toString());
            }

            if (ListaDatos.getValueAt(fila, 4) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 4);
            } else {
                txtRemolque1.setText(ListaDatos.getValueAt(fila, 4).toString());
            }

            if (ListaDatos.getValueAt(fila, 5) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 5);
            } else {
                txtRemolque2.setText(ListaDatos.getValueAt(fila, 5).toString());
            }
            if (ListaDatos.getValueAt(fila, 6) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 6);
            } else {
                txtDolly.setText(ListaDatos.getValueAt(fila, 6).toString());
            }

            txtAsignacion.setText(ListaDatos.getValueAt(fila, 7).toString());

            txtNombreRuta.setText(ListaDatos.getValueAt(fila, 8).toString());
            lblOrigen.setText("Origen : " + ListaDatos.getValueAt(fila, 9).toString());
            lblDestino.setText("Destino : " + ListaDatos.getValueAt(fila, 10).toString());
            lblCiudadOrigen.setText("Ciudad Origen : " + ListaDatos.getValueAt(fila, 11).toString());
            lbCiudadlDestino1.setText("Ciudad Destino : " + ListaDatos.getValueAt(fila, 12).toString());

            txtNombreCorto.setText(ListaDatos.getValueAt(fila, 13).toString());
            txtKilometros.setText(ListaDatos.getValueAt(fila, 14).toString());
            txtfolio.setText(ListaDatos.getValueAt(fila, 15).toString());
            txtNumeroGuia.setText(ListaDatos.getValueAt(fila, 16).toString());
            txtFlete.setText(ListaDatos.getValueAt(fila, 17).toString());
            txtventa.setText(ListaDatos.getValueAt(fila, 18).toString());
            if (ListaDatos.getValueAt(fila, 17) == null) {
                ListaDatos.setValueAt("", fila, 17);
            }
            txtExpedicion.setText(ListaDatos.getValueAt(fila, 19).toString());
            txtOperador.setText(ListaDatos.getValueAt(fila, 20).toString());
            txtDireccion.setText(ListaDatos.getValueAt(fila, 25).toString());
            txtNumeroGuias.setText(ListaDatos.getValueAt(fila, 27).toString());
            txtOperacion.setText(ListaDatos.getValueAt(fila, 29).toString());
            txtEstatus.setText(ListaDatos.getValueAt(fila, 30).toString());
            txtUsuarioAlta.setText(ListaDatos.getValueAt(fila, 31).toString());
            txtTipoCobro.setText(ListaDatos.getValueAt(fila, 33).toString());
            txtFactura.setText(ListaDatos.getValueAt(fila, 34).toString());

            if (txtEstatusFactura.getText().equalsIgnoreCase("facturado")) {
                txtEstatusFactura.setBackground(Color.GREEN);
            } else {
                txtEstatusFactura.setBackground(Color.RED);
            }

            txtEstatusFactura.setText(ListaDatos.getValueAt(fila, 35).toString());

            if (ListaDatos.getValueAt(fila, 21) == null) {
                ListaDatos.setValueAt("Sin viatico", fila, 21);
            } else {
                txtViatico.setText(ListaDatos.getValueAt(fila, 21).toString());
            }

            txtHoras.setText(ListaDatos.getValueAt(fila, 36).toString());
            lblEstatusGuia.setText(ListaDatos.getValueAt(fila, 37).toString());

        } catch (Exception e) {
            help.mensaje("Error en evento clic " + e.getMessage(), "error");
        }


    }//GEN-LAST:event_ListaDatosMouseClicked

    private void ListaDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ListaDatosKeyPressed
        try {

            int fila = ListaDatos.getSelectedRow();

            txtNumeroViaje.setText(ListaDatos.getValueAt(fila, 0).toString());
            txtCodigoRuta.setText(ListaDatos.getValueAt(fila, 1).toString());
            txtUnidad.setText(ListaDatos.getValueAt(fila, 2).toString());
            txtFechaCita.setText(ListaDatos.getValueAt(fila, 3).toString());
            if (ListaDatos.getValueAt(fila, 26) == null) {
                ListaDatos.setValueAt("Sin fecha programada", fila, 26);
            } else {
                txtFechaProgramada.setText(ListaDatos.getValueAt(fila, 26).toString());
            }

            if (ListaDatos.getValueAt(fila, 4) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 4);
            } else {
                txtRemolque1.setText(ListaDatos.getValueAt(fila, 4).toString());
            }

            if (ListaDatos.getValueAt(fila, 5) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 5);
            } else {
                txtRemolque2.setText(ListaDatos.getValueAt(fila, 5).toString());
            }
            if (ListaDatos.getValueAt(fila, 6) == null) {
                ListaDatos.setValueAt("Sin datos", fila, 6);
            } else {
                txtDolly.setText(ListaDatos.getValueAt(fila, 6).toString());
            }

            txtAsignacion.setText(ListaDatos.getValueAt(fila, 7).toString());

            txtNombreRuta.setText(ListaDatos.getValueAt(fila, 8).toString());
            lblOrigen.setText("Origen : " + ListaDatos.getValueAt(fila, 9).toString());
            lblDestino.setText("Destino : " + ListaDatos.getValueAt(fila, 10).toString());
            lblCiudadOrigen.setText("Ciudad Origen : " + ListaDatos.getValueAt(fila, 11).toString());
            lbCiudadlDestino1.setText("Ciudad Destino : " + ListaDatos.getValueAt(fila, 12).toString());

            txtNombreCorto.setText(ListaDatos.getValueAt(fila, 13).toString());
            txtKilometros.setText(ListaDatos.getValueAt(fila, 14).toString());
            txtfolio.setText(ListaDatos.getValueAt(fila, 15).toString());
            txtNumeroGuia.setText(ListaDatos.getValueAt(fila, 16).toString());
            txtFlete.setText(ListaDatos.getValueAt(fila, 17).toString());
            txtventa.setText(ListaDatos.getValueAt(fila, 18).toString());
            if (ListaDatos.getValueAt(fila, 17) == null) {
                ListaDatos.setValueAt("", fila, 17);
            }
            txtExpedicion.setText(ListaDatos.getValueAt(fila, 19).toString());
            txtOperador.setText(ListaDatos.getValueAt(fila, 20).toString());
            txtDireccion.setText(ListaDatos.getValueAt(fila, 25).toString());
            txtNumeroGuias.setText(ListaDatos.getValueAt(fila, 27).toString());
            txtOperacion.setText(ListaDatos.getValueAt(fila, 29).toString());
            txtEstatus.setText(ListaDatos.getValueAt(fila, 30).toString());
            txtUsuarioAlta.setText(ListaDatos.getValueAt(fila, 31).toString());
            txtTipoCobro.setText(ListaDatos.getValueAt(fila, 33).toString());
            txtFactura.setText(ListaDatos.getValueAt(fila, 34).toString());

            if (txtEstatusFactura.getText().equalsIgnoreCase("facturado")) {
                txtEstatusFactura.setBackground(Color.GREEN);
            } else {
                txtEstatusFactura.setBackground(Color.RED);
            }

            txtEstatusFactura.setText(ListaDatos.getValueAt(fila, 35).toString());

            if (ListaDatos.getValueAt(fila, 21) == null) {
                ListaDatos.setValueAt("Sin viatico", fila, 21);
            } else {
                txtViatico.setText(ListaDatos.getValueAt(fila, 21).toString());
            }

            txtHoras.setText(ListaDatos.getValueAt(fila, 36).toString());

        } catch (Exception e) {
            help.mensaje("Error en evento clic " + e.getMessage(), "error");
        }

    }//GEN-LAST:event_ListaDatosKeyPressed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked

        if (evt.getClickCount() == 2) {
            txtBuscar.setText("");
        }

    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

        // mostarDetalladoFechasBuscardor("","",txtBuscar.getText());
        String fechainicial = formatoFecha.format(txtFechaInicio.getDate());
        String fechafinal = formatoFecha.format(txtFechaFinal.getDate());
        String buscar = txtBuscar.getText().trim();


    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (evt.getClickCount() == 2) {

            frmBuscadorFolios frm = new frmBuscadorFolios();
            Principal.escritorio.add(frm);
            help.centrarPantalla(Principal.escritorio, frm);
            frm.show();

        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed

        try {
            Excel ejecucion1 = new Excel();
            ejecucion1.setFechainiciales(formatoFecha.format(txtFechaInicio.getDate()));

            ejecucion1.setFechafinales(formatoFecha.format(txtFechaFinal.getDate()));
            ejecucion1.setBuscar(txtBuscar.getText().trim());

            ejecucion1.start();

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnViaticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViaticosActionPerformed
        frmViaticos viatico = new frmViaticos();
        Principal.escritorio.add(viatico);
        help.centrarPantalla(Principal.escritorio, viatico);
        viatico.show();
    }//GEN-LAST:event_btnViaticosActionPerformed

    private void btnUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesActionPerformed
        frmUnidades unidades = new frmUnidades();

        Principal.escritorio.add(unidades);

        help.centrarPantalla(Principal.escritorio, unidades);

        unidades.show();
        validacionEnvio = 1;
    }//GEN-LAST:event_btnUnidadesActionPerformed

    private void txtOperadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOperadorMouseClicked

        if (evt.getClickCount() == 2) {

            frmOperadores operadores = new frmOperadores();
            Principal.escritorio.add(operadores);
            help.centrarPantalla(Principal.escritorio, operadores);
            operadores.show();

            validacionEnvio = 2;

        }
    }//GEN-LAST:event_txtOperadorMouseClicked

    private void txtNombreCortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCortoActionPerformed

    private void txtNombreRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreRutaMouseClicked

        if (evt.getClickCount() == 2) {
            frmRutas rutas = new frmRutas();

            Principal.escritorio.add(rutas);

            help.centrarPantalla(Principal.escritorio, rutas);

            rutas.show();

        }
    }//GEN-LAST:event_txtNombreRutaMouseClicked

    private void txtDollyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDollyMouseClicked
        if (evt.getClickCount() == 2) {

            frmUnidades unidades = new frmUnidades();
            Principal.escritorio.add(unidades);
            help.centrarPantalla(Principal.escritorio, unidades);
            unidades.show();

            validacionEnvio = 4;
        }
    }//GEN-LAST:event_txtDollyMouseClicked

    private void txtRemolque2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemolque2MouseClicked

        if (evt.getClickCount() == 2) {

            frmUnidades unidades = new frmUnidades();
            Principal.escritorio.add(unidades);
            help.centrarPantalla(Principal.escritorio, unidades);
            unidades.show();

            validacionEnvio = 3;
        }
    }//GEN-LAST:event_txtRemolque2MouseClicked

    private void txtRemolque1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemolque1MouseClicked

        if (evt.getClickCount() == 2) {
            frmUnidades unidades = new frmUnidades();
            Principal.escritorio.add(unidades);
            help.centrarPantalla(Principal.escritorio, unidades);
            unidades.show();

            validacionEnvio = 2;
        }
    }//GEN-LAST:event_txtRemolque1MouseClicked

    private void btnFacturaCanceladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaCanceladaActionPerformed
        frmFacturas facturas = new frmFacturas();
        Principal.escritorio.add(facturas);
        help.centrarPantalla(Principal.escritorio, facturas);
        facturas.show();
    }//GEN-LAST:event_btnFacturaCanceladaActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed

        frmLiberacionFactura liberacion = new frmLiberacionFactura();
        Principal.escritorio.add(liberacion);
        help.centrarPantalla(Principal.escritorio, liberacion);
        liberacion.show();

        
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnCancelacionViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelacionViajeActionPerformed
        frmCancelacionDeviaje cancelacion = new frmCancelacionDeviaje();
        Principal.escritorio.add(cancelacion);
        help.centrarPantalla(Principal.escritorio, cancelacion);
        cancelacion.show();
    }//GEN-LAST:event_btnCancelacionViajeActionPerformed

    private void btnActualizarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUnidadActionPerformed

        Unidad unidades = new Unidad();

        if (txtNumeroViaje.getText().length() == 0) {
            help.mensaje("Ingresa un numero de viaje", "informativo");
            return;
        }

        if (txtCodigoRuta.getText().length() == 0) {
            help.mensaje("Ingresa un codigo de area", "informativo");
            return;
        }

        if (txtUnidad.getText().length() == 0) {
            help.mensaje("Ingresa un numero economico", "informativo");
            return;
        }

        unidades.setId_unidad(txtUnidad.getText());
        unidades.setCodigoArea(Integer.parseInt(txtCodigoRuta.getText()));
        unidades.setNumeroViaje(Integer.parseInt(txtNumeroViaje.getText()));
        
        if (help.mensajeConfirmacion("Deseas actualizar el registros " + txtUnidad.getText()) != 1) {
            
            help.mensajeLateral("Datos", "Unidad " + unidades.getId_unidad() + " Codigo Area " + unidades.getCodigoArea() + " Numero de viaje " + unidades.getNumeroViaje(), "pregunta");

        if (uni.actualizarUnidad(unidades)) {
            help.mensajeLateral("Actualizado", "Se actualizado correctamente el registro", "aceptado");
            mostrar(txtBuscar.getText());
        } else {
            help.mensajeLateral("Error", "No se puedo actualizar el registro correctamente", "fallo");
        }
        
        }
        



    }//GEN-LAST:event_btnActualizarUnidadActionPerformed

    private void btnModificarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOperadorActionPerformed
       
        
        
    }//GEN-LAST:event_btnModificarOperadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaDatos;
    private javax.swing.JButton btnActualizarUnidad;
    private javax.swing.JButton btnCancelacionViaje;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFacturaCancelada;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnModificarOperador;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JButton btnViaticos;
    public static javax.swing.JLabel idrutas;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCiudadlDestino1;
    private javax.swing.JLabel lblCiudadOrigen;
    private javax.swing.JLabel lblDestino;
    public static javax.swing.JLabel lblEstatusGuia;
    public static javax.swing.JLabel lblIDOperadores;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lbltotalRegistros;
    private javax.swing.JTextField txtAsignacion;
    public static javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCodigoRuta;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtDolly;
    private javax.swing.JTextField txtEstatus;
    public static javax.swing.JTextField txtEstatusFactura;
    private javax.swing.JTextField txtExpedicion;
    public static javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFechaCita;
    public static com.toedter.calendar.JDateChooser txtFechaFinal;
    public static com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtFechaProgramada;
    private javax.swing.JTextField txtFlete;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtKilometros;
    public static javax.swing.JTextField txtNombreCorto;
    public static javax.swing.JTextField txtNombreRuta;
    public static javax.swing.JTextField txtNumeroGuia;
    private javax.swing.JTextField txtNumeroGuias;
    public static javax.swing.JTextField txtNumeroViaje;
    private javax.swing.JTextField txtOperacion;
    public static javax.swing.JTextField txtOperador;
    public static javax.swing.JTextField txtRemolque1;
    public static javax.swing.JTextField txtRemolque2;
    private javax.swing.JTextField txtTipoCobro;
    public static javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtUsuarioAlta;
    public static javax.swing.JTextField txtViatico;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
