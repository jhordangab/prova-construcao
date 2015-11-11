package br.ufg.inf.es.construcao.algoritmo4;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testProduto() {
        assertEquals(0, Produto.produto(1, 0));
        assertEquals(0, Produto.produto(0, 1));
        assertEquals(1, Produto.produto(1, 1));
        assertEquals(24, Produto.produto(2, 12));
        assertEquals(100, Produto.produto(20, 5));
        assertEquals(230, Produto.produto(10, 23));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroNumeroInvalido() {
        Produto.produto(-1, 1);
        Produto.produto(1, -1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoNumeroInvalido() {
        Produto.produto(1, -1);
    }

}
