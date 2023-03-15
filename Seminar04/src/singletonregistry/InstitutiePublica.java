package singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;
    private static Map<String, InstitutiePublica> registruInstitutie = new HashMap<>();


    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(!registruInstitutie.containsKey(denumire)){
            registruInstitutie.put(denumire, new InstitutiePublica(denumire,0));
        }
        return registruInstitutie.get(denumire);
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
