public class ForDemo {
    public static void main(String[] args) {
        int count = 0;
        int line = 1;
//        for (int i = 65; i <= 90; i++) {
//            if (line % 2 == 0) {
//                System.out.printf("%c\t", (char) i + 32);
//            } else {
//                System.out.printf("%c\t", (char) i);
//            }
//            count++;
//            if (count % 5 == 0) {
//                System.out.println();
//                line++;
//            }
//        }

        int i = 65;
        while (i <= 90) {
            if (line % 2 == 0) {
                System.out.printf("%c\t", (char) i + 32);
            } else {
                System.out.printf("%c\t", (char) i);
            }
            count++;
            if (count % 5 == 0) {
                System.out.println();
                line++;
            }
            i++;
        }
    }
}
