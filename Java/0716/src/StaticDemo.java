public class StaticDemo {
    public static void main(String[] args) {
        Tiger[] array = new Tiger[4];
        for (int i = 0; i < array.length ; i++) {
            array[i] = new Tiger();
        }
        for (Tiger t : array) {
            System.out.println("a = "  + t.a + ", b = " + Tiger.b);
        }
    }
}
class Tiger {
    int a; // member variable은 수 만큼 생성된다.
    static int b; //static variable은 하나만 생성된다.
    public Tiger() {
        a++;
        b++;
    }
}
