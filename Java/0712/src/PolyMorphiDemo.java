/*
    다형성
    1. 객체 형변환
    1) 자동 형변환, implicit conversion, promotion
    -자식 객체가 부모 객체로 형변환 할 때
    2) 강제 형변환, explicit conversion, demotion
    -부모 객체가 자식 객체로 형변환하고자 할 때, 단. instanceof 연산자가 ture를 리턴할 때에만
    2. Override method
 */
public class PolyMorphiDemo {
    public static void main(String[] args) {

        //int su = 5;
        //long lo = su; // 자동 형변환, implicit conversion, promotion
        //double avg = su; //자동 형변환,
        //short sh = (short)avg;  //강제 형변환, explicit conversion, demotion

        //객체끼리는 형변환이 안된다. 부모 자식의 관계에서 가능
        Test t = new Test();
        Demo d = new Demo();
//        t = (Test) d;
        if(t instanceof Demo) {
            d = (Demo)t;
        } else {
            System.out.println("안돼");
        }
    }
}

class Test {
}

class Demo extends Test {
}
