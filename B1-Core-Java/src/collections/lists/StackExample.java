package collections.lists;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(11);
        stack.push(21);
        stack.push(10);
        stack.push(31);
        System.out.println(stack.peek()); // top
        System.out.println(stack.size()); // total
        System.out.println(stack);
    }
}
