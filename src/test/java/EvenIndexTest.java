import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenIndexTest {
    @Test
    void printEven() {
        List<String> list = List.of("a", "b", "c");
        EvenIndex.printValuesFromEven(list, 0);
    }

    @Test
    void listIsNull() {
        List<Integer> list = null;
        EvenIndex.printValuesFromEven(list, 0);
    }

    @Test
    void listIsEmpty() {
        List<Integer> list = Collections.emptyList();
        EvenIndex.printValuesFromEven(list, 0);
    }

}