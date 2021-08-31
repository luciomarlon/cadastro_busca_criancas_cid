/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.CodigosCid;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LucioMarlon
 */
public class DAO_Cid 
{
    Connection conectaBanco = new ConnectionFactory().getConnectionFactory();
    public void adicionarCid(CodigosCid cid)
    {
         String sql_inserir_cid = "INSERT INTO tbl_cid(cid, descricao) "
                 + "values (?, ?)" ; 
         try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir_cid)) {
              stmt.setString(1,  cid.getCid());
              stmt.setString(2,  cid.getDescricao());
              
               stmt.execute();
               stmt.close();
         }
          catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão." + erro.getMessage());
         } 
         
    }
     public ResultSet listarCid()
        {
         conectaBanco = new ConnectionFactory().getConnectionFactory();
         String sqlListaCid = "SELECT * FROM tbl_cid;";
         
         try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sqlListaCid);
                return  stmt.executeQuery();
            }
         catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela codigo CID." + erro.getMessage());            
                return null;
            }       
        }
     
     
     public ResultSet buscarcid(String buscarcid) 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlBuscar = "select id_cid from tbl_cid where cid = ? ;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlBuscar);        
            stmt.setString(1, buscarcid);      
            
//            stmt.execute();
//            stmt.close();
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar "
                    + "tabela cid." + erro.getMessage());  
            
        }
        return null;
    }
     
     public ResultSet listarCidDeficiencias()
        {
         conectaBanco = new ConnectionFactory().getConnectionFactory();


//                String sqlListaCid = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
//                                     " descricao_hd, turno_escolar, turno_aee, professor_aee, prof_regular, \n" +
//                                     " ano_escolar_aluno  from tbl_aluno\n" +
//                                     " join tbl_escola on id_escola = fk_professor_escola \n" +
//                                     " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
//                                     " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
//                                     " join tbl_professor on id_professor = fk_professor_escola \n" +
//                                     " where estatus like 'A' order by professor_aee;";

String sqlListaCid = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                     " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                     " profregular, transporte, auxiliar, mobilidade, \n" +
                                     " ano_escolar_aluno  from tbl_aluno\n" +
                                     " join tbl_escola on id_escola = fk_professor_escola \n" +
                                     " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                     " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                     " join tbl_professor on id_professor = fk_professor_escola \n" +
                                     " where estatus like 'A' order by professor_aee;";
         
                
                
                
                
         try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sqlListaCid);
                return  stmt.executeQuery();
            }
         catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela codigo CID." + erro.getMessage());            
                return null;
            }       
        }
     public ResultSet PesquisarDiagnostico(
            String nome_aluno,
            String cid,
            String descricao_diagnostico,
            String professor_aee
            
    )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
                                    " where CIDA.cid like '%"+cid+"%' \n" +                                    
                                    " OR nome_aluno like '%"+nome_aluno+"%'\n" +
                                    " OR descricao_diag like '%"+descricao_diagnostico+"%'\n" +
                                    " OR professor_aee like '%"+professor_aee+"%'\n" +  
                                    " AND estatus like 'A'; ";
            

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
     
     public ResultSet PesquisarDiagnosticoUnico(
           
             String descricao_diagnostico   
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();
            
              String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
                                        " where descricao_diag Like '%"+descricao_diagnostico+"%' \n" +   
                                    " and tipo_diag like '%unico%'  \n" +
                                    " AND estatus like 'A'; ";
            

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
     
     public ResultSet PesquisarDiagnosticoMulti(
//            String cid_diag_multiplo
            String descricao_diag
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();
            
              String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
                                    " where descricao_diag like '%"+descricao_diag+"%' \n" +    
                                    " and tipo_diag like '%multiplo%'  \n" +
                                    " AND estatus like 'A'; ";
            

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
     public ResultSet PesquisarHd(
            String cid_hd,
            String nome_aluno,            
            String descricao_hd,
            String professor_aee
            
    )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
                                    " where CIDB.cid like '%"+cid_hd+"%' \n" +                                    
                                    " OR nome_aluno like '%"+nome_aluno+"%'\n" +
                                    " OR descricao_hd like '%"+descricao_hd+"%'\n" +
                                    " OR professor_aee like '%"+professor_aee+"%'\n" + 
                                    " AND estatus like 'A'; ";
            

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
     
     
     public ResultSet PesquisarHDUnico(
//            String cid_hd,
            String descricao_hd
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

 String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
//                                    " where CIDB.cid like '%"+cid_hd+"%' \n" +
                                    " where descricao_hd like '%"+descricao_hd+"%' \n" + 
                                    " and tipo_hd like '%unico%'  \n" +
                                    " AND estatus like 'A'; ";
            

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
     
     public ResultSet PesquisarHdMultiplo(
//            String cid_hd
             String descricao_hd_multiplo
    )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            String sql_pesquisar = "select nome_aluno, CIDA.cid, tipo_diag, descricao_diag, CIDB.cid, tipo_hd, \n" +
                                    " descricao_hd, turno_escolar, turno_aee, professor_aee, \n" +
                                    " profregular, transporte, auxiliar, mobilidade, estatus,  \n" +
                                    " ano_escolar_aluno  from tbl_aluno\n" +
                                        " join tbl_escola on id_escola = fk_professor_escola \n" +
                                        " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                                        " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                                        " join tbl_professor on id_professor = fk_professor_escola\n" +
//                                    " where CIDB.cid like '%"+cid_hd+"%' \n" +
                                    " where CIDB.cid like '%"+descricao_hd_multiplo+"%' \n" + 
                                    " and tipo_hd like '%multiplo%' " +    
                                    " AND estatus like 'A'; ";
            

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
     
    
    
}
