package state.clase;

public class StareRezervata implements IStare{

    @Override
    public void modificaStarea(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("Masa este rezervata acum");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa nu poate fi rezervata");
        }
    }
}
