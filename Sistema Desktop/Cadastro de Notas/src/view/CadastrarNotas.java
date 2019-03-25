package view;

import classes.Aluno;
import classes.Materias;
import classes.Notas;
import dao.NotaDAO;
import javax.swing.JOptionPane;

public class CadastrarNotas extends javax.swing.JInternalFrame {

    public CadastrarNotas() {
        initComponents();
    }
    
    public Notas getNotas() {
        Notas notas = new Notas();
        Aluno aluno = new NotaDAO().getAluno(Integer.parseInt(txtRA.getText()));
        Materias materias = new NotaDAO().getMaterias(Integer.parseInt(txtMateria.getText()));
        
        notas.setId_aluno(aluno.getId_aluno());
        notas.setId_materia(materias.getId_materia());
        notas.setNota_bimestre1(Integer.parseInt(txtNota1.getText()));
        notas.setNota_bimestre2(Integer.parseInt(txtNota2.getText()));
        notas.setNota_bimestre3(Integer.parseInt(txtNota3.getText()));
        notas.setNota_bimestre4(Integer.parseInt(txtNota4.getText()));
        notas.setNota_final(Integer.parseInt(txtNotaFinal.getText()));
        
        return notas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        lblRA = new javax.swing.JLabel();
        txtRA = new javax.swing.JTextField();
        lblRA1 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        txtNomeMateria = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        lblNome4 = new javax.swing.JLabel();
        txtNota3 = new javax.swing.JTextField();
        lblNome5 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        txtNota4 = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        txtNotaFinal = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnPesquisaAluno = new javax.swing.JButton();
        btnPesquisaMateria = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Nota");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Leelawadee", 1, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jPanel1.setLayout(null);

        txtNome.setEditable(false);
        jPanel1.add(txtNome);
        txtNome.setBounds(90, 90, 200, 30);

        lblNome.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome.setText("Nome: ");
        jPanel1.add(lblNome);
        lblNome.setBounds(20, 90, 70, 30);

        lblNome1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome1.setText("Turma:");
        jPanel1.add(lblNome1);
        lblNome1.setBounds(20, 130, 70, 30);

        txtTurma.setEditable(false);
        jPanel1.add(txtTurma);
        txtTurma.setBounds(90, 130, 80, 30);

        lblRA.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblRA.setText("RA:");
        jPanel1.add(lblRA);
        lblRA.setBounds(20, 50, 70, 30);
        jPanel1.add(txtRA);
        txtRA.setBounds(90, 50, 120, 30);

        lblRA1.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblRA1.setText("Cód Matéria:");
        jPanel1.add(lblRA1);
        lblRA1.setBounds(350, 50, 110, 30);
        jPanel1.add(txtMateria);
        txtMateria.setBounds(460, 50, 70, 30);

        lblNome2.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome2.setText("Nome: ");
        jPanel1.add(lblNome2);
        lblNome2.setBounds(390, 90, 70, 30);

        txtNomeMateria.setEditable(false);
        jPanel1.add(txtNomeMateria);
        txtNomeMateria.setBounds(460, 90, 200, 30);

        lblNome3.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome3.setText("1º Bimestre:");
        jPanel1.add(lblNome3);
        lblNome3.setBounds(20, 230, 80, 30);
        jPanel1.add(txtNota1);
        txtNota1.setBounds(120, 230, 70, 30);

        lblNome4.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome4.setText("3º Bimestre:");
        jPanel1.add(lblNome4);
        lblNome4.setBounds(20, 280, 80, 30);
        jPanel1.add(txtNota3);
        txtNota3.setBounds(120, 280, 70, 30);

        lblNome5.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome5.setText("2º Bimestre:");
        jPanel1.add(lblNome5);
        lblNome5.setBounds(220, 230, 80, 30);
        jPanel1.add(txtNota2);
        txtNota2.setBounds(320, 230, 70, 30);

        lblNome6.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome6.setText("4º Bimestre:");
        jPanel1.add(lblNome6);
        lblNome6.setBounds(220, 280, 80, 30);
        jPanel1.add(txtNota4);
        txtNota4.setBounds(320, 280, 70, 30);

        lblNome7.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        lblNome7.setText("Nota Final:");
        jPanel1.add(lblNome7);
        lblNome7.setBounds(430, 230, 80, 30);

        txtNotaFinal.setEditable(false);
        jPanel1.add(txtNotaFinal);
        txtNotaFinal.setBounds(530, 230, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 670, 430);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(590, 480, 100, 30);

        btnPesquisaAluno.setText("Pesquisar Aluno");
        btnPesquisaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaAluno);
        btnPesquisaAluno.setBounds(290, 480, 140, 30);

