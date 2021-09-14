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

    public void adicionar(Escolas escolas) {
        String sql_inserir = "INSERT INTO tbl_escola(ano_escolar, nome_escola, "
                + "setor, estatus, dt_cria_escola)"
                + "values (?, ?, ?, ?, ?);";

        try (PreparedStatement stmt = conectaBanco.prepareStatement(sql_inserir)) {
            stmt.setInt(1, escolas.getAno_escolar());
            stmt.setString(2, escolas.getNome_escola());
            stmt.setInt(3, escolas.getSetor());
            stmt.setString(4, escolas.getEstatus());
            stmt.setString(5, escolas.getDt_cria_escola());

            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Não foi possível incluir, problema na "
                    + "conexão com a tabela escola." + erro.getMessage());
        }
    }

    public ResultSet buscaEscola(String buscaescolas) {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlBuscar = "select id_escola from tbl_escola where nome_escola = ? ;";

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlBuscar);
            stmt.setString(1, buscaescolas);

//            stmt.execute();
//            stmt.close();
            return stmt.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar "
                    + "tabela escola." + erro.getMessage());

        }
        return null;
    }

    public ResultSet listarEscolasCombobox() {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT * FROM tbl_escola ORDER BY nome_escola;";

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }

    public ResultSet listarEscolas() {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT ano_escolar, nome_escola, setor, id_escola FROM tbl_escola ORDER BY setor;";

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }

    public ResultSet PesquisarEscolas(String nomeescola, String setor) {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "SELECT ano_escolar, nome_escola, setor, id_escola FROM tbl_escola where nome_escola "
                + "like '%" + nomeescola + "%' "
                + "OR setor like '%" + setor + "%' ORDER BY setor;";

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }

    public ResultSet listarEstatisticasPeriodo() {
        conectaBanco = new ConnectionFactory().getConnectionFactory();
        String sqlListar = "select nome_escola, setor, count(*) as total, \n"
                + "		count(if ( turno_aee = 'Manhã', 1, NULL)) AS total_manha,\n"
                + "		count(if ( turno_aee = 'Tarde', 1, NULL)) AS total_tarde,\n"
                + "		count(if ( turno_aee = 'M/T', 1, NULL)) AS manha_tarde,\n"
                + "		count(if ( turno_aee = 'NE', 1, NULL)) AS ne\n"
                + "    from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where estatus like '%A%' group by nome_escola;";

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sqlListar);
            return stmt.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }
    }

    public ResultSet ProfessorEscolasTurnos(
            String professoraee,
             String nomeescola
    ) {

        conectaBanco = new ConnectionFactory().getConnectionFactory();

//        String sql_pesquisar = "select  nome_escola, setor, professor_aee, count(*) total from tbl_aluno \n" +
//                        "	join tbl_professor on id_professor = fk_professor_escola\n" +
//                        "       join tbl_escola on id_escola = fk_professor\n" +
//                        "   where (nome_escola like '%"+nomeescola+"%' or " +
//                        "   turno_aee like '%"+turno_aee+"%' or professor_aee like '%"+professoraee+"%' )\n" +
//                        " and estatus like '%A%' group by professor_aee order by nome_escola;";
        String sql_pesquisar = "   select nome_escola, setor, professor_aee, count(*) as total, \n"
                + "		count(if ( turno_aee = 'Manhã', 1, NULL)) AS total_manha,\n"
                + "		count(if ( turno_aee = 'Tarde', 1, NULL)) AS total_tarde,\n"
                + "		count(if ( turno_aee = 'M/T', 1, NULL)) AS manha_tarde,\n"
                + "		count(if ( turno_aee = 'NE', 1, NULL)) AS ne\n"
                + "               from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where (nome_escola like '%"+nomeescola+"%' OR professor_aee like '%"+professoraee+"%') "
                + "    and estatus like '%A%'  group by professor_aee order by professor_aee;";


        ResultSet resultadoBusca;
        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sql_pesquisar);
            resultadoBusca = stmt.executeQuery();
            return resultadoBusca;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }

    }

    public ResultSet ProfessorEscolasTurnos() {

        conectaBanco = new ConnectionFactory().getConnectionFactory();

        String sql_pesquisar = "select  nome_escola, setor, professor_aee, turno_aee, count(*) total from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where (turno_aee like '%manh%' and professor_aee like '%%')\n"
                + "    and estatus like '%A%' group by professor_aee \n"
                + "    union \n"
                + "select  nome_escola, setor, professor_aee, turno_aee,  count(*) total from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where (turno_aee like '%tard%' and professor_aee like '%%')\n"
                + "    and estatus like '%A%' group by professor_aee \n"
                + "    union \n"
                + "    select  nome_escola, setor, professor_aee, turno_aee, count(*) total from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where (turno_aee like '%M/T%' and professor_aee like '%%')\n"
                + "    and estatus like '%A%' group by professor_aee \n"
                + "    union \n"
                + "    select  nome_escola,  setor, professor_aee, turno_aee, count(*) total from tbl_aluno \n"
                + "		join tbl_professor on id_professor = fk_professor_escola\n"
                + "		join tbl_escola on id_escola = fk_professor\n"
                + "    where (turno_aee like '%ne%' and professor_aee like '%%')\n"
                + "    and estatus like '%A%' group by professor_aee order by nome_escola; ";

        ResultSet resultadoBusca;

        try {
            PreparedStatement stmt = conectaBanco.prepareStatement(sql_pesquisar);
            return stmt.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar "
                    + "tabela escola." + erro.getMessage());
            return null;
        }

    }

}
