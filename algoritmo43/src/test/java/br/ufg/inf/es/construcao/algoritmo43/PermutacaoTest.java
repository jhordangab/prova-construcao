package br.ufg.inf.es.construcao.algoritmo43;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermutacaoTest {

    @Test
    public void testPermutacaoTrivial() {
        List<String> result = Permutacao.permutacao("", "a", new ArrayList<String>());
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    public void testSegundaPermutacaoTrivial() {
        List<String> result = Permutacao.permutacao("", "ab", new ArrayList<String>());
        assertEquals(2, result.size());
        assertEquals("ab", result.get(0));
    }

    @Test
    public void testPermutacao() {
        List<String> result = Permutacao.permutacao("", "jhordan", new ArrayList<String>());
        assertEquals(5040, result.size());
        assertEquals("jhordan", result.get(0));
    }
}
