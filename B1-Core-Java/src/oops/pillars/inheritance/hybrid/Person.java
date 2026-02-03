package oops.pillars.inheritance.hybrid;
interface Sports{
    void play();
}
public class Person {
    String name;
    Person(String name){
        this.name = name;
    }
}
class Student extends Person implements Sports{
    Student(String name){
        super(name);
    }
    public void play(){
        System.out.println(name + " plays football!");
    }
}
class Demo{
    public static void main(String[] args) {
        Student s = new Student("Saurav");
        s.play();
    }
}
