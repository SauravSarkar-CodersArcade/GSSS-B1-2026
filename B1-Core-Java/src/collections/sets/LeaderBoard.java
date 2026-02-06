package collections.sets;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
// Sorted Order - TreeSet - No Duplicates
// add(), remove(), contains(), size(), clear()
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(450);
        scores.add(120);
        scores.add(300);
        scores.add(300);
        System.out.println("Leader Board: " + scores);
    }
}
/*
⭐ Set = no duplicates
⭐ HashSet = fastest
⭐ LinkedHashSet -> preserve the insertion order
⭐ TreeSet -> Sorted
⭐ No index-based access
⭐ If no child classes are used - it uses Hashing Order
 */
