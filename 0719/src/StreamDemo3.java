import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/*
    중간연산 : filter(), map()
    최종연산 : count(), sum(), max(), min(), average(), reduce(), forEach
    filter(조건) : 중간연산
    map() : 중간연산
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        String[] array = {"abc", "Hello", "Hi", "Java Language"};
        Stream<String> sStream = Stream.of(array); //생성
        sStream.filter(str -> str.length() >= 5).forEach(s -> System.out.println(s + "\t"));
        List<Customer> list = new ArrayList<Customer>();
        Customer c1 = new Customer("박은화", 33); list.add(c1);
        Customer c2 = new Customer("원상운",32); list.add(c2);
        Customer c3 = new Customer("오승찬",30); list.add(c3);
        Customer c4 = new Customer("박정민",29); list.add(c4);
        Stream<Customer> customerList = list.stream();
        customerList.map(c -> c.getName()).forEach(s -> System.out.println(s));
    }
}

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

