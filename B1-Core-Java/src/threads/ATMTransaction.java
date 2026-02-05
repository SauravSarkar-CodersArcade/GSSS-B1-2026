package threads;
public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing ATM Transaction.!");
    }
    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread state: " + t.getState());
        t.start();
        System.out.println("Thread state: " + t.getState());
    }
}
/*
⭐ Thread is created once
⭐ start() changes the state
⭐ Thread cannot be restarted
⭐ Final state is TERMINATED or DEAD
 */
