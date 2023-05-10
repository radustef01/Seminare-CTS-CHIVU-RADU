package template.clase;

public abstract class Masa {
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetelele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();

    public final void ocupaMasa() {
        curataMasa();
        aseazaServetelele();
        aseazaTacamuri();
        invitaPersoane();
    }

    public int getNumar() {
        return numar;
    }
}