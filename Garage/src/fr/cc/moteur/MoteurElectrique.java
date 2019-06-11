package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurElectrique extends Moteur {
    public MoteurElectrique(){
        super();
        setCylindre("200E");
        setPrixMoteur(5000);
        setType(TypeMoteur.ELECTRIQUE);
    }
}
