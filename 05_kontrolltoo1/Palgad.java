import java.io.*;
import java.util.ArrayList;

//* Failis on viie aasta kohta koefitsiendid, kui palju igal aastal palk muutus. Samuti esimese aasta palk.
// Väljasta teise faili palk igal aastal neist ning võrdlusena kõrvale palk,
// kui sama alg- ja lõppsumma juures olnuks koefitsient arvutatud geomeetrilise keskmise abil.

public class Palgad {
    public static double[] loeFailist(String fileName) throws IOException{
        ArrayList<String> palgad = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader(fileName));
        String rida = br1.readLine();
        while(rida != null){
            palgad.add(rida);
            rida = br1.readLine();
        }
        br1.close();

        double[] uusList= new double[palgad.size()];
        int i = 0;
        for (String j: palgad) {
            uusList[i] = Double.parseDouble(j);
            i++;
        }
        return uusList;
    }
    public static String[] KirjutaFaili(double[] uuedPalgad_2, double esimenePalk_2, double keskminePalk, double[] kasvSuurus, double[] uuedPalgad_3) throws IOException{
        PrintWriter pw1 = new PrintWriter(new FileWriter("palk.txt"));
        String[] salvestatud = new String[1];

        try{
            pw1.println("Algne palk on: " + esimenePalk_2 + "€");
            pw1.println("Keskmine palk on : " + keskminePalk + "€");
            pw1.println(" ");
            for(int i=1; i<=uuedPalgad_2.length; i++){
                pw1.println("Uus palk " + i + ". kuul oli: " + uuedPalgad_2[i-1] + "€" + " Koenfitsent on: " + kasvSuurus[i] + ", Palk pärast konfitsendi kasutamist on:" + uuedPalgad_3[i-1] + "€");
            }
            salvestatud[0] = "Salvestatud";
        }catch (Exception e){
            salvestatud[0] = "Salvestamisel tekkis viga";
        }
        pw1.close();

        return salvestatud;
    }

    public static double korruta2(double[] arvud){
        double uusArv_2 = 1;
        double finalArv;

        for(int i=0; i<arvud.length; i++){
            uusArv_2 = uusArv_2 * arvud[i];
        }

        double astendaja = 1.0 / arvud.length;
        finalArv = Math.pow(uusArv_2, astendaja);

        return finalArv;
    }

    public static void main(String[] args) throws IOException {
        double[] a = loeFailist("koenfid.txt");

        double esimenePalk = a[0];
        double esimenePalk_2 = a[0];

        double[] uuedPalgad = new double[a.length - 1];
        double uusPalk;

        for (int i = 1; i < a.length; i++) {
            uusPalk = esimenePalk * (1.0 + a[i]);
            esimenePalk = Math.round(uusPalk * 100.0) / 100.0;
            uuedPalgad[i - 1] = esimenePalk;
        }

        double avgKasv = Math.round(korruta2(uuedPalgad) * 100.0) / 100.0;

        double[] uuedPalgad_2 = new double[a.length];
        uuedPalgad_2[0] = 1000;
        for(int i=0; i<uuedPalgad.length -1; i++){

            double b =  Math.sqrt(uuedPalgad[i] * uuedPalgad[i+1]);

            double avgKasv2 = Math.round(b * 100.0) / 100.0;
            uuedPalgad_2[i+1] = avgKasv2;

        }
        String[] kirjutaAndmedFaili = KirjutaFaili(uuedPalgad, esimenePalk_2, avgKasv, a, uuedPalgad_2);
        System.out.println(kirjutaAndmedFaili[0]);
    }
}