package factoryMethod;

public class Asistent extends PersonalSpital{

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Gigel este " + super.getNume());
    }


}
