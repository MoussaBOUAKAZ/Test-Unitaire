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
public class JeuTest {
    @Mock
    private Banque banque;
    @Mock
    private Joueur joueur;
    @Mock
    private De de1;
    @Mock
    private De de2;

    private Jeu jeu;

    @Before
    public void setUp() {
        jeu = new Jeu(banque);
    }

    @Test(expected = JeuFermeException.class)
    public void testJeuFerme() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        jeu.fermer();

        // Act
        jeu.jouer(joueur, de1, de2);
    }

    @Test(expected = DebitImpossibleException.class)
    public void testJoueurInsolvable() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        when(joueur.mise()).thenReturn(100);
        doThrow(new DebitImpossibleException("Solde insuffisant"))
            .when(joueur).debiter(100);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(de1, never()).lancer();
        verify(de2, never()).lancer();
    }

    @Test
    public void testPerte() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        when(joueur.mise()).thenReturn(100);
        when(de1.lancer()).thenReturn(2);
        when(de2.lancer()).thenReturn(3);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(joueur).debiter(100);
        verify(banque).crediter(100);
        verify(joueur, never()).crediter(anyInt());
    }

    @Test
    public void testGain() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        when(joueur.mise()).thenReturn(100);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4);
        when(banque.est_solvable()).thenReturn(true);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(joueur).debiter(100);
        verify(banque).crediter(100);
        verify(banque).debiter(200);
        verify(joueur).crediter(200);
    }

    @Test
    public void testGainBanqueInsolvable() throws JeuFermeException, DebitImpossibleException {
        // Arrange
        when(joueur.mise()).thenReturn(100);
        when(de1.lancer()).thenReturn(3);
        when(de2.lancer()).thenReturn(4);
        when(banque.est_solvable()).thenReturn(false);

        // Act
        jeu.jouer(joueur, de1, de2);

        // Assert
        verify(joueur).debiter(100);
        verify(banque).crediter(100);
        verify(banque).debiter(200);
        verify(joueur).crediter(200);
        assertFalse(jeu.estOuvert());
    }
} 