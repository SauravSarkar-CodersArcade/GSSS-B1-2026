package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Stream is a collection of data in the form of bytes
// map, filter, reduce, collect, create
// Java 8 - Stream API
public class FilterExample {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45,67, 80, 55, 90);
        List<Integer> passed = marks.stream()
                .filter(m -> m > 60)
                .collect(Collectors.toList());
        System.out.println(passed);
    }
}
