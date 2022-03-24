/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import Helpers.crud;
import Modelo.Ruta;
import Vista.Viajes.frmBarraProgreso;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ricardo Herrera
 */
public class fViajes {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    Ruta ruta = new Ruta();
    frmBarraProgreso progreso = new frmBarraProgreso();

    public DefaultTableModel showdata(String buscar) {

        DefaultTableModel modelo;

        String[] columnas = {
            "No de viaje", "Codigo Area", "Unidad", "Fecha Cita", "Fecha Arribo",
            "Remolque 1", "Remolque 2", "Dolly", "id Asignacion", "Nombre Ruta", "IdRuta", "Origen", "Destino",
            "Tipo viaje", "Sucursal", "Km", "Folio", "Numero de guia",
            "Flete", "Tipo de Expedicion", "Nombre del operador", "Telefono Operador", "Total viaticos", "Fecha de confirmacion viaticos",
            "Concepto de dispersion", "Condicional Pepsi", "Direccion", "Fecha de creacion",
            "Numero de guia", "Expedicion", "Estatus del viaje"
        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarviajesZemog(?) }");
            cst.setString(1, buscar);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("NoViaje");
                registros[1] = rs.getString("id_area");
                registros[2] = rs.getString("Tracto");
                registros[3] = rs.getString("CitaCarga");
                registros[4] = rs.getString("f_arribo_prog");
                registros[5] = rs.getString("Remolque1");
                registros[6] = rs.getString("Remolque2");
                registros[7] = rs.getString("Dolly");
                registros[8] = rs.getString("id_asignacion");
                registros[9] = rs.getString("Ruta");
                registros[10] = rs.getString("idRuta");
                registros[11] = rs.getString("Origen");
                registros[12] = rs.getString("Destino");
                registros[13] = rs.getString("tipo_viaje");
                registros[14] = rs.getString("Sucursal");
                registros[15] = rs.getString("kms");
                registros[16] = rs.getString("Folio");
                registros[17] = rs.getString("num_guia");
                registros[18] = rs.getString("flete");
                registros[19] = rs.getString("Expedicion");
                registros[20] = rs.getString("NombreOperador1");
                registros[21] = rs.getString("TelefonoOperador1");
                registros[22] = rs.getString("TotalViatico");
                registros[23] = rs.getString("FechaConfirmacionDispersion");
                registros[24] = rs.getString("num_guia");
                registros[25] = rs.getString("Estatus");

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensajeLateral("Error", "Error en la consulta fviajes " + e.getMessage(), "error");
            return null;
        }

    }

    public DefaultTableModel showdataFordate(String fechaInicio, String fechafinal, String[] buscar) {
        DefaultTableModel modelo;

        String[] columnas = {
            "No de viaje", "Codigo Area", "Unidad", "Fecha Cita",
            "Remolque 1", "Remolque 2", "Dolly", "id Asignacion", "Nombre Ruta", "Origen", "Destino", "EstadoOrigen", "EstadoDestino",
            "Sucursal", "Km", "Folio", "Numero de guia",
            "Tarifa", "Venta Total", "Tipo de Expedicion", "Nombre del operador", "Total viaticos", "Fecha de confirmacion viaticos",
            "Concepto de dispersion", "Condicional Pepsi", "Direccion", "Fecha de creacion",
            "Numero de guia", "FolioComplemento", "Operacion", "Estatus", "Usuario Alta", "Venta Real", "Tipo cobro", "Factura", "Estatus de la factura", "Horas Transcurridas",
            "Estatus Carta Porte", "Numero de Pedido", "Carta cobro"
        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            for (int i = 0; i < buscar.length; i++) {
                
                CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarviajesZemog(?,?,?) }");
                cst.setString(1, fechaInicio);
                cst.setString(2, fechafinal);
                cst.setString(3, buscar[i]);
                ResultSet rs = cst.executeQuery();

                while (rs.next()) {

                    registros[0] = rs.getString("NoViaje");
                    registros[1] = rs.getString("id_area");
                    registros[2] = rs.getString("Unidad");
                    registros[3] = rs.getString("CitaCarga");
                    registros[4] = rs.getString("Remolque1");
                    registros[5] = rs.getString("Remolque2");
                    registros[6] = rs.getString("Dolly");
                    registros[7] = rs.getString("id_asignacion");
                    registros[8] = rs.getString("Ruta");
                    registros[9] = rs.getString("Origen");
                    registros[10] = rs.getString("Destino");
                    registros[11] = rs.getString("EstadoOrigen");
                    registros[12] = rs.getString("EstadoDestino");
                    registros[13] = rs.getString("Sucursal");
                    registros[14] = rs.getString("kms");
                    registros[15] = rs.getString("Folio");
                    registros[16] = rs.getString("num_guia");
                    registros[17] = rs.getString("flete");
                    registros[18] = rs.getString("TotalVenta");
                    registros[19] = rs.getString("Expedicion");
                    registros[20] = rs.getString("NombreOperador1");
                    registros[21] = rs.getString("TotalViaticos");
                    registros[22] = rs.getString("FechaConfirmacionDispersion");
                    registros[23] = rs.getString("ConceptosDispersion");
                    registros[24] = rs.getString("CondicionalPepsi");
                    registros[25] = rs.getString("Trayecto");
                    registros[26] = rs.getString("FechaCreacion");
                    registros[27] = rs.getString("no_guia");
                    registros[28] = rs.getString("FolioComplemento");
                    registros[29] = rs.getString("nombreCortoOperacion");
                    registros[30] = rs.getString("Estatus");
                    registros[31] = rs.getString("usuarioAlta");
                    registros[32] = rs.getString("VentaReal");
                    registros[33] = rs.getString("Tipo_Cobro");
                    registros[34] = rs.getString("Factura");
                    registros[35] = rs.getString("EstatusFactura");
                    registros[36] = rs.getString("HorasTranscurridas");
                    registros[37] = rs.getString("EstatusCartaPorte");
                    registros[38] = rs.getString("numeroPedido");
                    registros[39] = rs.getString("CartaCobro");
                    
                    totalRegistros = totalRegistros + 1;

                    modelo.addRow(registros);
                }

            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la consulta fviajes " +e.getMessage(), "Error");
            return null;
        }

    }

    public DefaultTableModel resumenIndicador(String fechaInicio, String fechafinal) {
        DefaultTableModel modelo;

        String[] columnas = {"Sucursal", "Dia", "Kilometros", "Numero Viajes", "Venta", "Promedio km"};

        String[] registros = new String[columnas.length + 1];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_resumenKilometros(?,?)}");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechafinal);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1); // Sucursal
                registros[1] = rs.getString(2); // Dia
                registros[2] = rs.getString(3); // Km
                registros[3] = rs.getString(4); // numeroViajes
                registros[4] = rs.getString(5); // Venta
                registros[5] = rs.getString(6); // PromedioViajes

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);

            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fviajes " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }

    }

    public DefaultTableModel resumenIndicadorOperacion(String fechaInicio, String fechafinal, String operacion) {
        DefaultTableModel modelo;

        String[] columnas = {"Sucursal", "Operacion", "Dia", "Kilometros", "Numero Viajes", "Venta", "Promedio km"};

        String[] registros = new String[columnas.length + 1];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_resumenKilometros(?,?,?)}");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechafinal);
            cst.setString(3, operacion);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1); // Sucursal
                registros[1] = rs.getString(2); // Sucursal
                registros[2] = rs.getString(3); // Dia
                registros[3] = rs.getString(4); // Km
                registros[4] = rs.getString(5); // numeroViajes
                registros[5] = rs.getString(6); // Venta
                registros[6] = rs.getString(7); // PromedioViajes

                totalRegistros = totalRegistros + 1;
                //total_kilometros = total_kilometros + rs.getInt(4);
                modelo.addRow(registros);

            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fviajes " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }

    }

    public DefaultTableModel ViaticosDispersos(String NuemeroFolio, String Sucursal) {
        DefaultTableModel modelo;

        String[] columnas = {"Fecha Cita", "Kilometros", "# de viaje", "# de area", "Nombre Operador", "Nombre de la ruta", "Folio ida", "Folio regreso", "Estatus de anticipo", "Sucursal", "Fecha deposito", "Monto Anticipo", "Registro de usuario", "Fecha de ingreso", "Observaciones", "Detalle"};

        Object[] registros = new String[columnas.length];
        System.out.println("Tamano  del arreglo " + columnas.length);

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call mostrarGasto (?,?)}");
            cst.setString(1, NuemeroFolio);
            cst.setString(2, Sucursal);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString(1); //Fecha Cita
                registros[1] = rs.getString(2); //Km
                registros[2] = rs.getString(3); //#numero de viaje
                registros[3] = rs.getString(4); //# de area
                registros[4] = rs.getString(5);//Nombre Operador
                registros[5] = rs.getString(6);//Nombre de la ruta
                registros[6] = rs.getString(7);//Folio de ida
                registros[7] = rs.getString(8);//Folio de regreso
                registros[8] = rs.getString(9);//Estatus anticipo
                registros[9] = rs.getString(10); // Sucursal
                registros[10] = rs.getString(11); // Fecha deposito
                registros[11] = rs.getString(12); // Ingreso
                registros[12] = rs.getString(13); // Fecha Ingreso
                registros[13] = rs.getString(14); // Observaciones
                registros[14] = rs.getString(15); // Detalle
                registros[15] = rs.getString(16); // Detalle

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);

            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la funcion fviajes viatico aqui esta el errror  " + e.getMessage() + e.getErrorCode(), "Alerta");
            return null;
        }

    }

    public void cargarDB_Excel(String fechaInicio, String fechafinal, String buscar) {
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Detalle de viajes");

        //Creamos una fila cero para las columnas
        Row fila0 = hoja.createRow(0);

        String[] columnas = {"Numero de viaje",
            "Numero de area",
            "Numero Economico",
            "Fecha Cita Carga",
            "Fecha Cita Carga",
            "Remolque1",
            "Remolque2",
            "Dolly",
            "Id Asignacion",
            "Nombre Ruta",
            "id Ruta",
            "Origen",
            "Destino",
            "EstadoOrigen",
            "EstadoDestino",
            "id_asignacion_orig",
            "Tipo Viaje",
            "Sucursal",
            "Km PWO ZAM",
            "Km reales",
            "Folio",
            "Numero Guia",
            "Venta",
            "Total Venta",
            "Expedicion",
            "Numero Adicional",
            "Id Operador1",
            "Nombre Operador1",
            "Telefono Operador1",
            "Id Operador2",
            "Telefono Operador2",
            "Numero Asignacion",
            "Total Viaticos",
            "Fecha Dispersion",
            "Conceptos Dispersion",
            "Condicional Pepsi",
            "Trayecto",
            "Fecha Creacion",
            "Numero Guia",
            "Folio Complemento",
            "nombre Operacion",
            "Estatus",
            "usuarioAlta",
            "Venta Real",
            "Numero Cobro",
            "Factura",
            "Estatus Factura",
            "Folio Separado",};

        //recorremos el arreglo
        for (int i = 0; i < columnas.length; i++) {

            Cell celda = fila0.createCell(i);
            celda.setCellValue(columnas[i]);
        }

        int numFila = 1;

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrarviajesZemog(?,?,?) }");
            cst.setString(1, fechaInicio);
            cst.setString(2, fechafinal);
            cst.setString(3, buscar);

            ResultSet rs = cst.executeQuery();

            //Numero de columnas
            int numCol = rs.getMetaData().getColumnCount();

            while (rs.next()) {

                Row filaDatos = hoja.createRow(numFila);

                for (int i = 0; i < numCol; i++) {
                    Cell celda = filaDatos.createCell(i);

                    if (i == 0 || i == 1 || i == 18 || i == 19 || i == 22 || i == 23 || i == 43 || i == 32 || i == 23) {
                        celda.setCellValue(rs.getDouble(i + 1));
                    } else if (i == 3 || i == 4 || i == 33 || i == 37) {
                        celda.setCellValue(rs.getDate(i + 1));
                    } else {
                        celda.setCellValue(rs.getString(i + 1));
                    }

                }

                numFila++;
            }

            String nombreArchivo = "ViajesZEMOG.xlsx";
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            libro.write(archivo);
            archivo.close();
            File objetoFila = new File(nombreArchivo);
            Desktop.getDesktop().open(objetoFila);

            try {
                Thread.sleep(1000);
                help.mensaje("Excel descagado saticfactoriamente !!! ", "Success");
            } catch (InterruptedException ex) {
                Logger.getLogger(fViajes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException e) {
            help.mensaje("error ", "Error");
        } catch (SQLException ex) {
            help.mensaje("Error en el " + fSucursal.class.getName() + ex.getMessage() + " Contacta al adm de sistema al ricardo.herrera@zemog.com.mx", "Error");

        }

    }

    public boolean liberacionCartaPorte(String numeroGuia, String estatusGuia, String prestamo) {

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_liberar_carta_porte(?,?,?)}");
            cst.setString(1, numeroGuia);
            cst.setString(2, estatusGuia);
            cst.setString(3, prestamo);

            int nEjecucion = cst.executeUpdate();

            if (nEjecucion != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            help.mensajeLateral("Ocurrio un error al intentar actualizar el estatus de " + e.getMessage(), "Validacion denegada", "fallo");
            return false;
        }

    }

    public boolean cancelacion_Carta_Porte(int codigoArea, int numeroViaje, String estatusGuia, String prestamo, String comentarios, String estatusAnticipo, int estatusPedido, int estatusAsignacion, String cartaPorte,String accion) {

        try {
            
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_Cancelar_Carta_Porte(?,?,?,?,?,?,?,?,?,?)}");
            cst.setInt(1, codigoArea);
            cst.setInt(2, numeroViaje);
            cst.setString(3, estatusGuia);
            cst.setString(4, prestamo);
            cst.setString(5, comentarios);
            cst.setString(6, estatusAnticipo);
            cst.setInt(7, estatusPedido);
            cst.setInt(8, estatusAsignacion);
            cst.setString(9, cartaPorte);
            cst.setString(10, accion);
            
            cst.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public List<Ruta> rutas(Ruta rut) {

        try {
            List<Ruta> lista = new ArrayList<>();

            PreparedStatement pst = con.prepareCall("select id_ruta ,desc_ruta, kms_ruta from dbo.trafico_ruta where desc_ruta like '%" + rut.getNombreRuta() + "%'");
            //pst.setString(1, rut.getNombreRuta());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                rut.setId_ruta(rs.getInt(1));
                rut.setNombreRuta(rs.getString(2));
                rut.setKmRuta(rs.getInt(3));

                lista.add(rut);

            }

            return lista;

        } catch (SQLException e) {

            return null;
        }

    }

    public boolean update_numero_pedido(String numeroPedido, String numeroGuia) {

        try {

            PreparedStatement pst = con.prepareCall("update dbo.trafico_guia set campo1=? where num_guia=?");
            pst.setString(1, numeroPedido);
            pst.setString(2, numeroGuia);

            pst.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public DefaultTableModel showDataCancel(String fechaInicio, String fechafinal, String[] buscar) {
        DefaultTableModel modelo;

        String[] columnas = {"FechaCita", "Unidad", "NumeroViaje", "Sucursal",
            "CodigoArea", "EstatusDelViaje", "NumeroGuia", "Factura",
            "EstatusCartaPorte", "FechaCancelacion", "Comentarios",
            "EstatusGuia", "Folio", "NombreRuta", "Kilometros",
            "EstatusPedido",
            "Usuario Modifico",
            "Venta"
        };

        Object[] registros = new String[columnas.length];
 
        modelo = new DefaultTableModel(null, columnas);

        try {

            for (int i = 0; i < buscar.length; i++) {
                
                CallableStatement cts = con.prepareCall("{call sp_ZEMOG_mostrar_viajes_cancelados(?,?,?)}");
                
                cts.setString(1, fechaInicio);
                cts.setString(2, fechafinal);
                cts.setString(3, buscar[i]);

                ResultSet rs = cts.executeQuery();

                while (rs.next()) {

                    registros[0] = rs.getString(1);
                    registros[1] = rs.getString(2);
                    registros[2] = rs.getString(3);
                    registros[3] = rs.getString(4);
                    registros[4] = rs.getString(5);
                    registros[5] = rs.getString(6);
                    registros[6] = rs.getString(7);
                    registros[7] = rs.getString(8);
                    registros[8] = rs.getString(9);
                    registros[9] = rs.getString(10);
                    registros[10] = rs.getString(11);
                    registros[11] = rs.getString(12);
                    registros[12] = rs.getString(13);
                    registros[13] = rs.getString(14);
                    registros[14] = rs.getString(15);
                    registros[15] = rs.getString(16);
                    registros[16] = rs.getString(17);
                    registros[17] = rs.getString(18);

                    modelo.addRow(registros);

                }
            }

            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }
    
    public String update_trafico_viaje(String estado, int num_viaje , int codigo_area){
        
        try {
            
            PreparedStatement cst = con.prepareCall("update dbo.trafico_viaje set status_viaje=? where no_viaje=? and id_area =? ");
            cst.setString(1, estado);
            cst.setInt(2, num_viaje);
            cst.setInt(3, codigo_area);
            
            cst.execute();
            
            return "success";
            
            
        } catch (SQLException e) {
        
            return "Error  " + e.getMessage();
        }
        
    }
    
    

    
    
}
