/*
    작성자 : 오승찬
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Hosipital
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
public class Hospital {
    private int num;
    private String dept;
    private int daysAdmitted; // 입원일수
    private int age;
    private double admissionFee; // 입원비
    private double totalHospitalFee; // 총 입원비
    private double treatmentFee; // 진료비
    private double examinationFee; // 진찰비

    public Hospital(int num, String dept, int daysAdmitted, int age) {
        this.num = num;
        this.dept = dept;
        this.daysAdmitted = daysAdmitted;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public int getAge() {
        return age;
    }

    public void setAdmissionFee(double admissionFee) {
        this.admissionFee = admissionFee;
    }

    public void setTreatmentFee(double treatmentFee) {
        this.treatmentFee = treatmentFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%.0f\t%.0f\t%.0f",
                num, dept, examinationFee, admissionFee, treatmentFee);
    }
}
