package view;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCadastrarNotas = new javax.swing.JMenuItem();
        btnCadastrarVoto = new javax.swing.JMenuItem();
        btnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N

        jMenu1.setText("Menu");

        btnCadastrarNotas.setText("Cadastrar Notas");
        btnCadastrarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNotasActionPerformed(evt);
            }
        });
        jMenu1.add(btnCadastrarNotas);

        btnCadastrarVoto.setText("Cadastrar Faltas");
        btnCadastrarVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVotoActionPerformed(evt);
            }
        });
        jMenu1.add(btnCadastrarVoto);

        jMenuBar1.add(jMenu1);

        btnSobre.setText("Sobre");
        btnSobre.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnSobreMenuSelected(evt);
            }
        });
        jMenuBar1.add(btnSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(878, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNotasActionPerformed
        
        CadastrarNotas janelaNotas = new CadastrarNotas();
        janelaNotas.setLocation(50,50);
        janelaNotas.setResizable(false);
        
        this.add(janelaNotas);
        
        janelaNotas.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarNotasActionPerformed

    private void btnCadastrarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVotoActionPerformed
        CadastrarFaltas janelaFaltas = new CadastrarFaltas();
        janelaFaltas.setLocation(50,50);
        janelaFaltas.setResizable(false);
        
        this.add(janelaFaltas);
        
        janelaFaltas.setVisible(true);
    }//GEN-LAST:event_btnCadastrarVotoActionPerformed

    private void btnSobreMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnSobreMenuSelected
        Sobre sobre = new Sobre();
        sobre.setLocation(50,50);
        sobre.setResizable(false);
        
        this.add(sobre);
        
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreMenuSelected

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCadastrarNotas;
    private javax.swing.JMenuItem btnCadastrarVoto;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
