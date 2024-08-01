/*
    작성자 : 박은화
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 -
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */

package com.example.controller;

import com.example.model.EmployeeVO;

public class CalcController {
    private EmployeeVO e;
    public CalcController(EmployeeVO e) {
        this.e = e;
        this.calc();
    }

    public void calc() {
        // 가족 수당
        int fsal = 7000 * e.getFcount();

        //기본급
        int result = e.getSal();

        // 기본급 계산
        int sal = getSal(e.getSal());

        // 호급수당 계산
        int rsal = getRsal(e.getEmpno());

        // 야간수당 계산
        int nsal = getNsal(e.getNhour());

        // 총급액 계산
        int total = sal + rsal + nsal + fsal;

        // 세금 (호급수당의 10%)
        double tax = rsal * 0.10;

        // 실수령액 계산
        int realTotal = (int) (total - tax);

        e.setResult(result);
        e.setDname(getDname(e.getEmpno()));
        e.setRsal(rsal);
        e.setFsal(fsal);
        e.setNsal(nsal);
        e.setTotal(total);
        e.setRealTotal(realTotal);
    }

    // 부서명 코드
    private String getDname(String empno){
        String dname =null;

        if (empno != null && !empno.isEmpty()) {
            char firstChar = empno.charAt(0);

            switch (firstChar){
                case 'A': dname = "영업부"; break;
                case 'B': dname = "업무부"; break;
                case 'C': dname = "홍보부"; break;
                case 'D': dname = "인사부"; break;
                case 'E': dname = "경리부"; break;
                case 'F': dname = "판촉부"; break;
            }
        } else {
            dname = "총무부";
        }
        return dname;
    }

    // 기본급 (기본급 참조)
    private int getSal(int sal){
        int result = 0;
        switch(sal){
            case 1 : result = 15000; break;
            case 2 : result = 25000; break;
            case 3 : result = 35000; break;
            case 4 : result = 45000; break;
            default: result = 0;
        }
        return result;
    }

    // 호급수당 계산
    private int getRsal(String empno) {
        int rsal = 0; // 기본값 0 설정

        if (empno != null && empno.length() > 1 && Character.isDigit(empno.charAt(1))) {
            int secondDigit = Character.getNumericValue(empno.charAt(1));
            switch (secondDigit) {
                case 1: rsal = 900000; break;
                case 2: rsal = 400000; break;
                case 3: rsal = 600000; break;
                case 4: rsal = 800000; break;
                case 5: rsal = 300000; break;
                case 6:
                case 7: rsal = 800000; break;
                default: rsal = 0; // 잘못된 두 번째 숫자일 경우 기본값 0 설정
            }
        } else {
            rsal = 0; // 유효성 검사 실패 시 기본값 0 설정
        }
        return rsal; // 호급수당 반환
    }

    // 야간수당 ( 야간수당표 참조 )
    private int getNsal(int nhour) {
        int nsal = 0; // 기본값 0 설정

        // 야간 시간에 따라 야간수당 결정
        switch (nhour) {
            case 1: nsal = 1500; break;
            case 2: nsal = 2500; break;
            case 3: nsal = 3500; break;
            case 4: nsal = 4500; break;
            default: nsal = 0; // 유효하지 않은 야간 시간일 경우 기본값 0 설정
        }
        return nsal; // 야간수당 반환
    }
}