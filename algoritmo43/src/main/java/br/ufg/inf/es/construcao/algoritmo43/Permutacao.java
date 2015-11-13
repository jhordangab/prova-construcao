package br.ufg.inf.es.construcao.algoritmo43;

import java.util.List;

/**
 *
 * Permutacao é a classe para a resolução do algorítmo 43, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Permutacao {

    /**
     * Imprime uma permutação.
     *
     * @param prefixo
     * @param conjunto
     * @param resultado
     *
     * return List resultado
     */
    public static List<String> permutacao(String prefixo, String conjunto, List<String> resultado) {
        if (conjunto.length() == 1) {
            resultado.add(prefixo + conjunto);
            return resultado;
        }

        for (int i = 0; i < conjunto.length(); i++) {

            StringBuilder sLinha = new StringBuilder(conjunto);
            char indiceI = sLinha.charAt(i);
            sLinha.deleteCharAt(i);

            String pLinha = prefixo + indiceI;

            permutacao(pLinha, sLinha.toString(), resultado);
        }

        return resultado;
    }
}
