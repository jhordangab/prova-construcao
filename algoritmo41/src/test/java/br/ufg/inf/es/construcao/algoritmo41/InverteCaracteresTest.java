package br.ufg.inf.es.construcao.algoritmo41;

import org.junit.Test;
import static org.junit.Assert.*;

public class InverteCaracteresTest {
    
    @Test
    public void testInverteCaracteres() {
        assertEquals("nadrohj", InverteCaracteres.inverteCaracteres("jhordan"));
    }
    
    @Test
    public void testInverteCaracteresTrivial() {
        assertEquals("a", InverteCaracteres.inverteCaracteres("a"));
        assertEquals("b", InverteCaracteres.inverteCaracteres("b"));
    }
    
    @Test
    public void testInverteOutrosCaracteres() {
        assertEquals("gabriel", InverteCaracteres.inverteCaracteres("leirbag"));
    }
}
