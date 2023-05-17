package flyweight.main;

import flyweight.clase.Cont;
import flyweight.clase.Detinator;
import flyweight.clase.FlyweightFactory;
import flyweight.clase.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica=new FlyweightFactory();
        Cont cont1=new Cont(2300, 12);
        Cont cont2=new Cont(4000, 14);
        Cont cont3=new Cont(5000, 15);

        Detinator detinator= new Detinator("Radu", "5555", "bucluci");
        detinator.descriere(cont1);

        fabrica.getDetinator("Maria","4377634","str secundara")
                .descriere(cont1);
        fabrica.getDetinator("Maria","4377634","str secundara")
                .descriere(cont1);
        fabrica.getDetinator("Maria","4377634","str secundara")
                .descriere(cont2);

        fabrica.getDetinator("Maria","4377634","str secundara")
                .descriere(cont1);

        detinator.descriere(cont1);
        detinator.descriere(cont2);
    }
}