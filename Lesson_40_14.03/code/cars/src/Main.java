public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобили и полиморфизм.");

        Car car = new Car(8, "sharing", 75);
        Auto auto = new Auto(11,"Taxi", 80, "VW", 7 );
        Bus bus = new Bus(5,"Trip", 60, "MAN", 70);

        car.go();
        auto.go();
        bus.go();
        System.out.println();

        car.stop();
        auto.stop();
        bus.stop();
        System.out.println();

        car.speed_down();
        auto.speed_down();
        bus.speed_down();
        System.out.println();

        car.speed_up();
        auto.speed_up();
        bus.speed_up();





    }
}