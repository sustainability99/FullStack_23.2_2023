public class Track extends Car{
    String brand;
    int load_weight;

    public Track(int age, String usage, int speed, String brand, int load_weight) {
        super(age, usage, speed);
        this.brand = brand;
        this.load_weight = load_weight;
    }
}


