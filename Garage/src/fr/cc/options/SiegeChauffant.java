
package fr.cc.options;

import fr.cc.garage.Options;

/**
 * @SiegeChauffant: est une classe implementant options, c'est une option qu'un véhicule peut avoir
 *  */
public class SiegeChauffant implements Options {
    /**
     * @getPrixOption(): définit le prix de l'option siège chauffanr
     * @return: Double: prix de l'option siège chauffant
     */
    @Override
    public double getPrixOption() {
        return 3000;
    }

    /**
     * @toString(): Résume l'option
     * @return: String: dit que l'option est un siège chauffant
     */
    @Override
    public String toString() {
        return "SiegeChauffant{}";
    }
}
