import java.util.List;

public class SecondMax {

    public static int getSecondMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return getTwoOfMax(list)[1];
    }

    private static Integer[] getTwoOfMax(List<Integer> list) {
        if (list.size() == 1) {
            return new Integer[]{list.get(0), null};
        }

        Integer[] arrOfMax = getTwoOfMax(list.subList(1, list.size()));

        if (list.get(0) > arrOfMax[0]) {
            arrOfMax[1] = arrOfMax[0];
            arrOfMax[0] = list.get(0);
        } else if (arrOfMax[1] == null || list.get(0) > arrOfMax[1]) {
            arrOfMax[1] = list.get(0);
        }

        return arrOfMax;
    }
}
