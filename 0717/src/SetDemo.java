import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        String[] array = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Set<String> hashset = new HashSet<String>();
        Set<String> treeSet = new TreeSet<String>();
        for(String element : array) {
            hashset.add(element);
            treeSet.add(element);
        }
        System.out.println("HashSet: " + hashset);
        System.out.println("TreeSet: " + treeSet);
    }
}
