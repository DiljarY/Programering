package Exercise1;

public class MyInteger {
    static void main(String[] args) {


        int number = 5;
        int nextNumber = 6;


        System.out.println(number);
        System.out.println(nextNumber);

        nextNumber = number + 1;
        number = 5 + 3;


        System.out.println();
        System.out.println("Now updated to:  ");
        System.out.println(number);
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("Now updated to:  ");
        number += 3;
        System.out.println(number);

        nextNumber -=2;
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("Now updated to:  ");
        number++;
        System.out.println(number);

        nextNumber--;
        System.out.println(nextNumber);

    }


}
