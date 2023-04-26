package decorator.clase;

public class RezultatHartie implements FurnizareRezultat{

    @Override
    public void printareRezultat(String diagnostic) {
        System.out.println("Hartie: "+ diagnostic);
    }
}
