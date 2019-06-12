package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

import java.io.Serializable;

public class Laguna extends Vehicule implements Serializable {
    public Laguna(){
        setNomMarque(Marque.RENO);
        setPrixChassis(5000.0);
        setNom("Laguna");
    }
}
