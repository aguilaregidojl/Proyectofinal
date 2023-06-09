/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Swing.tablaClientes;
import Vista.resumenCliente;
import Vista.vistaActivosClienteFinanza;
import Vista.vistaClientes;
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
    int id;

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
        id = clientes.getId();
        vista.intIngresos.setText(Integer.toString(clientes.getIngresos()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnFinancieros) {
            vistaActivosClienteFinanza vista = new vistaActivosClienteFinanza();
            //ctrlVistaClientes ctrl = new ctrlVistaClientes(vista, modelo, clientes);
            //ctrl.iniciar();
            //vista.setVisible(true);
        }
    }

}
