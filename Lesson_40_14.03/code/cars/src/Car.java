public abstract class Car {
    int age; // возраст
    String usage; // применение
    int speed;

    // конструктор класса
    public Car(int age, String usage, int speed) {
        this.age = age;
        this.usage = usage;
        this.speed = speed;
    }

    public void go() {
        System.out.println("Едем по дороге");
        this.speed = speed;
    }

    public void stop() {
        System.out.println("Остановились");
        speed = 0;
    }

    public void speed_up() {
        System.out.println("Увеличиваем скорость");
        speed = speed + 10;
        System.out.println("Скорость выросла: " + speed);
    }
    public void speed_down() {
        System.out.println("Уменьшаем скорость");
        speed = speed - 10;
        System.out.println("Скорость упала: " + speed);
    }

}
