package StreamAPI;
import java.util.Arrays;
import java.util.List;
public class ReduceCartAmountsToTotal {
    public static void main(String[] args) {
        List<Integer> cartValues =
                Arrays.asList(10, 2, 5, 6);
        int totalAmount = cartValues.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println(totalAmount);
        int totalProduct = cartValues.stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println(totalProduct);
    }
}
