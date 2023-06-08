/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author java
 */
public class conexion {
    
    public static Connection getConection() throws SQLException {
        Connection con = null;
        String base = "fortunadb"; //Nombre de la base de datos
        String url = "jdbc:mysql://www.db4free.net:3306/" + base; //Direccion, puerto y nombre de la Base de Datos
        String user = "grupo2dicampus"; //Usuario de Acceso a MySQL
        String password = "grupo2dicampus"; //Password del usuario
        
        //Ahora un try catch

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
    

