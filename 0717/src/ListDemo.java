//List: 중복 허용, 인덱스로 접근

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        String[] array ={"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Vector<String> vector = new Vector<String>(3,3); //(초기용량, 증가량)

        List<String> list = new ArrayList<>(5);
        for(String element : array) {
            list.add(element);
        }
        System.out.println("현재 방 갯수 : " + list.size());
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
