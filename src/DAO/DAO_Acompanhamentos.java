
package DAO;

import Factory.ConnectionFactory;
import Model.Acompanhamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DAO_Acompanhamentos {
    
    Connection conectaBanco = new ConnectionFactory().getConnectionFactory();
    
    public void adicionarAcompanhamento(Acompanhamentos acompanhamentos)
    {
         String sql_inserir = "INSERT INTO tbl_acompanhamentos(acompanhamento, "
                 + "instrumento, natureza, observacoes, fk_acompanhamento)"
                 + "values (?, ?, ?, ?, ?)";
         try(PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir))
         {
            stmt.setString(1, acompanhamentos.getAcompanhamentos());
            stmt.setString(2, acompanhamentos.getInstrumento());
            stmt.setString(3, acompanhamentos.getNatureza());
            stmt.setString(4, acompanhamentos.getObservacoes());
            stmt.setInt(5, acompanhamentos.getFk_acompanhamento());

            stmt.execute();
            stmt.close();            
             
         }
         catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão com a tabela "
                      + "acompanhamento." + erro.getMessage());
         }   
    }
    
    public void alterarAcompanhamentos(Acompanhamentos acompanhamentos) 
    {
        String sql_atualizar
                = "UPDATE tbl_acompanhamentos SET  acompanhamento = ?, instrumento = ?, "
                + "natureza = ?, observacoes = ?, fk_acompanhamento = ?, "               
                + "WHERE id_acompanha = ?";
         try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_atualizar)) 
        {
           stmt.setString(1, acompanhamentos.getAcompanhamentos());
            stmt.setString(2, acompanhamentos.getInstrumento());
            stmt.setString(3, acompanhamentos.getNatureza());
            stmt.setString(4, acompanhamentos.getObservacoes());
            stmt.setInt(5, acompanhamentos.getFk_acompanhamento());
            stmt.setInt(6, acompanhamentos.getId_acompanha());

            stmt.execute();
            stmt.close();
        } 
        catch(SQLException erro)
         {
               throw new RuntimeException("Não foi possível alterar, problema na "
                    + "conexão com a tabela acompanhemtos." + erro.getMessage());
         }   
    }
        
}

    

