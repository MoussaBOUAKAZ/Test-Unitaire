package TP1;

import org.example.TP1.Calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        Calculatrice calc = new Calculatrice();
        assertEquals(5, calc.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        Calculatrice calc = new Calculatrice();
        assertEquals(1, calc.soustraction(4, 3));
    }

    @Test
    public void testMultiplication() {
        Calculatrice calc = new Calculatrice();
        assertEquals(12, calc.multiplication(4, 3));
    }

    @Test
    public void testDivision() {
        Calculatrice calc = new Calculatrice();
        assertEquals(2, calc.division(6, 3));
    }

    @Test
    public void testDivisionParZero() {
        Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> calc.division(6, 0));
    }
}
