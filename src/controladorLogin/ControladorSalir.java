/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorLogin;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import visual.Jinicio;

/**
 *
 * @author USER
 */
public class ControladorSalir implements MouseListener{
    private JTextField txtUsuario;
    private JPasswordField passClave;


    public ControladorSalir(JTextField txtUsuario, JPasswordField passClave) {
        this.txtUsuario = txtUsuario;
        this.passClave = passClave;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Jinicio inicio = new Jinicio();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
