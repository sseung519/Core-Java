/*
    작성자 : 오승찬
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 - EmployeeDAOIpml
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
package com.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    private Connection conn;

    //생성자: DBConnection을 통해 DB 연결 설정
    public EmployeeDAOImpl() {
        DBConnection dbConnection = new DBConnection();
        this.conn = dbConnection.getConnection();
    }
    //새로운 사원을 DB에 생성하는 메소드

    @Override
    public boolean createEmployee(EmployeeVO e) throws SQLException {
        String sql = "{call sp_create_employee(?,?,?,?,?,?,?,?,?)}";
        CallableStatement cstmt = this.conn.prepareCall(sql);
        try {
            cstmt.setString(1, e.getEmpno());
            cstmt.setString(2, e.getEname());
            cstmt.setString(3, e.getDname());
            cstmt.setInt(4, e.getSal());
            cstmt.setInt(5, e.getRsal());
            cstmt.setInt(6, e.getFsal());
            cstmt.setInt(7, e.getNsal());
            cstmt.setInt(8, e.getTotal());
            cstmt.setInt(9, e.getRealTotal());

            int su = cstmt.executeUpdate();
            return (su == 1) ;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            ex.printStackTrace();
            System.out.println("중복된 사원번호입니다. 다시 시도해주세요.");
            return false;
        }finally {
            DBClose.dbClose(this.conn, cstmt);
        }
    }

    @Override
    public List<EmployeeVO> readAllEmployee() throws SQLException {
        String sql = "{call sp_select_all_employee}";
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        boolean flag = rs.next();
        List<EmployeeVO> list = new ArrayList<>();
        if(!flag) {
        } else {
            do {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String dname = rs.getString("dname");
                int sal = rs.getInt("sal");
                int rsal = rs.getInt("rsal");
                int fsal = rs.getInt("fsal");
                int nsal = rs.getInt("nsal");
                int total = rs.getInt("total");
                int realTotal = rs.getInt("real_total");
                EmployeeVO e = new EmployeeVO();
                e.setEmpno(empno); e.setEname(ename); e.setDname(dname);
                e.setSal(sal); e.setRsal(rsal); e.setFsal(fsal);
                e.setNsal(nsal); e.setTotal(total); e.setRealTotal(realTotal);
                list.add(e);
            } while(rs.next());
        }
        DBClose.dbClose(this.conn, stmt);
        return list;
    }
}
