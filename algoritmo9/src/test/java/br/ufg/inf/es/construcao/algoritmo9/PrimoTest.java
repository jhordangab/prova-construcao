package br.ufg.inf.es.construcao.algoritmo9;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoTest {

    @Test
    public void testPrimo() {
        assertTrue(Primo.primo(5));
        assertTrue(Primo.primo(7));
        assertTrue(Primo.primo(13));
    }

    @Test
    public void testPrimoFalso() {
        assertTrue(!Primo.primo(4));
        assertTrue(!Primo.primo(70));
        assertTrue(!Primo.primo(100));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimoInvalido() {
        Primo.primo(-100);
        Primo.primo(-1);
        Primo.primo(0);
        Primo.primo(1);
    }
}
