package collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        // Min Heap - least value at root node
        severity.offer(5); // low
        severity.offer(1); // critical
        severity.offer(3); // medium

        System.out.println("Treating severity: " + severity.poll());
        System.out.println("Waiting patients: " + severity);
    }
}
