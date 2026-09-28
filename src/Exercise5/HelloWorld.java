package Exercise5;

import java.util.Scanner;

public class HelloWorld {

    static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();


        Scanner scan = new Scanner(System.in);

        //String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        //System.out.println(number);
        //System.out.println("Du skrev: " + text);






        //hwp.print();

        hwp.printManyTimes(number);






    }
}
