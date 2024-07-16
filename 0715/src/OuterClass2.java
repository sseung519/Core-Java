public class OuterClass2 {
    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();
        oc.display();
    }

    void display() {
        int a = 5; //local variables
        class InnerClass2 { //local class
            int b = 100; //local inner class's member variable
            static int c = 500; //local inner class's static variable

            void print() {

            }
        }
        InnerClass2 ic = new InnerClass2();
        System.out.println(ic.b); // member variable 이기 때문에 주소로 접근
        System.out.println(InnerClass2.c); //static이기 때문에 접근 가능
    }
}

