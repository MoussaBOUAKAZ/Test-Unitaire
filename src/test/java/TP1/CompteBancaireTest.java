package TP1;
import org.example.TP1.CompteBancaire;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    @Test
    public void testDepot() {
        CompteBancaire c = new CompteBancaire(100);
        c.deposer(50);
        assertEquals(150, c.getSolde(), 0.001);
    }

    @Test
    public void testRetrait() {
        CompteBancaire c = new CompteBancaire(100);
        c.retirer(30);
        assertEquals(70, c.getSolde(), 0.001);
    }

    @Test
    public void testRetraitSuperieurAuSolde() {
        CompteBancaire c = new CompteBancaire(100);
        c.retirer(150);
        assertEquals(100, c.getSolde(), 0.001); // pas de retrait possible
    }

    @Test
    public void testDepotNegatif() {
        CompteBancaire c = new CompteBancaire(100);
        c.deposer(-50);
        assertEquals(100, c.getSolde(), 0.001); // rien ne se passe
    }
}
