/*
    작성자 : 오승찬
    작성일 : 2024-07-19
    작성목적 : 병원관리프로그램 - Sort
    작성환경 : MacOS 14.5
            JDK 17.0.10
            IntelliJ IDEA 2024.1.4 (Ultimate Edition)
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public List<Hospital> list;
    public Sort(List<Hospital> list) {
        this.list = list;
    }

    public void quickSort() {
        Collections.sort(this.list, new Comparator<Hospital>() {
            @Override
            public int compare(Hospital o1, Hospital o2) {
                return o1.getNum() - o2.getNum();
            }
        });
    }
}
