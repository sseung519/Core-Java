public class AbstractDemo {
    public static void main(String[] args) {
        Tiger t = new Lion();
        t.display();
    }
}

abstract class Tiger{
    // 추상 클래스는 정상 메소드와 추상 메소드 둘다 사용 가능, 정상 메소드만 사용도 가능
    // 추상 메소드를 한개라도 가지고 있으면 그 클래스는 추상 클래스다.
    public void pirnt() {
        System.out.println("나는 정상적인 메소드");
    }
    public abstract void display();
}
class Lion extends Tiger{
    public void display(){
        System.out.println("나는 자식 메소드");
    }
}
