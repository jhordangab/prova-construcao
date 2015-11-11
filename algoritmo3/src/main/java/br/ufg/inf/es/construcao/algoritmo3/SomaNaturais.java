package br.ufg.inf.es.construcao.algoritmo3;

/**
 *
 * SomaNaturais é a classe para a resolução do algorítmo 3, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class SomaNaturais {

    /**
     * Retorna a soma dos números naturais de determinado número.
     *
     * @param numero Número para retorno da soma.
     *
     * @return Soma.
     *
     * @throws IllegalArgumentException Se número for menor que 'um'.
     */
    public static int somaNaturais(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("O número informado não pode ser "
                    + "menor que um.");
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
