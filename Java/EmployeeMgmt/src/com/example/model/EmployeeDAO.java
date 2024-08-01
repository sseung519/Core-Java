/*
    작성자 : 오승찬
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 - EmployeeDAO
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
package com.example.model;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    /**
     * 새로운 사원을 등록한다. 등록된 사원이 있다면 false, 등록 성공 시, true
     * @Param EmployeeVO
     * @return 등록 성공하면 true, 실패 false
     */
    boolean createEmployee(EmployeeVO e) throws SQLException;

    /**
     * 지금까지 등록된 모든 사원 리스트를 반환
     * @return PatientVO형 List
     */
    List<EmployeeVO> readAllEmployee() throws SQLException;

}
