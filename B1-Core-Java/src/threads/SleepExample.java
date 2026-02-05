package threads;
public class SleepExample {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Printing 0-9: ");
        for (int i=0; i<10; i++){
            System.out.println("Printed: " + i);
            Thread.sleep(1000);
        }
        System.out.println("Done");
    }
}
/*
Here, the thread is paused for a fixed duration using sleep().
The Thread does not release any lock and resumes automatically after the
given time.
 */
