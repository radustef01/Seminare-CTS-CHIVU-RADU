package simpleFactory;

public class Medic extends PersonalSpital{

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Gigel este " + super.getNume());
    }


}
