
package Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexão com o banco de dados
 * @author Lucio Marlon
 */
public class ConnectionFactory 
{
    public Connection getConnectionFactory()
    {
        try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_crei", "root", "");            
        }
        catch(SQLException erro)
        {
            throw new RuntimeException("Ocorreu um erro na conexão. " + erro);
        }
    }
}
