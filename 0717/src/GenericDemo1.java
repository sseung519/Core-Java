import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class GenericDemo1 {
    public static void main(String[] args) {
        Object obj = "Hello";
        // Vector<Object> v1 = new Vector<String>(); // Generic은 형변환이 되지 않는다.
        // Vector<?> v2 = new Vector<?> (); //wildcard type
        // v2.add(5);
        Product<Integer> pencil = new Product<Integer>(1000);
        Product<Double> ballpen = new Product<Double>(100.0);
        // Product<Object> obj = new Product<Object>(new Car());
        Car<?> car = new Car<Integer>(1000);
        Car<? extends Number> car1 = new Car<Integer>(10);

        Car<? super Number> car2 = new Car<Object>(1000);
        //super인 경우에는 실체형을 따라가고,
        //extends인 경우에는 선언형을 따라간다.
        //?는 Object를 따라간다.
        // List<Car> = new ArrayList<Car>();
    }
}
class Product<T extends Number> {
    private T price;

    public Product(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }
}
