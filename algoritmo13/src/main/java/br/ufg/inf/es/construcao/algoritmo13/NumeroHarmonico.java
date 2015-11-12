package br.ufg.inf.es.construcao.algoritmo13;

/**
 *
 * NumeroHarmonico é a classe para a resolução do algorítmo 13, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class NumeroHarmonico {

    /**
     * Retorna o número harmônico de determinado número.
     *
     * @param numero .
     *
     * @return auxiliarS Número Harmonico
     *
     * @throws IllegalArgumentException Se número for menor que um.
     *
     */
    public static int numeroHarmonico(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int auxiliarS = 1;

        while (auxiliar <= numero) {
            auxiliarS = auxiliarS + (1 / auxiliar);
            auxiliar++;
        }

        return auxiliarS;
    }
}
