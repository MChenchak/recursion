import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecondMaxTest {

    @Test
    @DisplayName("Пустой список")
    void listIsEmpty() {
        List<Integer> list = Collections.emptyList();

        assertThrows(IllegalArgumentException.class, () -> SecondMax.getSecondMax(list));
    }

    @Test
    @DisplayName("List is null")
    void listIsNull() {
        List<Integer> list = Collections.emptyList();

        assertThrows(IllegalArgumentException.class, () -> SecondMax.getSecondMax(list));
    }

    @Test
    @DisplayName("Все числа >= 0")
    void positive() {
        List<Integer> list = List.of(12,45,34,234,1);

        int secondMax = SecondMax.getSecondMax(list);

        assertEquals(45, secondMax);
    }

    @Test
    @DisplayName("Все числа <= 0")
    void negative() {
        List<Integer> list = List.of(-15, -1, 0, -90, -2);

        int secondMax = SecondMax.getSecondMax(list);

        assertEquals(-1, secondMax);
    }

    @Test
    @DisplayName("Массив из одного элемента")
    void onlyOneElement() {
        List<Integer> list = List.of(4);

        assertThrows(IllegalArgumentException.class, () -> SecondMax.getSecondMax(list));
    }
}