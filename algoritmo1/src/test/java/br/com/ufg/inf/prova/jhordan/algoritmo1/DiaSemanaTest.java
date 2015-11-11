package br.com.ufg.inf.prova.jhordan.algoritmo1;

import static org.junit.Assert.*;

public class DiaSemanaTest {

    @org.junit.Test
    public void testDiaValido() {
        assertEquals(3, DiaSemana.diaSemana(29, 10, 2015));
        assertEquals(2, DiaSemana.diaSemana(30, 9, 2015));
        assertEquals(6, DiaSemana.diaSemana(8, 11, 2015));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testDiaInvalido() {
        DiaSemana.diaSemana(-5, 6, 2000);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMesInvalido() {
        DiaSemana.diaSemana(5, -6, 2000);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAnoInvalido() {
        DiaSemana.diaSemana(5, 6, -2000);
    }
}
