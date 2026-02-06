package threads;
public class SafeBankAccount {
    int balance = 1000;
    synchronized void withdraw(int amount){
        balance -= amount;
    }
    public static void main(String[] args) throws InterruptedException {
        SafeBankAccount acc = new SafeBankAccount();
        Thread t1 = new Thread(() -> acc.withdraw(500));
        Thread t2 = new Thread(() -> acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balance: " + acc.balance);
    }
}
/*
⭐ synchronized avoids race condition - but doesn't guarantee any order
⭐ locks critical section
⭐ slower but safe
⭐ Essential for shared resources
 */
