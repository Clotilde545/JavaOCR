package fr.cc.options;

import fr.cc.garage.Options;
/**
 * @BarreDeToit  : est une classe implementant options, c'est une option qu'un véhicule peut avoir
 *  */
public class BarreDeToit implements Options {
    /**
     * @getPrixOption(): définit le prix de l'option barre de toit
     * @return: Double: prix de l'option barre de toit
     */
    @Override
    public double getPrixOption() {
        return 1000;
    }
    /**
     * @toString(): Résume l'option
     * @return: String: dit que l'option est une barre de toit
     */
    @Override
    public String toString() {
        return "BarreDeToit{}";
    }
}
