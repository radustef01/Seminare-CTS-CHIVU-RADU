package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.FurnizareRezultat;
import decorator.clase.RezultatHartie;
import decorator.clase.RezultateOnline;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatPeHartie= new RezultatHartie();
        rezultatPeHartie.printareRezultat("Raceala");

        DecoratorAbstract decoratorAbstract = new RezultateOnline(rezultatPeHartie);
        decoratorAbstract.afisareOnline("Febra");
        decoratorAbstract.printareRezultat("Covid");
    }
}
