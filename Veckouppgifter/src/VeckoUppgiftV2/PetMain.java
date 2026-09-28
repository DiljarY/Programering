package VeckoUppgiftV2;

public class PetMain {
    public static void main(String[] args) {
        Pet husdjur = new Pet();


        husdjur.namn = "Bosse";
        husdjur.energi = 80;
        husdjur.hunger = 20;
        husdjur.gladje = 22;

        System.out.println("Namn: " + husdjur.namn);
        System.out.println("Energi: " +  husdjur.energi);
        System.out.println("Hunger: " + husdjur.hunger);
        System.out.println("Glädje: " + husdjur.gladje);



        for (int i = 1; i <= 7; i++) {
            System.out.println(" ");
            System.out.println("DAG: " + i );

            int valmande = husdjur.energi + husdjur.gladje - husdjur.hunger;


            husdjur.hunger = husdjur.hunger + 5;
            husdjur.energi = husdjur.energi -3;

            System.out.println("Energi: " +husdjur.energi);
            System.out.println("Hunger: " + husdjur.hunger);
            System.out.println("Glädje: " + husdjur.gladje);
            System.out.println("Välmående: " + valmande);

            if (husdjur.hunger>50) {
                System.out.println("Djuret är hungrig");
            }

                if (husdjur.energi<20) {
                    System.out.println("Djuret är trött");
                }

                    if (husdjur.gladje>=50) {
                        System.out.println("Djuret är glad");
                    } else {
                        System.out.println("Djuret är ledset");
                    }



        }
    }
}
