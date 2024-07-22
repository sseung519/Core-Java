public class ConsturctorDemo {
    public static void main(String[] args) {
//        Car sonata = new Car();
//        System.out.println(sonata.name);
//        System.out.println(sonata.price);

        //기본 생성자는 생성자를 만들지 않을 때만 컴파일러가 자동 생성하기 때문에 따로 만들어줘야한다. Product Class 기본 생성자 확인
        Product product = new Product();
        Product p = new Product("모나미연필", 1000, "모나미");
        Product c = new Product("노트북", 25_000_000, "Apple MacBook Pro");
        Product tv = new Product("TV", 30_000_000, "삼성전자");
    }
}
