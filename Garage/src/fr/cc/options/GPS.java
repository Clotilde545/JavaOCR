package fr.cc.options;

import fr.cc.garage.Options;
/**
 * @GPS: est une classe implementant options, c'est une option qu'un véhicule peut avoir
 *  */
public class GPS implements Options {
    /**
     * @getPrixOption(): définit le prix de l'option GPS
     * @return: Double: prix de l'option GPS
     */
    @Override
    public double getPrixOption() {
        return 500;
    }
    /**
     * @toString(): Résume l'option
     * @return: String: dit que l'option est un GPS
     */
    @Override
    public String toString() {
        return "GPS{}";
    }
}
