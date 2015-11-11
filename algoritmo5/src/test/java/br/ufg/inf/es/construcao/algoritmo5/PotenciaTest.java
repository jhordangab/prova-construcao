package br.ufg.inf.es.construcao.algoritmo5;

import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaTest {

    @Test
    public void testPotenciaValida() {
        assertEquals(8, Potencia.potencia(2, 3));
        assertEquals(4, Potencia.potencia(2, 2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testExpoenteInvalido() {
        Potencia.potencia(2, -1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testBaseInvalida() {
        Potencia.potencia(-2, 1);

    }
}
