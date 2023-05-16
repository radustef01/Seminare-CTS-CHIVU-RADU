package adapter.clase;

public class SoftBar implements ISoftBar {
    private String denumire;


    public SoftBar(String denumire) {
        this.denumire = denumire;

    }

    @Override
    public void printeazaListaBautara(double pretBautura) {
        System.out.println("Barul "+this.denumire+" a emis nota aferenta "+pretBautura);
    }

}