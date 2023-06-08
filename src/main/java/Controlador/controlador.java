/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import static Modelo.conexion.getConection;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java
 */
public class controlador implements ActionListener {
    private vistaClientes vista;
    private conexion modelo;
    private clientes clientes;
    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;
    
    public controlador (vistaClientes vista, conexion modelo, clientes clientes) {
        this.vista=vista;
        this.modelo=modelo;
        this.clientes=clientes;
        //CAMBIAR POR LOS BOTONES!
        //this.vista.jButton1.addActionListener(this);
    }
    
    public controlador() {
        
    }
    
    public void iniciar() {
        vista.setTitle("Prueba");
        vista.setLocationRelativeTo(null);
        listar();
    }
    
    private void limpiarCajas() {
        vista.txtNombreCrear.setText(null);
        vista.txtApellidoCrear.setText(null);
        vista.txtNombreActualizar.setText(null);
        vista.txtApellidoActualizar.setText(null);
        vista.intIdActualizar.setText(null);
        vista.intIdBorrar.setText(null);
        vista.intTelefonoCrear.setText(null);
        vista.intDniCrear.setText(null);
        vista.intTelefonoActualizar.setText(null);
        vista.intDniActualizar.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void listar() {

        String sql = "SELECT * FROM Clientes";
        try {
            con = getConection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] clientes = new Object[5];
            modelotabla = (DefaultTableModel) vista.TablaDatos.getModel();

            while (rs.next()) {
                clientes[0] = rs.getInt("idClientes");
                clientes[1] = rs.getString("nombre");
                clientes[2] = rs.getString("apellidos");
                clientes[3] = rs.getInt("telefono");
                clientes[4] = rs.getInt("dni");
                modelotabla.addRow(clientes);
            }
            vista.TablaDatos.setModel(modelotabla);
        } catch (Exception e) {
        }
    }
    

    
}
