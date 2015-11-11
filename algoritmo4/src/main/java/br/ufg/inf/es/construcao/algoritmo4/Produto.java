package br.ufg.inf.es.construcao.algoritmo4;

/**
 *
 * Produto é a classe para a resolução do algorítmo 4, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Produto {

    /**
     * Retorna o produto de dois números infomados.
     *
     * @param numero1
     * @param numero2
     *
     * @return int soma 
     *
     * @throws IllegalArgumentException Se os números informados forem
     * negativos.
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
