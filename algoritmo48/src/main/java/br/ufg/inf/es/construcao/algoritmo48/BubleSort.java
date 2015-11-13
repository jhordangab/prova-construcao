package br.ufg.inf.es.construcao.algoritmo48;

/**
 *
 * BubleSort é a classe para a resolução do algorítmo 48, da prova de Construção
 * de Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class BubleSort {

    /**
     * Executa o bubleSort em um array
     *
     * @param array
     * @param numero
     *
     * @throws IllegalArgumentException Se o número for negativo
     *
     */
    public static void bubleSort(int[] array, int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser "
                    + "negativo");
        }

        int p = numero;

        while (p >= 1) {
            int posicao = 1;
            while (posicao < p) {
                if (array[posicao] < array[posicao + 1]) {
                    int auxiliar = array[posicao];
                    array[posicao] = array[posicao + 1];
                    array[posicao + 1] = auxiliar;
                }
                posicao++;
            }
            posicao--;
        }
    }
}
