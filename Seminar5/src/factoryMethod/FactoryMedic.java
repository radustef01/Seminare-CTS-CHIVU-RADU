package factoryMethod;

public class FactoryMedic implements FactoryMethod{


    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
