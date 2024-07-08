import java.util.Scanner;

public class DoDemo {
    public static void main(String[] args) {
        String y_n = null; //null 방지
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("몇 Factorial? : ");
            int su = sc.nextInt();
            int answer = 1;
            for (int i = su; i > 0; i--) {
                answer *= i;
            }
            System.out.println(su + "! = " + answer);
            System.out.print("Again(y/n) ? ");
            y_n = sc.next();
        } while (y_n.equals("y") || y_n.equals("Y"));

    }
}
