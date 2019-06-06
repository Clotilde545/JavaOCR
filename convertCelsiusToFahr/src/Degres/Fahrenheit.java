package Degres;

import java.util.Scanner;

public class Fahrenheit {

    public static void convertFahrToCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez renseigner la température en F");
        System.out.println((sc.nextDouble() -32) *5.0/9.0);
    }
}
