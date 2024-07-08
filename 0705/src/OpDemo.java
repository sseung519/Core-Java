import java.util.Scanner;

public class OpDemo {
    public static void main(String[] args) {
//        short su = 5;
//        short result = ~su; //오류 나는 이유 + - ~의 연산은 int이기 때문에 result를 short로 받지 못한다.
//        short result = (short)~su; // 따라서 강제형변환이나 int result로 받아야한다.
//        short reuslt = true ? 1970 : 3.14; //true와 false 결과를 먼저 보고 조건을 본다.
        Scanner sc = new Scanner(System.in);

        System.out.print("값 입력(초단위): ");
        int time = sc.nextInt();
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 3600 % 60;
        System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + second + "초입니다.");

    }
}
