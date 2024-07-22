public class WrapperDemo {
    public static void main(String[] args) {
        //before jdk1.5
        int su1 = 5;
        Integer in1 = new Integer(su1); //Wrapping, Boxing
        int another1 = in1.intValue(); //Unwrapping, Unboxing
        System.out.println(another1);

        //After jdk 1.5
        int su2 = 5;
        Integer in2 = su2 * 100; //new Integer(su), Autoboxing
        int another2 = in2; //Autounboxing
        System.out.println(another2);
    }
}
