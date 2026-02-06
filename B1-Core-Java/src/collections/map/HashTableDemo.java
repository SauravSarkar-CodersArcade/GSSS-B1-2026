package collections.map;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Veeksha"); // entrySet()
        ht.put(117, "Keerthana");
        ht.put(128, "Aamna");
        ht.put(99, "Kanike");
        ht.put(101, "Thanushree");
        ht.put(100, "Soundarya");
        for(Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " <-> " + entry.getValue());
        }

    }
}
