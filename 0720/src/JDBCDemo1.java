import java.sql.*; //1단계

public class JDBCDemo1 {
    private static final String url = "jdbc:mysql://localhost:3306/mycompany";
    private static final String id = "root";
    private static final String password = "root1234";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2단계
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            //3단계
            conn = DriverManager.getConnection(url, id, password);
            //4단계
            stmt = conn.createStatement();
            //5단계 Query 실행하기
            String sql = "SELECT empno, ename, job, sal   ";
            sql += "FROM emp    ";
            sql += "WHERE sal >= 1500";
            rs = stmt.executeQuery(sql);
            //6단계 ResultSet 파싱하자.
            while(rs.next()) {
                int empno = rs.getInt(1); //인덱스 번호는 가독성이 떨어짐.
                String ename = rs.getString("ename"); //가독성을 위해 컬럼명을 쓴다.
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                System.out.printf("%d\t%s\t%s\t%.2f%n", empno, ename, job, sal);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            //7. close
            try{
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


