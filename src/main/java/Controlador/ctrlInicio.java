/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Vista.loginCliente;
import Vista.loginGestor;
import Vista.pantallaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class ctrlInicio implements ActionListener {

    private final pantallaInicio vista;
    private final conexion modelo;
    private final clientes clientes;

    public ctrlInicio(pantallaInicio vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.modelo = modelo;
        this.clientes = clientes;
        this.vista.btnTipocliente.addActionListener(this);
        this.vista.btnTipogestor.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Bienvenido a Fortuna Investments");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnTipocliente) {
            loginCliente vista2 = new loginCliente();
            ctrlLoginCliente ctrl = new ctrlLoginCliente(vista2, modelo, clientes);
            ctrl.iniciar();
            vista2.setVisible(true);
            vista.setVisible(false);
        }
        if (e.getSource() == vista.btnTipogestor) {
            loginGestor vista2 = new loginGestor();
            ctrlLoginGestor ctrl = new ctrlLoginGestor(vista2, modelo, clientes);
            ctrl.iniciar();
            vista2.setVisible(true);
            vista.setVisible(false);
        }
    }

}
