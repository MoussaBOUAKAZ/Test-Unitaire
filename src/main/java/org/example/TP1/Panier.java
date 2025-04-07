package org.example.TP1;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<String> articles;

    public Panier() {
        articles = new ArrayList<>();
    }

    public void ajouterArticle(String article) {
        articles.add(article);
    }

    public void supprimerArticle(String article) {
        articles.remove(article);
    }

    public int nombreArticles() {
        return articles.size();
    }

    public boolean contient(String article) {
        return articles.contains(article);
    }
}
