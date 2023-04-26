package facade.main;

import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade1 = new Facade();
        facade1.interneazaPacient("Luis");
        facade1.interneazaPacient("Cracul");
        facade1.interneazaPacient("Episcopus");
        facade1.interneazaPacient("Plagus");
        facade1.interneazaPacient("Plagus");
    }
}
