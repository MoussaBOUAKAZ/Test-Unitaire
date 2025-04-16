package TP1.ConditionCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.RomanNumeral;
import org.junit.jupiter.api.Test;

public class Exo5Test {

    @Test
    public void testToRoman() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994));
    }

    @Test
    public void testToRomanOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }

    @Test
    public void testToRomanSingleDigit() {
        assertEquals("V", RomanNumeral.toRoman(5));
        assertEquals("IX", RomanNumeral.toRoman(9));
    }
}
