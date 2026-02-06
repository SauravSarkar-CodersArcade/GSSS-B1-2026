package collections.queue;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class Heaps {
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.add(2);
        minHeap.add(9);
        minHeap.add(6);
        minHeap.add(1);
        minHeap.add(4);
        System.out.println(minHeap);
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(8);
        maxHeap.add(2);
        maxHeap.add(9);
        maxHeap.add(6);
        maxHeap.add(1);
        maxHeap.add(4);
        System.out.println(maxHeap);
    }
}
