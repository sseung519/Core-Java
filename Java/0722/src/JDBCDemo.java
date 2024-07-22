/*
    7단계
    1. import 하자. java.sql.*
 */
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) {
        // 2. MySQL Driver Loading 하자.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Founded");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
        // 3. Memory에 loading된 MySQL Driver를 이용하여 Connection 하자.
        String url = "jdbc:mysql://127.0.0.1:3306/mycompany"; // 어디갔노 ~~~~~~~ 빨리 와 승찬쿤 내가 대신 쳐줄게
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "root", "root1234");
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Failure");
        }
        // 4. Statement 객체 생성
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 5. Statement 객체를 이용하여 SQL 실행하자.
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT now(), version()"); //SELECT 쓸 때는 executeQuery 사용
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } //SELECT
        // 6. ResultSet의 결과를 parsing 하자.
        try {
            rs.next();
            String now = rs.getString(1); //DB는 인덱스가 1부터 시작
            String version = rs.getString(2);
            System.out.println(now + ", " + version);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //7. 반드시 Close해야한다.
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
