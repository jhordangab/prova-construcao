package br.ufg.inf.es.construcao.algoritmo45;

/**
 *
 * ImprimeArray é a classe para a resolução do algorítmo 45, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class ImprimeArray {

    /**
     * Imprime todos elementos de um array
     *
     * @param array
     * @param numero
     *
     * @throws IllegalArgumentException Se o número for negativo
     *
     */
    public static void imprimeArray(int[] array, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser "
                    + "negativo");
        }

        int posicao = 1;

        while (posicao <= numero) {
            System.out.println(array[posicao]);
            posicao++;
        }
    }
}
