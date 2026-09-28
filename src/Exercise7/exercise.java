package Exercise7;

import java.util.Scanner;

public class exercise {
    static void main(String[] args) {


        /*Läs in en String (scan.nextLine())

        Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen

        Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut */

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        if (text.equals("ägg")); {
            System.out.println("ägg är knasigt ut");
        }

        for(int i=0;i<text.length();i++) {
            System.out.print(text.charAt(i) + " ");


        }


    }

}
