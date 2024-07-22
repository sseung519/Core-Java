public class ArrayDemo2 {
    public static void main(String[] args) {
//        int[] array; //1차원 배열 선언
//        array = new int[4]; //(배열)생성
//        array[0] = 5; //할당
//        double[] avg = {89.5}; //초기화

//        int[][] array; //2차원 배열 선언
//        array = new int[4][3]; //2차원 배열의 생성 Rectangular Array, 4행 3열
//        array = new int[4][]; //Jagged(Ragged) Array
//        array[0][0] = 5; //할당
//        int[][] array= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//                {10,11,12}
//        };
//        int[][] array;
//        array = new int[4][3];
//        array[0] = new int[]{1, 2, 3};
//        array[1] = new int[]{4, 5, 6};
//        array[2] = new int[]{7, 8, 9};

        int[][] array; //2차원 배열 선언
        array = new int[4][]; //jagged array
        array[0] = new int[]{1, 2, 3, 4};
        array[1] = new int[]{5, 6};
        array[2] = new int[]{7};
        array[3] = new int[]{8, 9, 10, 11, 12};
        System.out.println(array.length);
        System.out.println(array[3].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.printf("array[%d][%d] = %d\t", i, j, array[i][j]);
            }
            System.out.println();
        }

    }
}
