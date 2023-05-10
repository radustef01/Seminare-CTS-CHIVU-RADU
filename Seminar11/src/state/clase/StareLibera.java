package state.clase;

public class StareLibera implements IStare{
    @Override
    public void modificaStarea(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa este libera acum");
            masa.setStare(this);
        }
        else{
            System.out.println("Masa este deja libera");
        }
    }
}
