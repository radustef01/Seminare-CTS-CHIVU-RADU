package dubluri;

import JUnit.IPersoana;

public class StubPersoana implements IPersoana {

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 16;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }

}
