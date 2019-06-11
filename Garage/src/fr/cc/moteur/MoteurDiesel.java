package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurDiesel extends Moteur {
    public MoteurDiesel(){
            setType(TypeMoteur.DIESEL);
    }

    public MoteurDiesel(String cylindre, double prixMoteur){
        super();
        setType(TypeMoteur.DIESEL);
    }
}
