package Degres;

import java.util.Scanner;

public class Celsius {
    public static void convertCelsiusToFahr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez renseigner la température en °C");
        System.out.println((9.0/5.0)*sc.nextDouble() + 32);
    }
}
