
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Db_conn {
    
    private static final String URL = "jdbc:mysql://localhost:3306/library_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }
}

