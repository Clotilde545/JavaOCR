package fr.cc;

import fr.cc.garage.Garage;
import fr.cc.garage.Vehicule;
import fr.cc.moteur.MoteurDiesel;
import fr.cc.moteur.MoteurElectrique;
import fr.cc.moteur.MoteurEssence;
import fr.cc.moteur.MoteurHybride;
import fr.cc.options.*;
import fr.cc.vehicule.A300B;
import fr.cc.vehicule.D4;
import fr.cc.vehicule.Laguna;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicule lag1 = new Laguna();
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256.0));
        MoteurEssence moteur = new MoteurEssence("150 Chevaux", 10256.0);
        System.out.println(moteur.getPrixMoteur());
        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());
        garage.addVoiture(lag1);
        System.out.println("\n" + lag1);

        Vehicule A300B_2 = new A300B();
        A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
        A300B_2.addOption(new Climatisation());
        A300B_2.addOption(new BarreDeToit());
        A300B_2.addOption(new SiegeChauffant());
        garage.addVoiture(A300B_2);
        System.out.println("\n" + A300B_2);

        Vehicule d4_1 = new D4();
        d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
        d4_1.addOption(new BarreDeToit());
        d4_1.addOption(new Climatisation());
        d4_1.addOption(new GPS());
        garage.addVoiture(d4_1);
        System.out.println("\n" + d4_1);

        Vehicule lag2 = new Laguna();
        lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
        garage.addVoiture(lag2);
        System.out.println("\n" + lag2);

        Vehicule A300B_1 = new A300B();
        A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
        A300B_1.addOption(new VitreElectrique());
        A300B_1.addOption(new BarreDeToit());
        garage.addVoiture(A300B_1);
        System.out.println("\n" + A300B_1);

        Vehicule d4_2 = new D4();
        d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
        d4_2.addOption(new SiegeChauffant());
        d4_2.addOption(new BarreDeToit());
        d4_2.addOption(new Climatisation());
        d4_2.addOption(new GPS());
        d4_2.addOption(new VitreElectrique());
        garage.addVoiture(d4_2);
        System.out.println("\n" + d4_2);

        //ECriture et lecture
        Path path = Paths.get("garage.txt");
        System.out.println("existe-t-il" + Files.exists(path));

        FileWriter fileWriter;
        FileReader fileReader;
        File file = new File("garage.txt");
        String str ;
        try {
            fileReader = new FileReader(file);
            str = "";
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                str += (char) i;
            }
            System.out.println(str);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            System.out.println("lecture terminée !");

    }
}

