import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        //4로 나누어 떨어지면서 100으로 나누어떨어지지 않고 400년마다 윤년

        Scanner sc = new Scanner(System.in);
        System.out.print("연도:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }


        //A~Z 출력
//        int i = 65; //initialization
//        int count = 0;
//        for (; i <= 90; ) {
//            System.out.printf("%c\t", (char) i);
//            i++;
//            count++;
//            if (count % 5 == 0) {
//                System.out.println();
//            }
//
//        }
//        System.out.println();
//
//        int count4 = 0;
//        for (int j = 1; j <= 100; j++) {
//            if (j % 4 == 0) {
//                count4++;
//            }
//        }
//        System.out.println("1부터 100의 4의 배수의 갯수 " + count4);
//    }

    }
}
