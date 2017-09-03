/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladorPersona.ControladorCancelar;
import controladorPersona.ControladorLimpiar;
import controladorPersona.ControladorModificar;
import controladorPersona.ControladorRegistrar;
import controladorPersona.ControladorwindowsPersona;
import java.awt.GridLayout;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Jpersona extends JFrame{
    
    private JButton registrar = new JButton("REGISTRARSE");
    private JButton modificar = new JButton("MODIFICAR");
    private JButton cancelar = new JButton("CANCELAR");
    private JButton limpiar = new JButton("LIMPIAR");
    private JLabel lblNombre = new JLabel("NOMBRES : ");
    private JLabel lblApellido = new JLabel("APELLIDOS : ");
    private JLabel lblGenero = new JLabel("GENERO : ");
    private JLabel lblDireccion = new JLabel("DIRECCION : ");
    private JLabel lblCelular = new JLabel("CELULAR : ");
    private JLabel lblDni = new JLabel("DNI : ");
    private JLabel lblEmail = new JLabel("EMAIL : ");
    private JTextField txtNombre = new JTextField("");
    private JTextField txtApellido = new JTextField("");
    private JTextField txtGenero = new JTextField("");
    private JTextField txtDireccion = new JTextField("");
    private JTextField txtCelular = new JTextField("");
    private JTextField txtDni = new JTextField("");
    private JTextField txtEmail = new JTextField("");
    private JTextField txtUsuario = new JTextField("");
    private JTextField txtContraseña = new JTextField("");
    
    //arraylist 
   /* private ArrayList<String> personaIngresado = new ArrayList<String>();
    private JList<String> unaLista = new JList<String>();

    private JList<String>listaPersona = new JList<String>();*/
    
    private GridLayout contenedor = new GridLayout(10,2);
    
    private ControladorCancelar controladorCancelar = new ControladorCancelar(txtApellido,txtCelular,txtContraseña,txtDireccion,txtDni,txtEmail,txtGenero,txtNombre,txtUsuario);
    private ControladorRegistrar controladorRegistrar = new ControladorRegistrar(txtApellido,txtCelular,txtContraseña,txtDireccion,txtDni,txtEmail,txtGenero,txtNombre,txtUsuario);
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(txtApellido,txtCelular,txtContraseña,txtDireccion,txtDni,txtEmail,txtGenero,txtNombre,txtUsuario);
    private ControladorModificar controladorModificar = new ControladorModificar(txtApellido,txtCelular,txtContraseña,txtDireccion,txtDni,txtEmail,txtGenero,txtNombre,txtUsuario);
    private ControladorwindowsPersona controladorwindowsPersona = new ControladorwindowsPersona();
    
    public Jpersona(){
        
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("REGISTRATE");
        this.setLocation(300, 300);
        this.setSize(900, 300);
        this.setVisible(true);
        this.contenedor.setHgap(20);
        this.contenedor.setVgap(20);
       
        this.registrar.addMouseListener(controladorRegistrar);
        this.limpiar.addMouseListener(controladorLimpiar);
        this.modificar.addMouseListener(controladorModificar);
        this.cancelar.addMouseListener(controladorCancelar);
    }

    private void agregarComponentes() {

        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblApellido);
        this.add(txtApellido);
        this.add(lblGenero);
        this.add(txtGenero);
        this.add(lblDni);
        this.add(txtDni);
        this.add(lblDireccion);
        this.add(txtDireccion);
        this.add(lblCelular);
        this.add(txtCelular);
        this.add(lblEmail);
        this.add(txtEmail);
        this.add(registrar);
        this.add(modificar);
        this.add(cancelar);
        this.add(limpiar);
    }
    
    
    
    
}

