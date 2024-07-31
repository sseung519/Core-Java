import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); // 1. 2. 3.
        String sql = "{call sp_selectEmp(?,?,?)}"; // 4 불완전한 SQL문장
        CallableStatement cstmt = null;
        try {
            cstmt = conn.prepareCall(sql);
            System.out.print("사원번호 : "); int empno = sc.nextInt(); sc.nextLine();
            cstmt.setInt(1, empno); //1. 들어가는 IN parametere
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR); //완전한 SQL문장
            cstmt.execute(); // 5
            System.out.printf("부서명 : %s, 부서위치 : %s%n",
                    cstmt.getString(2), cstmt.getString(3));

        } catch (SQLException e) {
            System.out.println("실패");
        }

        DBClose.dbClose(conn, null); // 7.
    }}
/*
DELIMITER $$
CREATE PROCEDURE sp_selectEmp
        (
                IN v_empno smallint,
                OUT v_dname varchar(14),
OUT v_loc varchar(13)
    )
BEGIN
        select dname, loc INTO v_dname, v_loc
from emp join dept on(emp.deptno = dept.deptno)
where empno = v_empno;
END
        $$
DELIMITER ;
 */