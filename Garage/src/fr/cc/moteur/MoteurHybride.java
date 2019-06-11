package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurHybride extends Moteur {
    public MoteurHybride(){
        super();
        setCylindre("150F");
        setPrixMoteur(15000);
        setType(TypeMoteur.HYBRIDE);
    }
}
