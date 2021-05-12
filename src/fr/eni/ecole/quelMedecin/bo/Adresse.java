package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente une adresse
 * @date 12/05/2021
 * @version v1.0
 * @author Christelle GUILLET
 */

import java.util.EmptyStackException;
import java.util.Locale;

public class Adresse {
    private String rue;
    private int num;
    private String complements = null;
    private String rue2;
    private int codePostal;
    private String ville;

    public Adresse(String rue, int num, String complements, String rue2, int codePostal, String ville) {
        this.rue = rue;
        this.num = num;
        this.complements = complements;
        this.rue2 = rue2;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int num, String complements, String rue2, int codePostal, String ville) {
        this.num = num;
        this.complements = complements;
        this.rue2 = rue2;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void afficher() {
        System.out.println(this.rue != null ? this.rue : "Aucune mention complémentaire");
        System.out.printf("%d %s %s %n" +
                "%05d %s %n",
                this.num, this.complements, this.rue2,
                this.codePostal, this.ville.toUpperCase());

    }
}
