/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author java
 */
@Getter
@Setter
public class modeloLoginCliente {

    boolean valid = false;

    int id;

    public boolean isValid() {
        return valid;
    }

    public void validarusuario(JTextField usuario, JPasswordField contraseña) {
        try {

            ResultSet rs;
            PreparedStatement ps;
            Modelo.conexion objetoconexion = new Modelo.conexion();
            String consulta = "SELECT * FROM Clientes WHERE Clientes.dni = (?) AND Clientes.telefono = (?) ;";
            ps = objetoconexion.getConection().prepareStatement(consulta);

//transformar password en variable string tipo cadena y llamamos la variable string
            String contra = String.valueOf(contraseña.getPassword());
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);

            ResultSet rs2;
            PreparedStatement ps2;
            String consulta2 = "SELECT * FROM Clientes WHERE Clientes.dni ='" + (usuario.getText()) + "'";
            ps2 = objetoconexion.getConection().prepareStatement(consulta2);
            rs2 = ps2.executeQuery(consulta2);
            int idcliente;
            while (rs2.next()) {
                idcliente = rs2.getInt("idClientes");
                System.out.println(idcliente);
            }

            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                valid = true;

            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto vuelva a intentar");
                valid = false;
            }

        } catch (Exception e) {
            System.out.println("Error " + e.toString());
        }

    }
}
