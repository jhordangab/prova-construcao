package br.com.ufg.inf.prova.jhordan.algoritmo2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ParidadeTest {

    @Test
    public void testNumerosImparesNegativos() {
        assertTrue(!Paridade.paridade(-21));
        assertTrue(!Paridade.paridade(-4321));
        assertTrue(!Paridade.paridade(-2321));
    }

    @Test
    public void testNumerosParesNegativos() {
        assertTrue(Paridade.paridade(-22));
        assertTrue(Paridade.paridade(-460));
        assertTrue(Paridade.paridade(-10));
    }

    @Test
    public void testNumerosParesPositivos() {
        assertTrue(Paridade.paridade(2));
        assertTrue(Paridade.paridade(220));
        assertTrue(Paridade.paridade(0));
    }

    @Test
    public void testNumerosImparesPositivos() {
        assertTrue(!Paridade.paridade(211));
        assertTrue(!Paridade.paridade(461));
        assertTrue(!Paridade.paridade(1));
    }
}
