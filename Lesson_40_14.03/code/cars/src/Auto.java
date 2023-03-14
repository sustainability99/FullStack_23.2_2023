public class Auto extends Car {
    String brand;
    int capacity;

    // Constructor dieser Klasse
    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге всей семьей");
        System.out.println(speed);
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }

    @Override
    public void speed_up() {
        super.speed_up();
    }

    @Override
    public void speed_down() {
        super.speed_down();
    }
}
