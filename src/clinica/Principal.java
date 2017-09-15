/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import DAO.Coneccion;
import java.sql.SQLException;
import visual.Bienvenido;




/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       //Jlogin login = new Jlogin();

     //   Jpersona persona = new Jpersona();
     
        
        
      
        Bienvenido holaMundo = new Bienvenido();
        holaMundo.setVisible(true);
        holaMundo.setAlwaysOnTop(true);


    }
    
}
