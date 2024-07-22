public class HelloWorld1 {
    /*
    동일 클래스에 있는 스태틱 변수는 클래스 이름을 생략 할 수 있다.
     */
    static String str = "Hello, World!"; //class | static variable
//    String str = "Hello World!"; //instance | member varialbe
    public static void main(String[] args) {
        String str = "Hello World";
        //local | stack | temporary | auto variable 지역변수는 메모리 스택에 올라오고,
        //템포러리로 생성되고, 자동으로 만들어지고 자동으로 소멸
        System.out.println(HelloWorld1.str);
        System.out.println(Demo.str);
    }
}

class Demo{
    static String str = "Python이 대세야!"; //class | static variable
}
