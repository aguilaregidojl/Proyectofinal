/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java
 */
public class modeloResumenGestor {
    
    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;

    public void listarResumen() {
        String sql = "SELECT SUM(Ingresos) FROM (SELECT ingreso_anual AS Ingresos FROM Finanzas UNION ALL SELECT ingresos_alquiler AS Ingresos FROM Inmuebles) AS Ingresos;";

        try {
            Modelo.conexion con = new Modelo.conexion();
            ps = con.getConection().prepareStatement(sql);
            //st = con.createStatement();
            rs = ps.executeQuery(sql);

            while (rs.next()) {
                //double ingresos = rs.getDouble("SUM(Ingresos)");
                //clientes.setIngresos(ingresos);

            }
        } catch (SQLException err) {
        }
    }
    
}
