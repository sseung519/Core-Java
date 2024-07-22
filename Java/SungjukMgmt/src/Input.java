import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    private Scanner sc;
    private Student[] array;
    public Input(Student[] array) throws FileNotFoundException {
        this.sc = new Scanner(new File("sungjuk_utf8.txt"));
        this.array = array;
    }
    void input() {
        for (int i = 0; i < this.array.length ; i++) {

            String line = this.sc.nextLine(); //1101 한송이 78 87 83 78
            //문자열 파싱 ==> String[] = String 클래스의 split(정규식)
            Scanner s = new Scanner(line).useDelimiter("\\s+");
            String hakbun = s.next();
            String name = s.next();
            int kor = s.nextInt();
            int eng = s.nextInt();
            int mat = s.nextInt();
            int edp = s.nextInt();
            this.array[i] = new Student(hakbun, name, kor, eng, mat, edp);

        }
    }
}
