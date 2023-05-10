package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{

    private String nume;
    private int nrAngajati;
    List<UnitateBancara> listaUB;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.listaUB= new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        listaUB.add(unitateBancara);
    }

    @Override
    public void stergereUnitate(UnitateBancara unitateBancara) {
        listaUB.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return listaUB.get(index);
    }

    @Override
    public void printUnitate(String indentare) {
        System.out.println(this.nume + " are "+ this.nrAngajati+ " angajati");
        for(UnitateBancara unitateBancara: listaUB)
        {
            unitateBancara.printUnitate("    "+indentare);
        }
    }
}
