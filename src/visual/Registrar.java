/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controladores.ControladorRegistrar;

/**
 *
 * @author PC16
 */
public class Registrar extends javax.swing.JFrame {

  
    public Registrar() {
        initComponents();
         controladorRegistro = new ControladorRegistrar(txtUsuario,txtClave,txtClave2,txtEmail);
        botRegistrar.addMouseListener(controladorRegistro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        lblClave2 = new javax.swing.JLabel();
        txtClave2 = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        botCancelar = new javax.swing.JButton();
        botRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO de USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 131, 320, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 181, 320, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 181, 70, -1));

        lblClave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClave.setText("Contraseña:");
        getContentPane().add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 221, -1, 14));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 221, 320, -1));

        lblClave2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClave2.setText("Repita la contraseña:");
        lblClave2.setOpaque(true);
        getContentPane().add(lblClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 261, 170, -1));
        getContentPane().add(txtClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 261, 320, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("email de seguridad:");
        lblEmail.setOpaque(true);
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 301, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 90));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 301, 320, -1));

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 120, -1));

        botRegistrar.setText("Registrar");
        botRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/Say-Goodbye-to-Coworkers-Step-8-Version-2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistrarActionPerformed
        Bienvenido inicio = new Bienvenido();
        inicio.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_botRegistrarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        Bienvenido inicio = new Bienvenido();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botCancelarActionPerformed

    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrar().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblClave2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClave2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

      private final ControladorRegistrar controladorRegistro;
}
