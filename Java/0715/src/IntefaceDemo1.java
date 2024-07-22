public interface IntefaceDemo1 {
    public static void main(String[] args) {
        Car sonata = new Car("EF 소나타", 30_000_000);
        Car matiz = new Car("RedMatiz", 10_000_000);
    }
}

class Car implements Comparable<Car>{
    private String name;
    private int price;
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car other) {// 파라미터로 들어온 값을 비교 this - other
        return this.price = other.price;
    }
}
