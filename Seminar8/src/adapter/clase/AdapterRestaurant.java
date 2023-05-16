package adapter.clase;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant{
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalSuma) {
        super.printeazaListaBautara(totalSuma);
    }
}