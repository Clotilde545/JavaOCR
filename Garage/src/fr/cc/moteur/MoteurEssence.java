package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurEssence extends Moteur {
    public MoteurEssence(){
        super();
        setCylindre("230O");
        setPrixMoteur(1000);
        setType(TypeMoteur.ESSENCE);
    }
}
