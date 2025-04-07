package TP1;

import org.example.TP1.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testCalculerSurface() {
        Rectangle r = new Rectangle(5, 10);
        assertEquals(50, r.calculerSurface(), 0.001);
    }

    @Test
    public void testCalculerPerimetre() {
        Rectangle r = new Rectangle(5, 10);
        assertEquals(30, r.calculerPerimetre(), 0.001);
    }

    @Test
    public void testGetLargeur() {
        Rectangle r = new Rectangle(4, 7);
        assertEquals(4, r.getLargeur(), 0.001);
    }

    @Test
    public void testGetHauteur() {
        Rectangle r = new Rectangle(4, 7);
        assertEquals(7, r.getHauteur(), 0.001);
    }
}
