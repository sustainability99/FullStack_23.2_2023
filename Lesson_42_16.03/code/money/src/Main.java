public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleich für die Klasse Money");

        Money euro = new Money(200, "EUR");
        Money euro2 = new Money(200, "eur");
        Money dollar = new Money(300,"USD");

        System.out.println(euro);
        System.out.println(euro2);
        System.out.println(dollar);
        System.out.println();

        System.out.println(euro == euro2);
        System.out.println(euro == dollar);
        System.out.println();

        System.out.println(euro.equals(euro2));
        System.out.println(euro.equals(dollar));

        System.out.println(euro2.toString());;




















    }
}