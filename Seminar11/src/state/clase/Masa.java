package state.clase;

public class Masa {
    private int numarMasa;
    private IStare stare;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.stare = new StareLibera();
    }
    protected void setStare(IStare s){
        this.stare=s;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public IStare getStare() {
        return stare;
    }

    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStarea(this);
    }

    public void rezervareMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStarea(this);
    }

    public void elibereazaMasa(){
        IStare stare = new StareLibera();
        stare.modificaStarea(this);
    }

}
