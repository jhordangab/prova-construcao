package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test
    public void testFatorial() {
        assertEquals(24, Fatorial.fatorial(4));
        assertEquals(120, Fatorial.fatorial(5));
        assertEquals(2, Fatorial.fatorial(2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void entradaInvalida() {
        Fatorial.fatorial(-4);
        Fatorial.fatorial(-234);
        Fatorial.fatorial(0);
    }
}
