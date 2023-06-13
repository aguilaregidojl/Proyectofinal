/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Modelo.modeloResumenCliente;
import Swing.tablaClientes;
import Vista.resumenCliente;
import Vista.vistaActivosClienteFinanzas;
import Vista.vistaClientes;
import java.awt.Color;
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
    private final modeloResumenCliente mod2;
    int id;

    public ctrlResumenCliente(resumenCliente vista, conexion modelo, clientes clientes, modeloResumenCliente mod2) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.mod2 = mod2;
        this.vista.btnFinancieros.addActionListener(this);
        this.vista.btnInmobiliarios.addActionListener(this);

    }

    public void iniciar() {
        vista.setTitle("Resumen de Cliente");
        vista.setLocationRelativeTo(null);
        id = clientes.getId();
        mod2.listarResumen();
        vista.intIngresos.setText(Double.toString(mod2.getIngresos()));
        vista.intCostes.setForeground(Color.red);
        vista.intIngresos.setForeground(Color.green);
        if(mod2.getBalance()>0){
            vista.intBalance.setForeground(Color.green);
        }if(mod2.getBalance()<0){
            vista.intBalance.setForeground(Color.red);
        }if(mod2.getBalance()==0){
            vista.intBalance.setForeground(Color.WHITE);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vista.btnFinancieros) {
            vistaActivosClienteFinanzas vista = new vistaActivosClienteFinanzas();
            //ctrlVistaClientes ctrl = new ctrlVistaClientes(vista, modelo, clientes);
            //ctrl.iniciar();
            //vista.setVisible(true);
        }
    }

}
