package fr.cc.options;

import fr.cc.garage.Options;

public class GPS implements Options {
    @Override
    public double getPrixOption() {
        return 500;
    }

    @Override
    public String toString() {
        return "GPS{}";
    }
}
