public class LambdaDemo4 {
    public static void main(String[] args) {
        Person1 sseung = new Person1();

        // 1st polymorphic parameter를 이용
        sseung.greeting(new Say1(){
            @Override
            public int something() {
                System.out.println("Hi");
                System.out.println("Nice 2 meet u");
                return 100;
            }
        });

        // 2nd Lambda Expression
       sseung.greeting(() -> {
           System.out.println("Hi");
           System.out.println("Nice 2 meet u");
           return 100;
       });
    }
}

@FunctionalInterface
interface Say1 {
    int something();
}

class Person1 {
    public void greeting(Say1 say) {
        int value = say.something();
        System.out.println("value = " + value);
    }
}

