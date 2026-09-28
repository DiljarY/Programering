package ÖvningarV5;

public class övning3 {
    static void main(String[] args) {
        int[] numbers = {33, 1, 2, 3, 4, 5, 6, 7, 8, 9,

                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,

                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,

                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,

                0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        };
       // numbers[0] = numbers[0]*2;
        //numbers[0] *=2;

        int index = 0;


        for (int i =0; i<50; i++) {
            numbers[i] *=2;

        }
        for (int i =0; i<50; i++) {
            System.out.println(numbers[i]);

        }



    }


}
