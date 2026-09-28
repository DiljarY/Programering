package ÖvningarV1;

public class CelciusFarenheit {
    static void main(String[] args) {

        /*Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9*C / 5 + 32.
        Skapa ett program där en temperatur i Celsius och motsvarande temperatur i
        Fahrenheit skrivs ut. */

        int celcius = 20;
        int fahrenheit = 9*celcius/5 + 32;
        System.out.println(celcius +"°C" + " = " + fahrenheit +"°F");

    }
}
