public class Player {
<<<<<<< HEAD
    // (muutuja aktiivne) parem klõps -> refactor -> rename
    int coordinateY;
    int coordinateX;
=======
    int coordinateY;
    int coordinateX;

>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    Direction direction;

    // Constructor
    public Player(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public int generateRandomCoordinate(int worldSize) {
<<<<<<< HEAD
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
=======
        return (int) (Math.random() * (worldSize - 2)) + 1;

    }

    public void movePlayer(String input, int worldHeight, int worldWidth) {
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
//            if (direction == Direction.LEFT && true) {
//                playerCoordinateX--;
//            } else if (direction == Direction.DOWN || input.equals("mihkel")) {
//                playerCoordinateY++;
//            } else if (direction == Direction.RIGHT) {
//                playerCoordinateX++;
//            } else if (direction == Direction.UP) {
//                playerCoordinateY--;
//            }

    }

}

// Tellimuse - id, tooted, kasutaja, aja
// Kasutaja - frontendis registreerumise järgselt
// Ühe toote
// Kategooria
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
