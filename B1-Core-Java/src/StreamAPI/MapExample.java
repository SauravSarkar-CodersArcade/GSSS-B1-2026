package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapExample {
    public static void main(String[] args) {
        List<Integer> pricesInRupees =
                Arrays.asList(100, 200, 300);
        List<Integer> pricesInDollars =
                pricesInRupees.stream()
                        .map(p -> p / 100)
                        .collect(Collectors.toList());
        System.out.println(pricesInDollars);
    }
}
