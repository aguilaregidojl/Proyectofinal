/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ctrlTablaClientes;
import Controlador.ctrlInicio;
import Modelo.clientes;
import Modelo.conexion;
import Vista.pantallaInicio;
import Vista.vistaClientes;

/**
 *
 * @author java
 */
public class main2 {

    public static void main(String[] args) {
        conexion modelo = new conexion();
        clientes clientes = new clientes();
        pantallaInicio vista = new pantallaInicio();

        ctrlInicio controlador = new ctrlInicio(vista, modelo, clientes);
        controlador.iniciar();

        vista.setVisible(true);

    }

}
