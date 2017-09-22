/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author Rocio
 */
public class Especialidades extends javax.swing.JFrame {

   
    public Especialidades() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        ConProfesionales = new javax.swing.JButton();
        VolverMenuPrincipal = new javax.swing.JButton();
        RegEspecialidades = new javax.swing.JButton();
        ConFecha = new javax.swing.JButton();
        ConPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESPECIALIDADES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 798, -1));

        ConProfesionales.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConProfesionales.setText("CONSULTA POR PROFESIONAL");
        ConProfesionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConProfesionalesActionPerformed(evt);
            }
        });
        getContentPane().add(ConProfesionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 380, 291, 40));

<<<<<<< HEAD
        VolverMenuPrincipal.setText("Volver al menu principal");
        VolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(VolverMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 550, -1, -1));
=======
        jButton5.setText("Volver al menu principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 550, -1, -1));
>>>>>>> c33e515d3f2cca780d833216e79526bd420429b4

        RegEspecialidades.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegEspecialidades.setText("REGISTRO DE ESPECIALIDADES");
        RegEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(RegEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 233, -1, 40));

        ConFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConFecha.setText("CONSULTA POR FECHA");
        ConFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConFechaActionPerformed(evt);
            }
        });
        getContentPane().add(ConFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 282, 291, 40));

        ConPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConPaciente.setText("CONSULTA POR PACIENTE");
        ConPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(ConPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 331, 291, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 110, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/profesionales 2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEspecialidadesActionPerformed
        
    }//GEN-LAST:event_RegEspecialidadesActionPerformed

    private void ConFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConFechaActionPerformed
        ProfesionalesCxF ProfesionalesCxF = new ProfesionalesCxF();
        ProfesionalesCxF.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_ConFechaActionPerformed

    private void ConPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConPacienteActionPerformed
        ProfesionalesCxP ProfesionalesCxP = new ProfesionalesCxP();
        ProfesionalesCxP.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_ConPacienteActionPerformed

    private void ConProfesionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConProfesionalesActionPerformed
        
    }//GEN-LAST:event_ConProfesionalesActionPerformed

    private void VolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuPrincipalActionPerformed
        Bienvenido inicio = new Bienvenido();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverMenuPrincipalActionPerformed

   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Especialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new Especialidades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConFecha;
    private javax.swing.JButton ConPaciente;
    private javax.swing.JButton ConProfesionales;
    private javax.swing.JButton RegEspecialidades;
    private javax.swing.JButton VolverMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
