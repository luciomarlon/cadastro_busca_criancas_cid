/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import Model.Beneficios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LucioMarlon
 */
public class DAO_Beneficios {
    
     Connection conectaBanco = new ConnectionFactory().getConnectionFactory();
    public void adicionarBeneficio(Beneficios beneficios)
    {
         String sql_inserir_beneficio = "INSERT INTO tbl_beneficios(beneficio_recebido, secretaria, autarquia, telefone) "
                 + "values (?, ?, ?, ?)" ; 
         try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir_beneficio)) {
              stmt.setString(1,  beneficios.getBeneficio_recebido());
              stmt.setString(2,  beneficios.getSecretaria());
              stmt.setString(3,  beneficios.getAutarquia());
              stmt.setString(4,  beneficios.getTelefone());
              
               stmt.execute();
               stmt.close();
         }
          catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão." + erro.getMessage());
         } 
         
    
    }
    public ResultSet listarBeneficio()
        {
         conectaBanco = new ConnectionFactory().getConnectionFactory();
         String sqlListaCid = "SELECT * FROM tbl_beneficios;";
         
         try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sqlListaCid);
                return  stmt.executeQuery();
            }
         catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela BENEFICIO." + erro.getMessage());            
                return null;
            }       
        }
    
    
      
     public ResultSet buscarBeneficios(String buscarbeneficio) 
    {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlBuscar = "select id_beneficios from tbl_beneficios where beneficio_recebido = ?;";

        try 
        {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlBuscar);        
            stmt.setString(1, buscarbeneficio);      
            
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
}
