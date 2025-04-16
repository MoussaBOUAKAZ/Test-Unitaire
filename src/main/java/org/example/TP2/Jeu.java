package org.example.TP2;

public class Jeu {
    private Banque banque;
    private boolean ouvert;

    public Jeu(Banque banque) {
        this.banque = banque;
        this.ouvert = true;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException, DebitImpossibleException {
        if (!estOuvert()) {
            throw new JeuFermeException("Le jeu est fermé");
        }

        int mise = joueur.mise();
        joueur.debiter(mise);
        banque.crediter(mise);

        int resultat1 = de1.lancer();
        int resultat2 = de2.lancer();
        int somme = resultat1 + resultat2;

        if (somme == 7) {
            int gain = mise * 2;
            banque.debiter(gain);
            joueur.crediter(gain);

            if (!banque.est_solvable()) {
                fermer();
            }
        }
    }

    public void fermer() {
        ouvert = false;
    }

    public boolean estOuvert() {
        return ouvert;
    }
} 