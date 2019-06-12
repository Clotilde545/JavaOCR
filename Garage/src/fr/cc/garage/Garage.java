package fr.cc.garage;

import fr.cc.options.GPS;


import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicule {
    protected double prixVehicule;
    protected String nomVehicule;
    protected List listVehicule;
    protected Marque nomMarque;



public Garage(){
    super();
    this.listVehicule = new ArrayList();

}

    //Getters and setters
    public List addVoiture(Object obj){
       listVehicule.add(obj);
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


    //public void setNomMarque(String nomMarque) {
      //  this.nomMarque = nomMarque;
    //}

    //To String
    @Override
    public String toString() {
        return "Garage{" +
                "prixVehicule=" + prixVehicule +
                ", nomVehicule='" + nomVehicule + '\'' +
                ", listVehicule=" + listVehicule +
                ", nomMarque='" + nomMarque + '\'' +
                "\n, prix Total" + prixTotal+
                '}';
    }
}
