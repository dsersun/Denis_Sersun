package homework_nr_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Setting for connection to database
 * */
public class DB_Connector {
    static String url =System.getenv("DB_URL");
    static String user = System.getenv("DB_USER");
    static String password = System.getenv("DB_PASSWORD");

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}