package observer.main;

import observer.clase.Client;
import observer.clase.IClient;
import observer.clase.IRestaurant;
import observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("George");
        IClient client2 = new Client("Abby");
        IClient client3 = new Client("Floppy");

        Restaurant restaurant = new Restaurant("Tratoria Mila");

        restaurant.introduceOfertaNoua();

        restaurant.abonareClient(client1);

        restaurant.adaugaDiscount(25);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonare(client1);

        restaurant.introduceOfertaNoua();
    }
}
