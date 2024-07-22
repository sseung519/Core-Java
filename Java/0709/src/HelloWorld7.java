/*
    다른 클래스의 스태틱 메소드는 클래스 이름으로 접근해야 한다.
 */
public class HelloWorld7 {
    public static void main(String[] args) {
        HelloWorld6 a =new HelloWorld6();
        Employee.print();
    }
}
class Employee {
    static void print() { //static | class method
        System.out.println("Hello World");
    }
}
