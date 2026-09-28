package ÖvningarV5;

public class övning1 {
    public static void main(String[] args) {

        char[] number = {'4', '5', '0', '9', '1', '2', '-', '3', '6', '8', '0'};

        //System.out.println(number[6]);


        int index = number.length -5;


        if (number[6]=='-') {
            System.out.println("korrekt personnummer");
        } else {
            System.out.println("felaktigt personnummer");
        }
    }
}
