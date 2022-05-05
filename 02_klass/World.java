<<<<<<< HEAD
=======
import javax.swing.*;

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
public class World {
    int worldHeight;
    int worldWidth;

    public World(int height, int width) {
        this.worldHeight = height;
        this.worldWidth = width;
    }
<<<<<<< HEAD

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordianteX) {
        // fori --> pakub
        char symbol;   // deklareerib 1x muutuja, mitte iga kord deklareerib selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
=======
    public void printMap(int playerCoordinateY, int playerCoordinateX,
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
