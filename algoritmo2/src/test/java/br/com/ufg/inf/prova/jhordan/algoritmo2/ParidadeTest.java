package br.com.ufg.inf.prova.jhordan.algoritmo2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Paridade
 *
 */
public class ParidadeTest {

    /**
     * Testes válidos com números pares
     */
    @Test
    public void testNumerosParesParidade() {
        assertEquals(true, Paridade.paridade(2));
        assertEquals(true, Paridade.paridade(-22));
        assertEquals(true, Paridade.paridade(-460));
        assertEquals(true, Paridade.paridade(220));
        assertEquals(true, Paridade.paridade(0));
    }

    /**
     * Testes válidos com números ímpares
     */
    @Test
    public void testNumerosImparesParidade() {
        assertEquals(false, Paridade.paridade(-1));
        assertEquals(false, Paridade.paridade(-11));
        assertEquals(false, Paridade.paridade(-461));
        assertEquals(false, Paridade.paridade(221));
        assertEquals(false, Paridade.paridade(1));
    }

}
