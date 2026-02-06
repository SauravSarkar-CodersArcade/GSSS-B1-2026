package collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class FoodDeliveryOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        // new orders
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        // Cancel order
        liveOrders.remove("ORD102");
        // Check order
        System.out.println("ORD103 exists? " +
                liveOrders.contains("ORD103"));
        // Current live orders:
        System.out.println("Current orders: " + liveOrders);
        // End of the day:
        liveOrders.clear();
        System.out.println("Orders after closing: " + liveOrders);
    }
}
/*
⭐ Collection is the base interface
⭐ Used when exact data structure not yet decided
⭐ No index-based access
⭐ Dynamic size
⭐ Stores objects only
⭐ ArrayList is the most common implementation
⭐ Only wrapper classes - no primitive data types allowed
 */
