//extends -- pärilus 1x
//implements -- liides Interface...x

public class Player extends Character implements WorldObject {
    Direction direction;
    Item item;

    // Constructor
    public Player(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth); // super sama mis new Character();
        this.direction = Direction.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }



    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight - 2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateY < worldWidth - 2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }


//        if (direction == Direction.LEFT) {
//            playerCoordinateX--;
//        } else if (direction == Direction.DOWN) {
//            playerCoordinateY++;
//        } else if (direction == Direction.RIGHT) {
//            playerCoordinateX++;
//        } else if (direction == Direction.UP) {
//            playerCoordinateY--;
//        }
    }
}

//tellimuse - id, tooted, kasutaja, aja
//kasutaja - frontendis registreerumise järgselt
// ühe toote
// kategooria