package br.ufg.inf.es.construcao.algoritmo26;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModSimplesTest {
    
    @Test
    public void testModSimples() {
        assertEquals(2147483646, ModSimples.modSimples(2, 2));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroInvalido() {
        ModSimples.modSimples(-1, 2);
        ModSimples.modSimples(-12, 22);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoInvalido() {
        ModSimples.modSimples(1, -2);
        ModSimples.modSimples(12, -22);
    }
}
