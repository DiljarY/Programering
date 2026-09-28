package ÖvningarV1;

public class BetalaBensin {
    static void main(String[] args) {

       /* Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala.
                Indatan kan vara definierade i variabler */

        int liter = 50;
        double prisPerLiter = 17.50;
        double rabatt = 10;

        double pris = liter * prisPerLiter;
        double rabattBelopp = pris * rabatt / 100;
        double attBetala = pris - rabattBelopp;

        System.out.println("Att betala: " + attBetala + " kr");


    }

}
