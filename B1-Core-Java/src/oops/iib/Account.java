package oops.iib;
public class Account {
    int balance;
    {
        // Common logic for all constructors
        balance = 1000;
        System.out.println("Initial balance set!");
    }
    Account(){
        System.out.println("Default Constructor!");
    }
    Account(int extra){
        balance += extra;
        System.out.println("Parameterised Constructor!");
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.balance);
        Account a2 = new Account(500);
        System.out.println(a2.balance);
    }
}
