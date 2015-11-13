package br.ufg.inf.es.construcao.algoritmo47;

import org.junit.Test;
import static org.junit.Assert.*;

public class MediaArrayTest {
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaNegativa() {
        int[] array = {3, 1, 2, 12, 54, 5};
        MediaArray.mediaArray(array, -2);
    }

    @Test
    public void testMediaArray() {
        int[] array = {3, 3, 3};
        assertEquals(3, MediaArray.mediaArray(array, 2));
    }
    
    @Test
    public void testMediaArrayMaior() {
        int[] array = {14, 6, 10};
        assertEquals(8, MediaArray.mediaArray(array, 2));
    }
}
