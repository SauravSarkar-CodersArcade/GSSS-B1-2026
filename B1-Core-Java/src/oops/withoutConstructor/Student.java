package oops.withoutConstructor;
public class Student {
    // Instance Variables
    // Class Variables
    // Attributes or Properties
    int id;
    String name;
    int marks;
    // Method
    void evaluateMarks(){
        if(marks >= 40){
            System.out.println(name + " has PASSED.");
        }else {
            System.out.println(name + " has FAILED.");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Amit";
        s1.marks = 65;
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Amar";
        s2.marks = 32;

        s1.evaluateMarks();
        s2.evaluateMarks();

    }
}
