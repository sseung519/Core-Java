/*
    작성자 : 박은화
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 -
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */

package com.example.controller;

import com.example.model.EmployeeDAO;
import com.example.model.EmployeeDAOImpl;
import com.example.model.EmployeeVO;

import java.sql.SQLException;

public class InsertController { // 사원정보를 데이터베이스에 삽입하는 역할
    private EmployeeDAO eDAO;

    public InsertController() { // Constructor 생성자
        eDAO = new EmployeeDAOImpl();
    }

    // 사원 정보를 삽입하는 메서드
    public boolean insert(EmployeeVO e){ // 사원정보가 넘어옴
        boolean result = false;
        try{
            CalcController calcController = new CalcController(e);
            result = eDAO.createEmployee(e);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
