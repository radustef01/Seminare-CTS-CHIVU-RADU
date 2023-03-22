package factoryMethod;

public class FactoryBrancardier implements FactoryMethod{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
