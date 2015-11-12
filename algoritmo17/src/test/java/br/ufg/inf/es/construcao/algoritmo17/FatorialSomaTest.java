package br.ufg.inf.es.construcao.algoritmo17;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialSomaTest {

    @Test
    public void testProduto() {
        assertEquals(2, FatorialSoma.fatorialSoma(2));
        assertEquals(6, FatorialSoma.fatorialSoma(3));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void entradaNegativa() {
        FatorialSoma.fatorialSoma(-23);
        FatorialSoma.fatorialSoma(0);
        FatorialSoma.fatorialSoma(-23);
    }
}
