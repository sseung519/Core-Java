public class LambdaDemo5 {
    public static void main(String[] args) {
        Person2 sseung = new Person2();

        // 1st polymorphic parameter를 이용
        sseung.greeting(new Say2(){
            @Override
            public int something(int a) {
                System.out.println("Hi");
                System.out.println("Nice 2 meet u");
                return a * 10;
            }
        });

        // 2nd Lambda Expression
        sseung.greeting((a) ->{
                System.out.println("Hi");
                System.out.println("Nice 2 meet u");
                return a * 100;
        });
    }
}

@FunctionalInterface
interface Say2 {
    int something(int a);
}

class Person2 {
    public void greeting(Say2 say) {
        int value = say.something(5);
        System.out.println("value = " + value);
    }
}

