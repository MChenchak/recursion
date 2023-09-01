import java.util.List;

public class EvenIndex {

    public static <T> void printValuesFromEven(List<T> list, int index) {
        if (list == null || list.isEmpty()) return;
        if (index == list.size()) return;

        if (index % 2 == 0)
            System.out.println(list.get(index));

        printValuesFromEven(list, index + 1);
    }
}
