package ÖvningarV1;

public class cirkel {
    static void main(String[] args) {


        /* Skapa ett program där en cirkels radie är definierad i en variabel. Cirkelns diameter,
        omkrets och area skall beräknas och skrivas ut. (anta att pi = 3.14). */

        int radie = 5;
        double pi = 3.14;
        int diameter = radie*2;
        double omkrets = pi*diameter;
        double area = pi*(radie*radie);
        System.out.println("Radius: " + radie + "cm");
        System.out.println("Diameter: " + diameter + "cm");
        System.out.println("Omkrets: " + omkrets + "cm");
        System.out.println("Area: " + area + "cm");

    }
}
