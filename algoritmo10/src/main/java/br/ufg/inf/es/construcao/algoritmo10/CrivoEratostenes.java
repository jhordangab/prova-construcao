package br.ufg.inf.es.construcao.algoritmo10;

/**
 *
 * CrivoEratostenes é a classe para a resolução do algorítmo 10, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class CrivoEratostenes {

    /**
     * Manipula determinado array, marcando os números primos do mesmo.
     *
     * @param array Array para verificação do crivo.
     * @param quantidade Quantidade de elementos do array informado
     *
     * @throws IllegalArgumentException Se a quantidade de elementos for menor
     * que 2, se a quantidade é diferente do tamanho do array, e se valores a
     * partir da segunda posição do array não for zero
     *
     */
    public static void crivoEratostenes(int[] array, int quantidade) {

        if (quantidade < 2) {
            throw new IllegalArgumentException("'quantidade' não pode ser menor"
                    + " que 2.");
        }

        if (array.length - 1 != quantidade) {
            throw new IllegalArgumentException("A quantidade é diferente do "
                    + "tamanho do vetor setado.");
        }

        for (int posicao = 2; posicao < quantidade; posicao++) {
            if (array[posicao] != 0) {
                throw new IllegalArgumentException("Valores a partir da segunda"
                        + " posição do array não podem ser diferentes de zero.");
            }
        }

        int auxiliar = 2;
        while (auxiliar <= (quantidade / 2)) {
            if (array[auxiliar] == 0) {
                int crivo = auxiliar + auxiliar;
                while (crivo <= quantidade) {
                    array[crivo] = 1;
                    crivo = crivo + auxiliar;
                }
            }
            auxiliar++;
        }
    }
}
