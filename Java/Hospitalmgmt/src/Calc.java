/*
    작성자 : 박은화
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Output
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
import java.util.ArrayList;
import java.util.List;

public class Calc {
    private List<Hospital> list = new ArrayList<>();

    public Calc(List<Hospital> list) {
        this.list = list;
    }

    public void calc() {
        /*
         * 총입원비 : 1일 입원비 * 입원일수
         * 입원비 : 총입원비 * 입원일수 할인비율
         * 진료비 = 진찰비 + 입원비
         */

        for (Hospital h : this.list) {
            int daysAdmitted = h.getDaysAdmitted(); // 입원일수

            // 1일 입원비 설정
            double dailyAdmissionFee = (daysAdmitted <= 3 && daysAdmitted > 0) ? 30000 : 25000;

            // 총입원비 계산
            double totalHospitalFee = dailyAdmissionFee * daysAdmitted;

            // 할인율 계산
            double discountRate = (daysAdmitted < 10) ? 1.00 :
                    (daysAdmitted < 15) ? 0.85 :
                            (daysAdmitted < 20) ? 0.80 :
                                    (daysAdmitted < 30) ? 0.77 :
                                            (daysAdmitted < 100) ? 0.72 :
                                                    0.68;


            // 입원비 계산
            double admissionFee = totalHospitalFee * discountRate;

            // 진찰비 계산
            double examinationFee = calculateExaminationFee(h.getAge());

            // 진료비 계산
            double treatmentFee = examinationFee + admissionFee;

            // 결과 설정

            h.setExaminationFee(examinationFee); // 진찰비
            h.setAdmissionFee(admissionFee); // 입원비
            h.setTreatmentFee(treatmentFee); // 진료비
        }
    }

    private double calculateExaminationFee(int age) {
        return (age < 10) ? 7000 :
                (age < 20) ? 5000 :
                        (age < 30) ? 8000 :
                                (age < 40) ? 7000 :
                                        (age < 50) ? 4500 : 2300;
    }
}