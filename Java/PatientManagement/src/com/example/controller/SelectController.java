package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;
import java.util.List;

public class SelectController {
    private PatientDAO pDao;

    public SelectController() {
        this.pDao = new PatientDAOImpl();
    }

    public List<PatientVO> selectAllPatient(){
        List<PatientVO> list =null;
        try{
            list = this.pDao.readAllPatient();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
}