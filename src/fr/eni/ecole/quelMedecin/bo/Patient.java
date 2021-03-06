package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente un patient
 * @date 12/05/2021
 * @version v1.0
 * @author Christelle GUILLET
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {
    protected String nom;
    protected String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;
    private Adresse adresse;
    private Creneau creneau;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecuriteSociale, LocalDate dateDeNaissance, String commentaires, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numSecuriteSociale = numSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %s%n" +
                "Sexe : %s%n" +
                "Numéro de sécurité Sociale : %d%n" +
                "Date de Naissance : %s%n" +
                "Commentaires : %s%nAdresse : ",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone,
                this.sexe == 'F' ? "Féminin" : "Masculin",
                this.numSecuriteSociale,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires == null ? "[Aucun commentaire]" : this.commentaires);
        this.adresse.afficher();
        // Pour la dernier ligne la 1ère partie pose une question, si oui et ensuite si non
    }

}