import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DBConnection dbConn = new DBConnection();
        Connection conn = dbConn.getConnection(); // 1. 2. 3.
        String sql = "{call sp_selectDname(?)}"; // 4 불완전한 SQL문장
        CallableStatement cstmt = null;
        try {
            cstmt = conn.prepareCall(sql);
            System.out.print("부서이름 : "); String dname = sc.nextLine();
            cstmt.setString(1, dname);
            //INOUT은 동시에 registerOut parameter()도 사용해야한다.
            cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
            cstmt.execute(); // 5
            System.out.printf("%s의 위치는 %s 입니다.%n",
                    dname, cstmt.getString(1));

        } catch (SQLException e) {
            System.out.println("실패");
        }

        DBClose.dbClose(conn, cstmt); // 7.

    }
}

/* 부서이름으로 부서위치를 출력하는 Stored Procedure
DELIMITER $$
CREATE PROCEDURE sp_selectDname
    (
        INOUT v_name varchar(14)
    )
BEGIN
    DECLARE v_str varchar(14); # begin과 end 사이 declare(변수 선언 inout에 사용)
    SELECT loc INTO v_str
    FROM dept
    WHERE dname = v_name;
    SET v_name = v_str;
END $$
DELIMITER ;
 */