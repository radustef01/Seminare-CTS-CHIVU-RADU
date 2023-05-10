package state.main;

import state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa =  new Masa(1);

        masa.ocupareMasa();
        masa.ocupareMasa();
        masa.rezervareMasa();
        masa.elibereazaMasa();

    }
}
