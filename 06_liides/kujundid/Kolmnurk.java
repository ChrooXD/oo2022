package kujundid;

<<<<<<< HEAD
public class Kolmnurk implements Kujund {
=======
public class Kolmnurk implements Kujund{


>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    double kylg1;
    double kylg2;
    double kylg3;

    public Kolmnurk(double kylg1, double kylg2, double kylg3) {
        this.kylg1 = kylg1;
        this.kylg2 = kylg2;
        this.kylg3 = kylg3;
    }

    @Override
    public double arvutaYmbermoot() {
        return kylg1 + kylg2 + kylg3;
    }

    @Override
    public double arvutaPindala() {
<<<<<<< HEAD
        return Math.sqrt((arvutaYmbermoot()/2-kylg1) *
                (arvutaYmbermoot()/2-kylg2) *
                    (arvutaYmbermoot()/2-kylg3));
=======
        return Math.sqrt((kylg1-arvutaYmbermoot()/2-kylg1) *
                (kylg2-arvutaYmbermoot()/2-kylg2) *
                (kylg3-arvutaYmbermoot()/2-kylg3));
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
