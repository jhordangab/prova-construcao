package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test
    public void testFatorial() {
        assertEquals(24, Fatorial.fatorial(4));
    }
}
