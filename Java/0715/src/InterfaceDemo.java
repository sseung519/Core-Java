public class InterfaceDemo {
    public static void main(String[] args) {
        //5. interface도 추상클래스처럼 인스턴스화가 안된다.
        //Mammal mammal = new Mammal();
        //Mammal m = new Dog();
        //m.display();
        //Mammal m1 = new Cat();
        //m1.display();
        //Mammal.PI = 3.15; //상수이기 떄문에 바꿀 수 없다.
        Mammal[] array = new Mammal[2];
//        array[0] = new Dog();
//        array[1] = new Cat();
        for (Mammal m : array) {
//            m.display();
        }
    }
}

//public interface Mammal {
//    //interface는 변수, 생성자를 가질 수 없다.
//    //interface는 static이다.
//    //1. public static final 이 생략된 상수만 가질 수 있다.
//    double PI = 3.14159265358979323846;
//
//    //2. public abstract이 생략된 추상메소드만을 가질 수 있다.
//    void display();
//}


//3. interface를 구현 시 implements 키워드 사용해야 한다. 이중상속
//class Dog implements Mammal {
//    //4. interface 추상메소드를 재정의 시, 반드시 public이어야 한다.
////    @Override
//    public void display() {
//        System.out.println("Dog에 맞게 재정의된 메소드");
//    }
//}
//
//class Cat implements Mammal {
////    @Override
//    public void display() {
//        System.out.println("Cat에 맞게 재정의된 메소드");
//    }
//}
