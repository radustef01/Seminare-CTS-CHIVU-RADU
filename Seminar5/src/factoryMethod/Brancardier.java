package factoryMethod;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Gigel este " + super.getNume());
    }


}
