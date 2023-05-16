package adapter.clase;

import adapter.clase.ISoftBar;
import adapter.clase.ISoftRestaurant;

public class AdapterObiecteRestaurant implements ISoftRestaurant {


    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        this.softBar.printeazaListaBautara(totalSuma);
    }
}