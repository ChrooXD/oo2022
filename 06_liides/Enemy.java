public class Enemy extends Character implements WorldObject {
    // right click --> refactor -> rename
    int coordinateY;
    int coordinateX;

    // new Enemy(1,6)
    public Enemy(int worldHeight, int worldWidth) {
        super(worldHeight,worldWidth);
    }
}