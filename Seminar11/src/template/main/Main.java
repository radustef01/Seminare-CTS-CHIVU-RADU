package template.main;

import template.clase.MasaFinal;
import template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        MasaFinal masaFinal = new MasaFinal(1);
        masaFinal.ocupaMasa();

        MasaRezervata masaRezervata = new MasaRezervata(2,"20:00");
        masaRezervata.ocupaMasa();
    }
}