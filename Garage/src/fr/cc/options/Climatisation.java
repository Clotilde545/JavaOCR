package fr.cc.options;

import fr.cc.garage.Options;

public class Climatisation implements Options {
    @Override
    public double getPrixOption() {
        return 2000;
    }

    @Override
    public String toString() {
        return "Climatisation{}";
    }
}
