package exceptions;
public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Main {
    static void vote(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("You can vote!");
    }
    public static void main(String[] args) {
        try {
            vote(16);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
