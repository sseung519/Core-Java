import java.sql.Array;
import java.util.Scanner;

public class Japanki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y_n = null;
        int[] moneyArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        do {
        System.out.print("money : "); // 145,678 입력
        int money = sc.nextInt();
        for (int i = 0; i < moneyArray.length; i++) {
            int mok = money / moneyArray[i];
            System.out.println(moneyArray[i] + "원: " + mok);
            money = money % moneyArray[i];
        }
            System.out.print("Again? (y/n) : ");
            y_n = sc.next();
            y_n = y_n.toLowerCase();
        } while(y_n.equals("y"));
        System.out.println("Program is over...");
    }
}
