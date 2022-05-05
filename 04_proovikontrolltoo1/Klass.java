<<<<<<< HEAD
=======
package main;

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
import java.util.ArrayList;
import java.util.List;

public class Klass {
//    Integer[] xCoords;
//    Integer[] yCoords;
    List<Integer> xCoords = new ArrayList<>();
    List<Integer> yCoords = new ArrayList<>();

    public void setxCoords(int x1, int x2, int x3) {
        xCoords.add(x1);
        xCoords.add(x2);
        xCoords.add(x3);
    }
<<<<<<< HEAD

=======
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    public void setyCoords(int y1, int y2, int y3) {
        yCoords.add(y1);
        yCoords.add(y2);
        yCoords.add(y3);
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Klass{" +
                "xCoords=" + xCoords +
                ", yCoords=" + yCoords +
                '}';
=======
    public String toString() {
            return "Klass(" +
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
