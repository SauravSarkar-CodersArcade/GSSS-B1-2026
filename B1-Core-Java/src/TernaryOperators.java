public class TernaryOperators {
    public static void main(String[] args) {
        int r1 = (2>3) ? 1 : 0;
        System.out.println(r1);
        String r2 = (2>3) ? "1" : "0";
        System.out.println(r2);
        boolean r3 = (2>3) ? true : false;
        System.out.println(r3);
        int a = 10;
        int b = 20;
        System.out.println(++a + ++b);
        System.out.println("a=" + a + "b="+b);
        System.out.println(3%4+10*2-1); // PEDMAS
        System.out.println(6^3);
        System.out.println(10>>2);
        System.out.println(10<<2);
        System.out.println(~-500);
    }
}
