/*
    return 타입
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        MethodDemo3 md = new MethodDemo3();
        md.print();
    }

    String print() { //member method
        int su = 5;
        System.out.println("Hello, World!");
//        return "Hello, World!";
//        System.out.println("dasdas"); //return으로 끝나서 오류
        if (su % 2 == 0) return "aaaa";
        else {
            System.out.println("World");
            return "bbb";
        }
    }
}
