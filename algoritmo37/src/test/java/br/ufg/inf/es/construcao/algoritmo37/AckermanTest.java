package br.ufg.inf.es.construcao.algoritmo37;

import org.junit.Test;
import static org.junit.Assert.*;

public class AckermanTest {

    @Test
    public void testAckerman() {
        assertEquals(61, Ackerman.ackerman(3, 3));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPrimeiroInvalido() {
        Ackerman.ackerman(-3, 3);
        Ackerman.ackerman(-1, 3);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSegundoInvalido() {
        Ackerman.ackerman(3, -3);
        Ackerman.ackerman(3, -1);
    }
}
