package org.example.TP2;

public interface Joueur {
    int mise();
    void debiter(int somme) throws DebitImpossibleException;
    void crediter(int somme);
} 