/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Modelo.conexion;
import Vista.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java
 */
public class ctrlTablaClientes implements ActionListener {

    private final vistaClientes vista;
    private final conexion modelo;
    private final clientes clientes;
    Connection con;
    PreparedStatement ps = null;
    DefaultTableModel modelotabla;
    Statement st;
    ResultSet rs;
    int id;

    public ctrlTablaClientes(vistaClientes vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.vista.btnCrear.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnBorrar.addActionListener(this);
        this.vista.btnGuardarCrear.addActionListener(this);
        this.vista.btnCancelarCrear.addActionListener(this);
        this.vista.btnGuardarActualizar.addActionListener(this);
        this.vista.btnCancelarActualizar.addActionListener(this);
        this.vista.btnBorrarBorrar.addActionListener(this);
        this.vista.btnCancelarBorrar.addActionListener(this);
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

    public void actutabla() {
        ((DefaultTableModel) vista.TablaDatos.getModel()).setNumRows(0);
        listar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCrear) {
            vista.panelCrear.setVisible(true);
            vista.panelActualizar.setVisible(false);
            vista.panelBorrar.setVisible(false);
            actutabla();
        }
        if (e.getSource() == vista.btnActualizar) {
            vista.panelCrear.setVisible(false);
            vista.panelActualizar.setVisible(true);
            vista.panelBorrar.setVisible(false);
            actutabla();
        }
        if (e.getSource() == vista.btnBorrar) {
            vista.panelCrear.setVisible(false);
            vista.panelActualizar.setVisible(false);
            vista.panelBorrar.setVisible(true);
            actutabla();
        }
        if (e.getSource() == vista.btnCancelarActualizar) {
            limpiarCajas();
        }
        if (e.getSource() == vista.btnCancelarCrear) {
            limpiarCajas();
        }
        if (e.getSource() == vista.btnCancelarBorrar) {
            limpiarCajas();
        }
        if (e.getSource() == vista.btnGuardarActualizar) {
            clientes.setId(Integer.parseInt(vista.intIdActualizar.getText()));
            clientes.setNombre(vista.txtNombreActualizar.getText());
            clientes.setApellidos(vista.txtApellidoActualizar.getText());
            clientes.setTelefono(Integer.parseInt(vista.intTelefonoActualizar.getText()));
            clientes.setDni(Integer.parseInt(vista.intDniActualizar.getText()));

            try {
                con = modelo.getConection();
                ps = con.prepareStatement("UPDATE Clientes SET nombre='" + clientes.getNombre() + "', apellidos='" + clientes.getApellidos() + "', telefono='" + clientes.getTelefono() + "', dni='" + clientes.getDni() + "' WHERE idClientes='" + clientes.getId() + "'");

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar Cliente");
                }

                limpiarCajas();
                actutabla();
                con.close();

            } catch (HeadlessException | SQLException err) {
                System.err.println(err);
            }

        }

        if (e.getSource() == vista.btnGuardarCrear) {
            try {
                con = modelo.getConection();
                ps = con.prepareStatement("INSERT INTO Clientes (nombre, apellidos, telefono, dni) VALUES(?,?,?,?) ");
                ps.setString(1, vista.txtNombreCrear.getText());
                ps.setString(2, vista.txtApellidoCrear.getText());
                ps.setString(3, vista.intTelefonoCrear.getText());
                ps.setString(4, vista.intDniCrear.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Crear Cliente");
                }

                limpiarCajas();
                actutabla();
                con.close();

            } catch (HeadlessException | SQLException err) {
                System.err.println(err);
            }
        }
        
    }

    public void listar() {

        String sql = "SELECT * FROM Clientes";
        try {
            con = modelo.getConection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[5];
            modelotabla = (DefaultTableModel) vista.TablaDatos.getModel();

            while (rs.next()) {
                cliente[0] = rs.getInt("idClientes");
                cliente[1] = rs.getString("nombre");
                cliente[2] = rs.getString("apellidos");
                cliente[3] = rs.getInt("telefono");
                cliente[4] = rs.getInt("dni");
                modelotabla.addRow(cliente);
            }
            vista.TablaDatos.setModel(modelotabla);
        } catch (SQLException err) {
        }
    }

}
