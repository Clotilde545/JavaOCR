package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurHybride extends Moteur {


    public MoteurHybride(String cylindre, double prixMoteur){
        super(cylindre, prixMoteur);
        setType(TypeMoteur.HYBRIDE);
    }
}
