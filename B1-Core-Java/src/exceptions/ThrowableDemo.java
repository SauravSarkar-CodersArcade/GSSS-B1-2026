package exceptions;
// Load testing + Performance testing
public class ThrowableDemo {
    static void test() throws Throwable{
        throw new Throwable("Something went wrong!");
    }
    public static void main(String[] args) {
        try {
            test();
        }catch (Throwable t){
            // fully qualified name + message
            System.out.println("Handled: " + t);
            // no name - just the message
            System.out.println("Handled: " + t.getMessage());
        }
    }
}
/*
throw new String("Error"); ❌
throw new Exception("Error"); ✅
throw new RuntimeException("Error"); ✅
throw new Throwable("Error"); ✅
throw new Integer("Error"); ❌
 */
