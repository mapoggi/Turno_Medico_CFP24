/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;


import controladorInicio.ControladorRegistrarse;
import controladorInicio.ControladorSolicitudTurno;
import controladorInicio.ControladorTurnosDisponibles;
import controladorInicio.ControladorWindowsInicio;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import visual.Bienvenido;
import visual.MenuPrincipal;

import visual.Bienvenido;


/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
       //Jlogin login = new Jlogin();

     //   Jpersona persona = new Jpersona();

        Bienvenido holaMundo = new Bienvenido();
        holaMundo.setVisible(true);
        holaMundo.setAlwaysOnTop(true);


    }
    
}
