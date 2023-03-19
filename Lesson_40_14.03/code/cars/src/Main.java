public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобили и полиморфизм.");

        Auto auto = new Auto(11,"Taxi", 80, "VW", 7 );
        Bus bus = new Bus(5,"Trip", 60, "MAN", 70);

        auto.go();
        bus.go();
        System.out.println();

        auto.stop();
        bus.stop();
        System.out.println();

        auto.speed_down();
        bus.speed_down();
        System.out.println();

        auto.speed_up();
        bus.speed_up();





    }
}