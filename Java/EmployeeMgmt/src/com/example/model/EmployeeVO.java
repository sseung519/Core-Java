/*
    작성자 : 오승찬
    작성일 : 2024-08-01
    작성목적 : 사원관리프로그램 - Employee
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
package com.example.model;

public class EmployeeVO {
    private String empno; //사원번호 (알파벳)
    private String ename; //사원이름
    private String dname; // 부서명
    private int sal; //기본급
    private int result; //기본급금액
    private int rsal; //호급수당
    private int fsal; //가족수당
    private int fcount; //가족수
    private int nsal; //야간수당
    private int nhour; //야간시간
    private int total; //총금액
    private int realTotal; //실수령액

    public EmployeeVO(){} //기본생성자
    public EmployeeVO(String empno, String ename, String dname, int sal,  int nhour, int fcount ){
        this.empno = empno;
        this.ename = ename;
        this.dname = dname;
        this.sal = sal;
        this.nhour = nhour;
        this.fcount = fcount;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getRsal() {
        return rsal;
    }

    public void setRsal(int rsal) {
        this.rsal = rsal;
    }

    public int getFsal() {
        return fsal;
    }

    public void setFsal(int fsal) {
        this.fsal = fsal;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public int getNsal() {
        return nsal;
    }

    public void setNsal(int nsal) {
        this.nsal = nsal;
    }

    public int getNhour() {
        return nhour;
    }

    public void setNhour(int nhour) {
        this.nhour = nhour;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRealTotal() {
        return realTotal;
    }

    public void setRealTotal(int realTotal) {
        this.realTotal = realTotal;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
