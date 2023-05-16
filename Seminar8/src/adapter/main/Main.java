package adapter.main;

import adapter.clase.AdapterRestaurant;
import adapter.clase.ISoftBar;
import adapter.clase.ISoftRestaurant;
import adapter.clase.SoftBar;
import adapter.clase.AdapterObiecteRestaurant;

public class Main {

    public static void imprimare(ISoftRestaurant restaurant, double totalNota)
    {
        restaurant.printeazaNota(totalNota);
    }
    public static void main(String[] args) {

        ISoftBar bar=new SoftBar("Alcadibo");
        bar.printeazaListaBautara(240);

        //Main.imprimare(bar,300);


        AdapterRestaurant adapterRestaurant=new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapterRestaurant,450);

        AdapterObiecteRestaurant adapterObiecteRestaurant=new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecteRestaurant,300);

    }
}