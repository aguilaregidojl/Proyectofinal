/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Modelo.modeloLoginGestor;
import Modelo.modeloResumenCliente;
import Modelo.modeloResumenGestor;
import Vista.loginGestor;
import Vista.pantallaInicio;
import Vista.resumenCliente;
import Vista.resumenGestor;
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
        this.vista.btnVolvergestor.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Iniciar Sesión (Gestor)");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresogestor) {
            modeloLoginGestor mod = new modeloLoginGestor();
            mod.validarusuario(vista.textusuariogestor, vista.textContraseñaGestor);
            if (mod.isValid() == true) {
                resumenGestor vista2 = new resumenGestor();
                modeloResumenGestor mod2 = new modeloResumenGestor();
                ctrlResumenGestor ctrl = new ctrlResumenGestor(vista2, modelo, clientes, mod2);
                ctrl.iniciar();
                vista2.setVisible(true);
                vista.setVisible(false);
            } else {
                vista.textContraseñaGestor.setText(null);
                vista.textusuariogestor.setText(null);
            }
        }
        if (e.getSource() == vista.btnVolvergestor) {
            pantallaInicio vista2 = new pantallaInicio();
            ctrlInicio ctrl2 = new ctrlInicio(vista2, modelo, clientes);
            ctrl2.iniciar();
            vista2.setVisible(true);
            vista.setVisible(false);
        }
    }

}
