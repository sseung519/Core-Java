public class Car {
    String name;
    int price;

    public Car(){ //기본 생성자 -> 만들지 않아도 *컴파일러가 자동 생성을 해준다.
        this.name = null;
        this.price = 0;
    }

    public Car clone() {
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
