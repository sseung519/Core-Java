public class Product {
    String name;
    int price;
    String maker;
    //생성자는 이름이 같고 파라미터가 다르기 때문에, method overloading을 할 수 밖에 없다.
    public Product() {//Default constructor
        this.name = null;
        this.price = 0;
        this.maker = null;
    }
    public Product(String name, int price, String maker) {//Constructor
        this.name = name;
        this.price = price;
        this.maker = maker;
    }
}
