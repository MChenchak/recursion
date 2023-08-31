import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberTest {

    @Test
    void printEven() {
        List<Integer> list = List.of(1,2,3,4,5,6);
        EvenNumber.printEven(list, 0);
    }

    @Test
    void listIsNull() {
        List<Integer> list = null;
        EvenNumber.printEven(list, 0);
    }

    @Test
    void listIsEmpty() {
        List<Integer> list = Collections.emptyList();
        EvenNumber.printEven(list, 0);
    }
}