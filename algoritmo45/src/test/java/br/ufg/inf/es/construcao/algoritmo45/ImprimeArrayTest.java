package br.ufg.inf.es.construcao.algoritmo45;

import org.junit.Test;

public class ImprimeArrayTest {

    @Test
    public void testImprimeArray() {
        int[] array = {1, 2, 3};
        ImprimeArray.imprimeArray(array, 2);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaNegativa() {
        int[] array = {3, 1, 2, 12, 54, 5};
        ImprimeArray.imprimeArray(array, -2);
    }
}
