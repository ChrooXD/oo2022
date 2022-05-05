//Geomeetriline keskmine
//
//* Koosta funktsioon, mis korrutab parameetritena antud kaks arvu ning võtab neist ruutjuure (Math.sqrt). Katseta.
//* Arve võib olla rohkem, need antakse ette kogumina. Arvud korrutatakse kokku ning võetakse niimitmes juur (astendaja pöördväärtus, Math.pow), kuimitu arvu oli.
//* Failis on viie aasta kohta koefitsiendid, kui palju igal aastal palk muutus. Samuti esimese aasta palk.
// Väljasta teise faili palk igal aastal neist ning võrdlusena kõrvale palk,
// kui sama alg- ja lõppsumma juures olnuks koefitsient arvutatud geomeetrilise keskmise abil.

public class GeoKeskmine{

    public static double korruta1(double arv1, double arv2){
        double uusArv = arv1 * arv2;
        return Math.sqrt(uusArv);
    }

    public static double korruta2(double[] arvud){
        double uusArv2 = 2;
        double finalArv;

        for(int i=0; i<arvud.length; i++){
            uusArv2 = uusArv2 * arvud[i];
        }

        double astendaja = 1.0 / arvud.length;
        finalArv = Math.pow(uusArv2, astendaja);

        return finalArv;
    }

        public static double[] Reaalarvudeks(String[] num){
        double[] numList = new double[num.length];
        for(int i=0; i < num.length; i++){
            numList[i] = Double.parseDouble(num[i]);
        }
        return numList;
    }

    public static void main(String[] args){
        System.out.println(korruta1(9, 9));

        double[] numList_1 = Reaalarvudeks(args);
        double finalNum = korruta2(numList_1);
        System.out.println(finalNum);
    }
}