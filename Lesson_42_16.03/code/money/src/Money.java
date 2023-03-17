public class Money {

    private long amount; // Variable long (sind ganze Zahlen) - Menge des Geldes-amount
    private String currency; // Art der Währung - EU, USD ...

    //Constructor von uns modifiziert
    public Money(double amount, String currency) { // umgewandelt in double sind Zahlen mit Komma
        this.amount = Math.round(amount * 100); // Rundung des Geldes
        this.currency = currency;
    }

    // Umwandlung der Methode toString
    @Override
    public String toString() { // Signatur der Methode, publik und gibt einen String aus
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase()); // Ausgabe Menge des Geldes
        // und Währungsart in groß geschrieben
    }

    // Umwandlung der Methode equals
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money money)) {
            return false;
        }
        return amount == money.amount && currency.equalsIgnoreCase(money.currency);
    }
}