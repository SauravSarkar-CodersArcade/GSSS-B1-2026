package exceptions;
public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[9]);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
            // e.printStackTrace(); // Details of the exception
        }catch (Exception e){
            System.out.println("Something unexpected happened!");
        }finally {
            // This block is always executed, no matter what happens to code.
            System.out.println("End of execution.");
            // db.close();
            // sc.close();
        }
        System.out.println("The value of k is: " + k);
    }
    static {
        System.out.println("Execution Starts");
    }
}
