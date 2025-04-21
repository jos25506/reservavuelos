/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservavuelos;

import java.sql.*;

/**
 *
 * @author chelo
 */
public class conexion {
       Connection con = null;
    String base = "vuelos";//nombre de la base de datos
    String url = "jdbc:mysql://localhost:3306/" + base;//direccion, puerto y nombre de la bd
    String user = "root";//usuario de acceso mysql
    String password = "";
 
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
    
}
