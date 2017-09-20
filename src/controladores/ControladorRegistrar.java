/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAO.Coneccion;
import DAO.Consulta;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author PC16
 */
public class ControladorRegistrar implements MouseListener{

    private JTextField txtUsuario;
    private JTextField txtClave;
    private JTextField txtClave2;
    private JTextField txtEmail;
    
    public ControladorRegistrar(JTextField txtUsuario, JTextField txtClave, JTextField txtClave2, JTextField txtEmail) {

        this.txtUsuario = txtUsuario;
        this.txtClave = txtClave;
        this.txtClave2 = txtClave2;
        this.txtEmail = txtEmail;
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
          Coneccion conn = new Coneccion("localhost", "root", "", "base_turnos");
        try {
            conn.conectar();
            Consulta unaConsulta = new Consulta();
            unaPersona = unaConsulta.recuperarPersonaUsuClave(conn.getCnx(), pUsu.getText(), pClave.getText());
            System.out.println(unaPersona);
            conn.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBienvenidoEntrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorBienvenidoEntrar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
