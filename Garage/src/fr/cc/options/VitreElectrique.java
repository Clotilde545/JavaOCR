package fr.cc.options;

import fr.cc.garage.Options;
/**
 * @VitreElectrique: est une classe implementant options, c'est une option qu'un véhicule peut avoir
 *  */
public class VitreElectrique implements Options {
    /**
     * @getPrixOption(): définit le prix de l'option vitre éléctrique
     * @return: Double: prix de l'option vitre éléctrique
     */
    @Override
    public double getPrixOption() {
        return 300;
    }

    /**
     * @toString(): Résume l'option
     * @return: String: dit que l'option est un vitre éléctrique
     */
    @Override
    public String toString() {
        return "VitreElectrique{}";
    }
}
