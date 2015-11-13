package br.ufg.inf.es.construcao.algoritmo46;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaArrayTest {
    
    @Test
    public void testSomaArray() {
        int array[] = {1,2,3,4,5};
        assertEquals(14, SomaArray.somaArray(array,4));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaNegativa() {
        int[] array = {3, 1, 2, 12, 54, 5};
        SomaArray.somaArray(array, -2);
    }
}
