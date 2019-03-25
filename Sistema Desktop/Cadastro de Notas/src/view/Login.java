package view;

import classes.Professor;
import classes.Unidade;
import dao.LoginDAO;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Notas");
        setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        jPanel1.setLayout(null);
        jPanel1.add(txt_login);
        txt_login.setBounds(190, 120, 220, 30);

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel2.setText("Cadastro de Notas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 50, 160, 30);

        btn_entrar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.setToolTipText("Realizar o Login");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_entrar);
        btn_entrar.setBounds(200, 280, 110, 40);

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 180, 70, 30);
        jPanel1.add(txt_senha);
        txt_senha.setBounds(190, 180, 220, 30);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setText("Login:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 120, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 520, 380);

        setSize(new java.awt.Dimension(613, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        int codigo_unidade;
        int codigo_professor;
        
        if(txt_login.getText().equals("") || txt_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");
        } else {
            Professor professor = new LoginDAO().getProfessor(txt_login.getText(), txt_senha.getText());
            if (professor == null){
                JOptionPane.showMessageDialog(null, "Login Inválido!");
            } else if (txt_login.getText().equals(professor.getLogin()) && txt_senha.getText().equals(professor.getSenha())){
                JOptionPane.showMessageDialog(null, "Login Aceito!!");
                
                codigo_unidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá Professor " +  professor.getNome() +  " , por favor informe o código de sua unidade! ", "Confirmar Unidade", JOptionPane.INFORMATION_MESSAGE));
                codigo_professor = professor.getId_professor();
                
                Unidade unidade = new LoginDAO().getUnidade(codigo_unidade, codigo_professor);

                if (unidade == null){
                    JOptionPane.showMessageDialog(null, "Unidade Inválida, Favor Refazer Login!");
                } else if (codigo_professor == unidade.getId_professor() && codigo_unidade == unidade.getId_unidade()){
                    JOptionPane.showMessageDialog(null, "Você Fez Login em " + unidade.getNome());
                    new Principal().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Não Está Liberado Nesta Unidade!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login Inválido!");
            }
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
