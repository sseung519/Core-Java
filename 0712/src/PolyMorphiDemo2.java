import java.util.Scanner;

public class PolyMorphiDemo2 {
    public static void main(String[] args) {
        Mammal m = null;

        PolyMorphiDemo2 pd = new PolyMorphiDemo2();
        for (int i = 0; i < 3; i++) {
            int choice = pd.choose();
            switch (choice){
                case 1 : m = new Dog(); break;
                case 3 : m = new Cat(); break;
                case 2 : m = new American(); break;
                case 4 : m = new Korean(); break;
            }
            m.sayThing();
        }
    }
    int choose() {
        System.out.println("***************** Menu *****************");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. American");
        System.out.println("4. Korean");
        Scanner sc = new Scanner(System.in);
        System.out.print("당신은 어느 종족입니까(1~4) ? :");
        return sc.nextInt();

    }
}
