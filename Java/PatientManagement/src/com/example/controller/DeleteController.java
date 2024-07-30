package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;

import java.sql.SQLException;

public class DeleteController {
    private PatientDAO dao; // 멤버변수
    public DeleteController(){ // 생성자
        this.dao = new PatientDAOImpl();
    }

    public boolean delete(int number){
        boolean isSuccess = false;
        try{
            isSuccess = this.dao.deletePatient(number);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return isSuccess;
    }
}