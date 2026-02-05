package demo;
enum Priority {
    HIGH, LOW, MEDIUM
}
enum OrderStatus{
    SHIPPED, DELIVERED, PENDING, OUT_FOR_DELIVERY, CANCELLED
}
public class EnumDemo {
    public static void main(String[] args) {
        Priority p = Priority.LOW;
        System.out.println("The priority is: " + p);
        // Traverse & print all the values
        for(Priority x : Priority.values()){
            System.out.print(x + " ");
        }
    }
}
