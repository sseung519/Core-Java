/*
    작성자 : 박은화
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Output
    작성환경 : Windows 10 22H2(OS Build 19045.4651),
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */
import java.util.List;

public class Output {
    private List<Hospital> list;
    public Output(List<Hospital> list) {
        this.list = list;
    }

    public void print(){
        for (Hospital h : this.list) {
            if(h == null){
                break;
            }
            System.out.println(h);

        }
        System.out.println("-------------------------------------------------------");
    }

    public void labelPrint(){
        System.out.println("                   <<병원관리프로그램>>  ");
        System.out.println("-------------------------------------------------------");
        System.out.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
        System.out.println("-------------------------------------------------------");


    }
}