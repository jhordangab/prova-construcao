package br.ufg.inf.es.construcao.algoritmo47;

/**
 *
 * MediaArray é a classe para a resolução do algorítmo 47, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class MediaArray {

    /**
     * Retorna a média de um array
     *
     * @param array
     * @param numero
     *
     * @return media
     *
     * @throws IllegalArgumentException Se o número for negativo
     *
     */
    public static int mediaArray(int[] array, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser "
                    + "negativo");
        }

        int soma = somaArray(array, numero);

        return soma / numero;
    }

    /**
     * Retorna a soma de todos elementos de um array
     *
     * @param array
     * @param numero
     *
     * @return soma
     *
     * @throws IllegalArgumentException Se o número for negativo
     *
     */
    public static int somaArray(int[] array, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser "
                    + "negativo");
        }

        int soma = 0;
        int posicao = 1;

        while (posicao <= numero) {
            soma += array[posicao];
            posicao++;
        }
        
        return soma;
    }
}
