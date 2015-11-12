package br.ufg.inf.es.construcao.algoritmo24;

/**
 *
 * DivideSomas é a classe para a resolução do algorítmo 24, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class DivideSomas {

    /**
     * Retorna o divideSoma de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliarS
     *
     * @throws IllegalArgumentException Se o primeiro número for negativo, e
     * se o segundo número for menor que um.
     *
     */
    public static int divideSomas(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 0;
        int auxiliarS = numero2;

        while (auxiliarS <= numero1) {
            auxiliarS += numero2;
            auxiliarD++;
        }
        return auxiliarS;
    }
}
