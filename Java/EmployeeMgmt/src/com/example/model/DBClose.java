package com.example.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//7번
public class DBClose {
    public static void dbClose(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void dbClose(Connection conn, Statement stmt) {
        try {
            if (conn != null) conn.close();
            if (stmt != null) stmt.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void dbClose(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
