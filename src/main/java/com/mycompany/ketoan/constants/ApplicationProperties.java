
package com.mycompany.ketoan.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApplicationProperties {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
     public static final String URL = "jdbc:mysql://localhost:3306/qlbh_quanao";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "88888888";

    public static Connection getConnection() {
        try
        {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            return null;
        }
    }
}
