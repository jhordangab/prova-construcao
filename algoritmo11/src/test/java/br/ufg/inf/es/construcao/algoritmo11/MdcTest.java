package br.ufg.inf.es.construcao.algoritmo11;

import org.junit.Test;
import static org.junit.Assert.*;

public class MdcTest {

    @Test
    public void testMdc() {
        assertEquals(6, Mdc.mdc(12, 6));
        assertEquals(3, Mdc.mdc(12, 3));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void segundoMaiorPrimeiro() {
        Mdc.mdc(2, 6);
        Mdc.mdc(12, 326);
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void segundoigualZero() {
        Mdc.mdc(2, 0);
        Mdc.mdc(12, 0);
    }
}
