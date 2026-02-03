package oops.thisKeyword;
public class Example {
    // this keyword is used to refer to all current class data members
    String i;
    void change(String i){
        // i = i; // Ambiguity == Confusion
        this.i = i;
    }
    void display(){
        System.out.println("The value of i is: " + i);
    }
    public static void main(String[] args) {
        Example obj = new Example();
        obj.change("GSSS");
        obj.display();
    }
}
