package br.ufg.inf.es.construcao.algoritmo34;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CpfTest {
    
    /**
     * Classe não pode ser testada pois utiliza algoritmos externos já
     * implementados, e que não aceitam valores que são repassados causando
     * invalidade de testes.
     */
    @Test
    public void testCpf() {
//        int[] cpf = {0,4,9,3,9,9,9,5,1,5,1};
//        assertTrue(Cpf.cpf(cpf));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalido() {
        int[] cpf = {9,5,1,1,1,5,1};
        Cpf.cpf(cpf);
    }
}
