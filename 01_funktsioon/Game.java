<<<<<<< HEAD
=======
import java.util.Objects;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
import java.util.Scanner;

public class Game {
    // main --> pakub
    public static void main(String[] args) {
<<<<<<< HEAD
        // sout --> pakub
        System.out.println("Hello World");
        // String -- sõnaline muutuja
        // char -- üks täht
        // double -- 15kohaline komakohaga number
        // float -- 7kohaline komagakohaga number xxx
        // int -- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short -- 32000kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999  -  0 ... 4.9999 -- 0..2 .. 1..3
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordianteX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight,worldWidth,playerCoordinateY,
                playerCoordinateX,enemyCoordinateY,enemyCoordianteX );

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            // kontrollib ühte muutujat mingite väärtuste vastu
=======
        //sout --> pakub
        System.out.println("Hello World!");
        // String -- sõnaline muutuja suure tähega!!!!
        // char -- üks täht
        // int -- täiskohaline number 2.1 mld
        // double -- 15 kohaline
        // float -- 7 kohaline
        // byte -- 128 kohta
        // short --  32000 kohta
        // Long -- 9000000000000000000000000000000000000000000000000000 kohta vms suure tähega!!!
        // boolean -- kahendväärtus true/false
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() -- 0 .. 0.9999999 - 0 .. 4.99999 -- 0..2 .. 1..3
        int playerCoordinateY =generateRandomCoordinate(worldHeight);
        int playerCoordinateX =generateRandomCoordinate(worldWidth);
        int enemyCoordinateY =generateRandomCoordinate(worldHeight);
        int enemyCoordinateX =generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, playerCoordinateY,
                playerCoordinateX, enemyCoordinateY, enemyCoordinateX );

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //fori --> pakub
        char symbol;       // deklareerib 1x muutuja, mitte iga kord deklareerib selle
        for (int y = 0; y< worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { //andmebaasipäring // primitiiv
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1){
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        while (!Objects.equals(input, "end")) {
            // kontrollib ühte muutjat mingite väärtuste vastu
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
<<<<<<< HEAD

            printMap(worldHeight,worldWidth,playerCoordinateY,
                    playerCoordinateX,enemyCoordinateY,enemyCoordianteX );
            input = scanner.nextLine();
        }
    }

    // int -- sama tüüp mis peab olema funktsiooni sees return järgi
=======
            printMap(worldHeight, worldWidth, playerCoordinateY,
                    playerCoordinateX, enemyCoordinateY, enemyCoordinateX );
            input = scanner.nextLine();
        }
    }
    // int -- sama tüüp, mis peab olema funktsiooni sees return järgi
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
<<<<<<< HEAD
                                int enemyCoordinateY, int enemyCoordianteX) {
        // fori --> pakub
        char symbol;   // deklareerib 1x muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
=======
                                int enemyCoordinateY, int enemyCoordinateX) {
        char symbol;       // deklareerib 1x muutuja, mitte iga kord deklareerib selle
        for (int y = 0; y< worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { //andmebaasipäring // primitiiv
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1){
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
<<<<<<< HEAD
                if (enemyCoordinateY == y && enemyCoordianteX == x) {
=======
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
<<<<<<< HEAD
=======

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
