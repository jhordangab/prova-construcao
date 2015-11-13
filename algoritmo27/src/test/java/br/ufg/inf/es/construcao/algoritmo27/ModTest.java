package br.ufg.inf.es.construcao.algoritmo27;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModTest {

    @Test
    public void testMod() {
        assertEquals(0, Mod.mod(2, 2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroNumeroInvalido() {
        Mod.mod(-1, 5);
        Mod.mod(-231, 23);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoNumeroInvalido() {
        Mod.mod(1, -5);
        Mod.mod(31, -23);
    }
}
