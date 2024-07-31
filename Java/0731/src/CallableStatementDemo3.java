import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo3 {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        DBConnection dbConn = new DBConnection();
        Connection conn =dbConn.getConnection(); //1. 2. 3.
        String sql = "{call sp_insertDept(?,?,?)}"; //4 불완전한 SQL문장
        CallableStatement cstmt = null;
        try{
            cstmt = conn.prepareCall(sql);
            System.out.print("부서번호 : "); int deptNo = sc.nextInt();
            sc.nextLine();
            System.out.print("부서이름 : "); String dname = sc.nextLine();
            System.out.print("부서위치 : "); String loc = sc.nextLine();
            cstmt.setInt(1, deptNo);
            cstmt.setString(2, dname);
            cstmt.setString(3, loc); //완전한 SQL 문장
            cstmt.execute(); //5
            System.out.println("새 레코드 삽입 성공");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
        }

        DBClose.dbClose(conn, null); //7.
    }
}
/*
DELIMITER $$
CREATE PROCEDURE sp_insertDept
    (
        IN v_deptno tinyint,
        IN v_dname varchar(14),
        IN v_loc varchar(13)
    )
BEGIN
    INSERT INTO dept_clone(deptno, dname, loc)
    VALUES(50, 'Design', 'Seoul');
    commit;
END
$$
DELIMITER ;
 */
