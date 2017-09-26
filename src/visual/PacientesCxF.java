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
public class PacientesCxF extends javax.swing.JFrame {

   
    public PacientesCxF() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CONSULTA POR FECHA DE PACIENTES");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRegist = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApelli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaIni = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        btonBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btonLimpiar = new javax.swing.JButton();
        VolverMenuPrincipal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Consultas por Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 732, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PACIENTES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 724, -1));

        jLabel6.setText("Registro N°");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        txtRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 147, 68, -1));

        jLabel1.setText("Nombre/s:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 174, -1, -1));

        txtNombr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombr, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 171, 377, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 200, -1, -1));

        txtApelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelliActionPerformed(evt);
            }
        });
        getContentPane().add(txtApelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 197, 377, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("DATOS del PACIENTE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 133, 133, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Fechas de Consulta");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 235, 119, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Especialidad", "Profesional", "Consultorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(4).setMinWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 235, 558, 282));

        jLabel7.setText("Hasta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 282, -1, -1));

        jLabel8.setText("Desde:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 258, -1, -1));

        txtFechaIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIniActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 255, 103, -1));

        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 279, 103, -1));

        btonBuscar.setText("BUSCAR");
        getContentPane().add(btonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 100, 90));

        btonLimpiar.setText("LIMPIAR");
        btonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, 30));

        VolverMenuPrincipal.setText("VOLVER");
        VolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(VolverMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 156, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/prg2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverMenuPrincipalActionPerformed
        Pacientes paciente = new Pacientes();
        paciente.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_VolverMenuPrincipalActionPerformed

    private void btonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiarActionPerformed
       txtApelli.setText("");
       txtFechaFin.setText("");
       txtFechaIni.setText("");
       txtNombr.setText("");
       txtRegist.setText("");
    }//GEN-LAST:event_btonLimpiarActionPerformed

    private void txtRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistActionPerformed
        txtRegist.transferFocus();
    }//GEN-LAST:event_txtRegistActionPerformed

    private void txtNombrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrActionPerformed
        txtNombr.transferFocus();
    }//GEN-LAST:event_txtNombrActionPerformed

    private void txtApelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelliActionPerformed
        txtApelli.transferFocus();
    }//GEN-LAST:event_txtApelliActionPerformed

    private void txtFechaIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIniActionPerformed
        txtFechaIni.transferFocus();
    }//GEN-LAST:event_txtFechaIniActionPerformed

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        txtFechaFin.transferFocus();
    }//GEN-LAST:event_txtFechaFinActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VolverMenuPrincipal;
    private javax.swing.JButton btonBuscar;
    private javax.swing.JButton btonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApelli;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaIni;
    private javax.swing.JTextField txtNombr;
    private javax.swing.JTextField txtRegist;
    // End of variables declaration//GEN-END:variables
}
