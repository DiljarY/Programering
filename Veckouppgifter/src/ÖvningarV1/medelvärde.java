package ÖvningarV1;

public class medelvärde {
    static void main(String[] args) {

        /*Skapa ett program där tre tal är definierade i var sin variabel. Programmet beräknar
        och skriver ut summan samt medelvärdet av de tre talen.*/

        int tal1 = 3;
        int tal2 = 8;
        int tal3 = 19;
        int sum = tal1+tal2+tal3;
        int mean = sum/3;

        System.out.println("Summan av talen är: " + sum);
        System.out.println("Medelvärdet av talen är: " + mean);

    }
}
