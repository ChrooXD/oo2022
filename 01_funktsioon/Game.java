public class Game {
    // main --> pakub
    public static void main(String[] args) {
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
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

