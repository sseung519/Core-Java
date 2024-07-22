public class ArrayDemo {
    public static void main(String[] args) {
//        int[] array;
//        array = new int[4];
//        array[0] = 5;
//        array[1] = 6;
//        array[2] = 7;
//        array[3] = 8;
//        for (int i = 0; i <= 3 ; i++) {
//            System.out.print("array[" + i + "] = " + array[i] + "\t");
//        }
//        System.out.println();
//        int[] age; //declartion 변수 선언
//        age = new int[4]; //creation
//        age[0] = 6; age[1] = 7; age[2] = 8; age[3] = 9; //assignment 할당
//        char[] array = {'a', 'b', 'c', 'd'}; //initialization
        String[] array = {"Hello", "World", "Good", "Java", "A"};
        array[3] = "Python";
        for (int i = 0; i <=4 ; i++) {
            System.out.print("array[" + i + "] = " + array[i] + "\t");
        }


    }
}
