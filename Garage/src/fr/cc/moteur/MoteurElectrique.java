package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurElectrique extends Moteur {
    public MoteurElectrique(){
              setType(TypeMoteur.ELECTRIQUE);
    }

    public MoteurElectrique(String cylindre, double prixMoteur){
        super();
        setType(TypeMoteur.ELECTRIQUE);
    }
}
