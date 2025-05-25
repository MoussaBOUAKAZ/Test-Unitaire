# Test Tp0 

### Class personne 
les tests sont bien implimenter dans le repo test\tp0
mais je trouve comme meme des erreurs dans la classe 
exemple:
-pas de vérification des valeurs null pour firstName et lastName

-pas de vérification de l'âge négatif

### Class stack

-Tests manquants pour l'expansion du tableau

-Pas de vérification des exceptions pour peek et pop sur pile vide

-Pas de test pour la taille initiale
### Class  fibonacci
-Pas de test pour les valeurs limites (0 et 1)

-Pas de test pour les valeurs négatives

-Pas de test pour les valeurs typiques

###  Class prime
-Pas de test pour les nombres premiers typiques

-Pas de test pour les nombres non premiers

-Pas de test pour les valeurs limites (0, 1, 2)

### Class factorial
-Pas de test pour 0! 

-Pas de test pour les valeurs négatives

-Pas de test pour les valeurs typiques


# Tests Unitaires TP1 - Couverture de Code

## Exercices de Couverture

### 1. Couverture de Lignes (LineCoverageTest)
- Test de toutes les lignes de code exécutables
- Vérification des chemins de base
- Exemple : `BinarySearch.binarySearch()`

### 2. Couverture de Branches (BranchCoverageTest)
- Test de toutes les conditions if/else
- Vérification des différents chemins de décision
- Exemple : `QuadraticEquation.solve()`

### 3. Couverture de Conditions (ConditionCoverageTest)
- Test de toutes les combinaisons de conditions
- Vérification des cas limites
- Exemple : `Anagram.isAnagram()`

## Classes testées

### BinarySearch
-La condition while (low < high) devrait être while (low <= high) pour inclure le cas où l'élément est à la position low == high

-La condition else if (array[mid] <= element) devrait être else if (array[mid] < element) pour une recherche binaire correcte
### Anagram
-La boucle for va jusqu'à i <= s1.length() ce qui causera une ArrayIndexOutOfBoundsException (devrait être i < s1.length())

### Palindrome
-Dans la boucle while, j++ et i-- sont inversés (devrait être i++ et j--)

### FizzBuzz
-La condition if (n <= 1) est trop restrictive (devrait être if (n < 1) pour permettre n=1)

### RomanNumeral
-La condition while (n > values[i]) devrait être while (n >= values[i]) pour inclure le cas d'égalité

### QuadraticEquation
je trouve aucune erreur.



# Tests Unitaires TP2 - Mockups

## Exercice n°1
CalculatriceTest

Test unitaire réalisé en isolation à l'aide de Mockito.
Il vérifie que la méthode additionner(2, 3) retourne 5, que l'appel a bien été effectué avec les bons paramètres, et que seule cette méthode a été invoquée.
Remarque : Utilisation de verifyNoMoreInteractions pour s'assurer qu'aucune autre méthode n'est appelée.

## Exercice n°2
UserServiceTest

Test unitaire en isolation qui vérifie que la méthode creerUtilisateur appelle correctement l'API UtilisateurApi avec l'objet utilisateur donné.
Remarque : Le test utilise doNothing() pour simuler un appel API réussi sans effet de bord.

## Exercice n°3

testCreerUtilisateurAvecException
Test unitaire qui vérifie la propagation des exceptions avec doThrow().
Remarque : Permet de tester la gestion des erreurs réseau ou de validation.

testCreerUtilisateurAvecId
Test unitaire qui vérifie la modification de l'état de l'utilisateur via doAnswer().
Remarque : Simule le comportement d'une API qui attribue un ID.

testCreerUtilisateurAvecArgumentCaptor
Test unitaire qui vérifie la validité des données transmises à l'API.
Remarque : Utilise ArgumentCaptor pour inspecter les paramètres passés.

## Exercice 4 : Jeu de dés

### 1. Objets à mocker
- `Banque` : Pour isoler les tests des effets financiers réels
- `Joueur` : Pour simuler différents comportements de joueurs
- `De` (×2) : Pour contrôler les résultats des lancers

### 2. Scénarios de test
1. Jeu fermé : Vérifie la gestion de l'état du jeu
2. Joueur insolvable : Vérifie la gestion des erreurs de paiement
3. Perte : Vérifie le flux normal sans gain
4. Gain : Vérifie le flux normal avec gain
5. Gain avec banque insolvable : Vérifie la fermeture du jeu

### 4. Test du jeu fermé
Test d'état qui vérifie la cohérence de l'état du jeu et la gestion des exceptions.

### 5. Test du joueur insolvable
Test d'interaction qui vérifie l'absence d'appels aux dés en cas d'erreur.

### 7. Différence entre les tests
- Mocks : Tests rapides et prévisibles, idéaux pour le développement
- Implémentation réelle : Tests d'intégration plus complets mais plus lents
  Remarque : Les deux approches sont complémentaires dans une stratégie de test.

