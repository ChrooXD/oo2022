<<<<<<< HEAD
=======
package main;

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
import java.util.ArrayList;
import java.util.List;

public class Arvud {
    List<Integer> arvudListis = new ArrayList<>();
    List<Double> arvudKeskmisega = new ArrayList<>();
<<<<<<< HEAD
    // []  -   tühi massiiv
    // ilma new ArrayList osata    - null
=======

    // [] - tühi massiiv
    // ilma new ArrayList osata        - null
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9

    public Arvud(int arv1, int arv2, int arv3) {
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(int arv) {
        arvudListis.add(arv);
    }

    public List<Double> libisevKeskmine() {
<<<<<<< HEAD
        List<Double> loppList = new ArrayList<>(this.arvudListis.size() - 2);
        for (int i = arvudKeskmisega.size(); i < this.arvudListis.size() - 2; i++) {
            loppList.add((this.arvudListis.get(i + 1) + this.arvudListis.get(i + 2)) / 2.0);
        }
        arvudKeskmisega.addAll(loppList);
=======
        List<Double> doubles = new ArrayList<>();
        if (arvudKeskmisega.isEmpty()) {
            for (int i = 0; i < arvudListis.size() - 2; i++) {
                double uusNumber = (
                        arvudListis.get(i) +
                                arvudListis.get(i + 1) +
                                arvudListis.get(i + 2)
                ) / 3.0;
                doubles.add(uusNumber);
        }
        arvudKeskmisega = doubles;
    } else {
        if(arvudKeskmisega.size() == arvudListis.size()-2) {

        } else {

        }
    }
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        return arvudKeskmisega;
    }
}
