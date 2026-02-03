package oops.pillars.abstraction.interfaces;
public interface Animal {
    // Interface only has abstract methods
    // The bodies are empty
    // They are implemented in the child classes
    // Because of this it is 100% abstraction
    void eat();
    void run();
}
class Rat implements Animal{
    @Override
    public void eat() {
        System.out.println("Rats love to eat cheese!");
    }
    @Override
    public void run() {
        System.out.println("Rats run fast!");
    }
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.eat();
        rat.run();
    }
}
