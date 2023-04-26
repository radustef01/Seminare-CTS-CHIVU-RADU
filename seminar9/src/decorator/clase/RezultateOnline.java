package decorator.clase;

public class RezultateOnline extends DecoratorAbstract{


    public RezultateOnline(FurnizareRezultat atr) {
        super(atr);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Site: "+ diagnostic);
    }
}
