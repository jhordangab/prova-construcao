package br.ufg.inf.es.construcao.algoritmo18;

import org.junit.Test;
import static org.junit.Assert.*;

public class LogNaturalSimplesTest {

    @Test
    public void testLogNaturalSimples() {
        assertEquals(6, LogNaturalSimples.logNaturalSimples(2, 2));
        assertEquals(10, LogNaturalSimples.logNaturalSimples(2, 3));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        LogNaturalSimples.logNaturalSimples(-2, 3);
        LogNaturalSimples.logNaturalSimples(-22, 21);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void logInvalido() {
        LogNaturalSimples.logNaturalSimples(2, 1);
        LogNaturalSimples.logNaturalSimples(22, -21);
    }
}
