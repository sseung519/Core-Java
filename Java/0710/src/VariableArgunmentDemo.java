public class VariableArgunmentDemo {
    public static void main(String[] args) {
        VariableArgunmentDemo vad = new VariableArgunmentDemo();
        int a = 5; char b = 'B'; boolean c= true;
        double avg = 89.5; String name = "씅찬";
        vad.change(a, b, c, avg, name); //argunment, 인자(인수)
    }

    void change(Object... a) { //parameter, 매개변수
        System.out.println(a.length);

//        for (Object su : a) {
//            System.out.print(su + " ");
//
//        }
    }
}
