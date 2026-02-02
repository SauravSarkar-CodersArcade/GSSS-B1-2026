public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(args[0]);
        System.out.println(args[1]);
        int x = 10;
        float f = 2.5F;
        double d = 2.5;
        int z = (int) f; // Explicit - Narrowing Casting
        float y = z; // Implicit Widening Casting
    }
}