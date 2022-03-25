import java.util.Arrays;
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
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height, world.width);

        // uue instantsi loomine -- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused, mis on defieneeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword = new Item(world.height,world.width,ItemType.SWORD);
        Item hammer = new Item(world.height,world.width,ItemType.HAMMER);
        Item dagger = new Item(world.height,world.width,ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer,dagger);

        //world.characters.add(mangija1);
        //world.characters.add(vaenlane1);
        //world.characters.add(sword);

        //world.worldObjects.add(mangija1);
        //world.worldObjects.add(vaenlane1);
       // world.worldObjects.add(sword);

        world.printMap(mangija1.coordinateY, mangija1.coordinateX,
                vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!Objects.equals(input, "end")) {
            // kontrollib ühte muutjat mingite väärtuste vastu
            mangija1.movePlayer(input,world.height,world.width);
            for (Item item:world.items) {
                if (item.coordinateX == mangija1.coordinateX &&
                        item.coordinateY == mangija1.coordinateY) {
                    mangija1.addItem(item);
                }
            }
            world.printMap(mangija1.coordinateY, mangija1.coordinateX,
                    vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }
    // int -- sama tüüp, mis peab olema funktsiooni sees return järgi

}

