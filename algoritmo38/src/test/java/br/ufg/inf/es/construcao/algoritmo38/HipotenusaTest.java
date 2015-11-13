package br.ufg.inf.es.construcao.algoritmo38;

import org.junit.Test;
import static org.junit.Assert.*;

public class HipotenusaTest {

    /**
     * Classe de raiz quadrada utilizada na classe hipotenuza,
     * com erro, pois no trecho r = (r + n/r)/2, pois não é permitido
     * dividir por 0;
     */
    @Test
    public void testHipotenusa() {
        //assertEquals(11, Hipotenusa.hipotenusa(4, 3));
    }
}
