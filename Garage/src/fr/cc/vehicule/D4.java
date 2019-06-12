package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

import java.io.Serializable;

public class D4 extends Vehicule implements Serializable {
    public D4(){
        setNomMarque(Marque.TROEN);
        setNom("D4");
        setPrixChassis(10000.0);
    }
}
