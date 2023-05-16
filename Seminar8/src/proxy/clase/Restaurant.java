package proxy.clase;

public class Restaurant implements IRestaurant{
    private String denumire;

    public Restaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        System.out.println("Masa a fost rezervata pentru "+nrPersoane+" la restaurantul"+this.denumire);
    }
}