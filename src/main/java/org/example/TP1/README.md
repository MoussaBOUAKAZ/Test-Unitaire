
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
