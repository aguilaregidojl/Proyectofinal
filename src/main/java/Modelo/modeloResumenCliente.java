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
public class modeloResumenCliente {

    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;

    public void listarResumen() {
        String sql = "SELECT * FROM Finanzas";
        try {
            //con = getConection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            int ingresos = 0;

            while (rs.next()) {
                ingresos = rs.getInt("Ingresos");
            }

        } catch (SQLException err) {
        }
    }

}
