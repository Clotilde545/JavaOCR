package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

import java.io.Serializable;

/**
 * @Laguna : Laguna est une voiture dont la classe hérite de véhicule
 * sa  marque est de type Reno et le prix de son chassis est renseigné
 */

public class Laguna extends Vehicule implements Serializable {
    public Laguna(){
        setNomMarque(Marque.RENO);
        setPrixChassis(5000.0);
        setNom("Laguna");
    }
}
