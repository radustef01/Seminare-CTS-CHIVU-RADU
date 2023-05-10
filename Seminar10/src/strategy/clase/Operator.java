package strategy.clase;

public class Operator {

    private ModVerificare modVerificare;

    public Operator() {
        this.modVerificare = modVerificare;
    }

    public ModVerificare getModVerificare() {
        return modVerificare;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }


}
