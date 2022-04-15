package Homework;


public class KysimusKolm extends Homework.PunktiLugeja {
    public int thirdQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Vale vastus");
                break;
            case "c":
                System.out.println("Õige vastus");
                PunktiLugeja = PunktiLugeja + 1;
                break;
            case "d":
                System.out.println("Vale vastus");
                break;
        }
        return 0;
    }
}