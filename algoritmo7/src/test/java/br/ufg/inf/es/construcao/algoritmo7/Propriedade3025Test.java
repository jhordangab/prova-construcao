package br.ufg.inf.es.construcao.algoritmo7;

import org.junit.Test;
import static org.junit.Assert.*;

public class Propriedade3025Test {

    @Test
    public void testPropriedade3025() {
        assertTrue(Propriedade3025.propriedade3025(3025));
    }

    @Test
    public void testNaoPropriedade3025() {
        assertTrue(!Propriedade3025.propriedade3025(232));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaInvalida() {
        Propriedade3025.propriedade3025(-1232);
        Propriedade3025.propriedade3025(100000);
    }
}
