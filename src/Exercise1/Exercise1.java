package Exercise1;

public class Exercise1 {

    static void main(String[] args) {

        /*Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.

        Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in.*/


        int first = 2;
        int second = 3;
        int third = 10;

        int sum = first + second + third;
        int mean = sum/3;

        System.out.println(first + second + third);
        System.out.println(mean);

        System.out.println();
        System.out.println("Now update to: ");

        int sside = 5;
        int lside = 8;
        int area = sside * lside;
        int circ = sside *2 + lside *2;

        System.out.println(area);
        System.out.println(circ);

    }
}
