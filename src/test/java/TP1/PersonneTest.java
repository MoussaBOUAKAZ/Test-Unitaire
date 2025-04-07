package TP1;

import org.example.TP1.Personne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonneTest {

    @Test
    public void testEstMajeurVrai() {
        Personne p = new Personne("Jean", 20);
        assertTrue(p.estMajeur());
    }

    @Test
    public void testEstMajeurFaux() {
        Personne p = new Personne("Luc", 15);
        assertFalse(p.estMajeur());
    }

    @Test
    public void testGetNomEtAge() {
        Personne p = new Personne("Sophie", 25);
        assertEquals("Sophie", p.getNom());
        assertEquals(25, p.getAge());
    }
}
