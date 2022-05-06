public class Info {
    String model;
    String processor;
    String graphics;
    int ram;
    int hdd;
<<<<<<< HEAD

=======
    // right click > generate > constructor > hold shift > click > cool beans
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
    public Info(String model, String processor, String graphics, int ram, int hdd) {
        this.model = model;
        this.processor = processor;
        this.graphics = graphics;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Info{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
