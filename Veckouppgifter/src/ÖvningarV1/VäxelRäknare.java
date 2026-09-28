package ÖvningarV1;

public class VäxelRäknare {
    static void main(String[] args) {

       /* Definiera ett heltal i en variabel som anger svenska kronor. Skriv ut motsvarande värde
        i pund respektive dollar. Antag att kursen är: 1 dollar = 6 kr, 1 pund = 10 kr.*/

        int kr = 12000;
        double dollar = kr/6.0;
        double pund = kr/10.0;
        System.out.println("VäxelRäknare:");
        System.out.println("Dina pengar: " + kr + "kr");
        System.out.println(kr + "Kr till dollar: " + dollar +"$");
        System.out.println(kr + "Kr till pund: " + pund + "£");



    }
}
