package collections.lists;
import java.util.LinkedList;
public class RecentSongs {
    public static void main(String[] args) {
        LinkedList<String> recent = new LinkedList<>();
        recent.addFirst("Song-Arijit_Singh");
        recent.addFirst("Song-Kishore_Kumar");
        recent.addFirst("Song-SP_Balasubramaniam");

        recent.removeLast(); // removes oldest
        recent.add("Song-Sonu_Nigam");
        System.out.println("Recently played: " + recent);
    }
}
/*
⭐ List -> ordered + duplicates
⭐ ArrayList - fast read
⭐ LinkedList - fast insert/delete
⭐ Index-based access available
⭐ Mostly used collection in real apps
 */
