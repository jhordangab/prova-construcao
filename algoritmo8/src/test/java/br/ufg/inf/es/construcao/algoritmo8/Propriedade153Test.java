package br.ufg.inf.es.construcao.algoritmo8;

import org.junit.Test;
import static org.junit.Assert.*;

public class Propriedade153Test {

    @Test
    public void testPropriedade153() {
        assertTrue(Propriedade153.propriedade153(153));
    }

    @Test
    public void testNaoPropriedade153() {
        assertTrue(!Propriedade153.propriedade153(232));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaInvalida() {
        assertTrue(Propriedade153.propriedade153(-1232));
        assertTrue(!Propriedade153.propriedade153(1000));
    }

}
