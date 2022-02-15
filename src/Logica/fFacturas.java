package Logica;

import Helpers.Ayudas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fFacturas {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;

    public DefaultTableModel showdata(String factura) {

        DefaultTableModel modelo;
        String[] l = {"Nombre", "Ricardo"};

        String[] columnas = {
            "ID Factura",
            "id area",
            "Horas",
            "Estatus Factura",
            "Sucursal",
            "Numero guia",
            "Factura",
            "Estatus guia",
            "Folio",
            "Venta",
            "Estatus",
            "Error Resp",
            "file_name_resp",
            "fecha_solicitud_cancelacion",
            "desc_estatus_cancelacion",
            "id_ingreso",
            "fecha_ingreso",
            "estatus_resp",
            "Estatus",
            "id_area",
            "no_guia",
            "no_certificado",
            "serie",
            "cadena_sat_1",
            "cadena_sat_2",
            "valor_qr",
            "fecha_timbrado",
            "fecha_solicitud_cancelacion",
            "desc_estatus_cancelacion",
            "status_cancel",
            "qr SAT"

        };

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_facturas_canceladas(?) }");
            cst.setString(1, factura);

            ResultSet rs = cst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("id_factura");
                registros[1] = rs.getString("id_area");
                registros[2] = rs.getString("Horas");
                registros[3] = rs.getString("EstatusFactura");
                registros[4] = rs.getString("nombrecorto");
                registros[5] = rs.getString("num_guia");
                registros[6] = rs.getString("num_guia_asignado");
                registros[7] = rs.getString("status_guia");
                registros[8] = rs.getString("no_remision");
                registros[9] = rs.getString("flete");
                registros[10] = rs.getString("status");
                registros[11] = rs.getString("error_desc_resp");
                registros[12] = rs.getString("file_name_resp");
                registros[13] = rs.getString("fecha_solicitud_cancelacion");
                registros[14] = rs.getString("desc_estatus_cancelacion");
                registros[15] = rs.getString("id_ingreso");
                registros[16] = rs.getString("fecha_ingreso");
                registros[17] = rs.getString("estatus_resp");
                registros[18] = rs.getString("Estatus");
                registros[19] = rs.getString("id_area");
                registros[20] = rs.getString("no_guia");
                registros[21] = rs.getString("no_certificado");
                registros[22] = rs.getString("serie");
                registros[23] = rs.getString("cadena_sat_1");
                registros[24] = rs.getString("cadena_sat_2");
                registros[25] = rs.getString("valor_qr");
                registros[26] = rs.getString("fecha_timbrado");
                registros[27] = rs.getString("fecha_solicitud_cancelacion");
                registros[28] = rs.getString("desc_estatus_cancelacion");
                registros[29] = rs.getString("status_cancel");
                registros[30] = rs.getString("valor_qr");

                totalRegistros = totalRegistros + 1;

                modelo.addRow(registros);
            }

            return modelo;

        } catch (SQLException e) {
            help.mensaje("Error en la consulta fviajes", "Error");
            return null;
        }

    }

}
