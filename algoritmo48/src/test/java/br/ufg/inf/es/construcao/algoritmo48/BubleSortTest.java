package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BubleSortTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testEntradaNegativa() {
        int[] array = {3, 1, 2, 12, 54, 5};
        BubleSort.bubleSort(array, -12);
    }

//    @Test
//    public void testBubleSort() {
//        int quantidade = 10;
//        int[] array = new int[quantidade + 1];
//        array[0] = 3;
//        array[1] = 1;
//        array[2] = 2;
//        array[3] = 12;
//        array[4] = 54;
//        array[5] = 5;
//        BubleSort.bubleSort(array, 5);
//        assertEquals(1, array[0]);
//        assertEquals(2, array[1]);
//        assertEquals(3, array[2]);
//        assertEquals(5, array[3]);
//    }
}
