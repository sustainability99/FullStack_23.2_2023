public class Sportsman extends Human{

    // Das ist Constructor der Klasse **cmd+N**
    public Sportsman(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Muss zum Training kommen.");
        playFootball(); // Erweiterung des Codes
    }
    // realisierung der Methode **playFootball**
    public void playFootball() {
        System.out.println("Laufen mit dem Ball.");
    }
}
