package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PatientDAOImpl implements PatientDAO{
    private Connection conn;

    public PatientDAOImpl() {
        DBConnection dbcConn = new DBConnection();
        this.conn = dbcConn.getConnection(); //1.2.3
    }

    @Override
    public boolean createPatient(PatientVO p) throws SQLException {
        Statement stmt = this.conn.createStatement(); //4.
        StringBuffer sb = new StringBuffer();
        sb.append("insert into patient ");
        sb.append("values(" + p.getNumber() +", '" + p.getCode() + "', ");
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', ");
        sb.append(p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ")");
        System.out.println(sb.toString());
        int su = stmt.executeUpdate(sb.toString()); //5.
        DBClose.dbClose(this.conn, stmt);
        return (su == 1) ? true : false; //insert는 하나밖에 못하니 1이면 true 아니면 false 리턴
    }

    @Override
    public PatientVO readPatient(int number) {
        return null;
    }

    @Override
    public List<PatientVO> readAllPatient() {
        return List.of();
    }

    @Override
    public boolean updatePatient() {
        return false;
    }

    @Override
    public boolean deletePatient() {
        return false;
    }
}
