import java.util.Scanner;

public class ProductMgmt {
    public static void main(String[] args) {
        /*
        Product pencil = new Product();
        pencil.name = "모나미 연필";
        pencil.price = 1000;
        System.out.printf("name = %s, price = %d%n", pencil.name, pencil.price);

        Product computer = new Product();
        computer.name = "컴퓨터";
        computer.price = 20_000_00;
        System.out.printf("name = %s, price = %,d%n", computer.name, computer.price);
         */
        Product[] array = new Product[2];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 2) {
            array[i] = new Product();
            System.out.print("Name : ");
            array[i].name = sc.next();
            System.out.print("Price : ");
            array[i].price = sc.nextInt();
            i++;
        }
        for (int j = 0; j < 2; j++) {
            System.out.printf("Name = %s, Price = %,d\n", array[j].name, array[j].price);
        }
    }

}
