package dao;

import classes.Faltas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FaltaDAO {
       
    public ArrayList<Faltas> getFaltas() {

        ArrayList<Faltas> lista = new ArrayList<Faltas>();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_faltas";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Faltas faltas = new Faltas();                
                faltas.setId_aluno(rs.getInt("id_aluno"));
                faltas.setId_materia(rs.getInt("id_materia"));
                faltas.setFaltas_bimestre1(rs.getInt("faltas_primeiro_bimestre"));
                faltas.setFaltas_bimestre2(rs.getInt("faltas_segundo_bimestre"));
                faltas.setFaltas_bimestre3(rs.getInt("faltas_terceiro_bimestre"));            
                faltas.setFaltas_bimestre4(rs.getInt("faltas_quarto_bimestre"));                       
                faltas.setTotal_faltas(rs.getInt("total_faltas"));

                lista.add(faltas);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public Faltas getFaltas(int id_aluno){
        Faltas faltas = new Faltas();
       
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_faltas WHERE id_aluno="+ id_aluno;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                faltas.setId_aluno(rs.getInt("id_aluno"));
                faltas.setId_materia(rs.getInt("id_materia"));
                faltas.setFaltas_bimestre1(rs.getInt("faltas_primeiro_bimestre"));
                faltas.setFaltas_bimestre2(rs.getInt("faltas_segundo_bimestre"));
                faltas.setFaltas_bimestre3(rs.getInt("faltas_terceiro_bimestre"));            
                faltas.setFaltas_bimestre4(rs.getInt("faltas_quarto_bimestre"));                       
                faltas.setTotal_faltas(rs.getInt("total_faltas"));
            }else{
                faltas = null;
            }
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return faltas;
    }
}
