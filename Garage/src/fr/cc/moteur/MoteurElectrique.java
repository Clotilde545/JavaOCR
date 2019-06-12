package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurElectrique extends Moteur {


    public MoteurElectrique(String cylindre, double prixMoteur){
        super(cylindre,prixMoteur);
        setType(TypeMoteur.ELECTRIQUE);
    }
}
