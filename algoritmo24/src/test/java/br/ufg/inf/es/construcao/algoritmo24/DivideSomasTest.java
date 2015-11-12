package br.ufg.inf.es.construcao.algoritmo24;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSomasTest {
    
    @Test
    public void testDivideSomas() {
        assertEquals(6, DivideSomas.divideSomas(3, 3));
        assertEquals(6, DivideSomas.divideSomas(2, 6));
        assertEquals(5, DivideSomas.divideSomas(3, 5));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroNumeroInvalido() {
        DivideSomas.divideSomas(-1, 5);
        DivideSomas.divideSomas(-231, 23);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoNumeroInvalido() {
        DivideSomas.divideSomas(1, -5);
        DivideSomas.divideSomas(31, -23);
    }
}
