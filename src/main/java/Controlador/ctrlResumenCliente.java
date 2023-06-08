/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Vista.pantallaInicio;
import Vista.resumenCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class ctrlResumenCliente implements ActionListener {

    private final resumenCliente vista;
    private final conexion modelo;
    private final clientes clientes;

    public ctrlResumenCliente(resumenCliente vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.vista.btnFinancieros.addActionListener(this);
        this.vista.btnInmobiliarios.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Resumen de Cliente");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
