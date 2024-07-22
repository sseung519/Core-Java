import java.io.IOException;
import java.util.Scanner;

public class SungjukMgmt1 {
    public static void main(String[] args) throws IOException {
        Student[] stdArray = new Student[3]; //앞으로 학생들의 정보가 저장 될 공간 확보
        Scanner sc = new Scanner(new java.io.File("src/sungjuk.dat"));
        for (int i = 0; i < 3; i++) {
            stdArray[i] = new Student(); //비로소 여기서 학생 생성
            String line = sc.nextLine();
            //Parsing
            String[] array = line.split("\\s+"); //주소는 line이 가지고 있다. \s : space, tab등
            stdArray[i].hakbun = array[0].trim();
            stdArray[i].name = array[1].trim();
            stdArray[i].kor = Integer.parseInt(array[2].trim());
            stdArray[i].eng = Integer.parseInt(array[3].trim());
            stdArray[i].math = Integer.parseInt(array[4].trim());
        }
        int j = 0;
        while(j < 3) {
            System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d%n",
                    stdArray[j].hakbun, stdArray[j].name, stdArray[j].kor, stdArray[j].eng, stdArray[j].math);
            j++;
        }
    }
}