        btnPesquisaMateria.setText("Pesquisar Matéria");
        btnPesquisaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaMateria);
        btnPesquisaMateria.setBounds(440, 480, 140, 30);

        setBounds(0, 0, 762, 599);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if(txtNota1.getText().equals("") || Integer.parseInt(txtNota1.getText()) < 0 || Integer.parseInt(txtNota1.getText()) > 10){
           JOptionPane.showMessageDialog(null, "Informe uma Nota Válida de 0 a 10", "Campos Inválidos", JOptionPane.WARNING_MESSAGE);
       } else if (txtNota2.getText().equals("") || Integer.parseInt(txtNota2.getText()) < 0 || Integer.parseInt(txtNota2.getText()) > 10){
           JOptionPane.showMessageDialog(null, "Informe uma Nota Válida de 0 a 10", "Campos Inválidos", JOptionPane.WARNING_MESSAGE);
       } else if (txtNota3.getText().equals("") || Integer.parseInt(txtNota3.getText()) < 0 || Integer.parseInt(txtNota3.getText()) > 10){
           JOptionPane.showMessageDialog(null, "Informe uma Nota Válida de 0 a 10", "Campos Inválidos", JOptionPane.WARNING_MESSAGE);
       } else if (txtNota4.getText().equals("") || Integer.parseInt(txtNota4.getText()) < 0 || Integer.parseInt(txtNota4.getText()) > 10){
           JOptionPane.showMessageDialog(null, "Informe uma Nota Válida de 0 a 10", "Campos Inválidos", JOptionPane.WARNING_MESSAGE);
       } else if (txtRA.getText().equals("") || txtMateria.getText().equals("") || txtNome.getText().equals("") || txtNomeMateria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Verifique RA e Matéria!", "Campos Vazios", JOptionPane.WARNING_MESSAGE);
        }  else  {
           
           int notafinal;
           notafinal = (Integer.parseInt(txtNota1.getText()) + Integer.parseInt(txtNota2.getText()) + Integer.parseInt(txtNota3.getText())  + Integer.parseInt(txtNota4.getText())) / 4;
           txtNotaFinal.setText(notafinal + "");
 
           Notas not = getNotas();
           String resp = new NotaDAO().inserirNotas(not);
                
                if(resp.equals("OK")){
                    JOptionPane.showMessageDialog(null, "Nota Cadastrada com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um Erro ao Tentar Cadastrar a Nota!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaAlunoActionPerformed
        if(txtRA.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o RA do Aluno", "Campos Vazios", JOptionPane.WARNING_MESSAGE);
        } else {
            Aluno aluno = new NotaDAO().getAluno(Integer.parseInt(txtRA.getText()));
            if(aluno.getCod_ra() != Integer.parseInt(txtRA.getText())){
                JOptionPane.showMessageDialog(null, "RA Não Cadastrado!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                txtNome.setText(aluno.getNome());
                txtTurma.setText(aluno.getTurma());
            }
        }
    }//GEN-LAST:event_btnPesquisaAlunoActionPerformed

    private void btnPesquisaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaMateriaActionPerformed
        if(txtMateria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o Código da Matéria Para Qual Deseja Aplicar Nota", "Campos Vazios", JOptionPane.WARNING_MESSAGE);
        } else {
            Materias materias = new NotaDAO().getMaterias(Integer.parseInt(txtMateria.getText()));
            if(materias.getId_materia() != Integer.parseInt(txtMateria.getText())){
                JOptionPane.showMessageDialog(null, "Matéria Não Cadastrada!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                txtNomeMateria.setText(materias.getNome());
            }
        }
    }//GEN-LAST:event_btnPesquisaMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisaAluno;
    private javax.swing.JButton btnPesquisaMateria;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblRA;
    private javax.swing.JLabel lblRA1;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMateria;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNotaFinal;
    private javax.swing.JTextField txtRA;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
