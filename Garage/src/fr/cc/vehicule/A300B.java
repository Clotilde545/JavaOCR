package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

import java.io.Serializable;

public class A300B extends Vehicule implements Serializable {
   public A300B(){
       setNomMarque(Marque.PIGEOT);
       setNom("A300B");
       setPrixChassis(15000.0);
   }
}
