import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름은? : ");
        String name = sc.nextLine();
        System.out.printf("귀하의 이름은 %s 입니다. \n", name);
    }
}


