package br.ufg.inf.es.construcao.algoritmo25;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSubtracoesTest {

//    @Test
//    public void testDivideSubtracoes() {
//        assertEquals(6, DivideSubtracoes.divideSubtracoes(1, 2));
//        assertEquals(5, DivideSubtracoes.divideSubtracoes(2, 2));
//    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroNumeroInvalido() {
        DivideSubtracoes.divideSubtracoes(-1, 5);
        DivideSubtracoes.divideSubtracoes(-231, 23);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoNumeroInvalido() {
        DivideSubtracoes.divideSubtracoes(1, -5);
        DivideSubtracoes.divideSubtracoes(31, -23);
    }
}
