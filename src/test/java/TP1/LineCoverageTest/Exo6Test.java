package TP1.LineCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.FizzBuzz;
import org.junit.jupiter.api.Test;

public class Exo6Test {

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testFizzBuzzInvalid() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
}
