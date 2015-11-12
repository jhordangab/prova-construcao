package br.ufg.inf.es.construcao.algoritmo22;

import org.junit.Test;
import static org.junit.Assert.*;

public class AmigosTest {
    
    @Test
    public void testAmigos() {
        assertTrue(Amigos.amigos(220, 284));
    }
    
    @Test
    public void testNotAmigos() {
        assertTrue(!Amigos.amigos(232, 12));
    }
}
