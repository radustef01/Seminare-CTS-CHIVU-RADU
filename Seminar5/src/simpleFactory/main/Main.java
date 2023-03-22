package simpleFactory.main;

import factoryMethod.PersonalSpital;
import simpleFactory.SimpleFactory;
import simpleFactory.TipPersonal;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        List<PersonalSpital> list = new ArrayList<>();
        PersonalSpital personalSpital1 = simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Asistent, "Garcea");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Brancardier, "Pistolaru");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Medic, "Petrulius");
        PersonalSpital personalSpital5 = simpleFactory.createPersonal(TipPersonal.Anestezist, "Galactus", 2);
        list.addAll(List.of(personalSpital1,personalSpital2,personalSpital3,personalSpital4,personalSpital5));
        for (PersonalSpital personalSpital0: list ){
            personalSpital0.afiseazaDescriere();
        }
    }
}
