package oops.pillars.inheritance.multiLevel;

public class SimpleCalculator {
    int x = 20;
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator {
    void square(int x){
        System.out.println(x*x);
    }
    void product(int a, int b){
        System.out.println(a*b);
    }
}
class Demo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        System.out.println("=========================================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(1,2);
        c2.subtract(3,1);
        System.out.println("=========================================");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(1,2);
        c3.subtract(1,2);
        c3.product(3,4);
        c3.square(10);
        System.out.println("=========================================");

    }
}
class A{
}
class B{}
//class C extends A, B{ // Not allowed
//
//}