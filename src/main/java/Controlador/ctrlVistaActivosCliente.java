/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Vista.vistaActivosCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class ctrlVistaActivosCliente implements ActionListener {

    private final vistaActivosCliente vista;
    private final conexion modelo;
    private final clientes clientes;
    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;

    public ctrlVistaActivosCliente(vistaActivosCliente vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.vista.btnFinanzas.addActionListener(this);
        this.vista.btnInmuebles.addActionListener(this);
        this.vista.btnVolver.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Vista de Activos (Cliente)");
        vista.setLocationRelativeTo(null);
        id = clientes.getId();
        listar();
        //mod2.listarResumen();
        //vista.intIngresos.setText(Double.toString(mod2.getIngresos()));
    }
    
    public void listar() {
        String sql = "SELECT * FROM Inmuebles";
        try {
            con = modelo.getConection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] inmueble = new Object[8];
            modelotabla = (DefaultTableModel) vista.tablaActivosInmobiliariosCliente.getModel();

            while (rs.next()) {
                inmueble[0] = rs.getInt("idInmueble");
                inmueble[1] = rs.getDouble("valor");
                inmueble[2] = rs.getDouble("ingresos_alquiler");
                inmueble[3] = rs.getInt("TipoActivo_idTipoActivo");
                inmueble[4] = rs.getDouble("costes_comunidad");
                inmueble[5] = rs.getDouble("costes_impuestos");
                inmueble[6] = rs.getDouble("costes_servicios");
                inmueble[7] = rs.getDouble("balance");
                modelotabla.addRow(inmueble);
            }
            vista.tablaActivosInmobiliariosCliente.setModel(modelotabla);
        } catch (SQLException err) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnFinanzas) {
            vista.tablaActivosFinancierosCliente.setVisible(true);
            vista.tablaActivosInmobiliariosCliente.setVisible(false);
        }
        if (e.getSource() == vista.btnInmuebles) {
            vista.tablaActivosInmobiliariosCliente.setVisible(false);
            vista.tablaActivosFinancierosCliente.setVisible(true);
        }
        if (e.getSource() == vista.btnVolver) {

        }
    }

}
