package fr.cc;

import fr.cc.garage.Garage;
import fr.cc.garage.Vehicule;
import fr.cc.moteur.MoteurEssence;
import fr.cc.options.GPS;
import fr.cc.options.SiegeChauffant;
import fr.cc.options.VitreElectrique;
import fr.cc.vehicule.Laguna;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicule lag1 = new Laguna();
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256));
        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());
        garage.addVoiture(lag1);
    }
}
