package Exercise2;

public class exercise2 {
    static void main(String[] args) {

        /*Jämför två tal. Om det första är större än det andra
        skriv ut ”Första talet är störst”,
        samt ”Andra talet är störst” om det är tvärt om
*/

        int number1 = 6;
        int number2 = 5;

        if (number1 > number2) {
            System.out.println("Första talet är störst");

        } else if (number2 > number1) {
            System.out.println("Andra talet är störst");
        }


        /*Jämför två tal. Om det första är jämt delbart med det andra
        skriv ut ”Jämt delbart”, annars skriv ut ”Inte jämt delbart”
*/

        if (number1 % number2 == 0) {
            System.out.println("Jämnt delbart");
        }
        else {
            System.out.println("Inte delbart");
        }
    }
}


