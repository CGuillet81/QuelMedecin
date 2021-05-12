package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {
        private LocalTime heureDebut;
        private int duree;
        private MedecinGeneraliste medecin;
        private Patient patient;

    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    public MedecinGeneraliste getMedecin() {
        return medecin;
    }

    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
                this.heureDebut,
                this.heureDebut.plusMinutes(this.duree),
                this.duree);
    }
}
