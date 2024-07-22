/*
    작성자 : 박은화
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Output
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hospital> list = new ArrayList<Hospital>();

        Input input = new Input(list); // 입력
        input.input();

        Calc calc = new Calc(list); // 계산
        calc.calc();

        Sort sort = new Sort(list); // 정렬
        sort.quickSort();

        Output output = new Output(list); // 출력
        output.labelPrint();
        output.print();
        System.out.println("Program is over...");

    }
}