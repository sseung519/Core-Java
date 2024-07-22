public class StaticDemo2 {
    private int a; //member variable
    private final int B; //member constant
    private static int c; //static varialbe
    private static final int D; //static constant
    {  //initialization block (초기화 블록): 멤버변수, 멤버상수 초기화, 객체 생성때마다 자동 호출 -> 생성자보다 먼저 실행된다.
        a = 5; B = 100;

    }
    static { //static initailization (스태틱 초기화 블록): 스태틱 변수, 스태틱 상수 최고하; class 로딩 시, 단 한번 수행
        c = 500; D = 1000;
    }

    public static void main(String[] args) {
        System.out.println(c + ", " + D);
    }
    void print(){
        int e; //local variable
        final int F; //local constant
    }
}
