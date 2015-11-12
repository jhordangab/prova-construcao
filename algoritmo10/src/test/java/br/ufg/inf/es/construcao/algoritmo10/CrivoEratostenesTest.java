package br.ufg.inf.es.construcao.algoritmo10;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrivoEratostenesTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testArrayDiferenteQuantidade() {
        int quantidade = 10;
        int[] array = new int[8];
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testQuantidadeMenor2() {
        int quantidade = 1;
        int[] array = new int[1];
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testArrayPosicaoEsperadaDiferenteZero() {
        int quantidade = 5;
        int[] array = {1, 1, 0, 2, 0};
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @Test
    public void testCrivo() {
        int quantidade = 10;
        int[] array = new int[quantidade + 1];
        CrivoEratostenes.crivoEratostenes(array, quantidade);
        assertEquals(1, array[9]);
        assertEquals(1, array[8]);
        assertEquals(0, array[7]);
        assertEquals(1, array[6]);
        assertEquals(0, array[5]);
        assertEquals(1, array[4]);
        assertEquals(0, array[3]);

    }

}
