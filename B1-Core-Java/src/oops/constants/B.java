package oops.constants;
public final class B {

}
// A final class cannot be inherited
//class Demo extends B{  Not allowed
//
//}
class C {
    final void show(){
        System.out.println("This is some important data!");
    }
    final void add(int a, int b){
        System.out.println(a+b);
    }
    final void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
class D extends C{
//    void show(){ Not allowed - A final method cannot be overridden
//
//    }
}
class E {
    static void display(final int x){
        // x = 200; // A final parameter cannot be changed - it is constant
        System.out.println(x);
    }
    public static void main(String[] args) {
        display(20);
    }
}
/*
ℹ a final variable cannot be changed
ℹ a final class cannot be inherited
ℹ a final method cannot be overridden
ℹ a final parameter cannot be changed
 */
