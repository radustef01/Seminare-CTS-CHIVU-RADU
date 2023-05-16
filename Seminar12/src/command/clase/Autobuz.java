package command.clase;

public class Autobuz implements Automobil{
    private int nr;

    public Autobuz(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public void plecareInCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul "+nr+" a plecat in cursa pe linia "+nrLinie);
    }
}