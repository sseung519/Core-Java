public class AbstractDemo1 extends Normal1{
    public AbstractDemo1(String name) {
        super(name);
    }
    public static void main(String[] args) {
        Normal1 normal = new AbstractDemo1("씅찬");
        normal.display();
    }

    @Override
    public void display() {
        System.out.println(super.getName());
    }
}
class Normal1 {
    private String name;

    public Normal1(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("name = " + this.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Normal1{" +
                "name='" + name + '\'' +
                '}';
    }
}
