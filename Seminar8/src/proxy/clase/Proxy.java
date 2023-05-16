package proxy.clase;

public class Proxy implements IRestaurant {
    private IRestaurant restaurant;

    public Proxy(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        if(nrPersoane>=4)
        {
            this.restaurant.rezervaMasa(nrPersoane);
        }
        else
        {
            System.out.println("Rezervarea nu a putut fi facuta.");
        }
    }
}
