import java.util.List;

public class ListLength {

    public static <T> List<T> pop(List<T> list) {
        list.remove(0);
        return list;
    }

    public static <T> int length(List<T> list) {
        if (list == null || list.isEmpty()) return 0;

        return 1 + length(pop(list));
    }
}
