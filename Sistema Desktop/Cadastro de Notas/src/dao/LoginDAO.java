package dao;

import classes.Aluno;
import classes.Professor;
import classes.Unidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public Professor getProfessor(String login, String senha){
        Professor professor = new Professor();
        
        try {
            Connection con = Conecta.getConexao();
            String query = "SELECT * FROM tb_professor WHERE login=? AND senha=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                professor.setId_professor(rs.getInt("id_professor"));
                professor.setNome(rs.getString("nome"));
                professor.setLogin(rs.getString("login"));
                professor.setSenha(rs.getString("senha"));
                professor.setId_unidade(rs.getInt("id_unidade"));
                professor.setId_materia(rs.getInt("id_materia"));
            } else {
                professor = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            professor = null;
        }
        return professor;
    }
    
    public Unidade getUnidade(int id_unidade, int id_professor){
        Unidade unidade = new Unidade();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM tb_unidade WHERE id_unidade=? AND id_professor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_unidade);
            ps.setInt(2, id_professor);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                unidade.setId_unidade(rs.getInt("id_unidade"));
                unidade.setNome(rs.getString("nome"));
                unidade.setId_professor(rs.getInt("id_professor"));
            } else {
                unidade = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            unidade = null;
        }
        return unidade;
    }
    
    public Aluno getAluno(int ra, String senha){
        Aluno aluno = new Aluno();
        
        try {
            Connection con = Conecta.getConexao();
            String query = "SELECT * FROM tb_aluno WHERE cod_ra=? AND senha=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ra);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setCod_ra(rs.getInt("cod_ra"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSenha(rs.getString("senha"));
                aluno.setId_unidade(rs.getInt("id_unidade"));
            } else {
                aluno = null;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            aluno = null;
        }
        return aluno;
    }
}
