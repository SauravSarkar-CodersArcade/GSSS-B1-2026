package oops.copyObjects;
import java.lang.String;
public class Employee {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    // Static copy method
    static Employee copy(Employee e){
        return new Employee(e.id, e.name);
    }
    void display(){
        System.out.println(id + " " + name);
    }
    void d(){

    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Amit");
        Employee e2 = Employee.copy(e1);
        e1.display();
        e2.display();

        String s = new String();
    }
    static {
        System.out.println("Latha starts static");
        // DB
        // Internet
        // Files
        // Any other resources
    }
}
