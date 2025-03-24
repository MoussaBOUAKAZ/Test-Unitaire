import org.example.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void fibonacci() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    void negativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}