package TP1.BranchCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.Palindrome;
import org.junit.jupiter.api.Test;

public class Exo1Test {


    @Test
    public void testIsPalindromeValid() {
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    public void testIsPalindromeInvalid() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
