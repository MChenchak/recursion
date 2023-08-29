import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    @DisplayName("-10 < Чмсло < 10")
    void whenValLessThan10() {
        int result = Digits.sumOfDigits(-8);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Чмсло = 10")
    void whenValEquals10() {
        int result = Digits.sumOfDigits(10);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Чмсло > 10")
    void whenValGreaterThan10() {
        int result = Digits.sumOfDigits(123);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Число = 0")
    void whenValEquals0() {
        int result = Digits.sumOfDigits(0);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Число < -10")
    void whenValIsNegative() {
        int result = Digits.sumOfDigits(-123);
        Assertions.assertEquals(6, result);
    }
}