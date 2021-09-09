/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.ProfessoresAEE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LucioMarlon
 */
public class DAO_ProfessoresAEE {

    Connection conectaBanco = new ConnectionFactory().getConnectionFactory();

    public void adicionar(ProfessoresAEE professores)
    {
        String sql_inserir = "INSERT INTO tbl_professor(professor_aee, "
                + "escola_vinculada, prof_regular,auxiliar_sala,turno_professor, "
                + "dt_cria_professor, estatusprofessor, fk_professor) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir)) 
        {
            stmt.setString(1, professores.getProfessor_aee());
            stmt.setString(2, professores.getEscola_vinculada());
            stmt.setString(3, professores.getProf_regular());
            stmt.setString(4, professores.getAuxiliar_sala());
            stmt.setString(5, professores.getTurno_professor());
            stmt.setString(6, professores.getDt_cria_professor());
            stmt.setString(7, professores.getEstatus());
            stmt.setInt(8, professores.getFk_professor());

            stmt.execute();
            stmt.close();
        } 
        catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão com a tabela "
                      + "professor." + erro.getMessage());
         }   
    }
    


    public void alterarProfessores(ProfessoresAEE professores) 
    {
        String sql_atualizar
                = "UPDATE tbl_professor SET  professor_aee = ?, escola_vinculada = ?, "
                + "prof_regular = ?, auxiliar_sala = ?, turno_professor = ?, "
                + "dt_cria_professor = ?, estatusprofessor = ?, fk_professor = ?  "
                + "WHERE id_professor = ?";

        try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_atualizar)) {
            stmt.setString(1, professores.getProfessor_aee());
            stmt.setString(2, professores.getEscola_vinculada());
            stmt.setString(3, professores.getProf_regular());
            stmt.setString(4, professores.getAuxiliar_sala());
            stmt.setString(5, professores.getTurno_professor());
            stmt.setString(6, professores.getDt_cria_professor());
            stmt.setString(7, professores.getEstatus());
            stmt.setInt(8, professores.getFk_professor());
            stmt.setString(9, professores.getId_professor());

            stmt.execute();
            stmt.close();
        } 
        catch (SQLException erro) {
            throw new RuntimeException("Não foi possível alterar, problema na "
                    + "conexão com a tabela professor." + erro.getMessage());
        }
    }

    public ResultSet listarProfessor() 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();     

 String sqlLista = "select professor_aee, escola_vinculada, prof_regular, "
                    + " auxiliar_sala, turno_professor, date_format(dt_cria_professor, \"%d/%m/%Y\" ) dt_cria_professor, "
                    + " estatusprofessor, nome_escola, id_professor from tbl_escola "
                    + " join tbl_professor "
                    + " on id_escola = fk_professor\n"
                    + " where estatusprofessor like 'A' order by professor_aee;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlLista);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela professor." + erro.getMessage());
            return null;
        }
    }
    
    public ResultSet listar() 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();     

            String sqlLista = "select * from tbl_professor "
                    + " where estatusprofessor like 'A' order by professor_aee; ";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlLista);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela professor." + erro.getMessage());
            return null;
        }
    }
    
    
    public ResultSet BuscarProfessor(
                                         String nome_professor,                                           
                                         String auxiliar_de_sala,
                                         String escola_vinculada,
                                         String nome_escola
                                        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


String sql_pesquisar = "select professor_aee, count(*) qtd_alunos, escola_vinculada, prof_regular,\n"
                    + " auxiliar_sala, turno_professor, date_format(dt_cria_professor, \"%d/%m/%Y\" ) dt_cria_professor,\n"
                    + " estatusprofessor, nome_escola, id_professor from tbl_aluno " 
                    + " join tbl_professor on id_professor = fk_professor_escola "
                    + " join tbl_escola on id_escola = fk_professor\n"
                    + " WHERE ( nome_escola like '%"+nome_escola+"%' OR "
                    + "professor_aee like '%"+nome_professor+"%' "                    
                    + " or escola_vinculada like '%"+auxiliar_de_sala+"%'"
                    + " or auxiliar_sala like '%"+escola_vinculada+"%') AND "
                    + " estatusprofessor like 'A' AND estatus like 'A' GROUP by professor_aee;";


            ResultSet resultadoBusca;
            try
            {
            PreparedStatement stmt = conectaBanco.prepareStatement(sql_pesquisar);
            resultadoBusca = stmt.executeQuery();
            return resultadoBusca;
            
            }
            catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }                 
                        
 }
    
    
    public ResultSet PesquisarProfessor(
                                         String nome_professor,  
                                         String nome_escola,
                                         String auxiliar_de_sala,
                                         String escola_vinculada                                                                                                           
                                        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


String sql_pesquisar = "select  professor_aee, escola_vinculada, "
                    + " prof_regular, auxiliar_sala, "
                    + " turno_professor, date_format(dt_cria_professor, \"%d/%m/%Y\" ) dt_cria_professor, "
                    + " estatusprofessor, nome_escola, id_professor  from tbl_escola" 
                    + " join tbl_professor on id_escola = fk_professor " 
                    + " WHERE ( professor_aee like '%"+nome_professor+"%' "
                    + " or nome_escola like '%"+nome_escola+"%' "
                    + " or escola_vinculada like '%"+auxiliar_de_sala+"%'"
                    + " or auxiliar_sala like '%"+escola_vinculada+"%') "
                    + " AND estatusprofessor like 'A'; ";


            ResultSet resultadoBusca;
            try
            {
            PreparedStatement stmt = conectaBanco.prepareStatement(sql_pesquisar);
            resultadoBusca = stmt.executeQuery();
            return resultadoBusca;
            
            }
            catch(SQLException error){
            throw new RuntimeException("Houve um problema " + error.getMessage());
        }                 
                        
 }
    
     public ResultSet buscarProfessores(String buscarprofessor) 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlBuscar = "select id_professor from tbl_professor where professor_aee = ? ;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlBuscar);        
            stmt.setString(1, buscarprofessor);      
            
//            stmt.execute();
//            stmt.close();
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar "
                    + "tabela professor." + erro.getMessage());  
            
        }
        return null;
    }
     
     
     public ResultSet listarProfessores() 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();     

String sqlLista = "select professor_aee, count(*) qtd_alunos, escola_vinculada, prof_regular,\n" +
"                    auxiliar_sala, turno_professor, date_format(dt_cria_professor, \"%d/%m/%Y\" ) dt_cria_professor,\n" +
"                    estatusprofessor, nome_escola, id_professor from tbl_aluno\n" +
"                    join tbl_professor on id_professor = fk_professor_escola\n" +
"                    join tbl_escola on id_escola = fk_professor\n" +
"                    where estatusprofessor like 'A' AND estatus like 'A'\n" +
"                    group by professor_aee order by professor_aee;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlLista);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela professor." + erro.getMessage());
            return null;
        }
    }
    
    

}
