/*
    1. this. : 나의 주소
    2. this : 나
    3. this() : 나의 생성자
 */
public class ThisDemo {
    public static void main(String[] args) {
        Car sonata = new Car();
        sonata.setName("현대소나타");
        sonata.setPrice(30_000_000);
        System.out.println("이름 = " + sonata.getName());
        Car matiz = sonata.clone();
        System.out.println(matiz.getName());
        matiz.setName("마티즈");
        System.out.println(matiz.getName());
    }

}
