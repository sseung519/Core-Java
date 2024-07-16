//member inner class
public class OuterClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        System.out.println(ic.c);
        System.out.println(InnerClass.d); //static

    }
    private int a = 5; //outer class's member variable
    private static int b = 10; //outer class's static variable
    private class InnerClass { // member inner class
        private int c =  100; //inner class's member variable
        private static int d =  500; //inner class's static variable
        public void display () { //inner class's member method
            System.out.println(a + ", " + b + ", " + c + ", " + d); //member는 static에 접근이 가능하다
        }
        public static void print() { //inner class's static method
            System.out.println();
        }
    }
}
