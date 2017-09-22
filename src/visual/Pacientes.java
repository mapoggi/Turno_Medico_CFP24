package visual;

public class Pacientes extends javax.swing.JFrame {

      public Pacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botMenuPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botRegPac = new javax.swing.JButton();
        botCxFpaciente = new javax.swing.JButton();
        botCxPpaciente = new javax.swing.JButton();
        botCxEpaciente = new javax.swing.JButton();
        botCxHCpaciente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 0, -1, 90));

        botMenuPrincipal.setText("Volver al menu principal");
        botMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PACIENTES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 400, 50));

        botRegPac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botRegPac.setText("REGISTRO DE PACIENTES");
        botRegPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegPacActionPerformed(evt);
            }
        });
        getContentPane().add(botRegPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 320, 40));

        botCxFpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxFpaciente.setText("CONSULTA POR FECHA");
        botCxFpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxFpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botCxFpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, 40));

        botCxPpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxPpaciente.setText("CONSULTA POR PROFESIONAL");
        botCxPpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxPpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botCxPpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, 40));

        botCxEpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxEpaciente.setText("CONSULTA POR ESPECIALIDAD");
        botCxEpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxEpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botCxEpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 40));

        botCxHCpaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botCxHCpaciente.setText("CONSULTA HISTORIAS CLINICAS");
        botCxHCpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCxHCpacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botCxHCpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/turnos (2).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegPacActionPerformed
        PacienteRegistro regitroPaciente = new PacienteRegistro();
        regitroPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botRegPacActionPerformed

    private void botMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPrincipalActionPerformed
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_botMenuPrincipalActionPerformed

    private void botCxFpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxFpacienteActionPerformed
        PacientesCxF cxfPaciente = new PacientesCxF();
        cxfPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxFpacienteActionPerformed

    private void botCxPpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxPpacienteActionPerformed
       
        PacienteCxP cxpPaciente = new PacienteCxP();
        cxpPaciente.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_botCxPpacienteActionPerformed

    private void botCxEpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxEpacienteActionPerformed
        
        PacienteCxE cxePaciente = new PacienteCxE();
        cxePaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxEpacienteActionPerformed

    private void botCxHCpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCxHCpacienteActionPerformed

        PacienteCxHC cxchPaciente = new PacienteCxHC();
        cxchPaciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCxHCpacienteActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCxEpaciente;
    private javax.swing.JButton botCxFpaciente;
    private javax.swing.JButton botCxHCpaciente;
    private javax.swing.JButton botCxPpaciente;
    private javax.swing.JButton botMenuPrincipal;
    private javax.swing.JButton botRegPac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
