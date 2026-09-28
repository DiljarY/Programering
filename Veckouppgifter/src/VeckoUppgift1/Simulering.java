package VeckoUppgift1;

public class Simulering {

    public static void main(String[] args) {

        int energy = 100;
        int food = 70;
        int water = 35;
        int day = 1;

        for(day = 1; day <= 10; day++ ) {

            water = water - 10;


            if (water < 50) {
                food=food - 15;
            } else {
                food=food - 10;
            }
            int energyloss = 10;
            if (food < 50) {
                energyloss = energyloss + 5;
            }
            if (water < 50) {
                energyloss = energyloss + 5;
            }
            energy = energy - energyloss;

            if (water < 0) {
                water = 0;
            }
            if (food < 0) {
                food = 0;
            }
            if (energy <= 0) {
                System.out.println("Personen klarade sig inte");
                break;
            }



            System.out.println("Dag: " + day);
            System.out.println("Energy: " + energy);
            System.out.println("Vatten: " + water);
            System.out.println("Food: " + food);


        }
        if (energy > 0) {
            System.out.println("Personen Överlevde!");
        }

    }
}
