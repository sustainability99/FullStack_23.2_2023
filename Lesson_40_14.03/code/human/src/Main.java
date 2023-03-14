public class Main {
    public static void main(String[] args) {
        System.out.println("Mensch und seine Stelle");

        Human human = new Human("Alexander", "Alexandrov");
        Programmer programmer = new Programmer("Pro","Programm");
        Sportsman sportsman = new Sportsman("Faul","Elfmeter");
        Banker banker = new Banker("Dollar", "Höhenflug");

        human.work();
        System.out.println();
        programmer.work();
        System.out.println();
        sportsman.work();
        System.out.println();
        banker.work();
        System.out.println();

        //Das ist ein Beispiel für die Schaffung neue Exemplare der Klasse Human
        Human human1 = programmer;
        Human human2 = sportsman;
        Human human3 = banker;

        System.out.println(human1); // Programmer@4517d9a3  wird nur Stelle
        System.out.println(human2); // Sportsman@372f7a8d   und Verlinkung
        System.out.println(human3); // Banker@2f92e0f4       ausgegeben

        human1.work();
        System.out.println();
        human2.work();
        System.out.println();
        human3.work();

    }
}