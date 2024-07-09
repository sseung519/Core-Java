/*
    동일 클래스의 스태틱 메소드는 클래스 이름을 생략할 수 있다.
 */
public class HelloWorld5 {
    public static void main(String[] args) {
        print();
    }
    static void print() { //static | class method
        System.out.println("Hello World");
    }
}
