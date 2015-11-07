package br.ufg.inf.es.construcao.algoritmo4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Produto
 *
 */
public class ProdutoTest {

    /**
     * Testes com entradas válidas.
     */
    @Test
    public void testProduto() {
        assertEquals(0, Produto.produto(1, 0));
        assertEquals(0, Produto.produto(0, 1));
        assertEquals(1, Produto.produto(1, 1));
        assertEquals(24, Produto.produto(2, 12));
        assertEquals(100, Produto.produto(20, 5));
        assertEquals(230, Produto.produto(10, 23));
    }

    /**
     * Testes com entradas inválidas
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testInvalidSomaNaturais() {
        Produto.produto(-1, 1);
        Produto.produto(1, -1);
    }

}
