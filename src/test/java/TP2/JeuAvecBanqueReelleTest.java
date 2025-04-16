package TP2;

import org.example.TP2.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class JeuAvecBanqueReelleTest {
    @Mock
    private Joueur joueur;
    @Mock
    private De de1;
    @Mock
    private De de2;

    private Jeu jeu;
    private BanqueImpl banque;

    @Before
    public void setUp() {
        banque = new BanqueImpl(1000, 500);
        jeu = new Jeu(banque);
    }

    @Test
    public void testGainAvecBanqueReelle() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        when(joueur.mise()).thenReturn(100);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(joueur).debiter(100);
        verify(joueur).crediter(200);
        assertEquals(900, banque.getFond()); // 1000 - 200 + 100
        assertTrue(jeu.estOuvert());
    }

    @Test
    public void testGainBanqueInsolvableAvecBanqueReelle() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        banque = new BanqueImpl(550, 500); // Banque avec un fond juste au-dessus du minimum
        jeu = new Jeu(banque);
        when(joueur.mise()).thenReturn(100);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(joueur).debiter(100);
        verify(joueur).crediter(200);
        assertEquals(450, banque.getFond()); // 550 - 200 + 100
        assertFalse(jeu.estOuvert());
    }
} 