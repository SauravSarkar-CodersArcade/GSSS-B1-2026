package mutableStrings;
public class BufferExample {
    public void stringAppend(){
        StringBuffer buffer = new StringBuffer("GSSS");
        System.out.println("Original String: " + buffer);
        buffer.append(" B1");
        System.out.println("New String: " + buffer);
    }
    public void stringInsert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Original String: " + buffer);
        buffer.insert(1, "AV"); // JAVA
        System.out.println("New String: " + buffer);
    }
    public void stringReverse(){
        StringBuffer buffer = new StringBuffer("NOHTYP");
        System.out.println("Original String: " + buffer);
        buffer.reverse(); // PYTHON
        System.out.println("New String: " + buffer);
    }
    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
