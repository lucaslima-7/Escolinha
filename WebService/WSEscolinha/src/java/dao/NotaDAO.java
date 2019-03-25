package dao;

import classes.Notas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NotaDAO {
   
    public ArrayList<Notas> getNotas() {

        ArrayList<Notas> lista = new ArrayList<Notas>();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_notas";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Notas notas = new Notas();                
                notas.setId_aluno(rs.getInt("id_aluno"));
                notas.setId_materia(rs.getInt("id_materia"));
                notas.setNota_bimestre1(rs.getInt("nota_primeiro_bimestre"));
                notas.setNota_bimestre2(rs.getInt("nota_segundo_bimestre"));
                notas.setNota_bimestre3(rs.getInt("nota_terceiro_bimestre"));            
                notas.setNota_bimestre4(rs.getInt("nota_quarto_bimestre"));                       
                notas.setNota_final(rs.getInt("nota_final"));

                lista.add(notas);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public Notas getNotas(int id_aluno){
        Notas notas = new Notas();
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM tb_notas WHERE id_aluno="+ id_aluno;
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                notas.setId_aluno(rs.getInt("id_aluno"));
                notas.setId_materia(rs.getInt("id_materia"));
                notas.setNota_bimestre1(rs.getInt("nota_primeiro_bimestre"));
                notas.setNota_bimestre2(rs.getInt("nota_segundo_bimestre"));
                notas.setNota_bimestre3(rs.getInt("nota_terceiro_bimestre"));            
                notas.setNota_bimestre4(rs.getInt("nota_quarto_bimestre"));                       
                notas.setNota_final(rs.getInt("nota_final"));
            }else{
                notas = null;
            }
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return notas;
    }
}


