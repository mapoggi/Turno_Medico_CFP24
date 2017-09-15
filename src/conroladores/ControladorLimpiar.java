/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conroladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class ControladorLimpiar implements MouseListener{
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtGenero;
    private JTextField txtCelular;
    private JTextField txtDni;
    private JTextField txtEmail;
    private JTextField txtUsuario;
    private JTextField txtContraseña;

public ControladorLimpiar(JTextField txtNombre, JTextField txtApellido, JTextField txtDireccion, JTextField txtGenero, JTextField txtCelular, JTextField txtDni, JTextField txtEmail, JTextField txtUsuario, JTextField txtContraseña) {
        this.txtNombre = txtNombre;
        this.txtApellido = txtApellido;
        this.txtDireccion = txtDireccion;
        this.txtGenero = txtGenero;
        this.txtCelular = txtCelular;
        this.txtDni = txtDni;
        this.txtEmail = txtEmail;
        this.txtUsuario = txtUsuario;
        this.txtContraseña = txtContraseña;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtDni.setText("");
        txtCelular.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtNombre.grabFocus();
        
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
