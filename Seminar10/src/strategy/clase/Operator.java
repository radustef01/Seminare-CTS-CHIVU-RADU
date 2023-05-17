package strategy.clase;

public class Operator {

    private ModVerificare modVerificare;

    public Operator() {
        this.modVerificare = new VerificarePF();
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }


}
