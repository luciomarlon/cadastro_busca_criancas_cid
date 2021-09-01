package DAO;

import Factory.ConnectionFactory;
import Model.AlunosAEE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * @author Lucio Marlon
 */
public class DAO_Alunos 
{
   Connection conectaBanco = new ConnectionFactory().getConnectionFactory();
   
   public void adicionarAlunos(AlunosAEE alunos)
   {

      String sql_inserir = "INSERT INTO tbl_aluno(cpf, data_cadastro, ano_escolar_aluno, "
              + "nome_aluno, sexo, data_nasc, nome_responsavel, telefone, "
              + "suspeita, laudo, tipo_diag, descricao_diag, "
              + "tipo_hd, descricao_hd, turno_escolar, "
              + "turno_aee, profregular, estatus, observacoes, transporte, auxiliar,"
              + "mobilidade, fk_cid_aluno, fk_cid_aluno_hd, "
              + "fk_beneficios, fk_professor_escola) "
              + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
              + "?, ?, ?, ?, ?, ?, ?)" ; 
      
       
           
          try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir)) 
          {

              stmt.setString(1,  alunos.getCpf());
              stmt.setString(2,  alunos.getData_cadastro());
              stmt.setString(3,  alunos.getAno_escolar());
              stmt.setString(4,  alunos.getNome_aluno());
              stmt.setString(5,  alunos.getSexo());
              stmt.setString(6,  alunos.getData_nasc());
              stmt.setString(7,  alunos.getNome_responsavel());
              stmt.setString(8,  alunos.getTelefone());
              stmt.setString(9,  alunos.getSuspeita());
              stmt.setString(10, alunos.getLaudo());
              stmt.setString(11, alunos.getTipo_diag());                            
              stmt.setString(12, alunos.getDescricao_diag());
              stmt.setString(13, alunos.getTipo_hd());              
              stmt.setString(14, alunos.getDescricao_hd());              
              stmt.setString(15, alunos.getTurno_escolar());
              stmt.setString(16, alunos.getTurno_aee());   
              stmt.setString(17, alunos.getProfregular());   
              stmt.setString(18, alunos.getEstatus()); 
              stmt.setString(19, alunos.getObservacoes()); 
              stmt.setString(20, alunos.getTransporte());   
              stmt.setString(21, alunos.getAuxiliar()); 
              stmt.setString(22, alunos.getMobilidade());   
              stmt.setInt(23, alunos.getFk_cid_aluno());
              stmt.setInt(24, alunos.getFk_cid_aluno_hd());
              stmt.setInt(25, alunos.getFk_beneficios());
              stmt.setInt(26, alunos.getFk_professor_escola());
              
              stmt.execute();
              stmt.close();
          }
                
        catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão com a tabela "
                      + "aluno." + erro.getMessage());
         }       
       }
        public void alterarAlunos(AlunosAEE alunos)
        {


            
              String sql_atualizar =  "UPDATE tbl_aluno SET cpf = ?, data_cadastro = ?, "
                    + " fk_professor_escola = ?,  nome_aluno = ?, data_nasc = ?, "
                    + " sexo = ?,  laudo = ?, suspeita = ?, nome_responsavel = ?,  "
                    + " tipo_diag = ?, fk_cid_aluno = ?, descricao_diag = ?, tipo_hd = ?, "
                    + " fk_cid_aluno_hd = ?, descricao_hd = ?, ano_escolar_aluno = ?, "
                    + " turno_escolar = ?, turno_aee = ?, profregular = ?, observacoes = ?, "
                    + " transporte = ?, auxiliar = ?, mobilidade = ?, telefone = ?, "
                    + " fk_beneficios = ?, estatus = ? "                    
                    + " WHERE id_aluno = ?";
            
            
            try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_atualizar)) {

              stmt.setString(1,  alunos.getCpf());
              stmt.setString(2,  alunos.getData_cadastro());
              stmt.setInt(3, alunos.getFk_professor_escola());              
              stmt.setString(4,  alunos.getNome_aluno());
              stmt.setString(5,  alunos.getData_nasc());
              stmt.setString(6,  alunos.getSexo());
              stmt.setString(7, alunos.getLaudo());
              stmt.setString(8,  alunos.getSuspeita());
              stmt.setString(9,  alunos.getNome_responsavel());
              stmt.setString(10, alunos.getTipo_diag()); 
              stmt.setInt(11, alunos.getFk_cid_aluno());
              stmt.setString(12, alunos.getDescricao_diag());
              stmt.setString(13, alunos.getTipo_hd());   
              stmt.setInt(14, alunos.getFk_cid_aluno_hd());
              stmt.setString(15, alunos.getDescricao_hd());
              stmt.setString(16,  alunos.getAno_escolar());              
              stmt.setString(17, alunos.getTurno_escolar());
              stmt.setString(18, alunos.getTurno_aee());              
              stmt.setString(19, alunos.getProfregular());  
              stmt.setString(20, alunos.getObservacoes()); 
              stmt.setString(21, alunos.getTransporte());  
              stmt.setString(22, alunos.getAuxiliar());  
              stmt.setString(23, alunos.getMobilidade());  
              stmt.setString(24,  alunos.getTelefone());
              stmt.setInt(25, alunos.getFk_beneficios());  
              stmt.setString(26, alunos.getEstatus()); 
              stmt.setString(27, alunos.getId_aluno());
              
              stmt.execute();
              stmt.close();
          }
                  
        catch(SQLException erro)
         {
              throw new RuntimeException("Problema na conexão." + erro.getMessage());
         } 
        }
        
        public void excluirAlunos(int id_aluno)
        {
            String sql_excluir = "delete from tbl_aluno where id_aluno = ?";
            
            try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sql_excluir);
                stmt.setInt(1, id_aluno);
                stmt.execute();
                stmt.close();
            }
            catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao excluir "
                        + "tabela ALUNOS." + erro.getMessage());            
                
            }   
            
        }
        
        public ResultSet listarAcompanhamentoAlunos()
        {
            conectaBanco = new ConnectionFactory().getConnectionFactory();
            String sql_listar = " select * from tbl_aluno where estatus like 'A';";
            
            try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sql_listar);
                return  stmt.executeQuery();
            }
            catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela ALUNOS." + erro.getMessage());            
                return null;
            }            
        }
        
        public ResultSet listarAlunos()
        {
            conectaBanco = new ConnectionFactory().getConnectionFactory();

         String sql_listar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                    + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                    + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                    + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                    + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                    + " beneficio_recebido, estatus, id_aluno "
                    + " from tbl_aluno "
                    + "	join tbl_escola on id_escola = fk_professor_escola "
                    + "	join tbl_professor on id_professor = fk_professor_escola "
                    + " join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                    + " join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "	                   
                    + " join tbl_beneficios on id_beneficios = fk_beneficios "                       
            + " where (nome_aluno like '%%' OR professor_aee like '%%' OR "
            + " tipo_diag LIKE '%%' OR CIDA.cid like '%%' OR  CIDB.cid like '%%' OR"          
            + " descricao_diag like '%%') AND estatus LIKE 'A' order by professor_aee;";

            
            try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sql_listar);
                return  stmt.executeQuery();
            }
            catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela ALUNOS." + erro.getMessage());            
                return null;
            }            
        }
        
        public ResultSet PesquisarAlunos(
                                         String nome_escola,   
                                         String nome_aluno,
                                         String sexo,
                                         String laudo,
                                         String medico,
//                                         String tipo_diag,
//                                         String cod_cid,
//                                         String cod_cid_hd,
                                         String descricao_diag,
                                         String descricao_hd,
                                         String professor_aee
                                        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();



  String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                    + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                    + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                    + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                    + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                    + " beneficio_recebido, estatus, id_aluno "
                    + "  from tbl_aluno "
                    + "	 join tbl_escola on id_escola = fk_professor_escola"
                    + "	 join tbl_professor on id_professor = fk_professor_escola"
                    + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                    + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                    + "  join tbl_beneficios on id_beneficios = fk_beneficios "              
                    + "	where (nome_escola like '%"+nome_escola+"%' OR "
                    + " nome_aluno like '%"+nome_aluno+"%' OR "
                    + " sexo like '%"+sexo+"%'OR "
                    + " laudo like '%"+laudo+"%'OR "
                    + " suspeita like '%"+medico+"%'OR "
//                    + " tipo_diag like '%"+tipo_diag+"%'OR "
//                    + " CIDA.cid like '%"+cod_cid+"%'OR "
//                    + " CIDB.cid like '%"+cod_cid_hd+"%'OR "
                    + " descricao_diag like '%"+descricao_diag+"%' OR "   
                    + " descricao_hd like '%"+descricao_hd+"%' OR "  
                    + " professor_aee like '%"+professor_aee+"%') " 
                    + " AND estatus LIKE 'A' ";
            
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
        
        public ResultSet PesquisaDiagnostico(String 
                descricao_diagnostico
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            
 String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                    + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                    + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                    + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                    + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                    + " beneficio_recebido, estatus, id_aluno "
                    + " from tbl_aluno "
                    + "	 join tbl_escola on id_escola = fk_professor_escola"
                    + "	 join tbl_professor on id_professor = fk_professor_escola"
                    + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                    + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                    + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                    + "	where descricao_diag like '%"+descricao_diagnostico+"%' AND estatus LIKE 'A'; ";

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
        
        
        public ResultSet PesquisaDiagnosticoUnico(String 
                descricao_diagnostico
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            
        String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                           + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                           + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                           + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                           + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                           + " beneficio_recebido, estatus, id_aluno "
                           + " from tbl_aluno "
                           + "	 join tbl_escola on id_escola = fk_professor_escola"
                           + "	 join tbl_professor on id_professor = fk_professor_escola"
                           + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                           + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                           + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                           + "	where descricao_diag like '%"+descricao_diagnostico+"%' "
                           + " and tipo_diag like '%unico%'  \n"
                           + " AND estatus LIKE 'A'; ";

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
        
        public ResultSet TotalAlunos(String descricao_diagnostico)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select count(*) from tbl_aluno\n" +
                        "	join tbl_escola on id_escola = fk_professor_escola\n" +
                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
                        "	join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                        "	join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                        "	join tbl_beneficios on id_beneficios = fk_beneficios        \n" +
                        "where descricao_diag like '%"+descricao_diagnostico+"%' \n" +
//                        "and tipo_diag like '%unico%'  \n" +
                        "AND estatus LIKE 'A';";

  
             

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
        
        public ResultSet TotalAlunosDiagUnico(String descricao_diagnostico)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select count(*) from tbl_aluno\n" +
                        "	join tbl_escola on id_escola = fk_professor_escola\n" +
                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
                        "	join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                        "	join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                        "	join tbl_beneficios on id_beneficios = fk_beneficios        \n" +
                        "where descricao_diag like '%"+descricao_diagnostico+"%' \n" +
                        "and tipo_diag like '%unico%'  \n" +
                        "AND estatus LIKE 'A';";

             

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
        
         public ResultSet TotalAlunosDiagMultiplo(String descricao_diagnostico)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select count(*) from tbl_aluno\n" +
                        "	join tbl_escola on id_escola = fk_professor_escola\n" +
                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
                        "	join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                        "	join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                        "	join tbl_beneficios on id_beneficios = fk_beneficios        \n" +
                        "where descricao_diag like '%"+descricao_diagnostico+"%' \n" +
                        "and tipo_diag like '%multiplo%'  \n" +
                        "AND estatus LIKE 'A';";

             

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
         
         
         public ResultSet TotalAlunosHDUnico(String descricao_hd)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select count(*) from tbl_aluno\n" +
                        "	join tbl_escola on id_escola = fk_professor_escola\n" +
                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
                        "	join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                        "	join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                        "	join tbl_beneficios on id_beneficios = fk_beneficios        \n" +
                        "where descricao_hd like '%"+descricao_hd+"%' \n" +
                        "and tipo_hd like '%unico%'  \n" +
                        "AND estatus LIKE 'A';";

             

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
        
         public ResultSet TotalAlunosHDMultiplo(String descricao_hd)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select count(*) from tbl_aluno\n" +
                        "	join tbl_escola on id_escola = fk_professor_escola\n" +
                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
                        "	join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid \n" +
                        "	join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid \n" +
                        "	join tbl_beneficios on id_beneficios = fk_beneficios        \n" +
                        "where descricao_hd like '%"+descricao_hd+"%' \n" +
                        "and tipo_hd like '%multiplo%'  \n" +
                        "AND estatus LIKE 'A';";

             

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
        
         public ResultSet PesquisaDiagnosticoMultiplo(String 
                descricao_diagnostico
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();
            
        String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                           + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                           + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                           + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                           + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                           + " beneficio_recebido, estatus, id_aluno "
                           + " from tbl_aluno "
                           + "	 join tbl_escola on id_escola = fk_professor_escola"
                           + "	 join tbl_professor on id_professor = fk_professor_escola"
                           + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                           + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                           + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                           + "	where descricao_diag like '%"+descricao_diagnostico+"%' "
                           + " and tipo_diag like '%multiplo%'  \n"
                           + " AND estatus LIKE 'A'; ";

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
        
        
        
        public ResultSet PesquisaHD(String 
                descricao_hd)
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();



 String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                    + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                    + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                    + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                    + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                    + " beneficio_recebido, estatus, id_aluno "
                    + "  from tbl_aluno "
                    + "	 join tbl_escola on id_escola = fk_professor_escola"
                    + "	 join tbl_professor on id_professor = fk_professor_escola"
                    + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                    + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                    + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                    + "	where descricao_hd like '%"+descricao_hd+"%' AND estatus LIKE 'A'; ";
            

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
        public ResultSet PesquisaHDUnico(String 
                descricao_hipotese
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            
        String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                           + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                           + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                           + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                           + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                           + " beneficio_recebido, estatus, id_aluno "
                           + " from tbl_aluno "
                           + "	 join tbl_escola on id_escola = fk_professor_escola"
                           + "	 join tbl_professor on id_professor = fk_professor_escola"
                           + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                           + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                           + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                           + "	where descricao_hd like '%"+descricao_hipotese+"%' "
                           + " and tipo_hd like '%unico%'  \n"
                           + " AND estatus LIKE 'A'; ";

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
        
        public ResultSet PesquisaHDMultiplo(String 
                descricao_hipotese
        )
        {
            
            conectaBanco = new ConnectionFactory().getConnectionFactory();


            
        String sql_pesquisar = "select cpf, data_cadastro, professor_aee, nome_aluno, "
                           + " data_nasc, sexo, laudo, suspeita,  nome_responsavel,"
                           + " tipo_diag, CIDA.cid, descricao_diag, tipo_hd, CIDB.cid,  "
                           + " descricao_hd, ano_escolar_aluno, turno_escolar, turno_aee, profregular, "
                           + " observacoes, transporte, auxiliar, mobilidade, telefone, "
                           + " beneficio_recebido, estatus, id_aluno "
                           + " from tbl_aluno "
                           + "	 join tbl_escola on id_escola = fk_professor_escola"
                           + "	 join tbl_professor on id_professor = fk_professor_escola"
                           + "  join tbl_cid as CIDA on tbl_aluno.fk_cid_aluno = CIDA.id_cid "
                           + "  join tbl_cid as CIDB on tbl_aluno.fk_cid_aluno_hd = CIDB.id_cid "
                           + "  join tbl_beneficios on id_beneficios = fk_beneficios "       
                           + "	where descricao_hd like '%"+descricao_hipotese+"%' "
                           + " and tipo_hd like '%multiplo%'  \n"
                           + " AND estatus LIKE 'A'; ";

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
        
        public ResultSet buscarAlunos() // carrega alunos na ComboBox para listar
        {
            conectaBanco = new ConnectionFactory().getConnectionFactory();
             String sql_listar = " select * from tbl_aluno where estatus like 'A';";            
            
            try
            {
                PreparedStatement stmt = conectaBanco.prepareStatement(sql_listar);
                return  stmt.executeQuery();
            }
            catch(SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro ao listar "
                        + "tabela ALUNOS." + erro.getMessage());            
                return null;
            }            
        }
        

}