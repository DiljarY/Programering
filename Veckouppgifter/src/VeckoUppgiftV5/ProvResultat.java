package VeckoUppgiftV5;

public class ProvResultat {
    static void main(String[] args) {

        int[] results ={27,49, 79, 66 ,34, 23, 78, 43,89,64,21,9,56,29,46,28,98,24,45,27};
        int passed = 0;
        int failed = 0;
        int sum = 0;
        int bestresult = 0;
        int worstresult = results[0];
        int overmean = 0;
        int elever = 20;


        for (int i =0; i<results.length; i++) {

            if (results[i]>=50) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("=== PROVRAPPORT ===");
        System.out.println("ANTAL ELEVER: " + elever);
        //System.out.println(results[i]);
        System.out.println("GODKÄNDA: " + passed);
        System.out.println("UNDERKÄNDA: " + failed);

        for (int i=0; i< results.length; i++) {
            sum = sum + results[i];
        }

        double mean = sum/ (double) results.length;
        System.out.println("MEDELVÄRDE: " + mean);

        for (int i =0; i<results.length; i++) {

            if (results[i]>bestresult) {
                bestresult = results[i];
            }
            if (results[i]<worstresult) {
                worstresult = results[i];

            }
        }

        System.out.println("BÄSTA RESULTATET: " +  bestresult);
        System.out.println("SÄMSTA RESULTATET: "+ worstresult);

        for (int i = 0; i<results.length; i++)  {
            if (results[i]>mean) {
                overmean++;
            }


        }
        System.out.println("ELEVER ÖVER MEDELVÄRDET: "+overmean);

    }
}
