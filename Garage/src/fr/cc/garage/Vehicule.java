package fr.cc.garage;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    protected Double prixChassis;
    protected String nom;
    protected List<Options> option;
    protected Marque nomMarque;
    protected Moteur moteur;

    public Vehicule(){
        super();
        this.option = new ArrayList<Options>();
    }


    public void addOption(Options opt){
            this.option.add(opt);

    }


    //ToSTring
    @Override
    public String toString() {
        return "Vehicule{" +
                "prixChassis=" + prixChassis +
                ", nom='" + nom + '\'' +
                ", option=" + option +
                ", nomMarque=" + nomMarque +
                '}';
    }

    //Getters and setters
    public Double getPrixChassis() {
        return prixChassis;
    }

    public void setPrixChassis(Double prixChassis) {
        this.prixChassis = prixChassis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Options> getOption() {
        return option;
    }

    public void setOption(List<Options> option) {
        this.option = option;
    }

    public Marque getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(Marque nomMarque) {
        this.nomMarque = nomMarque;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}
