public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleichen die Objekte");

        Human h1 = new Human(40,true);
        Human h2 = new Human(40,true);

        System.out.println(h1 == h2);
        
    }
}