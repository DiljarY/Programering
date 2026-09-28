package ÖvningarV1;

public class Lönesumman {
    public static void main(String[] args) {

        /*En försäljare har delvis prestationslön.
                Han får 8000 kr per månad i grundlön och 9% av försäljningssumman.
            Skapa ett program som beräknar lönesumman under en period.
                Försäljningssumman ska vara definierad i en variabel.

         */

        int grundlön = 8000;
        int försäljsumm = 100000;
        int månader = 5;
        double lön = (grundlön * månader) + (försäljsumm*0.9);


        System.out.println("lön efter " + månader  + " månader: " + lön +"kr");



    }
}
