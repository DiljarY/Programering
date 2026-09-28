package Exercise6;

public class PetZoo {
    static void main(String[] args) {


        Pet dog = new Pet("Bob");

        Pet cat = new Pet("Lol");

        Pet bird = new Pet("olle");

       /* dog.printName();
        cat.printName();
        bird.printName();
*/

        String dogName = dog.getName();
        String catName = cat.getName();
        String birdName = bird.getName();


        for (int i=0;i<2;i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(birdName);
        }

    }


}
