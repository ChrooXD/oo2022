import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double prevX;
        double x;
        double täpsus;
        System.out.print("Sisesta X: ");
        x = reader.nextDouble();
        prevX = x;
        System.out.print("Sisesta täpsus: ");
        täpsus = reader.nextDouble();
        while(Math.abs(function(x)) > täpsus){
            System.out.println("X: " + x + " f(x): " + function(x));
            x = prevX - (function(prevX) / functionTuletis(prevX));
            prevX = x;
        }
    }
    private static double function(double x) { //x^2 + 2x - 1
        return x * (x + 2) - 1;
    }
    private static double functionTuletis(double x) { //x^2 + 2x - 1
        return 2 * x + 2;
    }
}