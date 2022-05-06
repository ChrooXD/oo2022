public class Player {
    int coordinateY;
    int coordinateX;
<<<<<<< HEAD
    Direction direction; // 3-ndast kodutööst
    Item item;

=======
    Direction direction;
    Item item;

    // Constructor
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    public Player(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }

    public int generateRandomCoordinate(int worldSize) {
<<<<<<< HEAD
        return (int) ((Math.random()*(worldSize-2))+1); // cast
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
=======
        return (int) (Math.random() * (worldSize - 2)) + 1; //cast

    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
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
<<<<<<< HEAD
                if (coordinateY < worldHeight-2) {
=======
                if (coordinateY < worldHeight - 2) {
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                    coordinateY++;
                }
                break;
            case RIGHT:
<<<<<<< HEAD
                if (coordinateX < worldWidth-2) {
=======
                if (coordinateY < worldWidth - 2) {
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }
<<<<<<< HEAD
    }

    @Override
    public String toString() {
        return "Player{" +
                "coordinateY=" + coordinateY +
                ", coordinateX=" + coordinateX +
                ", direction=" + direction +
                ", item=" + item +
                '}';
    }
}
=======


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
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
