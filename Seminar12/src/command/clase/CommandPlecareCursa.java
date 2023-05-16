package command.clase;

public class CommandPlecareCursa implements ICommand {
    private int nrLinie;
    //dependency inversion
    private Automobil automobil;

    public CommandPlecareCursa(int nrLinie, Automobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void executa() {
        automobil.plecareInCursa(nrLinie);
    }
}
