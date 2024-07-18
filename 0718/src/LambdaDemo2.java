/*
    @FunctionalInterface
    1. 일반적으로 interface는 한 개 이상의 추상메소드를 가질 수 있다.
    2. 하지만, 여러개의 추상메소드가 있으면 Lambda Expression에 에러가 발생한다.
    3. 그래서, Lambda Expression에서 사용하기 위한 interface를 지정하기 위한 annotation이다.
 */

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
        첫번째 방법: Anonymous Class를 이용
        Comparable com = new Comparable() {
            @Override
            public int compare(int front, int back) {
                return front - back;
            }
        // };
        // int max = com.compare(a, b);
        // System.out.println();
         */

        /*
        두번째 방법: Polymorphic Parameter를 이용
        calculator(new Comparable() {
            @Override
            public int compare(int front, int back) {
                return front - back;
            }
        });
        */

        // 세번째 방법: Lambda를 이용
        calculator((front, back) -> front - back);
    }

    private static void calculator(Comparable comp) {
        int a = 5, b = 10;
        int result = comp.compare(a, b);
        System.out.println("result = " + result);
    }
}

@FunctionalInterface
interface Comparable {
    int compare(int front, int back);
}
