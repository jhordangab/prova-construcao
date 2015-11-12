package br.ufg.inf.es.construcao.algoritmo26;

/**
 *
 * ModSimples é a classe para a resolução do algorítmo 26, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class ModSimples {

    /**
     * Retorna o modSimples de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliarS
     *
     * @throws IllegalArgumentException Se o primeiro número não pode ser 
     * menor que um, e se o segundo número for menor que um.
     *
     */
    public static int modSimples(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'um'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = divideSubtracoes(numero1, numero2);

        return numero1 - (auxiliarD * numero2);
    }

    /**
     * Retorna o divideSubtracoes de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliarD
     *
     * @throws IllegalArgumentException Se o primeiro número for negativo, e
     * se o segundo número for menor que um.
     *
     */
    public static int divideSubtracoes(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 0;
        int auxiliarS = numero1;

        while (auxiliarS <= numero2) {
            auxiliarS = auxiliarS - numero2;
            auxiliarD++;
        }
        return auxiliarD;
    }
}
