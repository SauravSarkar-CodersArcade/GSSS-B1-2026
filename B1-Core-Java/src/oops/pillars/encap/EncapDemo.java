package oops.pillars.encap;

public class EncapDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Arun");
        s1.setRollNo(101);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
    }
}
