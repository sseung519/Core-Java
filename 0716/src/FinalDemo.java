public class FinalDemo {
    public static void main(String[] args) {
        Parent p = new Child(); p.display();
    }
}
class Parent{
    public void display(){
        System.out.println("나는 부모 메소드");
    }
}
class Child extends Parent{
    @Override
    public void display() {
        System.out.println("나는 자식 메소드");
    }
}
