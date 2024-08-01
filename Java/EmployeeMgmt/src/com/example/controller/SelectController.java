/*
        작성자 : 박종호
        작성일 : 2024-08-01
        작성목적 : 사원관리프로그램 -
        작성환경 : Windows 10 22H2(OS Build 19045.4651),
        JDK 17.0.10
        IntelliJ IDEA 2024.1.4 (Ultimate Edition)
        */
package com.example.controller;

import com.example.model.EmployeeDAO;
import com.example.model.EmployeeVO;

import java.sql.SQLException;
import java.util.List;

public class SelectController {
    private EmployeeDAO eDao;

    public SelectController(EmployeeDAO eDao) {
        this.eDao = eDao;
    }

    public List<EmployeeVO> selectAllEmployee() {
        List<EmployeeVO> list = null;
        try {
            list = this.eDao.readAllEmployee();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public EmployeeVO selectEmployeeById(int number) {
        List<EmployeeVO> employees = null;
        try {
            employees = this.eDao.readAllEmployee();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        if (employees != null) {
            for (EmployeeVO e : employees) {
                if (e.getEmpno().equals(String.valueOf(number))) {
                    return e;
                }
            }
        }

        return null; // 일치하는 직원이 없는 경우 null 반환
    }
}
