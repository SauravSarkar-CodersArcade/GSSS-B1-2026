package oops.staticBlock;
public class Config {
    static String dbName;
    static int maxConnections;

    static {
        dbName = "GSSS-Student_DB_B1";
        maxConnections = 71;
        System.out.println("Static configuration loaded!");
    }
    static void showConfig(){
        System.out.println(dbName + " " + maxConnections);
    }
}
class Demo {
    public static void main(String[] args) {
        Config.showConfig();
        System.out.println("MAX: " + Integer.MAX_VALUE);
        System.out.println("MIN: " + Integer.MIN_VALUE);
        System.out.println("MAX+1: " + (Integer.MAX_VALUE + 1));
        System.out.println("MIN-1: " + (Integer.MIN_VALUE - 1));
    }
}
