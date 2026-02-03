package oops.constants;
class A {
    // If a variable is final & not initialized,
    // where to do it? => Constructor
    final int a = 10;
    final int x;
    A(){
        x=100;
    }
    static final int p = 50;
    // If a variable is static & final & not initialized,
    // where to do it? => static block
    static final int q;
    static {
        q = 500;
    }
    public static void main(String[] args) {
        System.out.println(p);
    }

}
