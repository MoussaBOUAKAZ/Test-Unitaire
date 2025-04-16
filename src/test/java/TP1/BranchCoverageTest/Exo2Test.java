package TP1.BranchCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.Anagram;
import org.junit.jupiter.api.Test;

public class Exo2Test {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
        assertFalse(Anagram.isAnagram("chien", "chat"));
    }

    @Test
    public void testIsAnagramDifferentLength() {
        assertFalse(Anagram.isAnagram("chien", "chienn"));
    }

    @Test
    public void testIsAnagramNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "niche"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("chien", null));
    }
}
