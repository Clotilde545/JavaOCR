package fr.cc.options;

import fr.cc.garage.Options;

public class VitreElectrique implements Options {
    @Override
    public double getPrixOption() {
        return 300;
    }

    @Override
    public String toString() {
        return "VitreElectrique{}";
    }
}
