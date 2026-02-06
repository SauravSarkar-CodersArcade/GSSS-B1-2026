package collections.map;
import java.util.ArrayList;
import java.util.Iterator;
// Remove numbers greater than 10 - Iterator (Interface to traverse over Collections)
public class RemoveWithCondition {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(10);
        numbers.add(13);
        numbers.add(21);
        numbers.add(14);
        numbers.add(4);
        numbers.add(2);
        System.out.println("Before: " + numbers);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if(i > 10){
                it.remove();
            }
        }
        // numbers.removeIf(n -> n > 10); Lambda Expression
        System.out.println("After: " + numbers);
    }
}
