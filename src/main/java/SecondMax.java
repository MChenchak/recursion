import java.util.List;

public class SecondMax {

    public static int getSecondMax(List<Integer> list) {
        if (list == null || list.isEmpty() || list.size()<2) {
            throw new IllegalArgumentException();
        }

        return getSecondMaxRecursively(list, 0, list.get(0), list.get(1));
    }

    private static Integer getSecondMaxRecursively(List<Integer> list, int i, Integer firstMax, Integer secondMax) {
        if (i == list.size()) {
           return secondMax;
        }

        if (list.get(i) > firstMax) {
            secondMax = firstMax;
            firstMax = list.get(i);
        } else if (list.get(i) > secondMax) {
            secondMax = list.get(i);
        }

        return getSecondMaxRecursively(list, i + 1, firstMax, secondMax);
    }
}