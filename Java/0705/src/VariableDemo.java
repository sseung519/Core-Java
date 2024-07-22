public class VariableDemo {
    int eng = 100; //instance variable
    static int math = 80; //class variable / 실행 시, math가 가장 먼저 올라온다.

    public static void main(String[] args) {
        int kor = 90; // local variable(지역변수) main{} 괄호 안에 있기 떄문에
        System.out.printf("수학 점수 = %d\n", VariableDemo.math); //variableDemo 소속 math 하지만 static을 써서 공유를 했다.
        System.out.printf("수학 점수 = %d\n", Demo.math); // Demo의 math를 쓰려면
        System.out.printf("국어 점수 = %d\n", kor);
        VariableDemo vd = new VariableDemo(); // VariableDemo를 new로 생성해줬기 때문에 vd는 heap에 있는 eng(100)을 가져옴
        System.out.printf("영어 점수 = %d\n", vd.eng); //heap주소를 알고있는 vd를 통해 eng를 찾아야 한다.
        Demo d = new Demo(); //Demo의 eng을 사용하기 위해 생성
        System.out.printf("영어 점수 = %d\n", d.eng);
    }

}

class Demo {
    static int math = 100;
    int eng = 50;
}
