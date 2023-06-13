/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Modelo.modeloResumenCliente;
import Modelo.modeloResumenGestor;
import Swing.tablaClientes;
import Vista.resumenCliente;
import Vista.resumenGestor;
import Vista.vistaActivosCliente;
import Vista.vistaClientes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class ctrlResumenGestor implements ActionListener {

    private final resumenGestor vista;
    private final conexion modelo;
    private final clientes clientes;
    private final modeloResumenGestor mod2;
    int id;

    public ctrlResumenGestor(resumenGestor vista, conexion modelo, clientes clientes, modeloResumenGestor mod2) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.mod2 = mod2;
        this.vista.btnClientes.addActionListener(this);
        this.vista.btnFinancierosgestores.addActionListener(this);
        this.vista.btnInmobiliariosgestores.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Resumen de Cliente");
        vista.setLocationRelativeTo(null);
        id = clientes.getId();
        mod2.listarResumen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnClientes) {
            vistaClientes vista2 = new vistaClientes();
            conexion mod = new conexion();
            clientes clientes = new clientes();
            ctrlVistaClientes ctrl2 = new ctrlVistaClientes(vista2, mod, clientes);
            ctrl2.iniciar();
            vista2.setVisible(true);
        }
    }

}
