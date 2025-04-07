package TP0;

import org.example.TP0.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void factorial() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void negativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}