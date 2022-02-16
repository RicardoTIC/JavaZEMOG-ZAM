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

public class Conexion {

    //Primero creamos las propiedades  de nuestra clase conexion 
    public String db = "zemog;";
    public String user = "Ricardo;";
    public String pass = "rhvjinzo101212;";
   // public String url = "jdbc:sqlserver://SRVJZZEMOG-03\\:1433;databaseName=" + db + "user=" + user + "password=" + pass;
    public String url = "jdbc:sqlserver://Localhost\\:1433;databaseName=" + db + "user=" + user + "password=" + pass;
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
    

}
