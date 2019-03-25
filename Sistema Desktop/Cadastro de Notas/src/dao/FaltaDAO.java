package dao;

import classes.Aluno;
import classes.Faltas;
import classes.Materias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class FaltaDAO {

    public String inserirFaltas(Faltas faltas){
        String resp = "";
        try
        {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_faltas(id_aluno, id_materia, faltas_primeiro_bimestre, faltas_segundo_bimestre, faltas_terceiro_bimestre, faltas_quarto_bimestre, total_faltas)VALUES(?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, faltas.getId_aluno());
            ps.setInt(2, faltas.getId_materia());
            ps.setInt(3, faltas.getFaltas_bimestre1());
            ps.setInt(4, faltas.getFaltas_bimestre2());
            ps.setInt(5, faltas.getFaltas_bimestre3());            
            ps.setInt(6, faltas.getFaltas_bimestre4());                       
            ps.setInt(7, faltas.getTotal_faltas());
            
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
