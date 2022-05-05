public class Item {
    int coordinateY;
    int coordinateX;
<<<<<<< HEAD
    double strength;
=======
    double strenght;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    ItemType itemType;

    public Item(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
<<<<<<< HEAD
        determineStrength(itemType);  // ctrl + alt + m
    }

    private void determineStrength(ItemType itemType) {
        switch (itemType) {
            case SWORD:
                this.strength = 3;
                break;
            case HAMMER:
                this.strength = 2;
                break;
            case DAGGER:
                this.strength = 1;
=======
        determineStrenght(itemType); //ctrl + alt + m
    }

    private void determineStrenght(ItemType itemType) {
        switch (itemType) {
            case SWORD:
                this.strenght = 3;
                break;
            case HAMMER:
                this.strenght = 2;
                break;
            case DAGGER:
                this.strenght = 1;
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize) {
<<<<<<< HEAD
        return (int) ((Math.random()*(worldSize-2))+1); // cast
    }

    @Override
    public String toString() {
        return "Item{" +
                "coordinateY=" + coordinateY +
                ", coordinateX=" + coordinateX +
                ", strength=" + strength +
                ", itemType=" + itemType +
                '}';
=======
        return (int) (Math.random() * (worldSize - 2)) + 1; //cast
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    }
}
