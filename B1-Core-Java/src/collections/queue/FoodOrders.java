package collections.queue;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // adding -> add(){strict}, offer()
        // removing -> remove(){strict}, poll()
        // add & remove will throw exceptions
        orders.offer("Order#101");
        orders.offer("Order#102");
        orders.offer("Order#103");
        orders.offer("Order#104");
        System.out.println("Serving: " +
                orders.poll());
        System.out.println("Pending Orders: " +
                orders);
    }
}
