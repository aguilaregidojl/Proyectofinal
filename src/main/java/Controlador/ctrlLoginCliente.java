/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Modelo.modeloLoginCliente;
import Vista.loginCliente;
import Vista.resumenCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class ctrlLoginCliente implements ActionListener {

    private final loginCliente vista;
    private final conexion modelo;
    private final clientes clientes;

    public ctrlLoginCliente(loginCliente vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.clientes = clientes;
        this.modelo = modelo;
        this.vista.btnIngresocliente.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Iniciar Sesión (Cliente)");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresocliente) {
            modeloLoginCliente mod = new modeloLoginCliente();
            mod.validarusuario(vista.textUsuariocliente, vista.textContraseñaCliente);
            if (mod.isValid() == true) {
                resumenCliente vista2 = new resumenCliente();
                ctrlResumenCliente ctrl = new ctrlResumenCliente(vista2, modelo, clientes);
                ctrl.iniciar();
                vista2.setVisible(true);
            } else {
                System.exit(1);
            }

        }
    }

}
