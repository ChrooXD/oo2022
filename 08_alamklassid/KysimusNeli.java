package Homework;


public class KysimusNeli extends Homework.PunktiLugeja {
    public int fourthQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Vale vastus");
                break;
            case "c":
                System.out.println("Vale vastus");
                break;
            case "d":
                System.out.println("Õige vastus");
                PunktiLugeja = PunktiLugeja + 1;
                break;
        }
        return 0;
    }
}