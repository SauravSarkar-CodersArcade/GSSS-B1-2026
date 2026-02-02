package demo;
class StringExample {
    public static void main(String[] args) {
        char[] letters = {'R','U','C','H','I','T','H','A'};
        String name = new String(letters);
        // Wrapper Classes
        int a = 10;
        Integer x = 10;
        // Wrap primitive into Wrapper class -> Boxing
        // Wrapper class to primitive -> Unboxing
        System.out.println(name); // RUCHITHA
    }
}
