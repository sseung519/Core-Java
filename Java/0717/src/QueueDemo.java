import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        String[] array = {"박은화", "오승찬", "김경환", "박종호", "지소민", "박정민", "원상운"};
        Queue<String> queue = new LinkedList<String>();
        for(String element : array) {
            queue.add(element);
        }
        System.out.println(queue);
    }
}
