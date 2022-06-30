package Logica;

import Helpers.Ayudas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class fDespAsignacion {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    public int total_kilometros = 0;

    public DefaultTableModel showData(int no_viaje, int id_area) {

        DefaultTableModel modelo;
        int contador = 1;

        String[] columnas
                = {
                    "Numero Asignacion","Numero Guia","Unidad","Remolque 1",
                    "Dolly","Remolque 2","Fecha Cita Carga","Numero Viaje",
                    "Estatus viaje","Nombre Ruta","Sucursal","Usuario Ingreso",
                    "Kms","Modalidad","Folio","Trayecto","Expedicion","Numero guia",
                    "Estatus","Estatus Carta Porte","Factura","Operador"
                };

        SQL = "SELECT da.num_asignacion, tg.no_guia ,da.id_unidad,da.id_remolque1,da.id_dolly,da.id_remolque2, f_cita,da.no_viaje,\n"
                + "CASE WHEN status_asignacion = 0 THEN 'Todos' \n"
                + "WHEN status_asignacion =  1 THEN 'Capturado'\n"
                + "WHEN status_asignacion = 2 THEN 'Asignado'\n"
                + "WHEN status_asignacion = 3 THEN 'Entregado'\n"
                + "WHEN status_asignacion = 4 THEN 'Cancelado'\n"
                + "WHEN status_asignacion = 5 THEN 'En Transito'\n"
                + "END estatus,tc.desc_ruta,a.nombrecorto,da.id_ingreso, da.kms_ruta,\n"
                + "CASE WHEN da.id_remolque2 = '' THEN 'Sencillo' WHEN da.id_remolque1 = '' and da.id_remolque2 = '' THEN 'Sin estatus' ELSE 'Full' END Modalidad,\n"
                + "CASE WHEN da.id_ruta = da.ruta_regreso THEN  da.remision_vje_r ELSE da.remision_vje_i  END as FolioComplemento,\n"
                + "CASE WHEN da.id_ruta = da.ruta_regreso THEN 'Regreso' ELSE 'Ida' END as Trayecto,\n"
                + "da.tipo_expedicion,\n"
                + "tg.num_guia, \n"
                + "CASE WHEN tg.num_guia_asignado is null THEN 'Sin facturar' ELSE 'Facturado' END estatus, \n"
                + "CASE WHEN  tg.status_guia = 'C' THEN 'Confirmado' \n"
                + "WHEN tg.status_guia = 'R' THEN  'Regreso' \n"
                + "WHEN tg.status_guia = 'A' THEN 'Pendiente'\n"
                + "WHEN tg.status_guia = 'T' THEN 'Transito'\n"
                + "WHEN tg.status_guia = 'B' THEN 'Cancelado'\n"
                + "END  estatusCartaPorte,\n"
                + "CASE WHEN num_guia_asignado is null THEN num_guia ELSE num_guia_asignado END Factura,\n"
                + "pp.nombre\n"
                + "\n"
                + "from dbo.desp_asignacion da\n"
                + "join dbo.trafico_ruta tc on tc.id_ruta = da.id_ruta\n"
                + "join dbo.general_area a on a.id_area = da.id_area\n"
                + "left join dbo.trafico_guia tg on tg.id_area = da.id_area and tg.no_viaje = da.no_viaje\n"
                + "join dbo.personal_personal pp on pp.id_personal = da.id_personal\n"
                + "where da.no_viaje = ? and da.id_area = ?";

        String[] registros = new String[columnas.length];

        modelo = new DefaultTableModel(null, columnas);

        try {

            PreparedStatement pst = con.prepareCall(SQL);
            pst.setInt(1, no_viaje);
            pst.setInt(2, id_area);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                for (int i = 0; i < registros.length; i++) {

                    registros[i] = rs.getString(contador);
                    contador++;

                }
                contador = 1;
                modelo.addRow(registros);

            }

            return modelo;

        } catch (SQLException e) {
            return null;
        }

    }
    
    public boolean actualizarDespAsignacion(int numeroViaje , int codigoArea, int estatus){
        
        
        try {
            
            SQL =  "UPDATE desp_asignacion SET status_asignacion = ? WHERE no_viaje = ? and id_area = ?";    
            PreparedStatement pst = con.prepareCall(SQL);
            pst.setInt(1, estatus);
            pst.setInt(2, numeroViaje);
            pst.setInt(3, codigoArea);
            
            
            pst.execute();
            
            return true;
            
            
            
        } catch (SQLException e) {
            return false;
        }
        
        
    }
    
    
}
