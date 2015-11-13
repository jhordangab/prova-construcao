package br.ufg.inf.es.construcao.algoritmo32;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(2178309, Fibonacci.fibonacci(32));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Fibonacci.fibonacci(-1);
    }

}
