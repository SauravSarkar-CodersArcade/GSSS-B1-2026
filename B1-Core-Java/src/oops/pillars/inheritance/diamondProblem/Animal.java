package oops.pillars.inheritance.diamondProblem;
public interface Animal {
    void sound();
}
interface Cat{
    void sound();
}
interface Dog {
    void sound();
}
class Cog implements  Cat, Dog {
    public void sound(){
        System.out.println("Cog makes some combined sound!!");
    }
}
class Demo {
    public static void main(String[] args) {
        Cog c = new Cog();
        c.sound();
    }
}
