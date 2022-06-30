package Vista.Viajes;

import Helpers.Ayudas;
import Logica.fViajes;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmValidacionFacturas extends javax.swing.JInternalFrame {

    fViajes func = new fViajes();
    Helpers.Ayudas aux = new Ayudas();

    public frmValidacionFacturas() {
        initComponents();
        checkEstado.setSelected(true);
    }

    void numeroOperadoresActivos() {

        aux.mensajeLateral("Total de operadores", "Operadores Activos " + func.totalActivos + "\nOperadores Inactivos " + func.totalInactivos, "aceptado");

        func.totalActivos = 0;
        func.totalInactivos = 0;
    }

    void mostrar(String[] buscardor, boolean estado, boolean remision) {
        int numeroFilas = 0;

        try {

            if (CheckRemision.isSelected()) {

                ListaDeviajes.setModel(func.showOpeActive(buscardor, estado,remision));
                numeroFilas = ListaDeviajes.getRowCount();
                numeroOperadoresActivos();
                totalRegistros.setText(String.valueOf(numeroFilas));

            } else {
                ListaDeviajes.setModel(func.showOpeActive(buscardor, estado));
                numeroFilas = ListaDeviajes.getRowCount();
                numeroOperadoresActivos();
                totalRegistros.setText(String.valueOf(numeroFilas));

            }

        } catch (Exception e) {
            aux.mensaje("Eror " + e.getMessage() + " : " + getClass().getName(), e.getLocalizedMessage());
        }

    }
    
    void mostrar(String[] buscardor, boolean estado) {
        int numeroFilas = 0;

        try {

            ListaDeviajes.setModel(func.showOpeActive(buscardor, estado));
            numeroFilas = ListaDeviajes.getRowCount();
            numeroOperadoresActivos();
            totalRegistros.setText(String.valueOf(numeroFilas));

        } catch (Exception e) {
            aux.mensaje("Eror " + e.getMessage() + " : " + getClass().getName(), e.getLocalizedMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeviajes = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 1 ) {
                    return true;
                }else{
                    return false;
                }
            }
        };
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totalRegistros = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        checkEstado = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtFechaBaja = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        CheckRemision = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Validacion de viajes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validacion de viajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaDeviajes.setAutoCreateRowSorter(true);
        ListaDeviajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ListaDeviajes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JScrollPane pane = new JScrollPane(ListaDeviajes);
        add(pane, BorderLayout.CENTER);
        ListaDeviajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaDeviajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaDeviajesMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(ListaDeviajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 626, 382));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 50, 308, -1));

        jLabel1.setText("Buscar :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Numero de guia :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 47, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Carta de cobro :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 87, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha de cancelacion :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 127, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Remision :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Flete :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 203, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre Operador :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 241, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estatus :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 279, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estatus viaje :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 355, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 44, 267, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 84, 267, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 124, 267, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 162, 267, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 200, 267, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 238, 265, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 276, 263, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 349, 261, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alerta.png"))); // NOI18N
        jButton1.setText("Liberar Guia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 427, 160, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/free.png"))); // NOI18N
        jButton2.setText("Free carta cobro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 427, 166, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_77947.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 474, 166, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Total Registros :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 486, -1, -1));

        totalRegistros.setText("-");
        jPanel1.add(totalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 486, 142, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_travel_explore_black_24dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 44, -1, -1));

        checkEstado.setBackground(new java.awt.Color(255, 255, 255));
        checkEstado.setText("Activo");
        jPanel1.add(checkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 49, 89, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Fecha de baja :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 317, -1, -1));
        jPanel1.add(txtFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 314, 261, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/outline_calendar_month_black_24dp.png"))); // NOI18N
        jButton4.setText("Liberar Factura");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 478, 160, 37));

        CheckRemision.setBackground(new java.awt.Color(255, 255, 255));
        CheckRemision.setText("Remision");
        jPanel1.add(CheckRemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 49, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String[] cartaGuias = jTextField1.getText().trim().split(" ");
        boolean estado = checkEstado.isSelected();

        if (CheckRemision.isSelected()) {
            mostrar(cartaGuias, estado,true);
        } else {
            mostrar(cartaGuias, estado);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if (evt.getClickCount() >= 2) {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void ListaDeviajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDeviajesMouseClicked

        int fila = ListaDeviajes.rowAtPoint(evt.getPoint());

        try {

            jTextField2.setText(ListaDeviajes.getValueAt(fila, 0).toString()); // Numero guia
            jTextField3.setText(ListaDeviajes.getValueAt(fila, 1).toString()); // Carta de cobro
            jTextField4.setText(ListaDeviajes.getValueAt(fila, 2).toString()); // Fecha cancelacion
            jTextField5.setText(ListaDeviajes.getValueAt(fila, 3).toString()); // Remision
            jTextField6.setText(ListaDeviajes.getValueAt(fila, 4).toString()); // Flete
            jTextField7.setText(ListaDeviajes.getValueAt(fila, 8).toString()); // Nombre Operador
            jTextField8.setText(ListaDeviajes.getValueAt(fila, 9).toString()); // Estatus operador
            txtFechaBaja.setText(ListaDeviajes.getValueAt(fila, 10).toString()); // Fecha Baja
            jTextField9.setText(ListaDeviajes.getValueAt(fila, 15).toString()); // Estatus viaje

        } catch (Exception e) {
            aux.mensajeLateral("Error al seleccionar datos", e.getMessage() + " : " + getClass().getName(), "error");
        }


    }//GEN-LAST:event_ListaDeviajesMouseClicked

    private void ListaDeviajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaDeviajesMouseEntered

    }//GEN-LAST:event_ListaDeviajesMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[] no_guia = new int[ListaDeviajes.getRowCount()];
        int[] codigoArea = new int[ListaDeviajes.getRowCount()];

        try {

            if (aux.mensajeConfirmacion("Deseas liberar " + ListaDeviajes.getRowCount() + " Carta porte") == 0) {

                for (int i = 0; i < ListaDeviajes.getRowCount(); i++) {
                    no_guia[i] = Integer.parseInt(ListaDeviajes.getValueAt(i, 18).toString());
                    codigoArea[i] = Integer.parseInt(ListaDeviajes.getValueAt(i, 19).toString());

                }

                if (func.liberacionCartaPorteMasivo(no_guia, codigoArea).equalsIgnoreCase("success")) {
                    aux.mensaje("Se liberaron correctamente las " + ListaDeviajes.getRowCount() + " Carta Porte ", "informativo");

                    String[] cartaGuias = jTextField1.getText().trim().split(" ");
                    boolean estado = checkEstado.isSelected();

                    mostrar(cartaGuias, estado);
                } else {
                    aux.mensaje("No se liberaron las " + ListaDeviajes.getRowCount() + " Carta Porte ", "informativo");
                }

            }

        } catch (Exception e) {
            aux.mensaje("Error " + e.getMessage(), "informativo");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String[] numero_guia = new String[ListaDeviajes.getRowCount()];

        try {

            if (aux.mensajeConfirmacion("Deseas liberar  " + ListaDeviajes.getRowCount() + " Facturas") == 0) {

                for (int i = 0; i < ListaDeviajes.getRowCount(); i++) {
                    numero_guia[i] = ListaDeviajes.getValueAt(i, 0).toString();
                }

                if (func.liberacionFacturas(numero_guia).equalsIgnoreCase("success")) {

                    aux.mensaje("Se liberaron correctamente las " + ListaDeviajes.getRowCount() + " Las facturas ", "informativo");

                    String[] cartaGuias = jTextField1.getText().trim().split(" ");
                    boolean estado = checkEstado.isSelected();
                    mostrar(cartaGuias, estado);

                } else {
                    aux.mensaje("No se liberaron las " + ListaDeviajes.getRowCount() + " Carta Porte ", "informativo");
                }

            }

        } catch (Exception e) {

            aux.mensaje("Error " + e.getMessage(), "informativo");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[] no_guia = new int[ListaDeviajes.getRowCount()];
        int[] codigoArea = new int[ListaDeviajes.getRowCount()];
        try {
            //UPDATE trafico_guia SET no_carta = @no_carta ,fecha_vencimiento = @fecha_vencimiento WHERE no_guia=@no_guia  and id_area=@id_area

            if (aux.mensajeConfirmacion("Deseas liberar " + ListaDeviajes.getRowCount() + " Cartas de cobro ") == 0) {
                
                for (int i = 0; i < ListaDeviajes.getRowCount(); i++) {
                    no_guia[i] = Integer.parseInt(ListaDeviajes.getValueAt(i, 18).toString());
                    codigoArea[i] = Integer.parseInt(ListaDeviajes.getValueAt(i, 19).toString());

                }

                if (func.liberacionCartaDeCobro(no_guia, codigoArea).equalsIgnoreCase("success")) {

                    aux.mensaje("Se liberaron correctamente las " + ListaDeviajes.getRowCount() + " Cartas de cobro ", "informativo");

                    String[] cartaGuias = jTextField1.getText().trim().split(" ");
                    boolean estado = checkEstado.isSelected();
                    mostrar(cartaGuias, estado,true);

                } else {
                    aux.mensaje("No se liberaron las " + ListaDeviajes.getRowCount() + " Carta Porte ", "informativo");
                }

            }

        } catch (Exception e) {
            aux.mensaje("Error " + e.getMessage(), "informativo");
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckRemision;
    private javax.swing.JTable ListaDeviajes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel totalRegistros;
    private javax.swing.JTextField txtFechaBaja;
    // End of variables declaration//GEN-END:variables
}
