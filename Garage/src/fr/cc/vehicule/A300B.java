package fr.cc.vehicule;

import fr.cc.garage.Marque;
import fr.cc.garage.Vehicule;

public class A300B extends Vehicule{
   public A300B(){
       setNomMarque(Marque.PIGEOT);
       setNom("A300B");
       setPrixChassis(15000.0);
   }
}
