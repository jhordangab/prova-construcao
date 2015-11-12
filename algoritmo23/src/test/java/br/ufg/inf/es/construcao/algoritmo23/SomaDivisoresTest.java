package br.ufg.inf.es.construcao.algoritmo23;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaDivisoresTest {
    
    @Test
    public void testSomaDivisores() {
        assertEquals(1, SomaDivisores.somaDivisores(2));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSomaDivisoresInvalido() {
        SomaDivisores.somaDivisores(-2);
        SomaDivisores.somaDivisores(0);
    }

}
