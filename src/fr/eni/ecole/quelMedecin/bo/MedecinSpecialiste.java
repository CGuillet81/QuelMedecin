package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Personne {
    protected String nom;
    protected String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private String specialite;
    private int tarif;
    private Creneau[] creneau = new Creneau[10];

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif, Creneau[] creneau) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.specialite = specialite;
        this.tarif = tarif;
        this.creneau = creneau;
    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNom() {
        return nom;
    }

    public int getTarif() {
        return tarif;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    /**
     * Affiche sous la forme :
     * NOM Prénom
     * Téléphone : xxxx
     * Tarif : XX€
     */
    public void afficher() {
        System.out.printf("%s %s%nNTelephone : %s%nTarif : %d%nAdresse : ",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone,this.tarif);
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
