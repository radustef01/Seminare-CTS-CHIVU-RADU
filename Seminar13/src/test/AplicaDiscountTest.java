package test;

import JUnit.PachetTuristic;
import dubluri.FakePersoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicaDiscountTest {

    @Test
    void testNUAplicaDiscountVarstnici() {
        FakePersoana fp = new FakePersoana();
        fp.setGetVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fp, "Eforie",1000d );
        pachetTuristic.aplicaDiscountVarstnici(70);
        assertEquals(1000, pachetTuristic.getPret());
    }

    @Test
    void testAplicaDiscount(){
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(89);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana, "Eforie", 1000d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900, pachetTuristic.getPret());
    }
}