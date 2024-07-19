/*
    작성자 : 오승찬
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Input
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
import java.util.List;
import java.util.Scanner;

public class Input {
    private List<Hospital> list;

    public Input(List<Hospital> list) {
        this.list = list;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        String i_o = null;
        for (int i = 0; i < 5; i++) {
            System.out.print("번   호 : ");
            int num = sc.nextInt();
            System.out.print("진료코드 : ");
            String department = sc.next();
            System.out.print("입원일수 : ");
            int daysAdmitted = sc.nextInt();
            System.out.print("나   이 : ");
            int age = sc.nextInt();

            String dept = null;
            switch (department.toUpperCase()) {
                case "MI" : dept="외과"; break;
                case "NI" : dept="내과"; break;
                case "SI" : dept="피부과"; break;
                case "TI" : dept="소아과"; break;
                case "VI" : dept="산부인과"; break;
                case "WI" : dept="비뇨기과"; break;
            }
            Hospital hospital = new Hospital(num, dept, daysAdmitted, age);
            this.list.add(hospital);
            System.out.print("입력/출력(I/O)? ");
            i_o = sc.next();
            if (i_o.toLowerCase().equals("i")) {
                continue;
            } else {
                break;
            }
        }
    }
}
