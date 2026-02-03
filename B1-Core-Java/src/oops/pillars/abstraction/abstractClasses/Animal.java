package oops.pillars.abstraction.abstractClasses;
abstract class Animal {
    // If the abstract class has only abstract method -> 100% abstraction
    // If it has even 1 normal method -> it is not 100% abstraction
    // Normal or concrete methods
    void eat(){
        System.out.println("Animal eats something!");
    }
    // Abstract Methods
    abstract void run(); // Will be implemented in the child class
}
class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("cats run fast!");
    }
}
class Cheetah extends Animal{
    @Override
    public void run(){
        System.out.println("cheetah runs very fast!");
    }
}
class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();
    }
}
