import java.util.Scanner;

public class SungjukMgmt {
    public static void main(String[] args) {

        Student sseung = new Student();
        Scanner sc = new Scanner(System.in);
        String y_n = null;
        do {
            System.out.print("학번 : ");
            sseung.hakbun = sc.next();
            System.out.print("국어 : ");
            sseung.kor = sc.nextInt();
            System.out.print("영어 : ");
            sseung.eng = sc.nextInt();
            System.out.print("수학 : ");
            sseung.math = sc.nextInt();

            sseung.tot = sseung.kor + sseung.eng + sseung.math;
            sseung.avg = sseung.tot / 3.0;
            sseung.grade = '\0'; //char null값 \u0000, \0

            switch ((int) (sseung.avg / 10)) {
                case 10:
                case 9:
                    sseung.grade = 'A';
                    break;
                case 8:
                    sseung.grade = 'B';
                    break;
                case 7:
                    sseung.grade = 'C';
                    break;
                case 6:
                    sseung.grade = 'D';
                    break;
                default:
                    sseung.grade = 'F';
            }
            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f\t%3c%n",
                    sseung.hakbun, sseung.kor, sseung.eng, sseung.math,
                    sseung.tot, sseung.avg, sseung.grade);
            System.out.print("Again(y/n) : ");
           y_n = sc.next();
        } while(y_n.equals("y") || y_n.equals("Y"));
        System.out.println("Program is over...");
    }
}
