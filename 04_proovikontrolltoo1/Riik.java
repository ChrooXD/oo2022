package main;

public class Riik {
    Info info;
    int skt;

    public Riik(Info info, int skt) {
        this.info = info;
        this.skt = skt;
    }

    public String getInfo() {
        return "Riik on parameetritega: " + this.info + ". Riigi SKT elaniku kohta on: " + this.skt + "$";
    }
}
