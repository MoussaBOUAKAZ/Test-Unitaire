package TP1;
import org.example.TP1.Panier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PanierTest {

    @Test
    public void testAjouterArticle() {
        Panier panier = new Panier();
        panier.ajouterArticle("Pomme");
        assertTrue(panier.contient("Pomme"));
        assertEquals(1, panier.nombreArticles());
    }

    @Test
    public void testSupprimerArticle() {
        Panier panier = new Panier();
        panier.ajouterArticle("Banane");
        panier.supprimerArticle("Banane");
        assertFalse(panier.contient("Banane"));
        assertEquals(0, panier.nombreArticles());
    }

    @Test
    public void testNombreArticles() {
        Panier panier = new Panier();
        panier.ajouterArticle("Orange");
        panier.ajouterArticle("Kiwi");
        assertEquals(2, panier.nombreArticles());
    }
}
