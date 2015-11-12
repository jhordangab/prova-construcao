package br.ufg.inf.es.construcao.algoritmo6;

import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaSomaTest {

    @Test
    public void testPotenciaSoma() {
        assertEquals(6, PotenciaSoma.potenciaSoma(2, 2));
        assertEquals(27030, PotenciaSoma.potenciaSoma(3, 3));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroNumeroInvalido() {
        PotenciaSoma.potenciaSoma(-22, 11);
        PotenciaSoma.potenciaSoma(-2, 20);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoNumeroInvalido() {
        PotenciaSoma.potenciaSoma(22, -11);
        PotenciaSoma.potenciaSoma(2, -20);
    }
}
