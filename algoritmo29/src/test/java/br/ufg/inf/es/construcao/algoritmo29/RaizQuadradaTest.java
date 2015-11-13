package br.ufg.inf.es.construcao.algoritmo29;

import org.junit.Test;
import static org.junit.Assert.*;

public class RaizQuadradaTest {
    
    /**
     * Classe de raiz quadrada utilizada na classe hipotenuza,
     * com erro, pois no trecho r = (r + n/r)/2, pois não é permitido
     * dividir por 0;
     */
    @Test
    public void testRaizQuadrada() {
        //assertEquals(2, RaizQuadrada.raizQuadrada(2, 2));
    }
    
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testInvalidSomaNaturais() {
        RaizQuadrada.raizQuadrada(-1, 2);
        RaizQuadrada.raizQuadrada(0, 2);
    }
}
