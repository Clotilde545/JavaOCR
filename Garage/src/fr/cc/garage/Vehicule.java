package fr.cc.garage;

import java.util.ArrayList;
import java.util.List;

/**
 * @Véhicule: Véhicule est une classe mère
 * @prixChassis: définit le prix du chassis du véhicule
 * @nom: définit le nom de la voiture
 * @option: est une liste contenant les options du véhicule
 * @marque: est la marque de la voiture
 * @moteur: est le type de moteur de la voiture
 * @prixTotal : est le prix total du véhicule c'est à dire le prix du chassis, le prix du moteur et le prix des options
 */

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

    /**
     * @prixTot(): est une méthode permettant de claculer le prix total du véhicule,
     * elle prend en comptre le prix du chassis, le prix du moteur et le prix des options
     * @return: Double : elle retourne le prix total du véhicule
     */
    public double prixTot(){
        Double tot = this.getMoteur().getPrixMoteur() + getPrixChassis() + prixTotOption();
        return tot;
    }

    /**
     * @prixTotOption(): est une méthode permettant de calculer le prix total des options
     * @return: Double : elle retourne la somme total du prix des options
     */
    private double prixTotOption(){
        Double sum =0.0;
        for (Options opt:option) {

           sum += opt.getPrixOption();

        }
       return sum;
    }


    /**
     * @addOption(): méthode permettant d'ajouter les options dans une list d'option pour le véhicule
     * @param opt: est l'option du véhicule
     */
    public void addOption(Options opt){
            this.option.add(opt);
    }


    /**
     * @toString : est une fonction résumant le véhicule
     * @return : String : résumé des infos du véhicule
     */
    @Override
    public String toString() {
        return "Vehicule{" +
                "prixChassis=" + prixChassis +
                ", nom='" + nom + '\'' +
                ", option=" + option +
                ", nomMarque=" + nomMarque +
                ", prix moteur" + getMoteur().getPrixMoteur() +
                ", prix total " + prixTot() +
                "}\n";
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
