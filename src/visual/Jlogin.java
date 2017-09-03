/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladorLogin.ControladorEntrar;
import controladorLogin.ControladorSalir;
import controladorLogin.ControladorWindowsLogin;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Jlogin extends JFrame{
    
    private JButton entrar = new JButton("Entrar");
    private JButton salir = new JButton("Inicio");
    private JLabel lblUsuario = new JLabel("Usuario");
    private JLabel lblClave = new JLabel("Clave");
    private JTextField txtUsuario = new JTextField("");
    private JPasswordField passClave = new JPasswordField("");
    private GridLayout  contenedor = new GridLayout(3,2);
    private ControladorWindowsLogin controladorWindowsLogin = new ControladorWindowsLogin();
    private ControladorEntrar controladorEntrar = new ControladorEntrar(txtUsuario, passClave);
    private ControladorSalir controladorSalir = new ControladorSalir(txtUsuario, passClave);
    
    public Jlogin (){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Login");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.entrar.addMouseListener(controladorEntrar);
        this.salir.addMouseListener(controladorSalir);
       
    }

    private void agregarComponentes() {

        this.add(lblUsuario);
        this.add(txtUsuario);
        this.add(lblClave);
        this.add(passClave);
        this.add(entrar);
        this.add(salir);
        

    }

}
