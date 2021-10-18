package com.stu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregdb", "root", "123");
            System.out.println("connected.....");
        } catch (Exception e) {
            System.out.println("Error in db connection");
            e.printStackTrace();
        }
        return con;
    }
    
    
    public static void main(String[] args) {
        DBConnection myDB = new DBConnection();
        myDB.getConnection();
    }
    
    
}
