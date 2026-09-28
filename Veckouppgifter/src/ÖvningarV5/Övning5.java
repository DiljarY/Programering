package ÖvningarV5;

public class Övning5 {
    static void main(String[] args) {
        int[] numbers = {33, -1, 2, 3, 4, 5, 6, 17, 8, 9,

                0, 1, 2, 3, 4, 5, 6, -7, 78, -9,

                40, 1, 2, 3, 4, 5, 6, -7, 8, 9,

                6, 1, -2, 3, 4, -5, 6, -7, -8, -9,

                7, 1, -42, 3, -4, 95, 6, 7, 8, -39
        };

        int counter = 0;
        int i;

        for (i =0; i<50; i++) {
            if(numbers[i]>0) {
                counter++;
            }
        }
        System.out.println("Vad är i nu: " +i);
        System.out.println("Antal positiva nummer är: " +counter);

    }
}
