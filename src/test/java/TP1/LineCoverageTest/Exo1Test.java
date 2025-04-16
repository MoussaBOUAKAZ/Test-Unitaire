package TP1.LineCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.Palindrome;
import org.junit.jupiter.api.Test;


public class Exo1Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
