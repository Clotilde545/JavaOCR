package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurDiesel extends Moteur {
    public MoteurDiesel(){
        super();

        setType(TypeMoteur.DIESEL);
    }
}
