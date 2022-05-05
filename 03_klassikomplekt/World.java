import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int height, int width) {
        this.height = height;
        this.width = width;
    }
<<<<<<< HEAD

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordianteX) {
        char symbol;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) {
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
=======
    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordinateX) {
        char symbol;       // deklareerib 1x muutuja, mitte iga kord deklareerib selle
        for (int y = 0; y< height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) { //andmebaasipäring // primitiiv
                    symbol = '-';
                } else if (x == 0 || x == width -1){
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                for (Item item : items) {
                    if (item.coordinateY == y && item.coordinateX == x) {
                        symbol = 'I';
                        break;
                    }
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
