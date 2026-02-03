package oops.pillars.polymorphism.overriding;
public class RBI {
    double roi(){
        return 6.8;
    }
}
class ICICI extends RBI {
    @Override
    double roi(){
        return 7.2;
    }
}
class HDFC extends RBI {
    @Override
    double roi(){
        return 7.0;
    }
}
class Demo {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        System.out.println("The roi of RBI is: " + rbi.roi() + "%");
        System.out.println("The roi of ICICI is: " + icici.roi() + "%");
        System.out.println("The roi of HDFC is: " + hdfc.roi() + "%");
    }
}
