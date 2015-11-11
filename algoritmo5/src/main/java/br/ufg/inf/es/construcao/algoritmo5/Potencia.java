package br.ufg.inf.es.construcao.algoritmo5;

/**
 *
 * Potencia é a classe para a resolução do algorítmo 5, da prova de Construção
 * de Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Potencia {

    /**
     * Retorna a soma dos números naturais de determinado número.
     *
     * @param base Base da potência desejada.
     * @param expoente Expoente da potência desejada.
     *
     * @return int potencia
     *
     * @throws IllegalArgumentException Se a base for menor que 'um' e/ou
     * expoente for um número negativo.
     *
     */
    public static int potencia(int base, int expoente) {

        if (base < 1) {
            throw new IllegalArgumentException("O base informada não pode ser "
                    + "menor que um.");
        }

        if (expoente < 0) {
            throw new IllegalArgumentException("O expoente informado não pode"
                    + " ser menor que zero.");
        }

        int auxiliar = 1;
        int potencia = 1;

        while (auxiliar <= expoente) {
            potencia *= base;
            auxiliar++;
        }
        return potencia;
    }

}
