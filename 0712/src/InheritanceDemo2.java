//3. static 변수와 static 상속되지 않는다.
public class InheritanceDemo2 {
    public static void main(String[] args) {
        System.out.println(Student.age);
    }
}

class Person{
    String name = "씅찬";
    static int age = 30;
}

class Student extends Person{}