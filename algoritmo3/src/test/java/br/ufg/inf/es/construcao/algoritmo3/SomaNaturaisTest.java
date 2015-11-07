package br.ufg.inf.es.construcao.algoritmo3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe SomaNaturais
 *
 */
public class SomaNaturaisTest {

    /**
     * Testes com entrada inválida
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testInvalidSomaNaturais() {
        SomaNaturais.somaNaturais(0);
        SomaNaturais.somaNaturais(-1);
    }

    /**
     * Testes com entradas válidas
     */
    @Test
    public void testSomaNaturais() {
        assertEquals(1, SomaNaturais.somaNaturais(1));
        assertEquals(3, SomaNaturais.somaNaturais(2));
        assertEquals(6, SomaNaturais.somaNaturais(3));
        assertEquals(10, SomaNaturais.somaNaturais(4));
        assertEquals(15, SomaNaturais.somaNaturais(5));
    }

}
