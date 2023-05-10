package flyweight.clase;

public class Detinator implements IClientBanca{
    private String nume;
    private String nrTel;
    private String adresa;

    public Detinator(String nume, String nrTel, String adresa) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Detinator{" +
                "nume='" + nume + '\'' +
                ", nrTel='" + nrTel + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(this.toString()+ cont.toString());
    }
}
