/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladorInicio.ControladorRegistrarse;
import controladorInicio.ControladorSolicitudTurno;
import controladorInicio.ControladorTurnosDisponibles;
import controladorInicio.ControladorWindowsInicio;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Jinicio extends JFrame{
    private JLabel lblNombre = new JLabel("SOLICITUD DE TURNOS MEDICOS");
    private JButton solicitudTurno = new JButton("SOLICITUD DE TURNOS");
    private JButton turnosDisponibles = new JButton("TURNOS DISPONIBLES POR ESPECIALIDAD");
    private JButton registrarse = new JButton("REGISTRARSE");
    private GridLayout contenedor = new GridLayout(4,1);
    private ControladorWindowsInicio controladorWindowsInicio = new ControladorWindowsInicio();
    private ControladorRegistrarse controladorRegistrarse = new ControladorRegistrarse(lblNombre);
    private ControladorTurnosDisponibles controladorTurnosDisponibles = new ControladorTurnosDisponibles();
    private ControladorSolicitudTurno controladorSolicitudTurno = new ControladorSolicitudTurno();
    
     public Jinicio (){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("SOLICITUD DE TURNOS MEDICOS");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.solicitudTurno.addMouseListener(controladorSolicitudTurno);
        this.registrarse.addMouseListener(controladorRegistrarse);
        this.turnosDisponibles.addMouseListener(controladorTurnosDisponibles);
       
    }

    private void agregarComponentes() {

        this.add(lblNombre);
        this.add(solicitudTurno);
        this.add(turnosDisponibles);
        this.add(registrarse);
        

    }
    
}
