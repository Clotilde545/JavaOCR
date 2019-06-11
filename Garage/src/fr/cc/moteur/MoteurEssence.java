package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurEssence extends Moteur {
    public MoteurEssence(){
        super();
       
        setType(TypeMoteur.ESSENCE);
    }
}
