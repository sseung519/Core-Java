package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        DBConnection dbconn = new DBConnection();
        Connection conn = dbconn.getConnection(); // 1, 2, 3
        Statement stmt = null;
        ResultSet rs = null;
        try {
            if (conn != null) { // conn이 null인지 확인
                stmt = conn.createStatement();
                StringBuffer sb = new StringBuffer();
                sb.append("SELECT empno, ename, sal, d.deptno, dname, loc ");
                sb.append("FROM emp e JOIN dept d ON (e.deptno = d.deptno) ");
                sb.append("WHERE ename = 'SMITH'");
                rs = stmt.executeQuery(sb.toString()); // 5번
                while (rs.next()) { // 6
                    System.out.printf("%d\t%s\t%.1f\t%d\t%s\t%s%n",
                            rs.getInt("empno"), rs.getString("ename"), rs.getDouble("sal"),
                            rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
                }
            } else {
                System.out.println("Database connection failed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            DBClose.dbClose(conn, stmt, rs); // 7번
        }
    }
}
