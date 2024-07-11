public class ConstructorDemo1 {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        System.out.println(birthday.year);
    }
}
class MyDate{
    int year, month, day;
    public MyDate(){ // default constructor's overriding
        // 기본생성자를 목적에 맞게 다시 설정하는것을 오버라이딩
        // 이미 있는 것을 수정하는 것을 오버라이딩
        // 오버로딩 = 같은 이름을 가진 애가 여러 개. 매개변수를 다르게 하는거
        // 오버라이딩 = 한개가 있는애를 뜯어 고치는거
        //오버라이딩은 재정의라고 보면 된다. ( 수정하고 수정하는거~)
        this.year = 2024; this.month = 7; this.day = 11;
    }
}