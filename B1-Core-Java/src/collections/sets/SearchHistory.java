package collections.sets;
import java.util.LinkedHashSet;
import java.util.Set;
public class SearchHistory {
    public static void main(String[] args) {
        Set<String>  history = new LinkedHashSet<>();
        history.add("Cooking");
        history.add("Football");
        history.add("Java");
        history.add("DSA");
        history.add("Cooking"); // Duplicate search
        System.out.println("Search History: " + history);
    }
}
/*
ℹ When you need to maintain insertion order - LinkedHashset ️
 */
