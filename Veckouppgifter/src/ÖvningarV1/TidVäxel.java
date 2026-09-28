package ÖvningarV1;

public class TidVäxel {
    static void main(String[] args) {

        /*Skapa ett program där antal timmar är definierad i en variabel. Programmet beräknar
        och skriver ut hur mycket det blir omvandlat till minuter resp. sekunder. */

        int timmar = 10;
        int minuter = timmar*60;
        int sekunder = timmar*3600;

        System.out.println("minuter: " + minuter);
        System.out.println("sekunder: " + sekunder);

    }
}
