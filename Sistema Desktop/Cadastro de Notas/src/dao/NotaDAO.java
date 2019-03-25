package dao;

import classes.Aluno;
import classes.Materias;
import classes.Notas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class NotaDAO {

   public String inserirNotas(Notas notas){
        String resp = "";
        try
        {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_notas(id_aluno, id_materia, nota_primeiro_bimestre, nota_segundo_bimestre, nota_terceiro_bimestre, nota_quarto_bimestre, nota_final)VALUES(?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, notas.getId_aluno());
            ps.setInt(2, notas.getId_materia());
            ps.setInt(3, notas.getNota_bimestre1());
            ps.setInt(4, notas.getNota_bimestre2());
            ps.setInt(5, notas.getNota_bimestre3());            
            ps.setInt(6, notas.getNota_bimestre4());                       
            ps.setInt(7, notas.getNota_final());
            
            ps.execute();
            ps.close();
            con.close();            
            
            resp = "OK";
        }
        catch(Exception e)
        {
            resp = "Erro: " + e.toString();
        }
        return resp;
    }
       
    public Aluno getAluno(int cod_ra) {
        Aluno aluno = new Aluno();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_aluno WHERE cod_ra = " + cod_ra;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
                aluno.setId_aluno(rs.getInt("id_aluno"));
                aluno.setTurma(rs.getString("turma"));
                aluno.setCod_ra(rs.getInt("cod_ra"));
                aluno.setNome(rs.getString("nome"));
                aluno.setId_unidade(rs.getInt("id_unidade"));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return aluno;
    }
    
     public Materias getMaterias(int id_materia) {
        Materias materia = new Materias();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_materias WHERE id_materia = " + id_materia;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
                materia.setId_materia(rs.getInt("id_materia"));
                materia.setNome(rs.getString("nome"));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return materia;
    }
}


