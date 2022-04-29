public class Pendel {
    double pikkus;
    Hammasratas hammasratas;

    public Pendel(double _pikkus, Hammasratas _hammasratas) {
        this.pikkus = _pikkus;
        this.hammasratas = _hammasratas;
    }

    public double getPikkus() {
        return pikkus;
    }

    public double v6nkeperiood() {
        return 2 * Math.PI * Math.sqrt(getPikkus()/9.8);
    }
}
