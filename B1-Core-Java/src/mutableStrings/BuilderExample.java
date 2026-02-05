package mutableStrings;
public class BuilderExample {
    public void stringAppend(){
        StringBuilder buffer = new StringBuilder("GSSS");
        System.out.println("Original String: " + buffer);
        buffer.append(" B1");
        System.out.println("New String: " + buffer);
    }
    public void stringInsert(){
        StringBuilder buffer = new StringBuilder("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuilder buffer = new StringBuilder("NOHTYP");
        System.out.println("Original String: " + buffer);
        buffer.reverse(); // PYTHON
        System.out.println("New String: " + buffer);
    }
    public static void main(String[] args) {
        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();
    }
}
