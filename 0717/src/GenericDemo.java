public class GenericDemo {
    public static void main(String[] args) {
        // Car carnival = new Car(40_000_000);
        // carnival.setPrice(45_000_000);
        // System.out.println(carnival); //carnival.toString()

        Car<Integer> integerCar = new Car<Integer>(45_000_000);
        System.out.printf("price = %d%n", integerCar.getPrice());
        Car<String> stringCar = new Car<String>("10000000");
        System.out.printf("price = %s%n", stringCar.getPrice());
        Car<Double> doubleCar = new Car<Double>(45_000_000.0);
        System.out.printf("price = %.1f%n", doubleCar.getPrice());
    }
}

class Car<T> {
    private T price;

    public Car(T price) {
        this.price = price;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }
}
