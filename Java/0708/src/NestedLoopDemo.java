public class NestedLoopDemo {
    public static void main(String[] args) {
        int i = 1; //i 초기화
        while(i <= 9) { //i 조건
            int dan = 2; //dan 초기화
            while(dan <= 9) { //dan 조건
                System.out.printf("%d x %d = %d\t", dan , i, dan * i);
                dan++; //dan 증감식
            }
            System.out.println();
            i++;
        }

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <=9 ; j++) {
//                System.out.println(i + "x" + j + " = " + i*j);
//            }
//        }
    }
}
