package oops.pillars.inheritance.manualOverride;
public interface Cat {
    default void sound(){
        System.out.println("Meow");
    }
}
interface Dog {
    default void sound(){
        System.out.println("Woof");
    }
}
class Cog implements Cat, Dog {
    public void sound(){
        Dog.super.sound();
        // Cat.super.sound();
    }
}
class Demo {
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}
/*
Class - Class - Class ❌
Class + Interface ❌ (Without Override)
Interface + Interface ✅
Default Methods ✅
 */
