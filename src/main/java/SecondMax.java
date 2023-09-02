import java.util.List;

public class SecondMax {

    public static int getSecondMax(List<Integer> list) {
        if (list == null || list.isEmpty() || list.size() < 2) {
            throw new IllegalArgumentException();
        }

        int firstMax = Math.max(list.get(0), list.get(1));
        int secondMax = Math.min(list.get(0), list.get(1));

        return getSecondMaxRecursively(list, 0, firstMax, secondMax);
    }

    private static Integer getSecondMaxRecursively(List<Integer> list, int i, Integer firstMax, Integer secondMax) {
        if (i == list.size()) {
            return secondMax;
        }

        if (list.get(i) > firstMax) {
            secondMax = firstMax;
            firstMax = list.get(i);
        } else if (list.get(i) > secondMax && list.get(i) < firstMax) {
            secondMax = list.get(i);
        }

        return getSecondMaxRecursively(list, i + 1, firstMax, secondMax);
    }
}