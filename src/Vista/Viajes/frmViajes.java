package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fOperadores;
import Logica.fUnidades;
import Logica.fViajes;
import Modelo.Operador;
import Modelo.Ruta;
import Modelo.Unidad;
import Reportes.BarraProgresoHilo;
import Reportes.ConsultarViajes;
import Reportes.Excel;
import Reportes.Reloj;
import Vista.Login.IniciarSesion;

import Vista.Principal;
import Vista.frmBuscadorFolios;
import Vista.frmFacturas;
import Vista.Operadores.frmOperadores;
import Vista.Rutas.frmRutas;
import Vista.frmUnidades;
import Vista.frmViaticos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TimerTask;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class frmViajes extends javax.swing.JInternalFrame {

    fViajes func = new fViajes();
    fUnidades uni = new fUnidades();
    fOperadores ope = new fOperadores();
    DefaultListModel modeloFolios = new DefaultListModel();
    String[] columnas = {"Folio", "Numero de viaje", "Area", "Numero guia"};
    DefaultTableModel modeloTabla = new DefaultTableModel(null, columnas);
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    GregorianCalendar fechainicial = new GregorianCalendar();
    GregorianCalendar fechafinal = new GregorianCalendar(2022, 0, 1, 12, 59, 59);
    Ayudas help = new Ayudas();
    public static int validacionEnvio = 0;
    public static boolean validacionformulario = false;
    frmBarraProgreso progreso = new frmBarraProgreso();
    TimerTask tiempo = new Reloj();
    JScrollPane scroll = new JScrollPane();
    String[] arregloUnidades;

    public frmViajes() {

        initComponents();

        txtFechaFinal.setDate(fechainicial.getTime());
        txtFechaInicio.setDate(fechafinal.getTime());
        lbltotalRegistros.setText("Total registro : ");
        lblDestino.setEnabled(false);

        java.util.Timer timer = new java.util.Timer();
        timer.schedule(tiempo, 0, 1000);
        inhabilitar_cajas_busqueda_avazanda(false);
        btnSeguimientoFacturas.setEnabled(false);

    }

    void Buscar_Operador_Inactivo() {

        try {
            Operador op = ope.buscar_informacion_operador(txtOperador.getText());

            if (op.getEstado().equalsIgnoreCase("Inactivo")) {

                lblEstadoOperador.setOpaque(true);
                lblEstadoOperador.setHorizontalAlignment(SwingConstants.CENTER);
                /// Tipo de letra , font.bold, size
                lblEstadoOperador.setFont(new Font("Arial", Font.BOLD, 11));
                lblEstadoOperador.setBackground(Color.decode("#ecf0f1")); /// permite hexadecimales
                lblEstadoOperador.setToolTipText("Fecha de baja " + op.getFecha_baja());
                lblEstadoOperador.setForeground(Color.red);
                lblEstadoOperador.setText(op.getEstado());
            } else {
                lblEstadoOperador.setHorizontalAlignment(SwingConstants.CENTER);
                lblEncontrado.setToolTipText("Sin fecha de baja");
                lblEstadoOperador.setOpaque(true);
                lblEstadoOperador.setBackground(Color.decode("#ecf0f1"));
                lblEstadoOperador.setText(op.getEstado());
                lblEstadoOperador.setForeground(Color.black);
            }
        } catch (Exception e) {
            help.mensaje("Error " + ope.buscar_estatus_operador(txtOperacion.getText()), "Error");
        }

    }

    void tamano_imagen(JButton btn, String nombreImagen) {
        try {

            ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/" + nombreImagen));

            btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH)));

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }

    }

    void inhabilitar_cajas_busqueda_avazanda(boolean activacion) {

        lblCodigoArea.setVisible(activacion);
        lblNumeroViaje.setVisible(activacion);
        txtCodigoArea.setVisible(activacion);
        txtCodigoViaje.setVisible(activacion);
        btnConsultarViajesAvanzados.setVisible(activacion);
    }

    void mostrar(String buscar) {

        try {
            ListaDatos.setModel(func.showdata(buscar));
            tamano_columnas();
            if (ListaDatos.getRowCount() == 0) {
                if (help.mensajeConfirmacion("No se encontro ningun registro deseas buscar en viajes cancelados ? ") == 0) {

                    frmViajesCancelados frm = new frmViajesCancelados();
                    help.centrarPantalla(Principal.escritorio, frm);
                    Principal.escritorio.add(frm);
                    frm.show();

                }
            }

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }

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
            lbl1.setText("Ciudad Origen : " + ListaDatos.getValueAt(fila, 11).toString());
            lbCiudadlDestino2.setText("Ciudad Destino : " + ListaDatos.getValueAt(fila, 12).toString());

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

    public void mostarDetalladoFechasBuscardor(String fechainicio, String fechafinal, String[] buscar) {
        String valor_Comparativo = "";
        ListaDatos.setModel(func.showdataFordate(fechainicio, fechafinal, buscar));
        //tamano_columnas();
        func.totalRegistros = 0;
        if (ListaDatos.getRowCount() == 0) {
            if (help.mensajeConfirmacion("No se encontro ningun registro deseas buscar en viajes cancelados ? ") == 0) {

                frmViajesCancelados frm = new frmViajesCancelados();
                help.centrarPantalla(Principal.escritorio, frm);
                Principal.escritorio.add(frm);
                frm.show();

            }
        }
        ListaDatos.changeSelection(0, 1, false, false);
        seleccionar_fial();

        lbltotalRegistros.setText("Total registros " + String.valueOf(func.totalRegistros));
        //tamano_columnas();
    }

    void mostrarPorFechas(String fechainicio, String[] fechafinal) {
        // ListaDatos.setModel(func.showdataFordate(fechainicio, fechafinal));
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

    void inhabilitarBotones() {
        JButton[] arregloBotones = {
            btnViajesCancelados,
            btnLiberar,
            btnExcel,
            btnActualizarUnidad,
            btnCambioRuta,
            btnViaticos,
            btnCancelacionViaje,
            btnInsertarPendientes,
            btnModificarOperador,
            btnFacturaCancelada,
            btnSeguimientoFacturas,
            btnBuscarCartaCobro

        };

        for (int i = 0; i < arregloBotones.length; i++) {
            arregloBotones[i].setEnabled(false);
        }

    }

    void habilitarBotones() {
        JButton[] arregloBotones = {
            btnViajesCancelados,
            btnLiberar,
            btnExcel,
            btnActualizarUnidad,
            btnCambioRuta,
            btnViaticos,
            btnCancelacionViaje,
            btnInsertarPendientes,
            btnModificarOperador,
            btnFacturaCancelada,
            btnSeguimientoFacturas,
            btnBuscarCartaCobro

        };

        for (int i = 0; i < arregloBotones.length; i++) {
            arregloBotones[i].setEnabled(true);
        }

    }

    void validacion_estatus() {

        if (txtEstatus.getText().equalsIgnoreCase("Transito") || lblEstatusGuia.getText().equalsIgnoreCase("Transito")) {
            lblError.setOpaque(true);
            lblError.setForeground(Color.red);
            lblError.setText("Debes de finalizar el viaje para poder realizar alguna modificacion");
            inhabilitarBotones();

        } else {

            lblError.setForeground(Color.white);
            lblError.setText("");
            habilitarBotones();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Mensaje = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNumeroGuias = new javax.swing.JTextField();
        txtOperacion = new javax.swing.JTextField();
        txtEstatus = new javax.swing.JTextField();
        txtEstatusFactura = new javax.swing.JTextField();
        txtUsuarioAlta = new javax.swing.JTextField();
        txtNumeroPedido = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtTipoCobro = new javax.swing.JTextField();
        txtFactura = new javax.swing.JTextField();
        txtAsignacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtViatico = new javax.swing.JTextField();
        txtNombreCorto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtKilometros = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumeroGuia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFlete = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtventa = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtExpedicion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblIDOperadores = new javax.swing.JLabel();
        txtCodigoRuta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNumeroViaje = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnUnidades = new javax.swing.JButton();
        txtUnidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaProgramada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRemolque1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRemolque2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDolly = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreRuta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        idrutas = new javax.swing.JLabel();
        lblCiudadOrigen = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbCiudadlDestino1 = new javax.swing.JTextField();
        lbCiudadlDestino2 = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        PanelLista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lbltotalRegistros = new javax.swing.JLabel();
        NumeroRegistrosPegados = new javax.swing.JLabel();
        lblEncontrado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaDatos = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        CheckAvanzado = new javax.swing.JCheckBox();
        lblError = new javax.swing.JLabel();
        barraMovimiento = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnFacturaCancelada = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaFolio = new javax.swing.JTable();
        btnExcel = new javax.swing.JButton();
        btnCambioRuta = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnModificarOperador = new javax.swing.JButton();
        btnInsertarPendientes = new javax.swing.JButton();
        btnSeguimientoFacturas = new javax.swing.JButton();
        btnCancelacionViaje = new javax.swing.JButton();
        btnActualizarUnidad = new javax.swing.JButton();
        btnViajesCancelados = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        btnConsultarViajesAvanzados = new javax.swing.JButton();
        txtCodigoViaje = new javax.swing.JTextField();
        lblNumeroViaje = new javax.swing.JLabel();
        txtCodigoArea = new javax.swing.JTextField();
        lblCodigoArea = new javax.swing.JLabel();
        btnBuscarCartaCobro = new javax.swing.JButton();
        btnViaticos = new javax.swing.JButton();
        lblEstatusGuia = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblModalidad = new javax.swing.JLabel();
        lblEstadoOperador = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        Mensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MensajeMouseClicked(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Viajes");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de viajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Direccion :");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 33, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Numero de guia :");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 69, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Operacion :");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 97, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Estatus :");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 128, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Estatus factura :");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 166, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Tipo Cobro :");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 197, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Factura :");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 228, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Horas Transcurridos :");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(959, 254, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Usuario Alta :");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1006, 286, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Numero de pedido :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 314, 122, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 31, 180, -1));
        jPanel3.add(txtNumeroGuias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 64, 180, -1));
        jPanel3.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 95, 180, -1));
        jPanel3.add(txtEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 126, 180, -1));
        jPanel3.add(txtEstatusFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 164, 180, -1));
        jPanel3.add(txtUsuarioAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 252, 180, -1));
        jPanel3.add(txtNumeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 312, 180, -1));
        jPanel3.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 284, 180, -1));
        jPanel3.add(txtTipoCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 195, 180, -1));
        jPanel3.add(txtFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 226, 180, -1));
        jPanel3.add(txtAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 292, 197, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("idAsignacion :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 294, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Total viatico :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 33, -1, -1));
        jPanel3.add(txtViatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 31, 198, -1));

        txtNombreCorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCortoActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreCorto, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 55, 198, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nombre corto :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 57, -1, -1));
        jPanel3.add(txtKilometros, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 77, 198, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Kilometros :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 82, -1, -1));
        jPanel3.add(txtfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 115, 197, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Folio :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 117, -1, -1));
        jPanel3.add(txtNumeroGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 146, 197, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Numero Guia :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 148, -1, -1));
        jPanel3.add(txtFlete, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 177, 197, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("flete :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 179, -1, -1));
        jPanel3.add(txtventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 204, 197, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Venta :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 203, -1, 20));
        jPanel3.add(txtExpedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 235, 197, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Expedicion :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 237, -1, -1));

        txtOperador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOperadorMouseClicked(evt);
            }
        });
        jPanel3.add(txtOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 261, 197, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Nombre Operador :");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 263, -1, -1));

        lblIDOperadores.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        lblIDOperadores.setText("idOperador");
        jPanel3.add(lblIDOperadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, 20));
        jPanel3.add(txtCodigoRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 42, 76, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Codigo Area :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 44, -1, -1));
        jPanel3.add(txtNumeroViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 42, 76, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Numero de viaje :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 44, -1, -1));

        btnUnidades.setBackground(new java.awt.Color(255, 255, 255));
        btnUnidades.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        btnUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnUnidades.setText("Buscar Eco");
        btnUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesActionPerformed(evt);
            }
        });
        jPanel3.add(btnUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 69, 120, 20));
        jPanel3.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 68, 108, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unidad :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 70, -1, -1));
        jPanel3.add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 100, 249, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha Cita :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 102, -1, -1));
        jPanel3.add(txtFechaProgramada, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 126, 249, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de captura :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 131, -1, -1));

        txtRemolque1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemolque1MouseClicked(evt);
            }
        });
        jPanel3.add(txtRemolque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 164, 243, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Remolque 1:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 169, -1, -1));

        txtRemolque2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemolque2MouseClicked(evt);
            }
        });
        jPanel3.add(txtRemolque2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 190, 243, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Remolque 2 :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 195, -1, -1));

        txtDolly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDollyMouseClicked(evt);
            }
        });
        jPanel3.add(txtDolly, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 221, 243, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Dolly :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 223, -1, -1));

        txtNombreRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreRutaMouseClicked(evt);
            }
        });
        jPanel3.add(txtNombreRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 252, 310, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre Ruta :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 257, -1, -1));

        idrutas.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        idrutas.setText("idRuta");
        jPanel3.add(idrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 283, -1, -1));
        jPanel3.add(lblCiudadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 299, 141, -1));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl1.setText("Origen :");
        jPanel3.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 302, -1, -1));
        jPanel3.add(lbCiudadlDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 330, 141, -1));

        lbCiudadlDestino2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCiudadlDestino2.setText("Destino :");
        jPanel3.add(lbCiudadlDestino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 336, -1, -1));

        lblOrigen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrigen.setText("Origen :");
        jPanel3.add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 302, -1, -1));

        lblDestino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDestino.setText("Destino :");
        jPanel3.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 333, -1, -1));

        PanelLista.setBackground(new java.awt.Color(255, 255, 255));
        PanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        PanelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscar :");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        PanelLista.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 107, -1, -1));

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
        PanelLista.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 104, 192, -1));
        PanelLista.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 44, 182, -1));
        PanelLista.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 44, 187, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha Inicio :");
        PanelLista.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha final :");
        PanelLista.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 44, 72, -1));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        PanelLista.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, -1, 24));

        lbltotalRegistros.setText("Total Registros");
        PanelLista.add(lbltotalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 481, 240, -1));

        NumeroRegistrosPegados.setText("NumeroDeRegistrosPegados");
        PanelLista.add(NumeroRegistrosPegados, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 107, -1, -1));

        lblEncontrado.setText("Folios Encontrados");
        PanelLista.add(lblEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 107, -1, -1));

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
        jScrollPane2.setViewportView(ListaDatos);

        PanelLista.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 132, 711, 276));

        CheckAvanzado.setBackground(new java.awt.Color(255, 255, 255));
        CheckAvanzado.setText("Busqueda Avanzada");
        CheckAvanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAvanzadoActionPerformed(evt);
            }
        });
        PanelLista.add(CheckAvanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 44, -1, -1));
        PanelLista.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 700, 20));

        barraMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        barraMovimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMovimientoMouseDragged(evt);
            }
        });
        barraMovimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMovimientoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraMovimientoLayout = new javax.swing.GroupLayout(barraMovimiento);
        barraMovimiento.setLayout(barraMovimientoLayout);
        barraMovimientoLayout.setHorizontalGroup(
            barraMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        barraMovimientoLayout.setVerticalGroup(
            barraMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PanelLista.add(barraMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1310, 50));

        jPanel3.add(PanelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 387, 730, 502));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de folio por modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFacturaCancelada.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnFacturaCancelada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnFacturaCancelada.setText("Factura Cancelada");
        btnFacturaCancelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaCanceladaActionPerformed(evt);
            }
        });
        jPanel2.add(btnFacturaCancelada, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 311, 217, -1));

        TablaFolio = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }

        };
        TablaFolio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JScrollPane pane2 = new JScrollPane(TablaFolio);
        add(pane2,BorderLayout.CENTER);
        TablaFolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFolioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaFolio);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 81, 516, 80));

        btnExcel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_text_snippet_black_24dp.png"))); // NOI18N
        btnExcel.setText("Excel Viajes");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 260, 281, 30));

        btnCambioRuta.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCambioRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_share_location_black_24dp.png"))); // NOI18N
        btnCambioRuta.setText("Cambio de Ruta");
        btnCambioRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioRutaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambioRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 362, 281, -1));

        btnLiberar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_mark_email_read_black_24dp.png"))); // NOI18N
        btnLiberar.setText("Liberacion Carta Porte");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLiberar, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 216, 281, -1));

        btnModificarOperador.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnModificarOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_accessibility_new_black_24dp.png"))); // NOI18N
        btnModificarOperador.setText("Modificar Operadores");
        btnModificarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOperadorActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 260, 217, -1));

        btnInsertarPendientes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnInsertarPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_travel_explore_black_24dp.png"))); // NOI18N
        btnInsertarPendientes.setText("Insertar viajes pendientes");
        btnInsertarPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPendientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsertarPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 216, 217, -1));

        btnSeguimientoFacturas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSeguimientoFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_trending_down_black_24dp.png"))); // NOI18N
        btnSeguimientoFacturas.setText("Segumiento de facturas");
        btnSeguimientoFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguimientoFacturasActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeguimientoFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 362, 217, -1));

        btnCancelacionViaje.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCancelacionViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_disabled_by_default_black_24dp.png"))); // NOI18N
        btnCancelacionViaje.setText("Cancelacion de viaje");
        btnCancelacionViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelacionViajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelacionViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 172, 217, -1));

        btnActualizarUnidad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnActualizarUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_directions_bus_filled_black_24dp.png"))); // NOI18N
        btnActualizarUnidad.setText("Actualizar Unidad");
        btnActualizarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUnidadActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizarUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 311, 281, -1));

        btnViajesCancelados.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnViajesCancelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_do_disturb_alt_black_24dp.png"))); // NOI18N
        btnViajesCancelados.setText("Viajes cancelados");
        btnViajesCancelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesCanceladosActionPerformed(evt);
            }
        });
        jPanel2.add(btnViajesCancelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 172, 281, -1));

        lblReloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("-");
        jPanel2.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 450, 516, 45));

        btnConsultarViajesAvanzados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultarViajesAvanzados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_search_black_24dp.png"))); // NOI18N
        btnConsultarViajesAvanzados.setText("Consultar");
        jPanel2.add(btnConsultarViajesAvanzados, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 27, -1, -1));
        jPanel2.add(txtCodigoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 33, 101, -1));

        lblNumeroViaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumeroViaje.setText("# de viaje :");
        jPanel2.add(lblNumeroViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 36, -1, -1));
        jPanel2.add(txtCodigoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 33, 113, -1));

        lblCodigoArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigoArea.setText("# de Area :");
        jPanel2.add(lblCodigoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 36, -1, -1));

        btnBuscarCartaCobro.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarCartaCobro.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBuscarCartaCobro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_attach_money_black_24dp.png"))); // NOI18N
        btnBuscarCartaCobro.setText("Buscar Carta cobro");
        btnBuscarCartaCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCartaCobroActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCartaCobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 407, 217, 31));

        btnViaticos.setBackground(new java.awt.Color(255, 255, 255));
        btnViaticos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnViaticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_add_card_black_24dp.png"))); // NOI18N
        btnViaticos.setText("Mostrar Viaticos");
        btnViaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViaticosActionPerformed(evt);
            }
        });
        jPanel2.add(btnViaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 406, 281, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 387, -1, 502));

        lblEstatusGuia.setText("-------");
        jPanel3.add(lblEstatusGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 149, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Modalidad del viaje :");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 362, -1, -1));
        jPanel3.add(lblModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 362, 141, 14));
        jPanel3.add(lblEstadoOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 160, 20));

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try {
            
            String cadenaPruebas;
            String dateStart = formatoFecha.format(txtFechaInicio.getDate());
            String dateEnd = formatoFecha.format(txtFechaFinal.getDate());

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                try {

                    cadenaPruebas = txtBuscar.getText().trim();
                    String[] cadenaArreglo = cadenaPruebas.split(" ");

                    if (cadenaArreglo.length >= 1) {
                        for (int i = 0; i < cadenaArreglo.length; i++) {
                            mostarDetalladoFechasBuscardor(dateStart, dateEnd, cadenaArreglo);

                        }
                        NumeroRegistrosPegados.setText("Total registros consultado " + String.valueOf(cadenaArreglo.length));
                        lblEncontrado.setText("Total de registros encontrados " + String.valueOf(ListaDatos.getRowCount() - 2));

                    }

                    func.totalRegistros = 0;
                } catch (Exception e) {
                    help.mensaje("Error " + e.getMessage(), "Error");

                }

                if (ListaDatos.getRowCount() >= 1) {
                    Buscar_Operador_Inactivo();
                    validacion_estatus();
                }

            }

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ConsultarViajes viaje = new ConsultarViajes();
        BarraProgresoHilo progreso = new BarraProgresoHilo();

        String cadenaPruebas = "";

        try {

            cadenaPruebas = txtBuscar.getText();
            String[] cadenaArreglo = cadenaPruebas.split(" ");
            viaje.setFechainiciales(formatoFecha.format(txtFechaInicio.getDate()));
            viaje.setFechafinales(formatoFecha.format(txtFechaFinal.getDate()));
            viaje.setBuscar(cadenaArreglo);
            viaje.start();
            progreso.start();

            validacion_estatus();
            NumeroRegistrosPegados.setText("Total registros consultado " + String.valueOf(cadenaArreglo.length));
            lblEncontrado.setText("Total de registros encontrados " + String.valueOf(ListaDatos.getRowCount() - 2));
            func.totalRegistros = 0;

        } catch (Exception e) {
            help.mensaje("Error", "Error");
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked

        if (evt.getClickCount() == 2) {
            txtBuscar.setText("");
        }

    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

        // mostarDetalladoFechasBuscardor("","",txtBuscar.getText());
//        String fechainicial = formatoFecha.format(txtFechaInicio.getDate());
//        String fechafinal = formatoFecha.format(txtFechaFinal.getDate());
//        String buscar = txtBuscar.getText().trim();
//

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

        if (help.mensajeConfirmacion("Deseas crear el excel de " + formatoFecha.format(txtFechaInicio.getDate()) + " Al " + formatoFecha.format(txtFechaFinal.getDate())) == 0) {

            try {
                Excel ejecucion1 = new Excel();
                ejecucion1.setFechainiciales(formatoFecha.format(txtFechaInicio.getDate()));
                ejecucion1.setFechafinales(formatoFecha.format(txtFechaFinal.getDate()));
                ejecucion1.setBuscar(txtBuscar.getText().trim());

                ejecucion1.start();

            } catch (Exception e) {
                help.mensaje("Error " + e.getMessage(), "Error");
            }
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
        //unidades.setVisible(true);
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

        //validacion de cancelacion 
        if (TablaFolio.getRowCount() <= 0) {

            if (help.mensajeConfirmacion(" Debes de agregar un registro a la tabla de cancelacion para poder eliminar, \nDeseas abrir el formulario de cancelacion ? ") == 0) {
                frmCancelacionDeviaje cancelacion = new frmCancelacionDeviaje();
                Principal.escritorio.add(cancelacion);
                help.centrarPantalla(Principal.escritorio, cancelacion);
                cancelacion.show();
            }

            return;
        }

        frmCancelacionDeviaje cancelacion = new frmCancelacionDeviaje();
        
        Principal.escritorio.add(cancelacion);
        help.centrarPantalla(Principal.escritorio, cancelacion);
       
        cancelacion.show();
        
    }//GEN-LAST:event_btnCancelacionViajeActionPerformed

    private void btnActualizarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUnidadActionPerformed

        Unidad unidades = new Unidad();
        String cadenaAux;

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

        //Si ya ingresaste um remolque y aparte el dolly es vacio arroja el siguiente mensaje
        if (txtRemolque2.getText().length() > 0 && txtDolly.getText().length() <= 0) {

            help.mensaje("Debes de ingresar un dolly", "Informativo");
            txtUnidad.requestFocus();
            return;

        }

        if (uni.validacion_existente_unidad(txtUnidad.getText()) == 0) {

            help.mensaje("La unidad no existe en la base de datos no puedes ingresar una unidad que no existe", "Error");
            lblError.setOpaque(true);
            lblError.setForeground(Color.red);
            lblError.setText("Warning : La unidad no existe en la base de datos no puedes ingresar una unidad que no existe");

            return;

        } else {

            lblError.setOpaque(true);
            lblError.setText("");
            lblError.setBackground(Color.white);

            unidades.setId_unidad(txtUnidad.getText());
            unidades.setId_remolque1(txtRemolque1.getText());
            unidades.setId_remolque2(txtRemolque2.getText());
            unidades.setId_dolly(txtDolly.getText());

            unidades.setCodigoArea(Integer.parseInt(txtCodigoRuta.getText()));
            unidades.setNumeroViaje(Integer.parseInt(txtNumeroViaje.getText()));

            if (help.mensajeConfirmacion("Deseas actualizar el registros " + txtUnidad.getText()) == 0) {

                cadenaAux = txtBuscar.getText();

                if (cadenaAux.length() <= 0) {
                    cadenaAux = txtfolio.getText();
                }

                arregloUnidades = cadenaAux.split(" ");

                if (uni.actualizarUnidad(unidades)) {
                    mostarDetalladoFechasBuscardor(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), arregloUnidades);
                    help.mensajeLateral("Actualizado", "Se actualizado correctamente el registro", "aceptado");
                } else {
                    help.mensajeLateral("Error", "No se puedo actualizar el registro correctamente", "fallo");
                }

            }

        }


    }//GEN-LAST:event_btnActualizarUnidadActionPerformed

    private void btnModificarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOperadorActionPerformed

        Operador op = new Operador();
        String cadenaAux;

        if (txtNumeroViaje.getText().length() <= 0) {
            help.mensaje("Ingresa un numero de viaje", "Informativo");
            return;
        }

        if (txtCodigoRuta.getText().length() <= 0) {
            help.mensaje("Ingresa un codigo ruta ", "Informativo");
            return;
        }

        if (lblIDOperadores.getText().equalsIgnoreCase("idOperador")) {
            help.mensaje("Selecciona una operador", "Informativo");
            return;
        }

        op.setCodigo_area(Integer.parseInt(txtCodigoRuta.getText()));
        op.setNo_viaje(Integer.parseInt(txtNumeroViaje.getText()));
        op.setId_operador(Integer.parseInt(lblIDOperadores.getText()));
        op.setNombreOperador(txtOperador.getText());

        cadenaAux = txtBuscar.getText().trim();

        if (cadenaAux.length() <= 0) {
            cadenaAux = txtfolio.getText().trim();
        }

        arregloUnidades = cadenaAux.split(" ");

        if (help.mensajeConfirmacion("Deseas actualizar el registro " + op.getNombreOperador() + " Id Operador " + op.getId_operador()) != 1) {

            if (ope.update(op)) {
                help.mensajeLateral("Modificacion  exitosa", "Se modifico correctamente el operador ", "aceptado");
                mostarDetalladoFechasBuscardor(formatoFecha.format(txtFechaInicio.getDate()), formatoFecha.format(txtFechaFinal.getDate()), arregloUnidades);

                lblIDOperadores.setText("idOperador");
            } else {
                help.mensajeLateral("Modificacion erronea", "No Se modifico correctamente el operador", "error");
            }
        }


    }//GEN-LAST:event_btnModificarOperadorActionPerformed

    private void btnInsertarPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPendientesActionPerformed
        frmViajesPendientes esc = new frmViajesPendientes();
        Principal.escritorio.add(esc);
        help.centrarPantalla(Principal.escritorio, esc);
        esc.show();
    }//GEN-LAST:event_btnInsertarPendientesActionPerformed

    private void MensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MensajeMouseClicked

    }//GEN-LAST:event_MensajeMouseClicked

    private void TablaFolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFolioMouseClicked

        try {
            if (evt.getClickCount() > 1) {

                DefaultTableModel modelo = (DefaultTableModel) TablaFolio.getModel();
                modelo.removeRow(TablaFolio.getSelectedRow());

            }
        } catch (Exception e) {
            help.mensaje("error" + e.getMessage(), "eror");
        }


    }//GEN-LAST:event_TablaFolioMouseClicked

    private void btnCambioRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioRutaActionPerformed
        frmCambioRuta modificadorRutas = new frmCambioRuta();
        Principal.escritorio.add(modificadorRutas);
        help.centrarPantalla(Principal.escritorio, modificadorRutas);

        modificadorRutas.show();

        if (modificadorRutas.isShowing()) {
            validacionformulario = true;
        }


    }//GEN-LAST:event_btnCambioRutaActionPerformed

    private void btnBuscarCartaCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCartaCobroActionPerformed

        frmCartasDeCobro cartaCobro = new frmCartasDeCobro();

        Principal.escritorio.add(cartaCobro);
        help.centrarPantalla(Principal.escritorio, cartaCobro);
        cartaCobro.show();


    }//GEN-LAST:event_btnBuscarCartaCobroActionPerformed

    private void btnViajesCanceladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesCanceladosActionPerformed

        try {

            frmViajesCancelados frm = new frmViajesCancelados();

            Principal.escritorio.add(frm);

            help.centrarPantalla(Principal.escritorio, frm);
            frm.show();
//        Principal.escritorio.add(frm);
//        try {
//            this.setMaximum(true);
//
//        } catch (Exception ex) {
//            help.mensaje("Error " + ex.getMessage(), title);
//        }

        } catch (Exception e) {
            help.mensaje("Error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_btnViajesCanceladosActionPerformed

    private void ListaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDatosMouseClicked

        Vector<String> lista = new Vector<>();

        int fila = ListaDatos.getSelectedRow();

        try {

            if (evt.getClickCount() == 2) {

                if (TablaFolio.getRowCount() <= 0) {
                    help.mensaje("Agregado", "Informativo");
                }
                lista.add(ListaDatos.getValueAt(fila, 15).toString());
                lista.add(ListaDatos.getValueAt(fila, 0).toString());
                lista.add(ListaDatos.getValueAt(fila, 1).toString());
                lista.add(ListaDatos.getValueAt(fila, 16).toString());
                modeloTabla.addRow(lista);
                TablaFolio.setModel(modeloTabla);

            }

            txtNumeroViaje.setText(ListaDatos.getValueAt(fila, 0).toString());
            txtCodigoRuta.setText(ListaDatos.getValueAt(fila, 1).toString());
            txtUnidad.setText(ListaDatos.getValueAt(fila, 2).toString());
            txtFechaCita.setText(ListaDatos.getValueAt(fila, 3).toString());
            txtFechaProgramada.setText(ListaDatos.getValueAt(fila, 26).toString());
            txtRemolque1.setText(ListaDatos.getValueAt(fila, 4).toString());
            txtRemolque2.setText(ListaDatos.getValueAt(fila, 5).toString());
            txtDolly.setText(ListaDatos.getValueAt(fila, 6).toString());
            txtAsignacion.setText(ListaDatos.getValueAt(fila, 7).toString());
            txtNombreRuta.setText(ListaDatos.getValueAt(fila, 8).toString());
            lblCiudadOrigen.setText(ListaDatos.getValueAt(fila, 9).toString());
            lbCiudadlDestino1.setText(ListaDatos.getValueAt(fila, 10).toString());
            lblOrigen.setText(ListaDatos.getValueAt(fila, 11).toString());
            lblDestino.setText(ListaDatos.getValueAt(fila, 12).toString());
            txtNombreCorto.setText(ListaDatos.getValueAt(fila, 13).toString());
            txtKilometros.setText(ListaDatos.getValueAt(fila, 14).toString());
            txtfolio.setText(ListaDatos.getValueAt(fila, 15).toString());
            txtNumeroGuia.setText(ListaDatos.getValueAt(fila, 16).toString());
            txtFlete.setText(ListaDatos.getValueAt(fila, 17).toString());
            txtventa.setText(ListaDatos.getValueAt(fila, 18).toString());
            txtExpedicion.setText(ListaDatos.getValueAt(fila, 19).toString());
            txtOperador.setText(ListaDatos.getValueAt(fila, 20).toString());
            txtViatico.setText(ListaDatos.getValueAt(fila, 21).toString());
            txtDireccion.setText(ListaDatos.getValueAt(fila, 25).toString());
            txtNumeroGuias.setText(ListaDatos.getValueAt(fila, 27).toString());
            txtOperacion.setText(ListaDatos.getValueAt(fila, 29).toString());
            txtEstatus.setText(ListaDatos.getValueAt(fila, 30).toString());
            txtUsuarioAlta.setText(ListaDatos.getValueAt(fila, 31).toString());
            txtTipoCobro.setText(ListaDatos.getValueAt(fila, 33).toString());
            txtFactura.setText(ListaDatos.getValueAt(fila, 34).toString());
            txtEstatusFactura.setText(ListaDatos.getValueAt(fila, 35).toString());
            txtHoras.setText(ListaDatos.getValueAt(fila, 36).toString());
            txtHoras.setText(ListaDatos.getValueAt(fila, 31).toString());
            txtNumeroPedido.setText(ListaDatos.getValueAt(fila, 38).toString());
            lblEstatusGuia.setText(ListaDatos.getValueAt(fila, 37).toString());

            Ruta rut = new Ruta();

            ArrayList<Ruta> list = new ArrayList<>();

            if (txtNombreRuta.getText().length() <= 0) {
                help.mensaje("Ingresa un nombre de ruta", "Informativo");
                txtNombreRuta.requestFocus();
                return;
            }
            rut.setNombreRuta(txtNombreRuta.getText());

            for (Ruta ruta : func.rutas(rut)) {
                idrutas.setText(String.valueOf(ruta.getId_ruta()));
            }

            if (txtRemolque1.getText().length() > 0 && txtRemolque2.getText().length() > 0 && txtDolly.getText().length() > 0) {
                lblModalidad.setText("Full");
            } else if (txtRemolque1.getText().length() > 0 && txtDolly.getText().length() > 0 && txtRemolque2.getText().length() <= 0) {
                lblModalidad.setText("Error revisa esta modalidad");
                lblModalidad.setForeground(Color.RED);
                help.mensaje("NO puede existir esta modalidad revisa el viaje", "Error");
            } else {
                lblModalidad.setText("Sencillo");
            }

            Buscar_Operador_Inactivo();
            //lblEstadoOperador.setText(ope.buscar_estatus_operador(txtOperador.getText()));
        } catch (Exception e) {
            help.mensaje("error " + e.getMessage(), "Error");
        }


    }//GEN-LAST:event_ListaDatosMouseClicked

    private void CheckAvanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAvanzadoActionPerformed
        // TODO add your handling code here:

        if (CheckAvanzado.isSelected()) {

            inhabilitar_cajas_busqueda_avazanda(true);
        } else {
            inhabilitar_cajas_busqueda_avazanda(false);
        }

    }//GEN-LAST:event_CheckAvanzadoActionPerformed

    private void btnSeguimientoFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguimientoFacturasActionPerformed

    }//GEN-LAST:event_btnSeguimientoFacturasActionPerformed
    int xx, yy;
    private void barraMovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMovimientoMousePressed
        xx = getX();
        yy = getY();
    }//GEN-LAST:event_barraMovimientoMousePressed

    private void barraMovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMovimientoMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(xx - x, yy - y);

    }//GEN-LAST:event_barraMovimientoMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckAvanzado;
    public static javax.swing.JTable ListaDatos;
    private javax.swing.JPopupMenu Mensaje;
    private javax.swing.JLabel NumeroRegistrosPegados;
    private javax.swing.JPanel PanelLista;
    public static javax.swing.JTable TablaFolio;
    private javax.swing.JPanel barraMovimiento;
    private javax.swing.JButton btnActualizarUnidad;
    private javax.swing.JButton btnBuscarCartaCobro;
    private javax.swing.JButton btnCambioRuta;
    private javax.swing.JButton btnCancelacionViaje;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarViajesAvanzados;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFacturaCancelada;
    private javax.swing.JButton btnInsertarPendientes;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnModificarOperador;
    private javax.swing.JButton btnSeguimientoFacturas;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JButton btnViajesCancelados;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lbCiudadlDestino1;
    private javax.swing.JLabel lbCiudadlDestino2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField lblCiudadOrigen;
    private javax.swing.JLabel lblCodigoArea;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEncontrado;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblEstadoOperador;
    public static javax.swing.JLabel lblEstatusGuia;
    public static javax.swing.JLabel lblIDOperadores;
    private javax.swing.JLabel lblModalidad;
    private javax.swing.JLabel lblNumeroViaje;
    private javax.swing.JLabel lblOrigen;
    public static javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lbltotalRegistros;
    private javax.swing.JTextField txtAsignacion;
    public static javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigoArea;
    public static javax.swing.JTextField txtCodigoRuta;
    private javax.swing.JTextField txtCodigoViaje;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtDolly;
    private javax.swing.JTextField txtEstatus;
    public static javax.swing.JTextField txtEstatusFactura;
    public static javax.swing.JTextField txtExpedicion;
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
    public static javax.swing.JTextField txtNumeroPedido;
    public static javax.swing.JTextField txtNumeroViaje;
    private javax.swing.JTextField txtOperacion;
    public static javax.swing.JTextField txtOperador;
    public static javax.swing.JTextField txtRemolque1;
    public static javax.swing.JTextField txtRemolque2;
    private javax.swing.JTextField txtTipoCobro;
    public static javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtUsuarioAlta;
    public static javax.swing.JTextField txtViatico;
    public static javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txtventa;
    // End of variables declaration//GEN-END:variables
}
