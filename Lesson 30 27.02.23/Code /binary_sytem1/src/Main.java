import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        char ch = '1';
        int num;
        num = Character.getNumericValue(ch);
        System.out.println(""+ch+"      " +"            "+ num);

        int pow = (int) (num * Math.pow( 2, 10));
        System.out.println(pow);

        System.out.println("Bitte geben Sie eine Dezimalzahl ein  ");
        String binary_number = sc.nextLine();
        System.out.println("Ausgabe eingegebene Dezimalzahl:  "+ binary_number);

        int l = binary_number.length();
        System.out.println("Anzahl der Zahlen in der Dezimalzahl:  " + l);

        Character[] simbol = new String[l];
        ArrayList<String> simbolsOFbinum = new ArrayList<>();

        for ( int i = 0 ; i < simbol.length ; i++ ) {
            simbol[i] = String.valueOf(binary_number.charAt(i));
            simbolsOFbinum.add( i , simbol[i]);

        }

        System.out.println(simbolsOFbinum);

        int[] s = new int[l];
        for (int i = 0; i < l; i++) {
            s[i] = Character.getNumericValue(simbol(i));

        }


    }
}