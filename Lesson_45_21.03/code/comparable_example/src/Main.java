import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleich von Wohnräumen. ");

        //Gründen neue Objekte
        House h1 = new House(123,150000, "Kologne");
        House h2 = new House(100,120000, "London");
        House h3 = new House(145,230000, "New York");
        House h4 = new House(200,450000, "Moscow");

        // rufen ThreeSet auf
        TreeSet housesList = new TreeSet<>();

        // füllen Thre0Set mit Objekten
        housesList.add(h1);
        housesList.add(h2);
        housesList.add(h3);
        housesList.add(h4);

        System.out.println(housesList);







    }
}