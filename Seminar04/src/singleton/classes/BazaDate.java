package singleton.classes;

public class BazaDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String denumire;
    public static BazaDate instanta = new BazaDate();

    private BazaDate(){

    }

    private BazaDate(int dimensiuneDate, int numarTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    public static BazaDate getInstance(){
        return  instanta;
    }

    @Override
    public String toString() {
        return "BazaDate{" +
                "dimensiuneDate=" + dimensiuneDate +
                ", numarTabele=" + numarTabele +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
