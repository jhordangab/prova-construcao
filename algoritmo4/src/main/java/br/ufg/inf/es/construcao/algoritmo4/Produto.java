package br.ufg.inf.es.construcao.algoritmo4;

/**
 * Classe para implementação da função que retorna o produto de dois números
 */
public class Produto {

    /**
     * Obtém o produto de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int soma - Produto dos dois números informados
     *
     */
    public static int produto(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número informado não"
                    + "pode ser menor que zero.");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número informado não"
                    + "pode ser menor que zero.");
        }

        int auxiliar = 1;
        int soma = 0;

        while (auxiliar <= numero2) {
            soma += numero1;
            auxiliar++;
        }
        
        return soma;
    }
}
