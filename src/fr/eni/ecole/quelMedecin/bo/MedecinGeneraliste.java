package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente un médecin
 * @date 12/05/2021
 * @version v1.0
 * @author Christelle GUILLET
 */

public class MedecinGeneraliste {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private static int tarif = 25;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }


    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    public String getNom() {
        return nom;
    }


    /**
     * Affiche sous la forme :
     * NOM Prénom
     * Téléphone : xxxx
     * Tarif : XX€
     */
    public void afficher() {
        System.out.printf("%s %s%nNTelephone : %s%nTarif : %d%n",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone,MedecinGeneraliste.tarif);
    }
}
