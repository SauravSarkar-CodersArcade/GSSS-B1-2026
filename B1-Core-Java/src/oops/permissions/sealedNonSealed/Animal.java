package oops.permissions.sealedNonSealed;
sealed class Animal permits Cat {
}
non-sealed class Cat extends Animal{ // Cat is Permanently Open for inheritance
}
class Tiger extends Cat{
    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println("Tiger created!");
    }
}

