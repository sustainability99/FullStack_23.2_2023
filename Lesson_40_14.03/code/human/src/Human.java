public class Human {
    private String firstName;
    private String lastName;

    //Konstructor für die Klasse
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Methode die den Menschen zur Arbeit schickt
    public void work(){ //Methode wird eigenständig benannt
        System.out.println("Mensch hat sich eine Stelle gefunden und geht zur Arbeit");
    }
}
