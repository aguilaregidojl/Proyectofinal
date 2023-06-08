/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.controlador;
import Modelo.clientes;
import Modelo.conexion;
import Swing.tablaClientes;
import Vista.vistaClientes;

/**
 *
 * @author java
 */
public class main {

    public static void main(String[] args) {
        conexion conexion = new conexion();
        clientes clientes = new clientes();
        vistaClientes vista = new vistaClientes();
        

        controlador controlador = new controlador(vista, conexion, clientes);
        controlador.iniciar();
        vista.setVisible(true);
        
        
        
        

    }

}
