package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.Test;
import static org.junit.Assert.*;

public class Mdc2Test {

    @Test
    public void testMdc2() {
        assertEquals(6, Mdc2.mdc2(12, 6));
        assertEquals(3, Mdc2.mdc2(12, 3));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void segundoMaiorPrimeiro() {
        Mdc2.mdc2(2, 6);
        Mdc2.mdc2(12, 326);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void segundoigualZero() {
        Mdc2.mdc2(2, 0);
        Mdc2.mdc2(12, 0);
    }
}
