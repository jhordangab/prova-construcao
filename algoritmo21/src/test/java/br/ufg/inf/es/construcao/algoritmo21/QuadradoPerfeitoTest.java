package br.ufg.inf.es.construcao.algoritmo21;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {

    @Test
    public void testQuadradoPerfeito() {
        assertTrue(QuadradoPerfeito.quadradoPerfeito(16));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(100));
    }

    @Test
    public void testNotQuadradoPerfeito() {
        assertTrue(!QuadradoPerfeito.quadradoPerfeito(126));
        assertTrue(!QuadradoPerfeito.quadradoPerfeito(10));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaInvalida() {
        QuadradoPerfeito.quadradoPerfeito(-26);
        QuadradoPerfeito.quadradoPerfeito(0);
    }
}
