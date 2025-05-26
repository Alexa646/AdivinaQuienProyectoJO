package BoardGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/Entretenimiento";
            String user = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            return null;
        }
    }

}