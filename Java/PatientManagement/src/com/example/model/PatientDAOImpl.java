package com.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PatientDAOImpl implements PatientDAO{

    private Connection conn;

    // 생성자: DBConnection을 통해 데이터베이스 연결을 설정합니다.
    public PatientDAOImpl() {
        DBConnection dbConn = new DBConnection();
        this.conn = dbConn.getConnection();
    }
    // 새로운 환자를 데이터베이스에 생성하는 메서드
    @Override
    public boolean createPatient(PatientVO p) throws SQLException {
        // Statement 객체를 생성합니다.
        Statement stmt = this.conn.createStatement(); // 4
        StringBuffer sb = new StringBuffer();

        // SQL 쿼리를 생성합니다.
        sb.append("insert into patient ");
        sb.append("values(" + p.getNumber() +", '" + p.getCode() + "', ");
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', ");
        sb.append(p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ")");

        // 생성된 SQL 쿼리를 출력합니다.
        System.out.println(sb.toString());

        // SQL 쿼리를 실행하고 영향을 받은 행의 수를 반환받습니다.
        int su = stmt.executeUpdate(sb.toString()); // 5

        // 데이터베이스 연결과 Statement 객체를 닫습니다.
        DBClose.dbClose(this.conn, stmt);

        // 영향을 받은 행이 1개인 경우 true를 반환하고, 그렇지 않으면 false를 반환합니다.
        return (su ==1 ) ?true :false;
    }

    // 단일 환자 정보를 읽는 메서드
    @Override
    public PatientVO readPatient() {
        return null;
    }

    // 모든 환자 정보를 읽는 메서드
    @Override
    public List<PatientVO> readAllPatient() throws SQLException {
        String sql = "SELECT number ,dept,operfee ,hospitalfee ,money ";
        sql+="FROM patient ORDER BY number DESC"; // 높은 것 부터 내림차순
        Statement stmt = this.conn.createStatement(); // 4번
        ResultSet rs = stmt.executeQuery(sql);
        List<PatientVO> list = new ArrayList<>();
        while(rs.next()) { // 6번
            int number = rs.getInt("number");
            String dept = rs.getString("dept");
            int operfee = rs.getInt("operfee");
            int hospitalfee = rs.getInt("hospitalfee");
            int money = rs.getInt("money");
            PatientVO p = new PatientVO();;
            p.setNumber(number); p.setDept(dept);
            p.setOperFee(operfee); p.setHospitalFee(hospitalfee);
            p.setMoney(money);
            list.add(p);
        }
        DBClose.dbClose(conn,stmt,rs); // 7번
        return list;
    }

    // 환자 정보를 업데이트하는 메서드
    @Override
    public boolean updatePatient() {
        return false;
    }

    // 환자 정보를 삭제하는 메서드
    @Override
    public boolean deletePatient(int number) throws SQLException {
        String sql ="DELETE FROM Patient WHERE number = ?"; // 불완전한 SQL문. 삭제할 환자의 번호를 지정하는 SQL 문
        PreparedStatement pstmt = this.conn.prepareStatement(sql); // 4번 . SQL 문을 미리 컴파일하기 위해 PreparedStatement 객체 생성
        pstmt.setInt(1, number); // 완전한 SQL문장. 첫 번째 매개변수(?)에 환자 번호를 설정
        int row = pstmt.executeUpdate(); // 5번  SQL 문을 실행하고 영향을 받은 행의 수를 반환
        DBClose.dbClose(conn, pstmt); //7 번 데이터베이스 연결과 PreparedStatement 객체를 닫음
         return (row ==1) ? true :false; // 삭제된 행의 수가 1이면 true 반환, 그렇지 않으면 false 반환
    }
}
