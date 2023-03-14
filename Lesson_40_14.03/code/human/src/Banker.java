public class Banker extends Human{

    // Das ist Constructor der Klasse **cmd+N**
    public Banker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    //bearbeiten Methoder work
    @Override
    public void work() {
        System.out.println("Muss Geld vermehren");
        vervielfachen(); // Zusätzliche Methode
    }
    //realisierung der Methode **vervielfachen**
    public void vervielfachen() {
        System.out.println("Geld zählen");
    }
}
