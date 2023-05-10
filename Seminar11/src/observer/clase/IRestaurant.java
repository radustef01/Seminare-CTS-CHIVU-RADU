package observer.clase;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonare(IClient client);
    void notificareClient(String mesaj);
}
