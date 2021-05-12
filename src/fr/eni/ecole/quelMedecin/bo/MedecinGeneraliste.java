package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

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
    private Adresse adresse;
    private Creneau[] creneau = new Creneau[15];

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneau) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.creneau = creneau;
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
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
        System.out.printf("%s %s%nNTelephone : %s%nTarif : %d%nAdresse : ",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone,MedecinGeneraliste.tarif);
        this.adresse.afficher();
        for (int i = 0; i < this.creneau.length; i++) {
            if(this.creneau[i] != null) {
                this.creneau[i].afficher();
            }
        }
    }

    public void ajouterCreneau(Creneau creneauAajouter) {
        /*for (int i = 0; i < this.creneau.length; i++) {
            if (this.creneau[i] == null) {
                this.creneau[i] = creneauAajouter;
                break;
            }
        }*/
        for (Creneau chaqueCase : this.creneau) {
            if (chaqueCase == null) {
                chaqueCase = creneauAajouter;
                break;
            }
        }
    }
}
