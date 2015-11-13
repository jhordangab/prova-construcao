package br.ufg.inf.es.construcao.algoritmo15;

import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {

    @Test
    public void testPi() {
        assertEquals(4, Pi.pi(1));
        assertEquals(3, Pi.pi(12));
        assertEquals(3, Pi.pi(2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void entradaInvalida() {
        Pi.pi(0);
        Pi.pi(-23);
        Pi.pi(-232);
    }
}
