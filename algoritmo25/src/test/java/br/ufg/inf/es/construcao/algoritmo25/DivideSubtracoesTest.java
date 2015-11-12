package br.ufg.inf.es.construcao.algoritmo25;

public class DivideSubtracoesTest {

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
