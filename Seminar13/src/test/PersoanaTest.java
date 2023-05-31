package test;

import JUnit.ExceptieNenascut;
import JUnit.ExceptionCNPNull;
import JUnit.IPersoana;
import JUnit.Persoana;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    //right bicep - corectitudinea

    @org.junit.jupiter.api.Test
    void getVarstaTestBicep() {
        IPersoana persoana=new Persoana("Ana","197082824487");
        assertEquals(25,persoana.getVarsta());
    }

    //boundery - limite
    @org.junit.jupiter.api.Test
    void getVarstaTestBounderyNouNascut() {
        IPersoana persoana=new Persoana("Ana","5230524123456");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounderyLimitaInferioara() {
        IPersoana persoana=new Persoana("Ana","5000101123456");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBounderyLimitaSuperioara() {
        IPersoana persoana=new Persoana("Ana","2991231123456");
        assertEquals(23,persoana.getVarsta());
    }

    //inversion relationship nu putem face pt ca nu putem determina ce cnp are o pers dupa varsta


    @org.junit.jupiter.api.Test
    void getVarstaErrorCondition() {
        IPersoana persoana=new Persoana("Ana","6231231123456");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }



    @org.junit.jupiter.api.Test
    void getVarstaPerformance() {
        IPersoana persoana=new Persoana("Ana","6001231123456");
        assertTimeout(Duration.ofMillis(100),()->persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void cnpCaractereCorrect() {
        Persoana persoana=new Persoana("Ana","6001231123456");
        assertEquals(13, persoana.getCNP().length());
    }

    @org.junit.jupiter.api.Test
    void ordineVarsta() {
        Persoana persoana=new Persoana("Ana","6001231123456");
        Persoana persoana1=new Persoana("Ana","2981231123456");
        assertTrue(persoana.getVarsta() < persoana1.getVarsta());
    }


    @org.junit.jupiter.api.Test
    void existence() {
        Persoana persoana=new Persoana("Ana","6001231123456");
        Persoana persoana1=new Persoana("Ana","2981231123456");
        assertTrue(persoana.getVarsta() < persoana1.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaShouldThrownException() {
        Persoana persoana=new Persoana("Ana",null);
        assertThrows(ExceptionCNPNull.class,()->persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaCardinality() {
        Persoana persoana=new Persoana("Ana","5220515151234");
        assertEquals(1,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void verificaConstructorCrossCheck() {
        Persoana persoana=new Persoana("Ana","5220515151234");
        Persoana persoana1=new Persoana();
        persoana1.setCNP("5220515151234");
        persoana1.setNume("Ana");
        assertEquals(persoana.getCNP(),persoana1.getCNP());
        assertEquals(persoana.getNume(),persoana1.getNume());

    }
}