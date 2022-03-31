
package Logica;

import Helpers.Ayudas;
import Modelo.CartaPorte;
import Modelo.ListaProductos;
import Modelo.Ruta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class fCartaPorte {

    private Conexion sqlServer = new Conexion();
    private Connection con = sqlServer.conectar();
    private String SQL = "";
    public int totalRegistros;
    public Integer kmPlus;
    private int totalKilometros;
    private Ayudas help = new Ayudas();
    public int total_kilometros = 0;
    private CartaPorte carta = new CartaPorte();
    
    
    public String liberacion_factura(String numero_guia){
    
        try {
            
            PreparedStatement pst = con.prepareCall("update dbo.trafico_guia set num_guia_asignado = null where num_guia=?");
            pst.setString(1, numero_guia);
            
            pst.execute();
            
            return "success";
           
        } catch (SQLException e) {
            return "No se puedo actualizar el registros por :"+e.getMessage();
        }
        
    }
    
    public DefaultTableModel mostrar_productos(ListaProductos obj ){
        
        DefaultTableModel modelo;
        int col = 1;
        /*
        String [] columnas = {"Producto","Embalaje","Descripcion","Ubicacion",
            "Num. Piezas","Cantidad","Cve.Unidad","Unidad","Unidad Peso","Peso",
            "Volumen","Peso estimado","Peso Bruto","Peso Neto","Peso Tara","Kgs","Cve.Producto","Dimensiones","Volor Merc",
            "Moneda","Mat.Pelig","Cve. Mat.Pel","Cve.Embalaje","Desc.Embalaje","Fracion arancelaria","UUID comercio exterior","Pedimientos"};
        */
        
        String [] columnas = {"Productos","Embalaje","Descripcion"};
        modelo = new DefaultTableModel(null, columnas);
        String [] registros = new String[columnas.length];
        
        try {
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_producto_carta_porte(?,?)}");
            cst.setInt(1, obj.getNo_guia());
            cst.setInt(2, obj.getId_area());
            
            
            
            ResultSet rs = cst.executeQuery();
            
            while (rs.next()) {                
                
                registros[0] = rs.getString(6);
                registros[1] = rs.getString(9);
                registros[2] = rs.getString(10);

                modelo.addRow(registros);
                
            }
             return modelo;
            
        } catch (SQLException e) {
              return null;
        }
        
    }
    
    public List<CartaPorte> listaDatos(CartaPorte obj ){
    
        try {
            
             List<CartaPorte> lista = new ArrayList<>();
             
            CallableStatement cst = con.prepareCall("{call sp_ZEMOG_mostrar_informcaion_carta_Porte(?)}");
            cst.setString(1, obj.getNum_guia());
            
            System.out.println("Numero de guia  " + obj.getNo_guia());
             
            
            ResultSet rs = cst.executeQuery();
            
            
            if (rs.next()) {
                
                carta.setId_area(rs.getInt(1));
                carta.setNum_guia(rs.getString(2));
                carta.setNum_guia_asignado(rs.getString(3));
                carta.setStatus_guia(rs.getString(5));
                carta.setNum_pedido(rs.getInt(14));
                carta.setFecha_guia(rs.getString(8));
                carta.setNo_viaje(rs.getInt(31));
                carta.setNo_remision(rs.getString(76));
                carta.setId_cliente(rs.getInt(25));
                carta.setNombre_cliente(rs.getString(26));
                carta.setId_convenio(rs.getInt(126));
                carta.setFactor_iva(rs.getFloat(28));
                carta.setNum_guia_asignado(rs.getString(81));
                carta.setId_remitente(rs.getInt(32));
                carta.setNombre_remitente(rs.getString(33));
                carta.setDesc_conducir_de(rs.getString(63));
                carta.setRfc_cliente(rs.getString(35));
                carta.setDomicilio_remitente(rs.getString(164));
                carta.setDesc_destino(rs.getString(58));
                carta.setId_destinatario(rs.getInt(36));
                carta.setNombre_destinatario(rs.getString(37));
                carta.setDomicilio_destinatario(rs.getString(38));
                carta.setCobro_viaje_kms(rs.getDouble(52));
                lista.add(carta);
            }
            
            return lista;
             
            
        } catch (SQLException e) {
            
            return null;
        }
        
    }
    
    
}
