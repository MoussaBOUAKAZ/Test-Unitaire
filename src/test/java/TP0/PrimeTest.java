package TP0;

import org.example.TP0.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void isPrime() {
        assertFalse(Prime.isPrime(1));
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(17));
        assertFalse(Prime.isPrime(15));
    }

    @Test
    void edgeCases() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(-5));
    }
}