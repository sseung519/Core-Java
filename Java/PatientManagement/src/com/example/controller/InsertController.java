package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class InsertController {
    private PatientDAO patientDAO;
    public InsertController() { //Constructor
        patientDAO = new PatientDAOImpl();
    }
    public boolean insert(PatientVO p) {
        boolean result = false;
        try {
            CalcController calcController = new CalcController(p);
            result = patientDAO.createPatient(p);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
