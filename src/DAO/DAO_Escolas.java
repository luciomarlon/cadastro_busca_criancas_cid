package DAO;

import Factory.ConnectionFactory;
import Model.Escolas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAO_Escolas {
    
    Connection conectaBanco = new ConnectionFactory().getConnectionFactory();
    public void adicionar(Escolas escolas)
    {
        String sql_inserir = "INSERT INTO tbl_escola(ano_escolar, nome_escola, "
                + "setor, estatus, dt_cria_escola)"
                + "values (?, ?, ?, ?, ?);";  
        
         try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir)) 
        {
            stmt.setInt(1, escolas.getAno_escolar());
            stmt.setString(2, escolas.getNome_escola());
            stmt.setInt(3, escolas.getSetor());
            stmt.setString(4, escolas.getEstatus());
            stmt.setString(5, escolas.getDt_cria_escola());
            

            stmt.execute();
            stmt.close();
        } 
         catch (SQLException erro) 
        {
            throw new RuntimeException("Não foi possível incluir, problema na "
                    + "conexão com a tabela escola." + erro.getMessage());
        }
    }
    
    //1 - metodo buscar escola
    //2 - select na tabela apontar o dados para selecionar
    //3 - select * from tbl_escola where nome_escola = ?;
    
    public ResultSet buscaEscola(String buscaescolas) 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlBuscar = "select id_escola from tbl_escola where nome_escola = ? ;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlBuscar);        
            stmt.setString(1, buscaescolas);      
            
//            stmt.execute();
//            stmt.close();
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao buscar "
                    + "tabela escola." + erro.getMessage());  
            
        }
        return null;
    }
    
    
     public ResultSet listarEscolas() 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT * FROM tbl_escola ORDER BY nome_escola;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }
     
     public ResultSet Escolas() 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT ano_escolar, nome_escola, setor, id_escola FROM tbl_escola ORDER BY setor;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }
     
     public ResultSet PesquisarEscolas(String nomeescola, String setor) 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT ano_escolar, nome_escola, setor, id_escola FROM tbl_escola where nome_escola "
                + "like '%"+nomeescola+"%' "
                + "OR setor like '%"+setor+"%' ORDER BY setor;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } 
        catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }

    
}
