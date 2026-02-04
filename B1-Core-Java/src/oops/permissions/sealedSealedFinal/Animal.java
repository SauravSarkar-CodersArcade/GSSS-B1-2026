package oops.permissions.sealedSealedFinal;
sealed class Animal permits Cat {
}
sealed class Cat extends Animal permits Tiger {
}
final class Tiger extends Cat{
    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println("Tiger is allowed!");
    }
}
/*
----------------------------------------
sealed      -> controlled inheritance
final       -> inheritance stops
non-sealed  -> inheritance open forever
----------------------------------------
Case                      Allowed?
sealed -> final             ✅
sealed -> sealed            ✅
sealed -> non-sealed        ✅
sealed -> nothing           ❌
extending sealed            ❌
without permits
 */
