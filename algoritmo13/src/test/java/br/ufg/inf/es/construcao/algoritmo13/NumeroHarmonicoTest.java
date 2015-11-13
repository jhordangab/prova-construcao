package br.ufg.inf.es.construcao.algoritmo13;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroHarmonicoTest {

    @Test
    public void testNumeroHarmonico() {
        assertEquals(1, NumeroHarmonico.numeroHarmonico(3));
        assertEquals(1, NumeroHarmonico.numeroHarmonico(2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void entradaNegativa() {
        NumeroHarmonico.numeroHarmonico(-12);
        NumeroHarmonico.numeroHarmonico(0);
    }
}
