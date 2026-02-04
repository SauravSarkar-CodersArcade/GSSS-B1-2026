package oops.innerClasses.anonymous;
public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        // Boilerplate Code
        Payment p = new Payment(){
            public void pay(){
                System.out.println("Payment was done using Credit Card!");
            }
        };
        // Scala Inspired Code - Java Version 8 -> 1.8
        Payment p1 = () -> System.out.println("Debit card");
        p.pay();
        p1.pay();
    }
}
/*
Points to remember:
⭐ One-time implementation
⭐ No need to create separate class
⭐ Used in events & callback functions
 */
