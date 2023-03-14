public class Programmer extends Human {

    // Das ist Constructor der Klasse **cmd+N**
    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Programmierer liebt es Codes zu schreiben.");
        doCode(); // das ist noch eine Methode, das wir ausgedacht/bestellt haben/ist--ist nicht **Signiert**
    }

    // die realisation des Codes **doCose**
    public void doCode() {
        System.out.println("Sitzen an der Klviatur, denken und schreiben.");
    }
}
