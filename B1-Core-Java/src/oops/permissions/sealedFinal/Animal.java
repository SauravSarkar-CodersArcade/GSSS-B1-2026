package oops.permissions.sealedFinal;
sealed class Animal permits Cat {
    void type(){
        System.out.println("Animal");
    }
}
final class Cat extends Animal{ // Permanent 🔒 because of final
    void sound(){
        System.out.println("Meow");
    }
}
class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.type();
        cat.sound();
    }
}

