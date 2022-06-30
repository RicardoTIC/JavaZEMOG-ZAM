package Helpers;

import Vista.Indicadores.frmResumenCapi;
import com.toedter.calendar.JDateChooser;
import ds.desktop.notify.DesktopNotify;
import ds.desktop.notify.NotifyTheme;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Ayudas {

    JLabel label = new JLabel();

    public Ayudas() {
        label.setText("Ricardo");

    }

    public void popTable(String BotonCerrarPantalla,String BotonMaximizarPantalla,String BotonNombreMinimizarPantalla, JInternalFrame frame, JPopupMenu MenuCierre,JPanel panel ){

        //JMenuItem menu1 = new JMenuItem("Cerrar Pantalla", new ImageIcon(getClass().getResource("/Imagenes/cancel_77947.png")).getImage().getScaledInstance((int) MenuCierre, MenuCierre.getWidth(), Image.SCALE_SMOOTH));
        JMenuItem menu1 = new JMenuItem(BotonCerrarPantalla, new ImageIcon(getClass().getResource("/Imagenes/cancel_77947.png")));
        JMenuItem menu2 = new JMenuItem(BotonMaximizarPantalla, new ImageIcon(getClass().getResource("/Imagenes/outline_text_snippet_black_24dp.png")));
        JMenuItem menu3 = new JMenuItem(BotonNombreMinimizarPantalla, new ImageIcon(getClass().getResource("/Imagenes/outline_add_black_24dp.png")));

        
        menu1.addActionListener((ActionEvent ae) -> {
            frame.dispose();
        });
        
        menu2.addActionListener((ActionEvent e) -> {
            try {
                frame.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmResumenCapi.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        
        menu3.addActionListener((ActionEvent e) -> {
            
        });

        MenuCierre.add(menu1);
        MenuCierre.add(menu2);
        MenuCierre.add(menu3);

        panel.setComponentPopupMenu(MenuCierre);

    }

    public void ocultar_tabla(JTable tabla) {

        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void mensajeLateral(String titulo, String mensaje, String accion) {
        DesktopNotify.setDefaultTheme(NotifyTheme.Dark);
        switch (accion) {
            case "aceptado":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.SUCCESS);
                break;
            case "error":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.ERROR);
                break;
            case "estandar":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.DEFAULT);
                break;
            case "ayuuda":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.HELP);
                break;
            case "cuidado":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.WARNING);
                break;
            case "pregunta":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.INPUT_REQUEST);
                break;
            case "fallo":
                DesktopNotify.showDesktopMessage(titulo, mensaje, DesktopNotify.FAIL);
                break;

        }

    }

    public int mensajeRespues(String titulo, String mensaje) {
        int respuesta = DesktopNotify.INPUT_REQUEST;
        return respuesta;

    }

    public void mensaje(String mensaje, String tipoAlerta) {

        if (tipoAlerta.equalsIgnoreCase("Error")) {
            JOptionPane.showMessageDialog(null, mensaje, tipoAlerta, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, mensaje, tipoAlerta, JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void mensajeError(String action) {
        JOptionPane.showMessageDialog(null, "Error en la consulta o clase : ", action, JOptionPane.ERROR_MESSAGE);
    }

    public void mensajeActualizacionDatos(String action) {
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente", action, JOptionPane.QUESTION_MESSAGE);
    }

    public void mensajeGuardado(String action) {
        JOptionPane.showMessageDialog(null, "Datos guardados correctamente ", action, JOptionPane.DEFAULT_OPTION);
    }

    public void mensajeEliminado(String action) {
        JOptionPane.showMessageDialog(null, "Datos eliminados correctamente ", action, JOptionPane.INFORMATION_MESSAGE);
    }

    public int mensajeConfirmacion(String mensaje) {

        int respuesta = JOptionPane.showConfirmDialog(null, mensaje);
        return respuesta;
    }

    public void centrarPantalla(JDesktopPane ventan1, Container venta2) {

        Dimension pantalla1 = ventan1.getSize();
        Dimension pantalla2 = venta2.getSize();

        venta2.setLocation((pantalla1.width - pantalla2.width) / 2, (pantalla1.height - pantalla2.height) / 2);

    }

    public void limpiardorCajas(JTextComponent[] cajas, JComboBox []cbo, JDateChooser [] fechas) {

        for (int i = 0; i < cajas.length; i++) {
            
            cajas[i].setText("");
            cbo[i].setSelectedIndex(0);
            fechas[i].setDate(new Date());
            
        }
        

    }

    public boolean validacionCajas(JTextField[] cajas) {

        for (int i = 0; i < cajas.length; i++) {

            if (cajas[i].getText().length() == 0) {
                this.mensaje("No ingresaste un datos " + cajas[i].getName(), "Informativa");
                cajas[i].requestFocus();
                return false;

            }

        }

        return true;

    }

    public String invertirNumero(int numero) {
        int resto = 0;
        int invertido = 0;

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        return "" + numero;
    }

    public void ordernarColumnas(JTable tabla, int ancho, int nColumnas) {

        tabla.getColumnModel().getColumn(nColumnas).setMaxWidth(ancho);
        tabla.getColumnModel().getColumn(nColumnas).setMinWidth(ancho);
        tabla.getColumnModel().getColumn(nColumnas).setPreferredWidth(ancho);

    }

    public void seleccionar_datos(JTable tabla, JTextComponent[] cajas) {

        int fila = tabla.getSelectedRow();

        for (int i = 0; i < cajas.length; i++) {

            cajas[i].setText(tabla.getValueAt(fila, i).toString());

            fila++;

        }

    }

}
