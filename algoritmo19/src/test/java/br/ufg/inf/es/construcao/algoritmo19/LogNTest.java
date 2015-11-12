package br.ufg.inf.es.construcao.algoritmo19;

import org.junit.Test;
import static org.junit.Assert.*;

public class LogNTest {
    
    @Test
    public void testLogN() {
        assertEquals(311, LogN.logN(23, 2));
        assertEquals(335, LogN.logN(5, 8));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        LogN.logN(-2, 3);
        LogN.logN(-22, 21);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void logInvalido() {
        LogN.logN(2, 1);
        LogN.logN(22, -21);
    }
}
