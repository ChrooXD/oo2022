        import java.util.Objects;
        import java.util.Scanner;
            //parem klõps -> refactor -> rename
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

        // Math.random() -- 0 .. 0.9999999 - 0 .. 4.99999 -- 0..2 .. 1..3
        World world = new World(5 ,10);
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);

        // uue instantsi loomine -- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused, mis on defieneeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX,
                vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!Objects.equals(input, "end")) {
            // kontrollib ühte muutjat mingite väärtuste vastu
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
            world.printMap(mangija1.coordinateY, mangija1.coordinateX,
                    vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
    // int -- sama tüüp, mis peab olema funktsiooni sees return järgi

}


