package oops.iib;
public class Employee {
    static String company;
    static {
        company = "Bizotic";
        System.out.println("Static Block executed!");
        System.out.println("Company initialized!");
    }
    int id;
    {
        id = 100;
        System.out.println("IIB Executed!");
        System.out.println("ID initialized!");
    }
    Employee(){
        System.out.println("Constructor executed!");
    }
    void display(){
        System.out.println(id + " " + company);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.display();
        e2.display();
    }
}
