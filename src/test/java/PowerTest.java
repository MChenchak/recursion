import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {

    private final double base = 5;

    @Test
    @DisplayName("Степень = 0")
    void whenPowValEquals0() {

        Double powResult = Power.pow(base, 0);
        assertEquals(1.0,powResult);
    }

    @Test
    @DisplayName("Степень < 0")
    void whenPowValIsLessThan0() {

        Double powResult = Power.pow(base, -2);
        assertEquals(0.04,powResult);
    }

    @Test
    @DisplayName("Cтепень > 0")
    void whenBaseGreaterThan0() {

        Double powResult = Power.pow(base, 2);
        assertEquals(25,powResult);
    }

    @Test
    @DisplayName("Основание =  0 и степень > 0")
    void whenBseEquals0() {

        Double powResult = Power.pow(0.0, 2);
        assertEquals(0,powResult);
    }
}