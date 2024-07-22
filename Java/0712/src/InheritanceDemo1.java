//2. private 멤버는 상속되지 않는다.
public class InheritanceDemo1 {
    public static void main(String[] args) {
        Frog f = new Frog();
        //f.name = "개구리"; private이기 때문에 불가
    }
}

class Amphibia {
    private String name;
    int weight;
}

class Frog extends Amphibia {

}
