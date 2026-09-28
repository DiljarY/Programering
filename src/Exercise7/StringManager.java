package Exercise7;

public class StringManager {


    static void main(String[] args) {


        String myString = "some text";

        if(myString.equals("some text")) {

            System.out.println("the text is the same ");
        }


        if(myString.length()==9) {

            System.out.println("Text is 9 charahcters");
        }


        System.out.println(myString.charAt(myString.length() -1));




    }
}
