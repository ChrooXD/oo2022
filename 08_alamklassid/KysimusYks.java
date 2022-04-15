package Homework;

public class KysimusYks extends Homework.PunktiLugeja {
    public int firstQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Õige vastus");
                PunktiLugeja = PunktiLugeja + KaksPunkti;
                break;
            case "b":
                System.out.println("Vale vastus");
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