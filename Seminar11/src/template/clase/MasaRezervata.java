package template.clase;

public class MasaRezervata extends Masa{
    private String ora;

    public MasaRezervata(int numar,String ora) {
        super(numar);
        this.ora=ora;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Se curata masa " +
                getNumar() + " inainte de ora rezervarii " + this.ora );
    }

    @Override
    protected void aseazaServetelele() {
        System.out.println("Se aseaza servetelele pe masa " +
                getNumar() + " inainte de ora rezervarii " + this.ora );
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se aseaza tacamurile la masa " +
                getNumar() + " inainte de ora rezervarii " + this.ora );
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Va asteptam la masa " +
                getNumar() + " inainte de ora rezervarii " + this.ora );
    }
}