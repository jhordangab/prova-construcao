package br.com.ufg.inf.prova.jhordan.algoritmo3;

/**
 * Classe para implementação da função somaNaturais
 */
public class SomaNaturais {

    /**
     * Obtem o resultado da soma dos números naturais do número informado
     *
     * @param numero
     *
     * @return int - resultado das somas dos naturais do número informado
     *
     */
    public static int somaNaturais(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("O número informado não pode ser"
                    + " menor que 1");
        }

        int indice = 2;
        int soma = 1;

        while (indice <= numero) {
            soma += indice;
            indice++;
        }

        return soma;

    }
}
