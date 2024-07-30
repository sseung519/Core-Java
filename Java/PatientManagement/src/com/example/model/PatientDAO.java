package com.example.model;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    /**
    * 새로운 환자를 등록한다. 이미 등록된 환자가 있다면 false를 리턶나고, 등록에 성공하면 true를 리턴한다.
    * @param Patient
    * @return 등록 성공하면 true, 그렇지 않으면 false
    */
    boolean createPatient(PatientVO p) throws SQLException;
    /**
     * 환자 등록번호를 입력받아서해당 번호의 환자 한명을 리턴한다.
     * @param 환자등록번호
     * @return
     */
    PatientVO readPatient();
    /**
     * 지금까지 등록된 모든 환자 리스트를 반환한다.
     * @return 환자형 리스트
     */
    List<PatientVO> readAllPatient() throws SQLException;
    /**
     * 수정할 환자정보를 입력받아서 수정 성공하면 true를 리턴하고, 실패하면 false를 리턴한다.
     * @param 수정할 환자
     * @return 성공 여부
     */
    boolean updatePatient();

    /**
     * 환자 등록번호를 입력받아서 해당 환자를 삭제한다.
     * @param 삭제할 환자 등록번호
     * @return 성공여부 실패하면 false
     */
    boolean deletePatient(int num) throws SQLException;
}
