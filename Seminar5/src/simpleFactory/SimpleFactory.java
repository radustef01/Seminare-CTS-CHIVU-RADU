package simpleFactory;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String name){
        switch(tipPersonal){
            case Medic:
                return new Medic(name);
            case Brancardier:
                return new Brancardier(name);
            case Asistent:
                return new Asistent(name);
            default:
                return null;
        }
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, Integer aniVechime){
        switch(tipPersonal){
            case Anestezist:
                return new Anestezist(nume, aniVechime);
            default:
                return createPersonal(tipPersonal,nume);
        }
    }
}
