package template.clase;

public class MasaFinal extends Masa{

    public MasaFinal(int numar) {
        super(numar);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Se curata masa " + getNumar());
    }

    @Override
    protected void aseazaServetelele() {
        System.out.println("Se aseaza servetelele pe masa " + getNumar());
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se aseaza tacamurile la masa " + getNumar());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Se invita persoanele la masa " + getNumar());
    }
}