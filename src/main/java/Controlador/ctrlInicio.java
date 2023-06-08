/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.clientes;
import Modelo.conexion;
import Vista.pantallaInicio;
import Vista.vistaClientes;
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
        vista.setTitle("Prueba");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnTipocliente) {
            vistaClientes nueva = new vistaClientes();
            nueva.setVisible(true);
            
            
            
        }
        if (e.getSource() == vista.btnTipogestor) {
            
        }
    }

}
