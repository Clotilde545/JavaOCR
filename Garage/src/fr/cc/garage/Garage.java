package fr.cc.garage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Garage : est une classe héritant de véhicule qui traite toutes les voitures
 * @prixVehicule: Double : prix du véhicule
 * @nomVehicule : String : nom du véhicule
 * @nomMarque : String : nom de la marque du véhicule
 * @listVehicule : Arrays.asList : liste des véhicules
 */
public class Garage extends Vehicule {

    protected double prixVehicule;
    protected String nomVehicule;
    public List listVehicule = Arrays.asList();
    protected Marque nomMarque;


    public Garage() {
        super();
        this.listVehicule = new ArrayList();

    }

    //Getters and setters
    public List addVoiture(Object obj) {
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

    public List getListVehicule() {
        return listVehicule;
    }

    public void setListVehicule(ArrayList listVehicule) {
        this.listVehicule = listVehicule;
    }


    //To String
    @Override
    public String toString() {
        return "Garage{" +
                "prixVehicule=" + prixVehicule +
                ", nomVehicule='" + nomVehicule + '\'' +
                ", listOption=" + getOption() +
                ", nomMarque='" + nomMarque + '\'' +
                "\n, prix Total" + prixTotal +
                '}';
    }
}
