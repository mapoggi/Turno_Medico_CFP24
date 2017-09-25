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
        this.setLocationRelativeTo(null);
        this.setTitle("PROFESIONALES");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botCxProf = new javax.swing.JButton();
        botVolver = new javax.swing.JButton();
        botRegistro = new javax.swing.JButton();
        botCxF = new javax.swing.JButton();
        botCxP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESPECIALIDADES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 798, -1));

        botCxProf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxProf.setText("CONSULTA POR PROFESIONAL");
        getContentPane().add(botCxProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 380, 291, 40));

        botVolver.setText("MENU PRINCIPAL");
        botVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, -1));

        botRegistro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegistro.setText("REGISTRO DE ESPECIALIDADES");
        botRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(botRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 233, -1, 40));

        botCxF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxF.setText("CONSULTA POR FECHA");
        botCxF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxFActionPerformed(evt);
            }
        });
        getContentPane().add(botCxF, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 282, 291, 40));

        botCxP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxP.setText("CONSULTA POR PACIENTE");
        getContentPane().add(botCxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 331, 291, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 110, 90));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 680, 600));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/profesionales 2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 800, 600));

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

   

    private void botRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botRegistroActionPerformed

    private void botCxFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botCxFActionPerformed

    private void botVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botVolverActionPerformed
     
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCxF;
    private javax.swing.JButton botCxP;
    private javax.swing.JButton botCxProf;
    private javax.swing.JButton botRegistro;
    private javax.swing.JButton botVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
