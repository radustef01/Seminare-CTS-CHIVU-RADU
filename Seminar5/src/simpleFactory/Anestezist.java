package simpleFactory;

import factoryMethod.PersonalSpital;

public class Anestezist extends PersonalSpital {

    private Integer aniVechime;
    public Anestezist(String nume, Integer aniVechime ) {
        super(nume);
        this.aniVechime=aniVechime;
    }

    @Override
    public void afiseazaDescriere() {

        System.out.println("Anestezistul " + super.getNume() + " are " + this.aniVechime + " ani vechime.");
    }


}
