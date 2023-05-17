package strategy.main;

import strategy.clase.Operator;
import strategy.clase.VerificaPJ;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();

        operator.verificaClient();

        operator.setModVerificare(new VerificaPJ());
        operator.verificaClient();


    }
}
