package br.com.ufg.inf.prova.jhordan.algoritmo2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParidadeTest {

    @Test
    public void testNumerosImparesNegativos() {
        assertEquals(true, Paridade.paridade(-21));
        assertEquals(true, Paridade.paridade(-4321));
        assertEquals(true, Paridade.paridade(-2321));
    }
    
    @Test
    public void testNumerosParesNegativos() {
        assertEquals(true, Paridade.paridade(-22));
        assertEquals(true, Paridade.paridade(-460));
        assertEquals(true, Paridade.paridade(-10));
    }
    
    @Test
    public void testNumerosParesPositivos() {
        assertEquals(true, Paridade.paridade(2));
        assertEquals(true, Paridade.paridade(220));
        assertEquals(true, Paridade.paridade(0));
    }

    @Test
    public void testNumerosImparesPositivos() {
        assertEquals(false, Paridade.paridade(211));
        assertEquals(false, Paridade.paridade(461));
        assertEquals(false, Paridade.paridade(1));
    }

}
