package test;

import JUnit.PachetTuristic;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMajora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachetTuristicTestP  {

    @Test
    void testPoateRezerva() {
        StubPersoana persoana = new StubPersoana();
        PachetTuristic pachet =  new PachetTuristic(persoana,"Bucuresti", 150.0);
        assertFalse(pachet.poateRezerva());
    }
    @Test
    void unMajorPoateRezerva()
    {
        StubPersoanaMajora persoanaMajora = new StubPersoanaMajora();
        PachetTuristic pachet1 =  new PachetTuristic(persoanaMajora,"Bucuresti", 150.0);
        assertTrue(pachet1.poateRezerva());
    }


}