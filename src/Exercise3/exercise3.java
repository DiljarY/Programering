package Exercise3;

public class exercise3 {
    static void main(String[] args) {

        //Skriv ut alla tal ifrån 1-100
        System.out.println("numbers 1-100:");
        int number = 1;
        while(number <= 100) {
            System.out.print(number + " ");
            number = number + 1;

        }

        //Skriv ut alla jämna tal ifrån 1-100
        System.out.println();
        System.out.println();
        System.out.println("even numbers 1-100:");
        int even = 2;
        while (even<=100) {

            System.out.print(even + " ");
            even += 2;
        }


       /* Skriv ut alla fibonnacci-tal ifrån 1-100. Fibonnacci-tal är de två
        senaste talen adderat och börjar med 1, 1 som första två tal.
        Exempel: 1, 1, 2, 3, 5, 8, 13, 21
*/
        System.out.println();
        System.out.println();
        System.out.println("Fibonacci numbers 1-100:");
        int first = 1;

        System.out.print(first + " ");

        int second = 2;

        while(second <= 100) {
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second = third;



        }
    }
}
