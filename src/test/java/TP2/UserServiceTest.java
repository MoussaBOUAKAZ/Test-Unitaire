package TP2;

import org.example.TP2.ServiceException;
import org.example.TP2.UserService;
import org.example.TP2.Utilisateur;
import org.example.TP2.UtilisateurApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du comportement du mock
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'appel à l'API
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }

    @Test(expected = ServiceException.class)
    public void testCreerUtilisateurAvecException() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du mock pour lever une exception
        doThrow(new ServiceException("Echec de la création de l'utilisateur"))
                .when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);
    }

    @Test
    public void testCreerUtilisateurAvecId() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du mock pour renvoyer true
        doAnswer(invocation -> {
            Utilisateur u = invocation.getArgument(0);
            u.setId(123);
            return null;
        }).when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'ID de l'utilisateur
        assertEquals(123, utilisateur.getId());
    }

    @Test
    public void testCreerUtilisateurAvecArgumentCaptor() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Création du capteur d'arguments
        ArgumentCaptor<Utilisateur> argumentCaptor = ArgumentCaptor.forClass(Utilisateur.class);

        // Configuration du mock
        doNothing().when(utilisateurApiMock).creerUtilisateur(argumentCaptor.capture());

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Récupération de l'utilisateur capturé
        Utilisateur utilisateurCapture = argumentCaptor.getValue();

        // Vérification des arguments capturés
        assertEquals("Jean", utilisateurCapture.getNom());
        assertEquals("Dupont", utilisateurCapture.getPrenom());
        assertEquals("jeandupont@email.com", utilisateurCapture.getEmail());
    }
}