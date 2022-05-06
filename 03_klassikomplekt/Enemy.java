public class Enemy {
<<<<<<< HEAD
    int coordinateY;
    int coordinateX;

=======
    // right click --> refactor -> rename
    int coordinateY;
    int coordinateX;

    // new Enemy(1,6)
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    public Enemy(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }
<<<<<<< HEAD

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
=======
    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random() * (worldSize - 2)) + 1;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
