public class Funktsioonid {
    public static void main(String[] args) {
<<<<<<< HEAD
        // sout -> genereerin
=======
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        System.out.println(taksoSõit(3.5));

        double sõiduMaksumus = taksoSõit(0.5);
        System.out.println(sõiduMaksumus);

        prindiForTsükkel(5);

        System.out.println(temperatuuriHinnang(-2));
        String hinnang = temperatuuriHinnang(-2);
        System.out.println(hinnang);
    }

    public static double taksoSõit(double h) {
<<<<<<< HEAD
        return 3+0.8*h; // funktsioon selleks, et midagi saada
    }

    // void on funktsioon selleks, et midagi teha
    public static void prindiForTsükkel(int kordadeArv) {
        // fori --> genereerin
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
=======
        return 3+0.8*h; // funkstsioon selleks, et midagi saada
    }
    // void funktsioon selleks, et midagi teha
    public static void prindiForTsükkel(int kordadeArv) {
        //fori --> genereerin
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        }
    }

    public static String temperatuuriHinnang(float temperatuur) {
        if (temperatuur < 0) {
            return "On jääs";
        } else {
            return "Ei ole jääs";
        }
    }
}
