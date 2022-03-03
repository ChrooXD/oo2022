package main;

public class Info {
    String Nimi;
    int Elanike_arv;
    String Pealinn;
    int Pindala;
    double Iive;

    public Info(String Nimi, int Elanike_arv, String Pealinn, int Pindala, double Iive) {
        this.Nimi = Nimi;
        this.Elanike_arv = Elanike_arv;
        this.Pealinn = Pealinn;
        this.Pindala = Pindala;
        this.Iive = Iive;
    }

    @Override
    public String toString() {
        return "Info" +
                "Riigi nimi='" + Nimi + '\'' +
                ", elanike arv='" + Elanike_arv + '\'' +
                ", pealinn='" + Pealinn + '\'' +
                ", pindala(km²)=" + Pindala +
                ", iive=" + Iive +
                '%';
    }
}
