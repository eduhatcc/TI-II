package ti2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:postgresql://localhost:5432/veiculo";
    private static final String USUARIO = "ti2cc";
    private static final String SENHA = "ti@cc";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
