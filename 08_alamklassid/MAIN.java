package Homework;

import java.util.Scanner;

import static Homework.PunktiLugeja.PunktiLugeja;

public class MAIN {
    public static void main(String[] args) {
        int inputamount = 0;
        System.out.println("4 küsimust: Kirjutage vastuseks soovitud vastuse täht, nt: a/b/c/d. Kui soovite varem lõpetada, kirjutage end");
        KysimusYks mangija = new KysimusYks();
        KysimusKaks mangija2 = new KysimusKaks();
        KysimusKolm mangija3 = new KysimusKolm();
        KysimusNeli mangija4 = new KysimusNeli();
        if(inputamount == 0){
            System.out.println("Millise riigi lipul on peale Eesti lipuvärvideks sinine, must ja valge?");
            System.out.println("a - Botswana, b - Saint Lucia, c - Barbados, d - Nauru");
        }

        Scanner answer = new Scanner(System.in);
        String input = answer.nextLine();

        while (!input.equals("end")) {
            if (inputamount == 0) {
                mangija.firstQuestion(input);
            }
            if (inputamount == 1) {
                mangija2.secondQuestion(input);
            }
            if (inputamount == 2) {
                mangija3.thirdQuestion(input);
            }
            if (inputamount == 3) {
                mangija4.fourthQuestion(input);
            }
            inputamount = inputamount + 1;
            if (inputamount == 4) {
                break;
            }
            if (inputamount == 1) {
                System.out.println("Mitu järve on Soomes?");
                System.out.println("a - 67834, b - 187888, c - 201334, d - 34233");
            }
            if (inputamount == 2) {
                System.out.println("Mis riik on pindala poolest suuruselt 8. maailmas?");
                System.out.println("a - Austraalia, b - India, c - Argentiina, d - Kasahstan");
            }
            if (inputamount == 3) {
                System.out.println("Milline järgnevatest riikidest on suurim?");
                System.out.println("a - Monaco, b - Tuvalu, c - Vatikan, d - San Marino");
            }
            input = answer.nextLine();
        }
        System.out.println(PunktiLugeja);
    }
}