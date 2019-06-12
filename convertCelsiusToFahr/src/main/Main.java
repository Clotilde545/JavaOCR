
package main;

import main.Degres.Celsius;
import main.Degres.Fahrenheit;

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char response = ' ';

        do {
            System.out.println(
                    "Choisissez le mode de conversion: \n"
                            + "1- Convertisseur Celsius - Fahrenheit \n"
                            + "2- Convertisseur Fahrenheit - Celsius");


            switch (sc.nextInt()) {

                case 1:
                    System.out.println("Veuillez renseigner la température en °C");
                    double result =Celsius.convertCelsiusToFahr(sc.nextDouble());
                    System.out.println(result);
                    response = returnToHead();
                    break;

                case 2:
                    Fahrenheit.convertFahrToCelsius();
                    response = returnToHead();
                    break;

                default:
                    response = 'O';
                    System.out.println("vous n'avez pas choisi parmi les choix proposés");
            }
        } while (response == 'O');

        System.out.println("Au revoir");


    }

    public static char returnToHead() {
        Scanner sc = new Scanner(System.in);
        char response;
        System.out.println("Voulez-vous convertir une autre température ? (O/N)");
        response = sc.nextLine().toUpperCase().charAt(0);
        return response;
    }
}
