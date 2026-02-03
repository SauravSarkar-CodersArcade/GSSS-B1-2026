package oops.constructorChaining;
public class Employee {
    int id;
    String name;
    double salary;
    static String company = "TCS"; // Belongs to the class || Loads with class itself
    Employee(){
        this(0, "Not Assigned", 0.0);
    }
    Employee(int id, String name){
        this(id, name, 30000);
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(Employee e){ // Manually creating a C++ like Copy Constructor
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary + " " + company);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(201, "Kiran");
        Employee e3 = new Employee(202, "Megha", 5000);
        Employee e4 = new Employee(e3);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        System.out.println(e3.id == e4.id); // You are comparing data  -> true
        System.out.println(e3 == e4); // You are comparing references / addresses -> false
    }
}
