package oops.association.composition;
class Engine {
    void start(){
        System.out.println("Engine Starts!");
    }
}
public class Car {
    private Engine engine; // Composition
    Car(){
        // Engine object will be created here
        engine = new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving!");
    }
}
class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
