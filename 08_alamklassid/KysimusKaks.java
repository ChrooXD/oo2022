package Homework;


public class KysimusKaks extends Homework.PunktiLugeja {
    public int secondQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Õige vastus");
                PunktiLugeja = PunktiLugeja + KaksPunkti;
                break;
            case "c":
                System.out.println("Vale vastus");
                break;
            case "d":
                System.out.println("Vale vastus");
                break;
        }
        return 0;
    }
}