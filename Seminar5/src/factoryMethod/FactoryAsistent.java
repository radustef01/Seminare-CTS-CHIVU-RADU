package factoryMethod;

public class FactoryAsistent implements FactoryMethod{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}
