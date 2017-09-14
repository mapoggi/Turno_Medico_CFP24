/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import visual.Jinicio;
import visual.Jlogin;
import visual.Jpersona;
<<<<<<< HEAD
import visual.bienvenido;
import visual.menuprincipal;
=======
import visual.Bienvenido;
>>>>>>> 401ef9684490f0c70ee9c8818ab958a615eb2da5

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
       //Jlogin login = new Jlogin();
<<<<<<< HEAD
     //   Jpersona persona = new Jpersona();
=======
        Bienvenido holaMundo = new Bienvenido();
        holaMundo.setVisible(true);
        holaMundo.setAlwaysOnTop(true);
>>>>>>> 401ef9684490f0c70ee9c8818ab958a615eb2da5
       // Jinicio inicio = new Jinicio();
     //  new menuprincipal().setVisible(true);
         bienvenido menu = new bienvenido();
         menu.setVisible(true);
    }
    
}
