public class HWEnum {
        public static void main(String[] args) {
            System.out.println("Willkommen in unserer Backstube, was möchten Sie gern speisen? ");

            enum baecker {
                PainAuChocolat,
                Croissant,
                Baquette,
                Macaron,
                Brötchen,

            }
            baecker mySpezial = baecker.Croissant;

            switch (mySpezial) {

                case PainAuChocolat -> {
                    System.out.println("Im Frühling scheint die Sonne");
                    System.out.println("Alle sollen die Eier färben - Die Hasen verteilen diese");
                    break;
                }
                case Croissant -> {
                    System.out.println("Planen unseren Urlaub");
                    break;
                }
                case Baquette -> {
                    System.out.println("Nehmen Regenschirm mit");
                    System.out.println("Sammeln Pilze");
                    break;
                }
                case Macaron -> {
                    System.out.println("Ziehen Walenki an");
                    break;

                }case Brötchen -> {
                    System.out.println("Ziehen Walenki an");
                    break;
                }
            }
        }
    }
