package collections.map;
// If you want sorted order - use TreeMap (Rank, Position)
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class GameLeaderboard {
    public static void main(String[] args) {
        Map<Integer, String> leaderBoard =
                new TreeMap<>();
        leaderBoard.put(2, "Player A");
        leaderBoard.put(3, "Player B");
        leaderBoard.put(1, "Player C");
        System.out.println("LeaderBoard Stats: " +
                leaderBoard);
    }
}
