public class OverrideDemo {
    public static void main(String[] args) {
        Base parent = new Derived();
        parent.display();
    }
}

/*
    public > protected > (default) > private

    Override된 자식 메소드의 접근 범위는 부모 메소드보다 같거나 더 넓어야 한다.
 */
class Base{ //기반 class
    protected void display(){
        System.out.println("나는 부모 메소드");

    }
}

class Derived extends Base{ //파생 calss

    @Override
    public void display() {
        System.out.println("나는 자식 메소드");
    }
}