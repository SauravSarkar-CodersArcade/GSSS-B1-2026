package oops.pillars.inheritance.hierarchical;
public class User {
    void role(){
        System.out.println("Generic User");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin User");
    }
}
class Guest extends User{
    @Override
    void role(){
        System.out.println("Guest User");
    }
}
class Demo {
    public static void main(String[] args) {
        User u1 = new Admin();
        User u2 = new Guest();
        User u3 = new User();
        u1.role();
        u2.role();
        u3.role();
    }
}
