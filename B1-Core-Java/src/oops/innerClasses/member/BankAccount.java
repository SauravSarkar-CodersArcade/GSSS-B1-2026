package oops.innerClasses.member;
public class BankAccount {
    private double balance = 10000;
    // Member Inner Class
    class Transaction{
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }else {
                System.out.println("Insufficient balance.");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(30000);
        tx.withdraw(3000);
    }
}
/*
Points to remember:
⭐ Transaction belongs to a specific account
⭐ Direct access to private variable balance
⭐ Clean encapsulation
 */
