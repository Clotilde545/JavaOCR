package fr.cc.garage;

import fr.cc.options.GPS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Vehicule {
    protected Double prixChassis;
    protected String nom;
    protected List<Options> option;
    protected Marque nomMarque;
    protected Moteur moteur;
    protected Double prixTotal;


    public Vehicule(){
        super();
        this.option = new ArrayList<Options>();
        //this.prixTotal = prixTot() ;
    }

    public double prixTot(){
        Double tot = this.getMoteur().getPrixMoteur() + getPrixChassis() + prixTotOption();
        return tot;
    }

    private double prixTotOption(){
        Double sum =0.0;
        for (Options opt:option) {

           sum += opt.getPrixOption();

        }
       return sum;
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
                ", prix moteur" + getMoteur().getPrixMoteur() +
                ", prix total " + prixTot() +
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
