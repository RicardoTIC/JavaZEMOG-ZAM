/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Indicadores;

import Helpers.Ayudas;
import Logica.fCapiIndicadores;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public final class frmResumenCapi extends javax.swing.JInternalFrame {

    Helpers.Ayudas aux = new Ayudas();
    fCapiIndicadores func = new fCapiIndicadores();
    SimpleDateFormat fechaInicial = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat fechaFinal = new SimpleDateFormat("yyyy-MM-dd");
    LocalDate currentDate = LocalDate.parse(fechaFinal.format(new GregorianCalendar().getTime()));
    GregorianCalendar fechaStart = new GregorianCalendar(currentDate.getYear(), currentDate.getMonthValue() - 1, currentDate.getDayOfMonth());
    GregorianCalendar fechaEnd = new GregorianCalendar(currentDate.getYear(), currentDate.getMonthValue() - 1, 1);


    public frmResumenCapi() {
        initComponents();
        txtFechaInicio.setCalendar(fechaEnd);
        txtFechaFinal.setCalendar(fechaStart);
        popTable();
    }

    void popTable() {

        //JMenuItem menu1 = new JMenuItem("Cerrar Pantalla", new ImageIcon(getClass().getResource("/Imagenes/cancel_77947.png")).getImage().getScaledInstance((int) MenuCierre, MenuCierre.getWidth(), Image.SCALE_SMOOTH));
        
        
        
        JMenuItem menu1 = new JMenuItem("Cerrar Pantalla", new ImageIcon(getClass().getResource("/Imagenes/cancel_77947.png")));
        JMenuItem menu2 = new JMenuItem("Maximar", new ImageIcon(getClass().getResource("/Imagenes/outline_text_snippet_black_24dp.png")));
        JMenuItem menu3 = new JMenuItem("Minimizar", new ImageIcon(getClass().getResource("/Imagenes/outline_add_black_24dp.png")));

        menu1.addActionListener((ActionEvent ae) -> {
            this.dispose();
        });
        menu2.addActionListener((ActionEvent e) -> {
            try {
                this.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmResumenCapi.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        menu3.addActionListener((ActionEvent e) -> {
              this.setIconifiable(true);
        });

        MenuCierre.add(menu1);
        MenuCierre.add(menu2);
        MenuCierre.add(menu3);

        Principal.setComponentPopupMenu(MenuCierre);

    }

    void anchoColumnas() {
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightCellRenderer = new DefaultTableCellRenderer();

        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        rightCellRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        try {

            //Estable el ancho de la columna de nuestro jTable
            System.out.println("Numero de columnas " + ListaDeDatos.getColumnCount() + 1);
            for (int i = 0; i < ListaDeDatos.getColumnCount(); i++) {

                ListaDeDatos.getColumnModel().getColumn(i).setPreferredWidth(200);

                if (i == 0 || i == 1) {
                    ListaDeDatos.getColumnModel().getColumn(i).setPreferredWidth(95);
                }

                if (i == 3) {
                    ListaDeDatos.getColumnModel().getColumn(i).setPreferredWidth(45);
                }

                //ListaDatos.getColumnModel().getColumn(i).setCellRenderer(rightCellRenderer);
            }

            //deshabilita el editor del ancho de las columnas
            //ListaDatos.getColumnModel().getColumn(0).setResizable(false);
            //Alinear texto de fila
            //ListaDatos.getColumnModel().getColumn(0).setCellRenderer(Alinear);
            //Establece el alto de las columnas
            //ListaDatos.setRowHeight(85);
        } catch (Exception e) {
            aux.mensaje("El Error esta en la tabla " + getClass().getName() + " - " + e.getMessage(), "Error");
        }

    }

    void mostrar(String fechaInicio, String fechaFinal, String buscador) {

        try {

            JTableHeader encabezado = ListaDeDatos.getTableHeader();
            encabezado.setOpaque(false);
            encabezado.setBackground(Color.decode("#b33939"));
            encabezado.setForeground(Color.white);
            encabezado.setFont(new Font("Arial Black", Font.BOLD, 10));

            ListaDeDatos.setModel(func.showAllData(fechaInicio, fechaFinal, buscador));
            anchoColumnas();
            lbltotalRegistros.setText("" + ListaDeDatos.getRowCount());

        } catch (Exception e) {
            aux.mensaje("Error " + e.getMessage(), "Error");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuCierre = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        Principal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtFechaFinal = new com.toedter.calendar.JDateChooser();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeDatos = new javax.swing.JTable(){
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
        jLabel3 = new javax.swing.JLabel();
        lbltotalRegistros = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProyeccion = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Resumen capi");
        setToolTipText("");

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capacidad Instalada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fecha Inicio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha Final");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedaAvanzada.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        ListaDeDatos.setAutoCreateRowSorter(true);
        ListaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ListaDeDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaDeDatos);
        add(pane, BorderLayout.CENTER);
        jScrollPane1.setViewportView(ListaDeDatos);

        jLabel3.setText("Total registros :");

        lbltotalRegistros.setText("-");

        TablaProyeccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaProyeccion);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(PrincipalLayout.createSequentialGroup()
                                        .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnConsultar))))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 347, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConsultar)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltotalRegistros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        System.out.println("Fecha inicio  " + fechaInicial.format(txtFechaInicio.getDate()) + " Fecha final " + fechaFinal.format(txtFechaFinal.getDate()));

        mostrar(fechaInicial.format(txtFechaInicio.getDate()), fechaFinal.format(txtFechaFinal.getDate()), txtBuscador.getText());

    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaDeDatos;
    private javax.swing.JPopupMenu MenuCierre;
    private javax.swing.JPanel Principal;
    private javax.swing.JTable TablaProyeccion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbltotalRegistros;
    private javax.swing.JTextField txtBuscador;
    private com.toedter.calendar.JDateChooser txtFechaFinal;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
