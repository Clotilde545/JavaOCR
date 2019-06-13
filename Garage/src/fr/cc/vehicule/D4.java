package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

import java.io.Serializable;

/**
 * @D4: est une voiture héritant de la classe véhicule
 * Sa marque est une TROEN et son prix de chassis est de 10 000€
 */

public class D4 extends Vehicule implements Serializable {
    public D4(){
        setNomMarque(Marque.TROEN);
        setNom("D4");
        setPrixChassis(10000.0);
    }
}
