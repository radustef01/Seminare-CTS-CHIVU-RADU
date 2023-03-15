package main;

import singleton.classes.BazaDate;
import singleton.classes.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstanta(1, 10);
        Secretariat secretariat2 = Secretariat.getInstanta(2, 6);

        System.out.println(secretariat1);
        System.out.println(secretariat2);


        BazaDate bazaDate = BazaDate.getInstance();
        BazaDate bazaDate1 = BazaDate.getInstance();
        bazaDate.setDimensiuneDate(200);
        bazaDate1.setDimensiuneDate(300);
        System.out.println(bazaDate);
        System.out.println(bazaDate1);
    }
}
