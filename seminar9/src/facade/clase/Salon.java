package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon(){
        coduriPaturiLibere=new ArrayList<>();
    }

    public boolean verificaPaturiLibere(){
        return this.coduriPaturiLibere.size()>0;
    }

    public void adaugaPaturiLibere(int codPatLiber){
        coduriPaturiLibere.add(codPatLiber);
    }

    public void ocupaPat(){
        coduriPaturiLibere.remove(0);
    }
}
