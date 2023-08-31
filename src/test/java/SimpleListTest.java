import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleListTest {

    @Test
    @DisplayName("List is empty")
    void listIsEmpty() {
        List<String> emptyList = Collections.emptyList();
        int length = ListLength.length(emptyList);
        assertEquals(0, length);

    }

    @Test
    @DisplayName("List is null")
    void listIsNull() {
        List<String> emptyList = null;
        int length = ListLength.length(emptyList);
        assertEquals(0, length);

    }

    @Test
    @DisplayName("List size is 5")
    void listSizeIs5() {
        List<Integer> emptyList = new ArrayList<>(10) {
            {
                add(1);
                add(1);
                add(1);
                add(1);
                add(1);
            }

        };
        int length = ListLength.length(emptyList);
        assertEquals(5, length);

    }
}