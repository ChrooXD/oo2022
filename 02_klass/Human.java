public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;
<<<<<<< HEAD
    char symbol;
=======
    String symbol;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
<<<<<<< HEAD
        this.symbol = 'R';
    }

    // to ---> võtan toString() --> enter

    public void sayHello() {
        System.out.println(nimi + " ütleb hello");
=======
        this.symbol = "R";
    }

    // to --> võtan toString() --> enter
    public void sayHello(){
        System.out.println(nimi + " ütleb tere!");
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }

    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                ", symbol=" + symbol +
                '}';
    }
}
<<<<<<< HEAD
=======

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
