package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomatorioTest {

    @Test
    public void testSomatorio() {
        assertEquals(0, Somatorio.somatorio(3));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void entradaInvalida() {
        Somatorio.somatorio(-12);
        Somatorio.somatorio(0);
    }
}
