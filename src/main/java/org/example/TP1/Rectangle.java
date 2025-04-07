package org.example.TP1;
public class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double calculerSurface() {
        return largeur * hauteur;
    }

    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }
}
