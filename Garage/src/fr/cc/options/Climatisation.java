package fr.cc.options;

import fr.cc.garage.Options;
/**
 * @Climatisation : est une classe implementant options, c'est une option qu'un véhicule peut avoir
 *  */
public class Climatisation implements Options {
    /**
     * @getPrixOption(): définit le prix de l'option Climatisation
     * @return: Double: prix de l'option Climatisation
     */
    @Override
    public double getPrixOption() {
        return 2000;
    }

    /**
     * @toString(): Résume l'option
     * @return: String: dit que l'option est une Climatisation
     */
    @Override
    public String toString() {
        return "Climatisation{}";
    }
}
