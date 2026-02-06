package collections.queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedo {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("Type A");
        actions.addLast("Type B");
        actions.addLast("Delete B");

        System.out.println("Undo: " + actions.removeLast());
        System.out.println("Remaining actions: " + actions);
    }
}
