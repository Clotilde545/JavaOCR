package fr.cc.garage;

import java.util.List;

public class Garage extends Vehicule {
    protected double prixVehicule;
    protected String nomVehicule;
    protected List listVehicule;
    protected String nomMarque;


    //Getters and setters
    public List addOptions(String opt){
       listVehicule.add(opt);
       return listVehicule;
    }

    public double getPrixVehicule() {
        return prixVehicule;
    }

    public void setPrixVehicule(double prixVehicule) {
        this.prixVehicule = prixVehicule;
    }

    public String getNomVehicule() {
        return nomVehicule;
    }

    public void setNomVehicule(String nomVehicule) {
        this.nomVehicule = nomVehicule;
    }

    public Marque getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    //To String
    @Override
    public String toString() {
        return "Garage{" +
                "prixVehicule=" + prixVehicule +
                ", nomVehicule='" + nomVehicule + '\'' +
                ", listVehicule=" + listVehicule +
                ", nomMarque='" + nomMarque + '\'' +
                '}';
    }
}
