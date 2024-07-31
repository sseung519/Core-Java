import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConn = new DBConnection();
        Connection conn =dbConn.getConnection(); //1. 2. 3.
        String sql = "{call sp_test(?, ?)}"; //미완성 sql 문장
        CallableStatement cstmt = conn.prepareCall(sql); //4.
        //JDBC는 인덱스가 1부터 시작한다. DB가 1부터 시작하기 때문에
        // IN parameter는 setxxx() 를 사용하고,
        //OUT, INOUT parameter는 registerOutParameter()를 사용한다.
        //INOUT parameter는 setxxx(), registerOutParameter()를 사용한다.
        cstmt.registerOutParameter(1,java.sql.Types.DATE);
        cstmt.registerOutParameter(2, Types.VARCHAR); //완전한 sql 문장
        cstmt.execute(); //5.
        System.out.println(cstmt.getDate(1));
        System.out.println(cstmt.getString(2));
        DBClose.dbClose(conn, null); //7.
    }
}

/*
DELIMITER //
CREATE PROCEDURE sp_test()
BEGIN
 SELECT NOW(), VERSION();
END
//
DELIMITER ;
 */
