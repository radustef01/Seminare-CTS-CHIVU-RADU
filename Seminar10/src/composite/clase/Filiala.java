package composite.clase;

public class Filiala implements UnitateBancara{
    private String denumire;
    private int nrAngajati;

    public Filiala(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergereUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printUnitate(String indentare) {
        System.out.println(indentare+ "Filiala "+ this.denumire+ " are "+this.nrAngajati+" angajati");
    }
}
