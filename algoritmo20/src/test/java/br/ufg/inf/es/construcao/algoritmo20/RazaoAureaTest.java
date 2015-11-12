package br.ufg.inf.es.construcao.algoritmo20;

import org.junit.Test;
import static org.junit.Assert.*;

public class RazaoAureaTest {

    @Test
    public void testRazaoAurea() {
        assertEquals(1, RazaoAurea.razaoAurea(3, 12, 2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void termo1Invalido() {
        RazaoAurea.razaoAurea(-2, 3, 1);
        RazaoAurea.razaoAurea(-22, 21, 12);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void termo1MaiorTermo2() {
        RazaoAurea.razaoAurea(20, 12, 6);
        RazaoAurea.razaoAurea(22, 21, 20);
    }
}
