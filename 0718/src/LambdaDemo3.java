public class LambdaDemo3 {
    public static void main(String[] args) {
        Person sseung = new Person();
        /*
        1st polymorphic parameter를 이용
        sseung.greeting(new Say(){
            @Override
            public void something() {
                System.out.println("Hi");
                System.out.println("Nice 2 meet u");
            }
        });
        */
        // 2nd Lambda Expression
        sseung.greeting(() -> {
                    System.out.println("Hi");
                    System.out.println("Nice 2 meet u");
                }
        );
    }
}

@FunctionalInterface
interface Say {
    void something();
}

class Person {
    public void greeting(Say say) {
        say.something();
    }
}

