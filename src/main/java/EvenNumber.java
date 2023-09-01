import java.util.Collections;
import java.util.List;

public class EvenNumber {
    public static void printEven(List<Integer> list, int s) {
        if (list == null || list.isEmpty()) return;
        if (s == list.size()) return;

        if (list.get(s) % 2 == 0)
            System.out.println(list.get(s));

        printEven(list, s + 1);
    }
}
