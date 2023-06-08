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

/**
 *
 * @author java
 */
public class modeloLoginGestor {
   public void validarusuario(JTextField usuario, JPasswordField contraseña){
       try {
           ResultSet rs;
           PreparedStatement ps;
           Modelo.conexion objetoconexion = new Modelo.conexion();
           String consulta="SELECT * FROM Gestores WHERE Gestores.dni = (?) AND Gestores.telefono = (?);";
           ps=objetoconexion.getConection().prepareStatement(consulta);
           
           //transformar password en variable string tipo cadena y llamamos la variable string
           String contra= String.valueOf(contraseña.getPassword());
         
           ps.setString(1, usuario.getText());
           ps.setString(2, contra);
           
           rs = ps.executeQuery();
           if (rs.next()) {
               JOptionPane.showMessageDialog(null, "El usuario es correcto");
               
           }
           else{
               JOptionPane.showMessageDialog(null, "Usuario incorrecto vuelva a intentar");
              
           }
           
           
                   
       } catch (Exception e) {
           System.out.println("Error " +e.toString());
       }
       
   }
}
