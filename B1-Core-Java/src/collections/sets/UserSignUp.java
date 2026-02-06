package collections.sets;
import java.util.HashSet;
import java.util.Set;
public class UserSignUp {
    public static void main(String[] args) {
        Set<String> username = new HashSet<>();
        username.add("ankita");
        username.add("anusha");
        username.add("ankita"); // duplicate attempt - ignored
        System.out.println("Registered users: " +
                username);
    }
}
