package br.ufg.inf.es.construcao.algoritmo3;

/**
 * Classe para implementação da função que retorna soma dos naturais de
 * determinado número
 */
public class SomaNaturais {

    /**
     * Obtém a soma dos naturais de um número.
     *
     * @param numero
     *
     * @return int soma
     *
     */
    public static int somaNaturais(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("O número informado não pode ser "
                    + "menor que zero.");
        }

        int auxiliar = 2;
        int soma = 1;

        while (auxiliar <= numero) {
            soma += auxiliar;
            auxiliar += 1;
        }

        return soma;
    }
}
