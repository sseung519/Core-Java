package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
    private Scanner sc;
    private List<StudentVO> list;

    public Input(List<StudentVO> list) throws FileNotFoundException {
        this.sc = new Scanner(new File("sungjuk_utf8.txt"));
        this.list = list;
    }

    void input() {


        while (this.sc.hasNextLine()) {
String line = sc.nextLine();
            // 문자열 파싱 ==> String[] = String 클래스의 split(정규식)
            Scanner s = new Scanner(line).useDelimiter("\\s+");
            String hakbun = s.next();
            String name = s.next();
            int kor = s.nextInt();
            int eng = s.nextInt();
            int mat = s.nextInt();
            int edp = s.nextInt();
            StudentVO student = new StudentVO(hakbun, name, kor, eng, mat, edp);
            this.list.add(student);
        }
    }
}
