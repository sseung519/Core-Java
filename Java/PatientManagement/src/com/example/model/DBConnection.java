package com.example.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//1~3
public class DBConnection {
    private Properties info;

    public DBConnection() {
        this.info = new Properties();
        File file = new File("src/dbinfo.properties");
        try {
            this.info.load(new FileInputStream(file));
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(this.info.getProperty("DBDRIVER"));       //Driver Loading 하자
            conn = DriverManager.getConnection(this.info.getProperty("DBURL"),
                                        this.info.getProperty("DBUSER"),
                                        this.info.getProperty("DBPASSWD"));
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
