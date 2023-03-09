public class Main {
    public static void main(String[] args) {
        System.out.println("Mitarbeiter und Einkommen");
        // Ein System entwickeln, in der Die Mitarbeiter und ihr Einkommen aufgenommen werden.
        // Möglichkeit eine E-Mail an die Mitarbeiter zu schicken, mit der Einkommensinformation.
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате

        // So funktioniert es nicht ein Exemplar **employee** zu erzeugen
        //Employee employee1 = new Employee("Ivanov Petr", "ivanov.p@mail.com",101);
        //  employee1.mailPaySlip();

        // Erschaffen einen neuen Mitarbeiter mit Einkommen
        Salary s1 = new Salary("Ivanov Peter", "ivanov.p@mail.com", 101,60000);
        Salary s2 = new Salary("Petriv Ivan", "petriv.i@mail.com", 102,48000);

        //Ausgabe zum testen
        //System.out.println(s1);
       // System.out.println(s2);

        System.out.println("Wir rufen dei Methode **PaySlip** auf");
        s1.mailPaySlip();
        System.out.println();
        s2.mailPaySlip();

        s2.setSalary(54000);//neues Einkommen eingegeben
        System.out.println();
        s2.mailPaySlip(); // Informiert über e-Mail

        Address emp1 = new Address("Alexander Tonev","alexander.t@online.de",104, "Keiserstrasse 2, 85697 Donau");
        Address emp2 = new Address("Silvia Salomon","silvia.s@online.de",105, "Wolkenstrasse 12, 97458 Hanau");

        System.out.println(emp1.getAdresse());
        System.out.println(emp2.getAdresse());

    }
}