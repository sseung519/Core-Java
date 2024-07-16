/*
    Child : String
    Parent : Object
 */
public class PolyMorphiDemo1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Object original = str; //자식이 부모형으로 자동 형변환
//        if(original instanceof String) System.out.println("된다.");
//        else System.out.println("안된다");
//        String target = (String)original; //강제 형변환
//        System.out.println(target);
//        Child sseung = new Child(); sseung.display();
        Parent p = new Parent();
        Child c = new Child();
        p = c; //자동 형변환
        p.display();

    }
}

class Parent {
    public void display() {
        System.out.println("나는 부모 메소드");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("나는 자식 메소드");
    }
}

