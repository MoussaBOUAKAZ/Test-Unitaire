package TP1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.BinarySearch;
import org.junit.jupiter.api.Test;

public class Exo3Test {
    @Test
    public void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
        assertEquals(-1, BinarySearch.binarySearch(array, 6));
    }

    @Test
    public void testBinarySearchEdgeCases() {
        int[] array = {1};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
        assertEquals(-1, BinarySearch.binarySearch(array, 2));
    }

    @Test
    public void testBinarySearchNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 3));
    }
}
