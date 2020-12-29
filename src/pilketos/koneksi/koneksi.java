package pilketos.koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kevadamargalih
 */
import java.sql.*;

public class koneksi {
    private static Connection connection = null;
        public static Connection getConnection() {
            if (connection != null) 
                return connection;
            else {
                String dbUrl = "jdbc:mysql://localhost:8889/pilketos_uas?"
                        + "user=root&password=root&autoReconnect=true&useSSL=false";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    connection=DriverManager.getConnection(dbUrl);
                } catch (ClassNotFoundException | SQLException e) {
                    return null;
                }
            return connection;
        }
    }
}
