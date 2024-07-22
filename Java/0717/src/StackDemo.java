import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        String[] array = {"박은화", "오승찬", "김경환", "박종호", "지소민", "박정민", "원상운"};
        Stack<String> stack = new Stack<>();
        for(String element : array) {
            stack.push(element);
        }
        // System.out.println(stack.peek());
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
