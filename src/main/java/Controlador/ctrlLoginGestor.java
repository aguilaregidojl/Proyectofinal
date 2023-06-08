/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Modelo.modeloLoginCliente;
import Vista.loginCliente;
import Vista.loginGestor;
import Vista.resumenCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author java
 */
public class ctrlLoginGestor implements ActionListener {

    private final loginGestor vista;
    private final conexion modelo;
    private final clientes clientes;

    public ctrlLoginGestor(loginGestor vista, conexion modelo, clientes clientes) {
        this.vista = vista;
        this.clientes = clientes;
        this.modelo = modelo;
        this.vista.btnIngresogestor.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Iniciar Sesión (Gestor)");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresogestor) {
            modeloLoginCliente mod = new modeloLoginCliente();
            mod.validarusuario(vista.textUsuarioGestor, vista.textContraseñaGestor);
            resumenCliente vista2 = new resumenCliente();
            ctrlResumenCliente ctrl = new ctrlResumenCliente(vista2, modelo, clientes);
            ctrl.iniciar();
            vista2.setVisible(true);
        }
    }

}
