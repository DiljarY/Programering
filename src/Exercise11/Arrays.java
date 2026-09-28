package Exercise11;

public class Arrays {
    static void main(String[] args) {

        //String[] name = {"Adam", "William", "Amir", "Melvin", "Alex"};
        String [] name = new String[5];
        name [0] = "Adam";
        name [1] = "William";
        name [2] = "Amir";
        name [3] = "Melvin";
        name [4] = "Alex";



        for(int i = 0; i <name.length; i++) {
            System.out.println(name [i]);
        }


        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray [i]);
        }

    }
}
