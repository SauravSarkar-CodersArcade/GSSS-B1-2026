package oops.withConstructor;
public class Student {
    // Instance Variables
    // Class Variables
    // Attributes or Properties
    int id;
    String name;
    int marks;

    Student(int i, String n, int m){
        id = i;
        name = n;
        marks = m;
    }
    // Method
    void evaluateMarks(){
        if(marks >= 40){
            System.out.println(name + " has PASSED.");
        }else {
            System.out.println(name + " has FAILED.");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 65);
        Student s2 = new Student(102, "Amar", 32);
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
