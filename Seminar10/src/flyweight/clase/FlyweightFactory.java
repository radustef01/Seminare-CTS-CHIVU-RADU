package flyweight.clase;

import java.util.Map;

public class FlyweightFactory {
    private Map<String, IClientBanca> mapCont;

    public FlyweightFactory() {
        this.mapCont = mapCont;
    }

    public IClientBanca getDetinator(String nume, String nrTelefon, String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBanca client= new Detinator(nume, nrTelefon,adresa);
            mapCont.put(nume,client);
            return client;
        }
        return mapCont.get(nume);
    }

}
