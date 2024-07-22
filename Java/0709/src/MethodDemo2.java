/*
Call by value : 값을 복사하기 때문에 original 의 값은 target의 값을 변경해도 바뀌지 않는다.
Call by reference : ballpen은 주소를 갖고 있기 때문에 주소를 넘겨준다. ballpen.price를 넘겨주면 int primative 타입이기때문에 stack 값 복사지만
                    주소를 가진 ballpen을 넘겨주면 주소 복사
 */
class Product{
    int price;
}
public class MethodDemo2 {
    public static void main(String[] args) {
        MethodDemo2 md =  new MethodDemo2();
        Product ballpen = new Product();
        ballpen.price = 100;
        System.out.println("before = " + ballpen.price);
        md.change(ballpen); // Call by reference
        System.out.println("after = " + ballpen.price);
//        int original = 100;
//        md.print(original); //Call by value
//        System.out.println("original = " + original);
    }
    void change(Product pencil) { //pencil = ballpen
        pencil.price = 50000;
    };

    void print(int target) { //target = original
        System.out.println("target = " + target);
        target = 50000;
        System.out.println("target = " + target);
    }
}
