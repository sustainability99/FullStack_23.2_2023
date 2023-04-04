import java.util.Scanner;

public class Tischreservierung {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Anzahl der verfügbaren Tische im Restaurant
        int tischAnzahl = 10;

        // Array, um zu verfolgen, welche Tische reserviert sind (1 = reserviert, 0 = frei)
        int[] tische = new int[tischAnzahl];

        // Schleife, um die verfügbaren Tische auf 1 zu setzen
        for (int i = 0; i < tischAnzahl; i++) {
            tische[i] = 1;
        }

        System.out.println("Willkommen im Restaurant!");
        System.out.print("Für wie viele Personen möchten Sie einen Tisch reservieren? ");
        int personenAnzahl = input.nextInt();

        // Schleife, um den nächsten verfügbaren Tisch zu finden und zu reservieren
        for (int i = 0; i < tischAnzahl; i++) {
            if (tische[i] == 1 && personenAnzahl <= 4) {
                tische[i] = 0;
                System.out.println("Tisch " + (i+1) + " für " + personenAnzahl + " Personen reserviert.");
                break;
            } else if (tische[i] == 1 && personenAnzahl <= 8) {
                if (i+1 < tischAnzahl && tische[i+1] == 1) {
                    tische[i] = 0;
                    tische[i+1] = 0;
                    System.out.println("Tisch " + (i+1) + " und " + (i+2) + " für " + personenAnzahl + " Personen reserviert.");
                    break;
                }
            } else if (tische[i] == 1 && personenAnzahl <= 12) {
                if (i+2 < tischAnzahl && tische[i+1] == 1 && tische[i+2] == 1) {
                    tische[i] = 0;
                    tische[i+1] = 0;
                    tische[i+2] = 0;
                    System.out.println("Tisch " + (i+1) + ", " + (i+2) + " und " + (i+3) + " für " + personenAnzahl + " Personen reserviert.");
                    break;
                }
            }
            if (i == tischAnzahl-1) {
                System.out.println("Es sind keine Tische verfügbar.");
            }
        }
    }

}
