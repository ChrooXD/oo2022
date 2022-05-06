<<<<<<< HEAD
=======
package main;

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KontrollToo {
    public static void main(String[] args) {
        double k = keskmiseLeidmine(21,2,3);
        System.out.println(k);
<<<<<<< HEAD

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,5, 3, 4));
        Integer[] integers = {1, 2, 4,7,6};
        List<Double> double1 = libisevKeskmine(integerList);
        List<Double> double2 = libisevKeskmine(Arrays.asList(integers));
=======
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4));
        Integer[] integers = {1, 2, 4, 7, 6};
        List<Double> double1 = libisevKeskmine(integerList);
        List<Double> double2 = libisevKeskmine(List.of(integers));
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
        System.out.println(double1);
        System.out.println(double2);

        Arvud arvud1 = new Arvud(3,5,6);
        arvud1.lisaArv(7);
        arvud1.lisaArv(8);
        System.out.println(arvud1.libisevKeskmine());
        arvud1.lisaArv(9);
        System.out.println(arvud1.libisevKeskmine());
<<<<<<< HEAD
=======

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }

    public static double keskmiseLeidmine(
            int arv1, int arv2, int arv3
    ){
        return (arv1+arv2+arv3)/3.0;
    }

    public static List<Double> libisevKeskmine(List<Integer> integers) {
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < integers.size()-2; i++) {
            double uusNumber = (
<<<<<<< HEAD
                    integers.get(i)+
                    integers.get(i+1)+
                    integers.get(i+2)
                )/3.0;
=======
                    integers.get(i)+ integers.get(i+1)+ integers.get(i+2)/3.0);
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
            doubles.add(uusNumber);
        }
        return doubles;
    }
}
