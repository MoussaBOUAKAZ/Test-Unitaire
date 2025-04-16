package TP1.ConditionCoverageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.example.TP1.QuadraticEquation;
import org.junit.jupiter.api.Test;

public class Exo4Test {

    @Test
    public void testSolveWithTwoRoots() {
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, roots);
    }

    @Test
    public void testSolveWithOneRoot() {
        double[] roots = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1.0}, roots);
    }

    @Test
    public void testSolveNoRoots() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    public void testSolveWithZeroA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }

    @Test
    public void testSolveWithNegativeDelta() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }
}
