package oops.iib;
public class Student {
    {
        System.out.println("INSTANCE INITIALIZER BLOCK");
    }
    Student(){
        System.out.println("Constructor executed!");
        System.out.println("Object Created!");
    }
    static {
        System.out.println("Execution Starts. Memory Loads.");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
