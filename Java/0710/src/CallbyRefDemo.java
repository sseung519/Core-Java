public class CallbyRefDemo {
    public static void main(String[] args) {
        CallbyRefDemo a = new CallbyRefDemo();
        int money = 1000;
        String name =  "씅찬";
        System.out.printf("Before : money =  %d, name = %s\n", money, name);
        a.change(money, name);
        //String 자체가 불변형이기때문에 바뀌지 않는다.
        System.out.printf("After : money =  %d, name = %s\n", money, name);
    }
    void change(int su, String str) { //Call by Value
        su *= 5;
        str = "김지민";
        System.out.printf("In change() su = %d, str = %s\n", su, str);
    }
}
