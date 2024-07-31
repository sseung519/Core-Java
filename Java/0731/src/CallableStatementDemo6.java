import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo6 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                DBConnection dbConn = new DBConnection();
                Connection conn = dbConn.getConnection(); // 1. 2. 3.
                String sql = "{call sp_select_emp_dept(?)}"; // 4 불완전한 SQL문장
                CallableStatement cstmt = null;
                ResultSet rs = null;
                try {
                    cstmt = conn.prepareCall(sql);
                    System.out.print("부서번호 : "); int deptno = sc.nextInt();
                    cstmt.setInt(1, deptno);//완전한 SQL 문장
                    rs = cstmt.executeQuery();
                    boolean flag = rs.next();
                    if(!flag) { //레코드가 한 개도 없다면
                        System.out.println("조건에 맞는 결과 값이 없습니다.");
                    } else { //한 개라도 있다면
                        do {
                            System.out.printf("%d\t%s\t%s\t%s%n",
                                    rs.getInt("empno"),rs.getString("ename"), rs.getString("dname"),
                                    rs.getString("loc"));
                        } while (rs.next());
                    }
                } catch (SQLException e) {
                    System.out.println("실패");
                }

                DBClose.dbClose(conn, cstmt, rs); // 7.
            }
        }
/* 부서번호로 소속사원의 사원 번호, 사원명, 부서명, 부서위치
DELIMITER $$
CREATE PROCEDURE sp_select_emp_dept
        (
                IN v_deptno tinyint
        )
BEGIN
        SELECT empno, ename, dname, loc, dept.deptno
FROM emp natural join dept
WHERE deptno = v_deptno;
END $$
DELIMITER ;
 */
