package gym_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;



public class DatabaseConnector {
    
    public static Connection connect() {
        
        Connection connection = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/gymmembership";
            String username = "root";
            String password = "sifre123";
            connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected to the MySQL database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
