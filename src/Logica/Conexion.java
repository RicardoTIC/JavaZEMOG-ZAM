/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Helpers.Ayudas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Helpers.Ayudas;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class Conexion {

    //Primero creamos las propiedades  de nuestra clase conexion 
    //public String db = "zemog;";
    public String db = "zemogpruebas;";
    public String user = "Ricardo;";
    // public String user = "Zemog;";
    public String pass = "rhvjinzo101212;";
    //public String url = "jdbc:sqlserver://SRVJZZEMOG-03\\:1433;databaseName=" + db + "user=" + user + "password=" + pass;
    public String url = "jdbc:sqlserver://192.168.100.30\\:1433;databaseName=" + db + "user=" + user + "password=" + pass;
    private Ayudas help = new Ayudas();

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            link = DriverManager.getConnection(url);

        } catch (ClassNotFoundException | SQLException e) {
            help.mensaje("Error en la conexion de base de datos " + e.getMessage(), "Error");
        }
        return link;
    }
    
       private static InetAddress getInet4Address() throws SocketException {
        // Obtén toda la información de la tarjeta de red
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) networkInterfaces.nextElement();
            Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress ip = (InetAddress) addresses.nextElement();
                if (ip instanceof Inet4Address) {
                    return ip;
                }
            }
        }
        return null;
       }

    public String direccionIP() throws UnknownHostException {

        //Declaracion de variables 
        String host = "DESKTOP-KDASVTV";
        String numeroIp = "0.0.0.0";
        String sHostName;

        InetAddress address = InetAddress.getLocalHost();
        sHostName = address.getHostAddress();

        return sHostName;
    }

    public static void main(String[] args) throws UnknownHostException, SocketException {
        Conexion con = new Conexion();

        System.out.println("Direccion IP "+ Conexion.getInet4Address());
    }

}
