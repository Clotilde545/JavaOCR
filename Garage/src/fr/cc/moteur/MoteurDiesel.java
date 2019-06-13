package fr.cc.moteur;

import fr.cc.garage.Moteur;
import fr.cc.garage.TypeMoteur;

public class MoteurDiesel extends Moteur {
    /**
     * @MoteurDiesel : hérite du constucteur de véhicule
     * @param cylindre :String : est le type de cylindre du véhicule
     * @param prixMoteur: Double : est le prix du moteur
     * @setType : définit le type de moteur
     */
    public MoteurDiesel(String cylindre, double prixMoteur){
        super(cylindre,prixMoteur);
        setType(TypeMoteur.DIESEL);
    }
}
