package singleton.classes;

public class Secretariat {
    private int numarBirou;
    private int numarAngajati;
    private static Secretariat instanta;


    private Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Secretariat getInstanta(int numarBirou, int numarAngajati) {
        if (Secretariat.instanta == null){
            Secretariat.instanta = new Secretariat(numarBirou, numarAngajati);
        }
        return Secretariat.instanta;
    }

    @Override
    public String toString() {
        return "Secretariat{" +
                "numarBirou=" + numarBirou +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
