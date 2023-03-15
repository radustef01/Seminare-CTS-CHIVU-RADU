package singletonregistry;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstitutie("politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstitutie("pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstitutie("politieLocala");

        politie.setNumarAngajati(10);
        pompieri.setNumarAngajati(5);
        politieLocala.setNumarAngajati(20);

        System.out.println(politie);
        System.out.println(pompieri);
        System.out.println(politieLocala);
    }
}
