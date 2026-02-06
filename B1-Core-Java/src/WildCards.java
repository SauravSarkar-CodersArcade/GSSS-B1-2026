import java.util.ArrayList;
import java.util.List;
public class WildCards {
    public static void printList(List<?> elements){
        for (Object o : elements){
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(11);
        integers.add(21);
        printList(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("GSSS");
        strings.add("B1");
        strings.add("2026");
        printList(strings);
    }
}
